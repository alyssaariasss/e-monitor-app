B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.5
@EndOfDesignText@
Sub Class_Globals
	Private mModule As Object
	Private mEventName As String
	Private wsh As Socket
	Private wtaserverIO As AsyncStreams
	Dim connected As Boolean=False
	Dim myid As String="456"
	Dim clientid As String="123"
	Private tmrwtaserver As Timer

	Private dbsql As String
	Private notconnected As Int
	Private autoconnect As Boolean=True
	Dim socketReceive     As UDPSocket
	Dim socketSend         As UDPSocket
	'Dim godaddy As String="192.168.254.112"
	Dim godaddy As String="184.168.126.221"
	
	Dim port1 As Int=5001
	Dim port2 As Int=5007
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pModule As Object, pEventName As String,id As String,clientid_ As String,dbsql_x As String)
	mModule    = pModule
	mEventName = pEventName
	myid=id
	clientid=clientid_
	dbsql=dbsql_x
	socketReceive.Initialize("sockedReceive",5020,256)
	socketSend.Initialize("sockedSend",5004,256)
End Sub
Sub encode(s As String) As Byte()
	Dim Data() As Byte
	Data = s.GetBytes("UTF8")
	Return Data
End Sub

Sub SendActive()
	Dim packet As B4XBytesBuilder
	packet.Initialize
	
	Dim client() As Byte = Array As Byte(0xff,0xAA,0xCC,0x3,0x1)
	packet.Append(client)
	
	packet.Append(encode(myid&Chr(10)))
	Dim InviaUDP As UDPPacket
	InviaUDP.Initialize(packet.ToArray,godaddy,port2)'InviaUDP.Initialize(packet.ToArray,"192.168.254.112",5005)
	socketSend.Send(InviaUDP)
End Sub
Sub SendPacket(data() As Byte)
	SendPacket2(clientid,data)
End Sub
Sub SendPacket2(clientname As String,data() As Byte)
	Dim packet As B4XBytesBuilder
	packet.Initialize
	
	Dim client() As Byte = Array As Byte(0xff,0xAA,0xCC,0x3,0x4)
	packet.Append(client)
	
	packet.Append(encode(clientname))
	packet.Append(Array As Byte(0))
	packet.Append(data)
	packet.Append(Array As Byte(0))
	Dim InviaUDP As UDPPacket
	InviaUDP.Initialize(packet.ToArray,godaddy,port2)
	socketSend.Send(InviaUDP)
End Sub

Sub sockedReceive_PacketArrived (PacketFromSender As UDPPacket)'this does not execute???
	Log("Received from Sender")
	'...this is he one that you are listening to
 
	Dim msg As String
	msg = BytesToString(PacketFromSender.Data, PacketFromSender.Offset, PacketFromSender.Length, "ASCII")
	Dim b() As Byte=  msg.GetBytes("ASCII")
	Dim InviaUDP As UDPPacket
	InviaUDP.Initialize(B,"192.168.1.249",9101)
	socketSend.Send(InviaUDP)
End Sub

Sub sockedSend_PacketArrived (PacketFromSender As UDPPacket)
	Log("Received from Receiver")
	'...this is he on    e that you are listening To
	Dim mLine As String
	mLine = BytesToString(PacketFromSender.Data, PacketFromSender.Offset, PacketFromSender.Length, "ASCII")
	If SubExists(mModule,mEventName & "_" & "NewData") Then
		CallSub2(mModule,mEventName & "_" & "NewData",mLine)
	End If
End Sub
Sub wsh_Connected(Successful As Boolean)
	ProgressDialogHide
	If Successful Then
		wtaserverIO.Initialize(wsh.InputStream,wsh.OutputStream,"wsh")
		Dim strs As String="WTAREGISTER^"&myid & Chr(13)
		SendActive
		wtaserverIO.Write(strs.GetBytes("UTF8"))
		connected=True
	Else
		wsh.Close
		ToastMessageShow("No net",False)
	End If
End Sub

Sub wsh_NewData(Buffer() As Byte)
	Dim mLine As String
	mLine = BytesToString(Buffer,0,Buffer.Length,"UTF-8")
	notconnected=0
	If SubExists(mModule,mEventName & "_" & "NewData") Then
		CallSub2(mModule,mEventName & "_" & "NewData",mLine)
		
	End If
	
End Sub
Sub SendServer(s As String)
	Try
		s=s&Chr(13)
		If wtaserverIO.IsInitialized Then
			wtaserverIO.Write(s.GetBytes("UTF8"))
			Starter.wsh.SendActive()
		Else
			InitWTAServer
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try
End Sub
Sub SendClient(s As String)
	Try
		If wtaserverIO.IsInitialized Then
			s="WTARELAY^" & clientid & "^" & s & Chr(13)
			wtaserverIO.Write(s.GetBytes("UTF8"))
		Else
			connected=False
			InitWTAServer
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try
End Sub

Sub wtaserver_Terminated()
	ToastMessageShow("Terminated raks",False)
	connected=False
End Sub
Sub wtaserver_Error()
	wtaserverIO.Close
	wsh.Close
	connected=False
	ToastMessageShow("wtaserver_Error",False)
End Sub
Sub InitWTAServer
	Try
		If tmrwtaserver.IsInitialized=False Then
			tmrwtaserver.Initialize("tmrwtaserver",5000)
			tmrwtaserver.Enabled=True
		End If
		If CheckConnection  Then
			wsh.Initialize("wsh")
			wsh.Connect(godaddy,port1,30000)
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try
End Sub
Sub tmrwtaserver_Tick
	If autoconnect Then
		If notconnected=3 Then
			ToastMessageShow("check connection",False)
			wsh.Close
			InitWTAServer
		Else
			notconnected=notconnected+1
			SendServer("WTASQLTIME")'prevent disconnection
			
		End If
	Else
		SendServer("x")'prevent disconnection
	End If
End Sub

Sub CheckConnection As Boolean
	Dim p As Phone
  
	If (p.GetDataState == "CONNECTED") Then
		Return True
	End If
      
	If (p.GetSettings ("wifi_on") == 1) Then
		Return True
	End If
  
	If (p.GetDataState == "DISCONNECTED") Then
		Return False
	End If
  
	If (p.GetDataState == "SUSPENDED") Then
		Return False
	End If
	Return False
End Sub




'db_sql
public Sub DataGrid(grid As Table,strs As String,header As String)
	Dim j As List=ToList(strs)
	ToGrid(grid,j,header)
End Sub
public Sub Querry(strs As String,key As String)
	strs=strs.Trim
	Dim sx() As String=Regex.Split(" ",strs)
	If sx(0).ToLowerCase.Contains("insert") Then
		SendServer("WTASQLNONQUERRY^"&strs&";^"&dbsql)
	End If
	If sx(0).ToLowerCase.Contains("create") Then
		SendServer("WTASQLNONQUERRY^"&strs&";^"&dbsql)
	End If
	If sx(0).ToLowerCase.Contains("update") Then
		SendServer("WTASQLNONQUERRY^" & strs &";^"&dbsql)
	End If
	If sx(0).ToLowerCase.Contains("delete") Then
		SendServer("WTASQLNONQUERRY^"& strs &";^"&dbsql)
	End If
	'Starter.wsh.SendServer("WTASQLNONQUERRY^update user set data='what,the,hello' where username='donna';^"&Starter.dbsql)
	If sx(0).ToLowerCase.Contains("select") Then
		SendServer("WTASQLQUERRY^"&strs &";^"&dbsql&"^"&key)
	End If
End Sub
private Sub ToGrid(grid As Table,j As List,header As String)
	Dim strs As String=header &CRLF
	For a =0  To j.Size-1
		Dim b As List	=j.get(a)'Log(j.Get(a))
		For c =0  To b.Size-1
			Dim d As String=b.get(c)'Log(j.Get(a))
			d=d.Replace(","," ")' supress comma
			strs=strs&d&","
		Next
		strs=strs.SubString2(0,strs.Length-1)
		strs=strs&CRLF
	Next
	Dim fname As String="mycsv.csv"
	If File.Exists(File.DirInternal,fname) Then
		File.Delete(File.DirInternal,fname)
	End If
	File.WriteString(File.DirInternal,fname,strs)
	grid.LoadTableFromCSV(File.DirInternal,fname,True)
End Sub
Sub ToList(s As String) As List
	Dim JSon As JSONParser
	s=s.Replace(",)",")")
	s=s.Replace(")","]")
	s=s.Replace("(","[")
	JSon.Initialize(s)
	Dim JSLs As List
	JSLs.Initialize
	JSLs = JSon.nextArray
	Return JSLs
End Sub
Sub DateTimeSQL() As String
	Dim a As String=DateTime.Date(DateTime.Now)
	Dim b As String=DateTime.Time(DateTime.Now)
	Dim date=vb6.getCSV(2,"/",a) & "-" & vb6.getCSV(0,"/",a) & "-" &vb6.getCSV(1,"/",a)  & " " & b
	Return  date
End Sub

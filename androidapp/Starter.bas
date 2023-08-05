B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=6.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region
'server
'serial
'sms
'gps

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim sms_rx As SmsInterceptor
	Dim sms As PhoneSms
	
	
	Dim timer1 As Timer
	Dim timer2 As Timer
	Private astream As AsyncStreams
	Dim connected_BT As Boolean
	Dim Serial1 As Serial
	Dim msec_ As Int'in 100 ms
	Dim customview As List
	Dim bluetoothview1 As Object
	Dim frmcontrols1 As Object
	Dim wsh As WTAServer
	Dim myparser As clsParser
	Dim parse1 As clsParser
	Dim volt As clsParser
	Dim amp As clsParser
	Dim powerWatt As clsParser
	Dim energy As clsParser
	Dim voltx As String="0"
	Dim ampx As String="0"
	Dim powerWattx As String="0"
	Dim energyx As String="0"
	Dim rp As RuntimePermissions
	'Dim frmsplash1 As Object
	'Dim frmpatient1 As Object'''
	Dim GPS1 As GPS
	Dim frmmain1 As Object
	Dim rp As RuntimePermissions
	
	Dim uuid As String
	Dim FilePath As String
	Dim statequerry As String
	Dim CONNECTED As clsParser
	Dim HIST As clsParser
	Dim frmcontrol1 As Object
	Dim frmmap1 As Object
	Dim UNO As clsParser
	Dim gpsparser As clsParser
	Dim REGISTER As clsParser
	Dim clientsmap As Map
	Dim Mall As clsParser
	Dim FEU As clsParser
	Dim Alabang As clsParser
	Dim led As String="000"
	Dim lat As Float
	Dim lon As Float
	Dim notifflag As Boolean=False	
	Dim frmhist1 As Object
	Dim mapparser As Map
	Dim frmsettings1 As Object
	Dim frmlogin1 As Object
	Dim price As Float=11.91
	Dim enKW1 As String
	Dim enKW2 As String
	Dim enKW3 As String
	Dim oldKW1 As Float=0
	Dim accumKW1 As Float=0
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Dim r As Reflector
	r.Target=r.RunStaticMethod("java.util.UUID", "randomUUID", Null, Null)
	uuid =r.RunMethod("toString")
	Serial1.Initialize("Serial1")

	'uuid="androidServer"
	wsh.Initialize(Me,"wsh",uuid,"ESALBAMCU","esalba.sqlite3")
	wsh.InitWTAServer()
	CONNECTED.Initialize("connected",".",3)
	HIST.Initialize("HIST",Chr(13),1)
	UNO.Initialize("UNO","#",1)
	REGISTER.Initialize("REGISTER","#",1)
	'mnuConnect_Click
	clientsmap.Initialize
	mapparser.Initialize
End Sub
Sub QuerryServer(header As String,terminator As String,sql As String) As clsParser
	Dim cls As clsParser
	cls.Initialize(header,terminator,1)
	mapparser.Put(cls,"NOTFINISH")
	wsh.Querry(sql,header)
	Return cls
End Sub
Sub map(m As String) As Map
	Dim mm As Map
	Dim j As JSONParser
	j.Initialize(m)
	mm=j.NextObject()
	Return mm
End Sub
Sub update(mp As Map,m As String)
	Dim mm As Map
	Dim j As JSONParser
	j.Initialize(m)
	
	mm=j.NextObject()
	For Each s As String In mm.Keys
		mp.Put(s,mm.Get(s))
	Next
End Sub
Sub QuerryTable()
	'Dim x As frmcontrol=Starter.frmcontrol1
	'x.Visible=True
	'setVisible(False)
	Dim cls As clsParser
	Dim sql As String=$"SELECT * FROM sqlite_master WHERE type='table';"$
	cls=QuerryServer("LOGIN",Chr(13),sql)
	Do While mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	Log(cls.data)
	If cls.data<>"" Then
		Dim l As List= wsh.ToList(cls.data)
		If l.Size<>0 Then
			For a=0 To l.Size-1
				Log(l.Get(0))
			Next

		Else
			ToastMessageShow("Invalid user/password",False)
		End If
	End If
	mapparser.Remove(cls)'important
End Sub

public Sub Println(str As String)
	Dim x As String
	str=str&Chr(13)
	x=str.Length
	If connected_BT=True Then
		astream.Write(str.GetBytes("UTF8"))
	End If
End Sub

Sub sendwsh(strs As String)
	wsh.SendClient(strs & "," &uuid & "#")
End Sub
Sub image(QPushButton1 As View,fname As String)
	Dim bm As Bitmap
	bm.Initialize(File.DirAssets,fname)
	QPushButton1.SetBackgroundImage(bm)
End Sub
Sub wsh_NewData(data As String)
	'ToastMessageShow(data,False)
	Dim aa As Int
	For aa = 0 To data.Length-1
		Dim z As String
		z=data.SubString2(aa,aa+1)
		
		If CONNECTED.available(z) Then
			ToastMessageShow(uuid&" connected",False)
			timer1.Initialize("Timer1",5000)
			timer1.Enabled=True
			wsh.SendClient("REGISTER" & uuid & "#")
		End If
		For Each a As clsParser In mapparser.Keys
			If a.available(z) Then
				mapparser.Put(a,"FINISH")
				Log("FINISH")
			End If
		Next
		If UNO.available(z)=True Then
			Dim x As frmcontrol
			x=frmcontrol1
			x.QLabel1.Text=UNO.data
			
			Dim pow1 As String=vb6.getCSV(2,",",UNO.data)
			enKW1=vb6.getCSV(3,",",UNO.data)
			
			x.kwh1.Text=enKW1 & " KWH"
			x.voltage1.Text=vb6.getCSV(0,",",UNO.data) & " V"
			x.current1.Text=vb6.getCSV(1,",",UNO.data) & " A"
			x.power1.Text=pow1 & " W"
			x.cost1.Text=NumberFormat(price*enKW1,0,2)

			Dim pow2 As String=vb6.getCSV(8,",",UNO.data)
			enKW2=vb6.getCSV(9,",",UNO.data)
			
			x.kwh2.Text=enKW2 & " KWH"
			x.voltage2.Text=vb6.getCSV(6,",",UNO.data) & " V"
			x.current2.Text=vb6.getCSV(7,",",UNO.data) & " A"
			x.power2.Text=pow2 & " W"
			x.cost2.Text=NumberFormat(price*enKW2,0,2)

			Dim pow3 As String=vb6.getCSV(14,",",UNO.data)
			enKW3=vb6.getCSV(15,",",UNO.data)
			
			x.kwh3.Text=enKW3 & " KWH"
			x.voltage3.Text=vb6.getCSV(12,",",UNO.data) & " V"
			x.current3.Text=vb6.getCSV(13,",",UNO.data) & " A"
			x.power3.Text=pow3 & " W"
			x.cost3.Text=NumberFormat(price*enKW3,0,2)
		End If
	Next
End Sub
Sub mnuDisconnect_Click
	If connected_BT=True Then
		astream.Close
		timer1.Enabled=False
		Serial1.Disconnect
		connected_BT=False
	End If
End Sub
Sub conns(res As Int, PairedDevices As Map, L As List)
	Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)
End Sub

Sub Serial1_Connected (Success As Boolean)
	If Success Then
		ToastMessageShow("Connected successfully", False)
		astream.Initialize(Serial1.InputStream, Serial1.OutputStream, "astream")
		connected_BT = True
	Else
		connected_BT = False
		ToastMessageShow("Check BT connection", False)
	End If
End Sub

Sub astream_NewData (Buffer() As Byte)
	Dim str As String
	str=BytesToString(Buffer, 0, Buffer.Length, "UTF8")
	'ToastMessageShow(str,False)
	Dim aa As Int
	Dim x As frmcontrol
	x=frmcontrol1
	x.QLabel1.Text=UNO.data
	For aa = 0 To str.Length-1
		Dim z As String
		z=str.SubString2(aa,aa+1)
		
		If UNO.available(z)=True Then
			For Each k As String In clientsmap.Keys
				wsh.clientid=k
				wsh.SendClient("UNO"&UNO.data&"#")
			Next
		End If
	Next
	
End Sub
Sub sms_rx_MessageReceived(From As String, Body As String) As Boolean
	Dim strsend As String
	If Body="Hello" Then
		sms.Send(From,"what the hell")
	End If
	Dim aa As Int
	For aa = 0 To Body.Length-1
		Dim z As String
		z=Body.SubString2(aa,aa+1)
		If myparser.available(z)=True Then
			ToastMessageShow(myparser.data,False)
		End If
	Next
End Sub
Sub mnuConnect_Click
	If connected_BT=False Then
		Try
			Serial1.Connect3("98:DA:50:01:7A:40",1)
		Catch
			ToastMessageShow("Bluetooth mcu is OFF",False)
		End Try
		'End If
	End If
End Sub
Sub Timer1_Tick
	wsh.SendClient("REGISTER" & uuid & "#")
End Sub
Sub Timer2_Tick
	If notifflag=True Then
		For Each k1 As String In clientsmap.Keys
	'		wsh.clientid=k1
	'		wsh.SendClient("hasnotifdriver#")
		Next
		notifflag=False	
	End If
End Sub
Sub msec(xa As Int)
	msec_ = xa
	Do While(msec_<>0)
		DoEvents
	Loop
End Sub
Sub Service_Start (StartingIntent As Intent)
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	ToastMessageShow("exit",True)
End Sub
Sub	StartGPS
	GPS1.Start(0, 0) 'Listen to GPS with no filters.
End Sub
Sub GPS_LocationChanged (Location1 As Location)
	lat= NumberFormat(Location1.Latitude, 1, 6)
	lon= NumberFormat(Location1.Longitude, 1, 6)
End Sub
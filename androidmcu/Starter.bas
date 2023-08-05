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
	Dim SSRON1 As clsParser
	Dim SSROFF1 As clsParser
	Dim SSRON2 As clsParser
	Dim SSROFF2 As clsParser
	Dim SSRON3 As clsParser
	Dim SSROFF3 As clsParser
	Dim mapparser As Map
	
	Dim en1 As String
	Dim en2 As String
	Dim en3 As String
	
	Dim energy1 As clschange
	Dim energy2 As clschange
	Dim energy3 As clschange
	Dim trigtime As Boolean=False
	Dim RESETENERGY As clsParser
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Dim r As Reflector
	r.Target=r.RunStaticMethod("java.util.UUID", "randomUUID", Null, Null)
	uuid =r.RunMethod("toString")
	Serial1.Initialize("Serial1")

	'uuid="androidServer"
	wsh.Initialize(Me,"wsh","ESALBAMCU","ESALBAAPP","esalba.sqlite3")
	wsh.InitWTAServer()
	CONNECTED.Initialize("connected",".",3)
	HIST.Initialize("HIST",Chr(13),1)
	UNO.Initialize("UNO",Chr(13),1)
	REGISTER.Initialize("REGISTER","#",1)
	
	mapparser.Initialize
	
	clientsmap.Initialize
	SSRON1.Initialize("SSRON1","#",1)
	SSROFF1.Initialize("SSROFF1","#",1)
	SSRON2.Initialize("SSRON2","#",1)
	SSROFF2.Initialize("SSROFF2","#",1)
	SSRON3.Initialize("SSRON3","#",1)
	SSROFF3.Initialize("SSROFF3","#",1)
	energy1.Initialize
	energy2.Initialize
	energy3.Initialize
	RESETENERGY.Initialize("RESETENERGY","#",1)
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
			'wsh.Querry("CREATE TABLE logs(DO CHAR(50),Temp CHAR(50),Ph CHAR(50),Voltage CHAR(50),Current CHAR(50),Power CHAR(50),DateOK CHAR(50))","")
			'run once to create table in our server
			'wsh.Querry("CREATE TABLE user(username CHAR(50),data CHAR(50))","")
			'Dim sql As String=$"insert into user(username, data) values ('${"Rocky"}','${"mydata"}')"$
			'wsh.Querry(sql,"")
			
			'run once to insert table in our server
			timer1.Initialize("Timer1",1000*60)
			timer1.Enabled=True
			'timer2.Initialize("Timer2",1000)
			'timer2.Enabled=True
			'wsh.SendClient("REGISTER" & uuid & "#")
			'Dim xa As frmmain=frmmain1
			'xa.getdata
			mnuConnect_Click
		End If
		
		If REGISTER.available(z)=True Then
			If clientsmap.ContainsKey(REGISTER.data)=False Then
				clientsmap.Put(REGISTER.data,"CLIENT")
			End If
		End If
		For Each a As clsParser In mapparser.Keys
			If a.available(z) Then
				mapparser.Put(a,"FINISH")
				'Log("FINISH")
			End If
		Next

		If SSRON1.available(z)=True Then
			Println("SSRON1#")
		End If
		If SSROFF1.available(z)=True Then
			Println("SSROFF1#")
		End If
		If SSRON2.available(z)=True Then
			Println("SSRON2#")
		End If
		If SSROFF2.available(z)=True Then
			Println("SSROFF2#")
		End If
		If SSRON3.available(z)=True Then
			Println("SSRON3#")
		End If
		If SSROFF3.available(z)=True Then
			Println("SSROFF3#")
		End If
		If RESETENERGY.available(z)=True Then
			Println("RESETENERGY#")
			Log("RESETENERGY")
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
		'TextReader1.Initialize(Serial1.InputStream)
		'TextWriter1.Initialize(Serial1.OutputStream)
		'tr.Initialize(Serial1.InputStream)
		'tw.Initialize(Serial1.OutputStream)
		astream.Initialize(Serial1.InputStream, Serial1.OutputStream, "astream")
		connected_BT = True
		'If IsPaused(Main)=False Then
			
		'bluetooth.Label2.Text="Connected"
		'End If
	Else
		connected_BT = False
		ToastMessageShow("Check BT connection", False)
		'If IsPaused(Main)=False Then
		'bluetooth.Label2.Text="DisConnected"
		'ToastMessageShow("Check BT connection", False)
		'End If
		
		'Msgbox(LastException.Message, "Error ra connecting.")
	End If
End Sub
Sub QuerryServer(header As String,terminator As String,sql As String) As clsParser
	Dim cls As clsParser
	cls.Initialize(header,terminator,1)
	mapparser.Put(cls,"NOTFINISH")
	wsh.Querry(sql,header)
	Return cls
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
		Try
			If UNO.available(z)=True Then
				
				Dim pow1 As String=vb6.getCSV(2,",",UNO.data)
				en1=vb6.getCSV(3,",",UNO.data)
			
				Dim pow2 As String=vb6.getCSV(8,",",UNO.data)
				en2=vb6.getCSV(9,",",UNO.data)
				
				Dim pow3 As String=vb6.getCSV(14,",",UNO.data)
				en3=vb6.getCSV(15,",",UNO.data)
				
				
				Dim fr As frmmain=frmmain1
				Dim pval1 As Float=energy1.getChanges(en1)
				If pval1<>0 Then
					fr.UpdateKW(pval1,1)
				End If
				Dim pval2 As Float=energy2.getChanges(en2)
				If pval2<>0 Then
					fr.UpdateKW(pval2,2)
				End If
				Dim pval3 As Float=energy3.getChanges(en3)
				If pval3<>0 Then
					fr.UpdateKW(pval3,3)
				End If
				
				Dim VAL As Map=CreateMap("P1":pow1,"P2":pow2,"P3":pow3,"E1":en1,"E2":en2,"E3":en3,"C1":pval1,"C2":pval2,"C3":pval3)
				
				Log(VAL)
				For Each k As String In clientsmap.Keys
					
					wsh.clientid=k
					wsh.SendClient("UNO"&UNO.data&"#")
				Next
			End If
		Catch
			ToastMessageShow("Parsing Issue",False)
		End Try		
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
			Serial1.Connect3("98:DA:50:01:7A:40",1)'mcu zigbee kiosk 1
		Catch
			ToastMessageShow("Bluetooth mcu is OFF",False)
		End Try
		'End If
	End If
End Sub
Sub Timer1_Tick
	Dim fr As frmmain=frmmain1
	fr.QPushButton1_click
	fr.QPushButton2_click
	fr.QPushButton3_click
	ToastMessageShow("Time timer1",False)
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

'public Sub Println(str As String)
'	Dim x As String
'	str=str&Chr(13)
'	x=str.Length
'	If connected_BT=True Then
'		astream.Write(str.GetBytes("UTF8"))
'	End If
'End Sub
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
	
	'Dim speed As String = "Speed = " & Location1.Speed
	'astream_write("WTA" & lat & "," & lon & "," & speed & Chr(13))
	
	'If IsPaused(Main)=False Then
	'	CallSub2(Main,"Set_edittext",lat & "," & lon & "," & speed)
	'End If
End Sub

'Sub GPS_UserEnabled (Enabled As Boolean)
'	ToastMessageShow("GPS device enabled = " & Enabled, True)
'End Sub
'Sub Activity_Resume
'	If GPS1.GPSEnabled = False Then
'		ToastMessageShow("Please enable the GPS device.", True)
'		StartActivity(GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
'	Else
'		GPS1.Start(0, 0) 'Listen to GPS with no filters.
'	End If
'End Sub
'Sub GPS_GpsStatus (Satellites As List)
'	'lblSatellites.Text = "Satellites:" & CRLF
'	For i = 0 To Satellites.Size - 1
'		Dim Satellite As GPSSatellite
'		'Satellite = Satellites.Get(i)
'		'lblSatellites.Text = lblSatellites.Text & CRLF & Satellite.Prn & _
'		'	" " & Satellite.Snr & " " & Satellite.UsedInFix & " " & Satellite.Azimuth _
'		'	& " " & Satellite.Elevation
'	Next
'End Sub





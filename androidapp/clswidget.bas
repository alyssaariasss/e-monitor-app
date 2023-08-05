B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Dim xui As XUI
	Dim date As B4XDateTemplate
	Dim dialog As B4XDialog
	Dim InputTemplate As B4XInputTemplate
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(base As B4XView)
	dialog.Initialize(base)
	date.Initialize
	InputTemplate.Initialize
End Sub
Sub ShowInfo(uri As String) As String
	Dim x As String
	Try
		x = GetFileInfoByIndex("_display_name", uri)
		Return x
	Catch
		x = "error"
	End Try
	Try
		x = GetFileInfoByIndex("mime_type", uri)
	Catch
		
	End Try
	Try
		x = GetFileInfoByIndex("_size", uri)
	Catch
		
	End Try
	Try
		x = DateTime.Date(GetFileInfoByIndex("last_modified", uri))
	Catch
		Try
			x = DateTime.Date(GetFileInfoByIndex("datetaken", uri))
		Catch
			
		End Try
	End Try
	Return ""
End Sub
Sub GetFileInfoByIndex(column As String, uri As String) As String
	
	Dim results As String
	Dim Cur As Cursor
	Dim Uri1 As Uri
	Dim cr As ContentResolver
	cr.Initialize("")

	'if viewing by gallery
	If uri.StartsWith("content://media/") Then
		Dim i As Int = uri.LastIndexOf("/")
		Dim id As String = uri.SubString(i + 1)
		Uri1.Parse(uri)
		Cur = cr.Query(Uri1, Null, "_id = ?", Array As String(id), Null)
		Cur.Position = 0
		If Cur.RowCount <> 0 Then
			For i = 0 To Cur.ColumnCount - 1
				If Cur.GetColumnName(i) <> Null Then
					If Cur.GetColumnName(i) = column Then
						results = Cur.GetString2(i)
						Exit
					End If
				End If
			Next
		End If
	Else
		Uri1.Parse(uri)
		Cur = cr.Query(Uri1, Null, Null, Null, Null)
		Cur.Position = 0
		If Cur.RowCount <> 0 Then
			For i = 0 To Cur.ColumnCount - 1
				If Cur.GetColumnName(i) <> Null Then
					If Cur.GetColumnName(i) = column Then
						results = Cur.GetString2(i)
						Exit
					End If
				End If
			Next
		End If
	End If
	
	Cur.Close
	
	Return results
	
End Sub

Sub FileDialog(base As B4XView)As ResumableSub
	Dim xui As XUI
	Dim cc As ContentChooser
	cc.Initialize("CC")
	cc.Show("*/*", "Bitte Bild wählen:")
	Wait For CC_Result (Success As Boolean, Dir As String, FileName As String)
	Dim m As Map
	If Success = True Then
	m=CreateMap("Dir":Dir,"Filename":FileName)
	end	if
	Dim size As Long=GetFileInfoByIndex("_size", FileName)
	Dim xx(size) As Byte= File.ReadBytes(Dir,FileName)
	Dim realname As String=GetFileInfoByIndex("_display_name", FileName)
	
	File.WriteBytes	(File.DirInternal,realname,xx)
	If Success = True Then
		Return m'Dir & "," & FileName
	Else
		'xui.Msgbox2Async("","")
		Return
		Log("error")
	End If
	
End Sub
Sub DateDialog(base As B4XView) As ResumableSub
	
	Wait For (dialog.ShowTemplate(date, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log( DateTime.Date(date.Date))
	End If
	Dim a As String=DateTime.Date(date.Date)
	Dim b As String=vb6.getCSV(2,"/",a) & "-" & vb6.getCSV(0,"/",a) & "-" &vb6.getCSV(1,"/",a)  & " " 
	Return b
End Sub
Sub TimeDialog(base As B4XView) As ResumableSub
	InputTemplate.lblTitle.Text = "Enter time (HH:MM)"
	InputTemplate.RegexPattern = "^([0-9]|0[0-9]|2[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$" '<---optional. Remove if not needed
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log( InputTemplate.Text)
	End If
	Return InputTemplate.Text
End Sub
Sub dashboard(graphx As LineChart,sql As String,code As String)
	Dim cls As clsParser
	Dim sql As String=sql
	cls=Starter.QuerryServer(code,Chr(13),sql)
	Do While Starter.mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	
	Log(cls.data)
	If cls.data<>"" Then
		'Starter.wsh.DataGrid(DataGrid6,cls.data,"LatLonStart,LatLonStop,Speed,Distance,HeartRate,BP,Date")
		Dim j As List=Starter.wsh.ToList(cls.data)
		Dim myfloat(j.Size+1) As Float
		Dim myxvals(j.Size+1) As String
		Dim strs As String
		For a =0  To j.Size-1
			Dim b As List	=j.get(a)'Log(j.Get(a))
			For c =0  To b.Size-1
				If c=0 Then
					Try
						myfloat(a)=b.get(c)'Log(j.Get(a))
					Catch
						myfloat(a)=0
					End Try
				End If
				If c=1 Then myxvals(a)=b.get(c)'Log(j.Get(a))
				Dim d As String=b.get(c)'Log(j.Get(a))
				d=d.Replace(","," ")' supress comma
				strs=strs&d&","
			Next
			strs=strs.SubString2(0,strs.Length-1)
			strs=strs&CRLF
		Next
	End If
	initgraph(graphx,"Legend","Title",myfloat,myxvals)
End Sub
Sub Datagrid(DataGrid6 As Table,sql As String,fields As String,id As String)
	Dim cls As clsParser
	Dim sql As String=sql'$"select LatLonStart,LatLonStop,Distance,HeartRate,BP,Date from history"$
	cls=Starter.QuerryServer(id,Chr(13),sql)
	Do While Starter.mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	Log(cls.data)
	If cls.data<>"" Then
		'Starter.wsh.DataGrid(DataGrid6,cls.data,"LatLonStart,LatLonStop,Speed,Distance,HeartRate,BP,Date")
		Starter.wsh.DataGrid(DataGrid6,cls.data,fields)
	End If
End Sub
Sub Querry(sql As String,id As String) As ResumableSub
	Dim cls As clsParser
	Dim sql As String=sql'$"select LatLonStart,LatLonStop,Distance,HeartRate,BP,Date from history"$
	Dim ret As List
	ret.Initialize
	cls=Starter.QuerryServer(id,Chr(13),sql)
	Do While Starter.mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	Log(cls.data)
	If cls.data<>"" Then
		ret = Starter.wsh.ToList(cls.data)
	End If
	Return ret
End Sub

Sub initgraph(graphx As LineChart,legend As String,title As String, myfloat() As Float,myxvals() As String)
	graphx.LegendShapeSize = 7.0        'this line of code needs to be before graph.setTheLegendPositionAndForm("BELOW_CHART_CENTER", "CIRCLE")
	graphx.setTheLegendPositionAndForm("BELOW_CHART_CENTER", "SQUARE")    'pass strings from the above comments
  
	graphx.TheLegendColor = Colors.Magenta
	graphx.TheLegendTextSize = 15.0
	graphx.LegendTitle = legend'"Cosine of x (x in degrees)"
  
	graphx.ChartDescription = title'"TITLE : A Cosine Curve"
	graphx.ChartDescriptionColor = Colors.Black
	graphx.ChartDescriptionTextSize = 15

	graphx.ValueTextColor = Colors.Black
	graphx.ValueTextSize = 7.0
  
	
	'myxvals(0)="Rocky"
	graphx.LegendText = myxvals
	graphx.ChartData = myfloat
	graphx.DoubleTapToZoomEnabled = True
	graphx.GridBackgroundColor = Colors.white
	graphx.DrawBorders = True
	graphx.DrawGridBackground = True
	graphx.PinchZoom = True
	graphx.ScaleEnabled = True
	graphx.BorderColor = Colors.Green
	graphx.BorderWidth = 5.0
	graphx.DrawDashedLine = False
	graphx.DrawGraphHollowCircles = False

	graphx.DrawGraphValues = False
	graphx.GraphCircleSize = 0.0
	graphx.DrawAxisLine = True
	graphx.DrawXaxisGridLines = True
	graphx.DrawYaxisGridLines = True
	graphx.GraphLineColor = Colors.Cyan
	graphx.GraphLineWidth = 2.0
  
	'TOP, BOTTOM, BOTH_SIDED, TOP_INSIDE, BOTTOM_INSIDE
	graphx.XaxisLabelPosition = "TOP"
	graphx.XaxisTextColor = Colors.Red
	graphx.XaxisTextSize = 15.0
  
	graphx.YaxisTextColor = Colors.Yellow
	graphx.YaxisTextSize = 15.0
	graphx.LineData = myfloat.Length   'this number must be the same as the number of elements in the above arrays
	
End Sub


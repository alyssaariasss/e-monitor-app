B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	'xyxyxyxyxyxyxy
	Dim bkgimage As ImageView
	Dim DataGrid1 As Table
	Dim btnrefresh As Button
	Dim btnback As Button

	Dim QLabel4 As Label
	
	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")
	Dim btnfilter As Button
	Dim linenum As EditText
	Dim QLabel7 As Label
End Sub
'clsTest.Initialize(Me, "clsTest")
'clsTest.AddToParent(Activity,0,0,100%x,100%y)
Public Sub AddToParent(Parent As Activity, Left As Int, Top As Int, Width As Int,Height As Int)
	mBase.Initialize("mBase")
	Parent.AddView(mBase, Left, Top, Width, Height)
	GTKForms
End Sub
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	'xyxyxyxyxyxyxy
	bkgimage.Initialize("bkgimage")
	DataGrid1.Initialize(Me,"DataGrid1",4)
	'DataGrid1.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,DataGrid1,"History")
	btnrefresh.Initialize("btnrefresh")
	btnback.Initialize("btnback")

	QLabel4.Initialize("QLabel4")
	btnfilter.Initialize("btnfilter")
	linenum.Initialize("linenum")
	QLabel7.Initialize("QLabel7")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	'xyxyxyxyxyxyxy
	mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"history bg.png",bkgimage.Width,bkgimage.Height,False)
	DataGrid1.AddToParent(mBase,0.12 * mBase.Width,0.23 * mBase.Height,0.74 * mBase.Width,0.68 * mBase.Height)
	'DataGrid1.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	'DataGrid1.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))
	btnrefresh.TextColor = 0xff000000
	btnrefresh.Text = "Refresh"
	mBase.AddView(btnrefresh,0.85 * mBase.Width,0.04 * mBase.Height,0.06 * mBase.Width,0.03 * mBase.Height)
	btnback.TextColor = 0xff000000
	btnback.Text = ""
	Starter.image(btnrefresh,"refresh button.png")
	Starter.image(btnback,"back button.png")
	Starter.image(btnfilter,"update button.png")
	mBase.AddView(btnback,0.07 * mBase.Width,0.03 * mBase.Height,0.09 * mBase.Width,0.05 * mBase.Height)

	btnrefresh.TextColor = 0xffffffff
	btnback.Text = ""
	QLabel4.Color =  0x00ffffff
	QLabel4.TextColor = 0xfffdb818
	QLabel4.Gravity = Gravity.CENTER
	QLabel4.Text = "H I S T O R Y"
	QLabel4.TextSize = 28
	QLabel4.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel4,0.30 * mBase.Width,0.03 * mBase.Height,0.47 * mBase.Width,0.05 * mBase.Height)
	QLabel4.Gravity = Gravity.Left
	btnfilter.TextColor = 0xffffffff
	btnfilter.Text = "Filter"
	mBase.AddView(btnfilter,0.56 * mBase.Width,0.12 * mBase.Height,0.23 * mBase.Width,0.07 * mBase.Height)
	QLabel7.Color =  0x00ffffff
	QLabel7.TextColor = 0xff000000
	QLabel7.Gravity = Gravity.Left
	QLabel7.Text = "Enter Line #"
	QLabel7.TextSize = 12
	QLabel7.Typeface = sourcesanspro.DEFAULT_BOLD
	
	linenum.Color =  0xfff6f7f7
	linenum.TextColor = 0xff000000
	linenum.Gravity = Gravity.CENTER
	linenum.Text = "0"
	Starter.image(linenum,"history box.png")
	mBase.AddView(linenum,0.38 * mBase.Width,0.12 * mBase.Height,0.15 * mBase.Width,0.07 * mBase.Height)
	
	mBase.AddView(QLabel7,0.17 * mBase.Width,0.14 * mBase.Height,0.25 * mBase.Width,0.05 * mBase.Height)
	btnrefresh.Text = ""
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
Sub DataGrid1_CellClick (Col As Int, Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = DataGrid1.GetValue(Col, Row)
	ToastMessageShow(val,False)
End Sub

Sub btnfilter_click()
	Dim cls As clsParser
	Dim sql As String=$"select * from history where Line='${linenum.Text}'"$
	cls=Starter.QuerryServer("HIST",Chr(13),sql)
	Do While Starter.mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	Log(cls.data)
	If cls.data<>"" Then
		Starter.wsh.DataGrid(DataGrid1,cls.data,"LIne,State,KW,Date")
	End If
End Sub

Sub btnrefresh_click()
	Dim cls As clsParser
	Dim sql As String=$"select * from history"$
	cls=Starter.QuerryServer("HIST",Chr(13),sql)
	Do While Starter.mapparser.Get(cls)="NOTFINISH"
		Sleep(1)
	Loop
	Log(cls.data)
	If cls.data<>"" Then
	Starter.wsh.DataGrid(DataGrid1,cls.data,"LIne,State,KW,Date")
	End If
End Sub
Sub btnback_click()
	Dim frmmain1 As frmmain=Starter.frmmain1
	frmmain1.Visible=True
	setVisible(False)
End Sub

Public Sub getVisible() As Boolean
	Return mBase.Visible
End Sub
Public Sub setVisible(flag As Boolean)
	mBase.Visible=flag
End Sub
Public Sub SetLayout(Left As Int,Top As Int,Width As Int,Height As Int)
	mBase.SetLayout(Left,Top,Width,Height )
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub



































































































































































































































































































































































































































































































































































































































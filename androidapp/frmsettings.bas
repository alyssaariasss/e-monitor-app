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
	Dim btnback As Button
	Dim QLabel3 As Label
	Dim txttime1 As EditText
	Dim QLabel5 As Label
	Dim txtkw1 As EditText
	Dim btnupdate1 As Button
	Dim QLabel8 As Label
	Dim txttime2 As EditText
	Dim QLabel10 As Label
	Dim txtkw2 As EditText
	Dim QLabel12 As Label
	Dim txttime3 As EditText
	Dim QLabel14 As Label
	Dim txtkw3 As EditText
	Dim btnupdate2 As Button
	Dim btnupdate3 As Button

	Dim settingsTitle As Label
	Dim line1Title As Label
	Dim limit1Title As Label
	Dim line2Title As Label
	Dim limit2Title As Label
	Dim line3Title As Label
	Dim limit3Title As Label
	
	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")

	Dim btnrefresh1 As Button
	Dim btnvoice As Button
	Dim lastedit1 As Int
	Dim lastedit2 As Int
	Dim lastedit3 As Int
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
	btnback.Initialize("btnback")
	QLabel3.Initialize("QLabel3")
	txttime1.Initialize("txttime1")
	QLabel5.Initialize("QLabel5")
	txtkw1.Initialize("txtkw1")
	btnupdate1.Initialize("btnupdate1")
	QLabel8.Initialize("QLabel8")
	txttime2.Initialize("txttime2")
	QLabel10.Initialize("QLabel10")
	txtkw2.Initialize("txtkw2")
	QLabel12.Initialize("QLabel12")
	txttime3.Initialize("txttime3")
	QLabel14.Initialize("QLabel14")
	txtkw3.Initialize("txtkw3")
	btnupdate2.Initialize("btnupdate2")
	btnupdate3.Initialize("btnupdate3")

	settingsTitle.Initialize("settingsTitle")
	line1Title.Initialize("line1Title")
	limit1Title.Initialize("limit1Title")
	line2Title.Initialize("line2Title")
	limit2Title.Initialize("limit2Title")
	line3Title.Initialize("line3Title")
	limit3Title.Initialize("limit3Title")

	btnrefresh1.Initialize("btnrefresh1")
	btnvoice.Initialize("btnvoice")
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
	mBase.AddView(bkgimage,0.01 * mBase.Width,-0.01 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"settings bg.png",bkgimage.Width,bkgimage.Height,False)
	mBase.AddView(btnback,0.06 * mBase.Width,0.03 * mBase.Height,0.09 * mBase.Width,0.05 * mBase.Height)
	QLabel3.Color =  0x00ffffff
	QLabel3.TextColor = 0xff000000
	QLabel3.Gravity = Gravity.Left
	QLabel3.Text = "Time 1"
	mBase.AddView(QLabel3,0.16 * mBase.Width,0.28 * mBase.Height,0.12 * mBase.Width,0.04 * mBase.Height)
	txttime1.Color =  0xffffffff
	txttime1.TextColor = 0xff000000
	txttime1.Gravity = Gravity.Left
	txttime1.Text = "0"
	mBase.AddView(txttime1,0.29 * mBase.Width,0.26 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txttime1.TextColor=Colors.black
	QLabel5.Color =  0x00ffffff
	QLabel5.TextColor = 0xff000000
	QLabel5.Gravity = Gravity.Left
	QLabel5.Text = "KW 1"
	mBase.AddView(QLabel5,0.54 * mBase.Width,0.28 * mBase.Height,0.12 * mBase.Width,0.04 * mBase.Height)
	txtkw1.Color =  0xffffffff
	txtkw1.TextColor = 0xff000000
	txtkw1.Gravity = Gravity.Left
	txtkw1.Text = "0"
	mBase.AddView(txtkw1,0.65 * mBase.Width,0.26 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txtkw1.TextColor=Colors.black
	btnupdate1.TextColor = 0xff000000
	btnupdate1.Text = "Update"
	btnupdate1.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(btnupdate1,0.62 * mBase.Width,0.15 * mBase.Height,0.23 * mBase.Width,0.07 * mBase.Height)
	QLabel8.Color =  0x00ffffff
	QLabel8.TextColor = 0xff000000
	QLabel8.Gravity = Gravity.Left
	QLabel8.Text = "KW 2"
	mBase.AddView(QLabel8,0.16 * mBase.Width,0.56 * mBase.Height,0.12 * mBase.Width,0.04 * mBase.Height)
	txttime2.Color =  0xffffffff
	txttime2.TextColor = 0xff000000
	txttime2.Gravity = Gravity.Left
	txttime2.Text = "0"
	mBase.AddView(txttime2,0.29 * mBase.Width,0.54 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txttime2.TextColor=Colors.black
	QLabel10.Color =  0x00ffffff
	QLabel10.TextColor = 0xff000000
	QLabel10.Gravity = Gravity.Left
	QLabel10.Text = "KW 2"
	mBase.AddView(QLabel10,0.54 * mBase.Width,0.56 * mBase.Height,0.12 * mBase.Width,0.05 * mBase.Height)
	txtkw2.Color =  0xffffffff
	txtkw2.TextColor = 0xff000000
	txtkw2.Gravity = Gravity.Left
	txtkw2.Text = "0"
	mBase.AddView(txtkw2,0.65 * mBase.Width,0.54 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txtkw2.TextColor=Colors.black
	QLabel12.Color =  0x00ffffff
	QLabel12.TextColor = 0xff000000
	QLabel12.Gravity = Gravity.Left
	QLabel12.Text = "KW 3"
	mBase.AddView(QLabel12,0.16 * mBase.Width,0.84 * mBase.Height,0.12 * mBase.Width,0.05 * mBase.Height)
	txttime3.Color =  0xffffffff
	txttime3.TextColor = 0xff000000
	txttime3.Gravity = Gravity.Left
	txttime3.Text = "0"
	mBase.AddView(txttime3,0.29 * mBase.Width,0.82 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txttime3.TextColor=Colors.black
	QLabel14.Color =  0x00ffffff
	QLabel14.TextColor = 0xff000000
	QLabel14.Gravity = Gravity.Left
	QLabel14.Text = "KW 3"
	mBase.AddView(QLabel14,0.55 * mBase.Width,0.84 * mBase.Height,0.12 * mBase.Width,0.05 * mBase.Height)
	txtkw3.Color =  0xffffffff
	txtkw3.TextColor = 0xff000000
	txtkw3.Gravity = Gravity.Left
	txtkw3.Text = "0"
	mBase.AddView(txtkw3,0.66 * mBase.Width,0.82 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	txtkw3.TextColor=Colors.black
	btnupdate2.TextColor = 0xff000000
	btnupdate2.Text = "Update"
	btnupdate2.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(btnupdate2,0.62 * mBase.Width,0.44 * mBase.Height,0.23 * mBase.Width,0.07 * mBase.Height)
	btnupdate3.TextColor = 0xff000000
	btnupdate3.Text = "Update"
	btnupdate3.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(btnupdate3,0.64 * mBase.Width,0.72 * mBase.Height,0.23 * mBase.Width,0.07 * mBase.Height)
	Starter.image(btnupdate1,"update button.png")
	Starter.image(btnupdate2,"update button.png")
	Starter.image(btnupdate3,"update button.png")
	Starter.image(btnback,"back button.png")
	Starter.image(btnrefresh1,"refresh button.png")
	Starter.image(btnvoice,"voice button.png")
	
	settingsTitle.Color =  0x00ffffff
	settingsTitle.TextColor = 0xfffdb818
	settingsTitle.Gravity = Gravity.Left
	settingsTitle.Text = "S E T T I N G S"
	settingsTitle.TextSize = 28
	settingsTitle.Typeface = sourcesanspro.DEFAULT_BOLD

	mBase.AddView(settingsTitle,0.26 * mBase.Width,0.03 * mBase.Height,0.55 * mBase.Width,0.05 * mBase.Height)
	line1Title.Color =  0x00ffffff
	line1Title.TextColor = 0xff000000
	line1Title.Gravity = Gravity.Left
	line1Title.Text = "Line 1"
	line1Title.TextSize = 18
	line1Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(line1Title,0.16 * mBase.Width,0.16 * mBase.Height,0.25 * mBase.Width,0.05 * mBase.Height)
	limit1Title.Color =  0x00ffffff
	limit1Title.TextColor = 0xff4a5759
	limit1Title.Gravity = Gravity.Left
	limit1Title.Text = "Set time / kWh limit"
	limit1Title.TextSize = 14
	limit1Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(limit1Title,0.16 * mBase.Width,0.21 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)
	btnupdate1.TextColor = 0xffffffff
	settingsTitle.Gravity = Gravity.Left
	btnupdate2.TextColor = 0xffffffff
	btnupdate3.TextColor = 0xffffffff

	line2Title.Color =  0x00ffffff
	line2Title.TextColor = 0xff000000
	line2Title.Gravity = Gravity.Left
	line2Title.Text = "Line 2"
	line2Title.TextSize = 18
	line2Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(line2Title,0.16 * mBase.Width,0.44 * mBase.Height,0.25 * mBase.Width,0.05 * mBase.Height)
	limit2Title.Color =  0x00ffffff
	limit2Title.TextColor = 0xff4a5759
	limit2Title.Gravity = Gravity.Left
	limit2Title.Text = "Set time / kWh limit"
	limit2Title.TextSize = 14
	limit2Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(limit2Title,0.16 * mBase.Width,0.49 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)
	line3Title.Color =  0x00ffffff
	line3Title.TextColor = 0xff000000
	line3Title.Gravity = Gravity.Left
	line3Title.Text = "Line 3"
	line3Title.TextSize = 18
	line3Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(line3Title,0.16 * mBase.Width,0.72 * mBase.Height,0.25 * mBase.Width,0.05 * mBase.Height)
	limit3Title.Color =  0x00ffffff
	limit3Title.TextColor = 0xff4a5759
	limit3Title.Gravity = Gravity.Left
	limit3Title.Text = "Set time / kWh limit"
	limit3Title.TextSize = 14
	limit3Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(limit3Title,0.16 * mBase.Width,0.78 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)
	btnback.Text = ""
	btnback.TextColor = 0xff000000
	btnrefresh1.TextColor = 0xff000000
	btnrefresh1.Text = ""
	mBase.AddView(btnrefresh1,0.86 * mBase.Width,0.04 * mBase.Height,0.06 * mBase.Width,0.03 * mBase.Height)
	btnvoice.TextColor = 0xff000000
	btnvoice.Text = ""
	mBase.AddView(btnvoice,0.80 * mBase.Width,0.88 * mBase.Height,0.16 * mBase.Width,0.08 * mBase.Height)
	QLabel3.Text = "Time"
	QLabel5.Text = "kWh"
	QLabel8.Text = "Time"
	QLabel10.Text = "kWh"
	QLabel12.Text = "Time"
	QLabel14.Text = "kWh"
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
Sub btnback_click()
	Dim frmmain1 As frmmain=Starter.frmmain1
	frmmain1.Visible=True
	setVisible(False)
End Sub
Sub btnrefresh1_click()
	Dim cc As clswidget
	cc.Initialize(Me)
	
	Dim sql As String=$"select * from `trigger1`"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
	
	If l.Size<>0 Then
		'Dim l As List= Starter.wsh.ToList(cls.data)
		'If l.Size<>0 Then
			
		Dim ll As List
		ll.Initialize
		ll=l.get(0)
		txtkw1.Text=ll.Get(1)
		txttime1.Text=ll.Get(0)
	End If

	Dim sql As String=$"select * from `trigger2`"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
	
	If l.Size<>0 Then
		'Dim l As List= Starter.wsh.ToList(cls.data)
		'If l.Size<>0 Then
			
		Dim ll As List
		ll.Initialize
		ll=l.get(0)
		txtkw2.Text=0.012
		txttime2.Text=ll.Get(0)
	End If
	
	Dim sql As String=$"select * from `trigger3`"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
	
	If l.Size<>0 Then
		'Dim l As List= Starter.wsh.ToList(cls.data)
		'If l.Size<>0 Then
			
		Dim ll As List
		ll.Initialize
		ll=l.get(0)
		txtkw3.Text=ll.Get(1)
		txttime3.Text=ll.Get(0)
	End If
End Sub
Sub btnvoice_click()
	CallSub(Main,"Speak")
End Sub
Sub QLabel3_click()
End Sub
Private Sub txttime1_TextChanged (Old As String, New As String)
	lastedit1=1
End Sub
Sub QLabel5_click()
End Sub
Private Sub txtkw1_TextChanged (Old As String, New As String)
	lastedit1=0
End Sub
Sub QLabel8_click()
End Sub
Private Sub txttime2_TextChanged (Old As String, New As String)
	lastedit2=1
End Sub
Sub QLabel10_click()
End Sub
Private Sub txtkw2_TextChanged (Old As String, New As String)
	lastedit2=0
End Sub
Sub QLabel12_click()
End Sub
Private Sub txttime3_TextChanged (Old As String, New As String)
	lastedit3=1
End Sub
Sub QLabel14_click()
End Sub
Private Sub txtkw3_TextChanged (Old As String, New As String)
	lastedit3=0
End Sub
Sub btnupdate1_click()
	If lastedit1=0 Then
		txttime1.Text="0"
	Else
		txtkw1.Text="0"
	End If
	Dim cc As clswidget
	cc.Initialize(Me)
	Dim cls As clsParser
	Dim sql As String=$"UPDATE `trigger1` SET Time='${txttime1.Text}',KW='${txtkw1.Text}'"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (Result1 As List)
	ToastMessageShow("LINE 1 LIMIT SET", False)
End Sub
Sub btnupdate2_click()
	If lastedit2=0 Then
		txttime2.Text="0"
	Else
		txtkw2.Text="0"
	End If
	Dim cc As clswidget
	cc.Initialize(Me)
	Dim cls As clsParser
	Dim sql As String=$"UPDATE `trigger2` SET Time='${txttime2.Text}',KW='${txtkw2.Text}'"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (Result1 As List)
	ToastMessageShow("LINE 2 LIMIT SET", False)
End Sub
Sub btnupdate3_click()
	If lastedit3=0 Then
		txttime3.Text="0"
	Else
		txtkw3.Text="0"
	End If
	Dim cc As clswidget
	cc.Initialize(Me)
	Dim cls As clsParser
	Dim sql As String=$"UPDATE `trigger3` SET Time='${txttime3.Text}',KW='${txtkw3.Text}'"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (Result1 As List)
	ToastMessageShow("LINE 3 LIMIT SET", False)
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

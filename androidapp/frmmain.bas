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
	Dim bkgimage As ImageView
	
	Dim bkgimage As ImageView
	Dim QPushButton1 As Button
	Dim QPushButton2 As Button
	Dim QPushButton3 As Button
	
	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")
	Dim QLabel4 As ImageView
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
	bkgimage.Initialize("bkgimage")
	QPushButton1.Initialize("QPushButton1")
	QPushButton2.Initialize("QPushButton2")
	QPushButton3.Initialize("QPushButton3")
	
	
	QLabel4.Initialize("QLabel4")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"cat.png",bkgimage.Width,bkgimage.Height,False)
	mBase.AddView(QPushButton1,0.23 * mBase.Width,0.32 * mBase.Height,0.54 * mBase.Width,0.12 * mBase.Height)
	mBase.AddView(QPushButton2,0.23 * mBase.Width,0.50 * mBase.Height,0.54 * mBase.Width,0.12 * mBase.Height)
	'QPushButton1.Text="MALL OFF"
	QPushButton1.TextColor=Colors.Blue
	'QPushButton2.Text="FEU OFF"
	QPushButton2.TextColor=Colors.Blue
	'QPushButton3.Text="ALABANG OFF"
	QPushButton3.TextColor=Colors.Blue
	Starter.image(QPushButton1,"main button.png")
	Starter.image(QPushButton2,"main button.png")
	Starter.image(QPushButton3,"main button.png")
	
	mBase.AddView(QPushButton3,0.23 * mBase.Width,0.68 * mBase.Height,0.54 * mBase.Width,0.12 * mBase.Height)
	QPushButton1.TextColor = 0xff000000
	QPushButton1.Text = "REALTIME"
	QPushButton1.Typeface = sourcesanspro.DEFAULT_BOLD
	QPushButton2.TextColor = 0xff000000
	QPushButton2.Text = "SETTINGS"
	QPushButton2.Typeface = sourcesanspro.DEFAULT_BOLD
	QPushButton3.TextColor = 0xff000000
	QPushButton3.Text = "HISTORY"
	QPushButton3.Typeface = sourcesanspro.DEFAULT_BOLD
	QPushButton1.TextColor = 0xffffffff
	QPushButton2.TextColor = 0xffffffff
	QPushButton3.TextColor = 0xffffffff

	mBase.AddView(QLabel4,0.33 * mBase.Width,0.07 * mBase.Height,0.33 * mBase.Width,0.17 * mBase.Height)
	QLabel4.Bitmap = LoadBitmapResize(File.DirAssets,"driver module.png",QLabel4.Width,QLabel4.Height,False)
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
Sub QPushButton1_click()
	
	Dim x As frmcontrol=Starter.frmcontrol1
	x.Visible=True
	setVisible(False)
	
	
	
End Sub
Sub QPushButton2_click()
	Dim x As frmsettings=Starter.frmsettings1
	x.Visible=True
	setVisible(False)
	Dim cc As clswidget
	cc.Initialize(Me)
	
	Dim cls As clsParser
	Dim sql As String=$"select * from `price`"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
	
	If l.Size<>0 Then
		'Dim l As List= Starter.wsh.ToList(cls.data)
		'If l.Size<>0 Then
			
		Dim ll As List
		ll.Initialize
		ll=l.get(0)
		
		Starter.price=  ll.Get(0)
	End If
	
	Dim sql As String=$"select * from `trigger1`"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
	
	If l.Size<>0 Then
		'Dim l As List= Starter.wsh.ToList(cls.data)
		'If l.Size<>0 Then
			
			Dim ll As List
			ll.Initialize
			ll=l.get(0)
			x.txtkw1.Text=ll.Get(1)
		x.txttime1.Text=ll.Get(0)
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
		x.txtkw2.Text=ll.Get(1)
		x.txttime2.Text=ll.Get(0)
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
		x.txtkw3.Text=ll.Get(1)
		x.txttime3.Text=ll.Get(0)
	End If
End Sub

Sub QPushButton3_click()
	Dim frmhist1 As frmhist=Starter.frmhist1
	frmhist1.Visible=True
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




































































































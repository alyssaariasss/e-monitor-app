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
	Dim QLabel5 As Label
	Dim txtEmail As EditText
	Dim btnupdate3 As Button
	Dim settingsTitle As Label
	Dim QLabel5 As Label
	Dim QLabel6 As Label
	Dim QLabel7 As Label
	Dim txtPassword As EditText
	
	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")

	Dim QLabel8 As Label

	Dim QLineEdit7 As EditText
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
	QLabel5.Initialize("QLabel5")
	txtEmail.Initialize("txtEmail")
	btnupdate3.Initialize("btnupdate3")
	settingsTitle.Initialize("settingsTitle")
	QLabel5.Initialize("QLabel5")
	QLabel6.Initialize("QLabel6")
	QLabel7.Initialize("QLabel7")
	QLabel8.Initialize("QLabel8")
	txtPassword.Initialize("txtPassword")
	QLineEdit7.Initialize("QLineEdit7")
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
	mBase.AddView(bkgimage,0.00 * mBase.Width,-0.01 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"cat.png",bkgimage.Width,bkgimage.Height,False)
	QLabel5.Color =  0x00ffffff
	QLabel5.TextColor = 0xff000000
	QLabel5.Gravity = Gravity.Left
	QLabel5.Text = "Username"
	QLabel5.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel5,0.11 * mBase.Width,0.41 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	
	txtEmail.Color =  0xffffffff
	txtEmail.TextColor = 0xfff6f7f7
	txtEmail.Gravity = Gravity.Left
	txtEmail.Text = "admin"
	mBase.AddView(txtEmail,0.31 * mBase.Width,0.39 * mBase.Height,0.57 * mBase.Width,0.06 * mBase.Height)
	
	txtEmail.TextColor=Colors.black
	btnupdate3.TextColor = 0xffffffff
	btnupdate3.Text = "Login"
	Starter.image(btnupdate3,"main button.png")
	mBase.AddView(btnupdate3,0.11 * mBase.Width,0.68 * mBase.Height,0.78 * mBase.Width,0.07 * mBase.Height)
	
	settingsTitle.Color =  0x00ffffff
	settingsTitle.TextColor = 0xfffdb818
	settingsTitle.Gravity = Gravity.CENTER
	settingsTitle.Text = "L O G I N"
	settingsTitle.TextSize = 28
	settingsTitle.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(settingsTitle,0.28 * mBase.Width,0.14 * mBase.Height,0.45 * mBase.Width,0.05 * mBase.Height)
	
	QLabel7.Color =  0x00ffffff
	QLabel7.TextColor = 0xff000000
	QLabel7.Gravity = Gravity.Left
	QLabel7.Text = "Password"
	QLabel7.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel7,0.11 * mBase.Width,0.48 * mBase.Height,0.20 * mBase.Width,0.06 * mBase.Height)
	
	txtPassword.Color =  0x00ffffff
	txtPassword.TextColor = 0xfff6f7f7
	txtPassword.Gravity = Gravity.Left
	txtPassword.Text = "1234"
	mBase.AddView(txtPassword,0.31 * mBase.Width,0.47 * mBase.Height,0.57 * mBase.Width,0.06 * mBase.Height)
	
	txtEmail.Color =  0xfff6f7f7
	txtEmail.TextColor = 0xff000000
	txtPassword.Color =  0xfff6f7f7
	txtPassword.TextColor = 0xff000000
	
	QLabel8.Text = "Login to view your household's electricity consumption."
	txtPassword.TextColor=Colors.black

	QLabel8.Color =  0x00ffffff
	QLabel8.TextColor = 0xff000000
	QLabel8.Gravity = Gravity.CENTER
	mBase.AddView(QLabel8,0.09 * mBase.Width,0.23 * mBase.Height,0.82 * mBase.Width,0.14 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
Sub QLabel5_click()
End Sub
Sub txtEmail_click()
End Sub
Sub btnupdate3_click()
	If txtEmail.Text="admin" And txtPassword.Text="1234" Then
		Dim frmmain1 As frmmain=Starter.frmmain1
		frmmain1.Visible=True
		setVisible(False)
	Else
		ToastMessageShow("Invalid username/password",False)
	End If		
End Sub
Sub settingsTitle_click()
End Sub
Sub QLabel6_click()
End Sub
Sub QLabel7_click()
End Sub
Sub txtPassword_click()
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


































































































































































































































































































































































































































































































































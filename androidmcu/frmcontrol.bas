B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
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
	Dim QLabel1 As Label
	Dim btnback As Button
	Dim bkgimage As ImageView
	Dim on1 As Button
	Dim on3 As Button
	Dim on2 As Button
	Dim off1 As Button
	Dim off2 As Button
	Dim off3 As Button
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
	QLabel1.Initialize("QLabel1")
	btnback.Initialize("btnback")
	on1.Initialize("on1")
	on3.Initialize("on3")
	on2.Initialize("on2")
	off1.Initialize("off1")
	off2.Initialize("off2")
	off3.Initialize("off3")
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
	QLabel1.Color =  0x00ffffff
	QLabel1.TextColor = Colors.White
	QLabel1.Textsize = 18
	QLabel1.Gravity = Gravity.Left
	QLabel1.Text = "QLabel1"
	mBase.AddView(QLabel1,0.10 * mBase.Width,0.04 * mBase.Height,0.79 * mBase.Width,0.53 * mBase.Height)
	btnback.TextColor = 0xff000000
	btnback.Text = "<<"
	mBase.AddView(btnback,0.10 * mBase.Width,0.57 * mBase.Height,0.20 * mBase.Width,0.07 * mBase.Height)
	on1.TextColor = 0xff000000
	on1.Text = "ON1"
	mBase.AddView(on1,0.33 * mBase.Width,0.57 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	on3.TextColor = 0xff000000
	on3.Text = "ON3"
	mBase.AddView(on3,0.57 * mBase.Width,0.57 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	on2.TextColor = 0xff000000
	on2.Text = "ON2"
	mBase.AddView(on2,0.45 * mBase.Width,0.57 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	off1.TextColor = 0xff000000
	off1.Text = "OFF1"
	mBase.AddView(off1,0.33 * mBase.Width,0.65 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	off2.TextColor = 0xff000000
	off2.Text = "OFF2"
	mBase.AddView(off2,0.45 * mBase.Width,0.65 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	off3.TextColor = 0xff000000
	off3.Text = "OFF3"
	mBase.AddView(off3,0.57 * mBase.Width,0.65 * mBase.Height,0.11 * mBase.Width,0.07 * mBase.Height)
	off2.TextColor = 0xff000000
	off2.Text = "OFF2"
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If

Sub btnback_click()
	Dim frmmain1 As frmmain=Starter.frmmain1
	frmmain1.Visible=True
	setVisible(False)
End Sub

Sub bkgimage_click()
End Sub
Sub cbolocation_ItemClick (Position As Int, Value As Object)
End Sub
Sub btnavailability_click()
End Sub
Sub seat2_click()
End Sub
Sub btnnotif_click()
	'Starter.wsh.SendClient(cbolocation.SelectedItem&"#")
End Sub
Sub on1_click()
	Starter.Println("SSRON1#")
End Sub
Sub on2_click()
	Starter.Println("SSRON2#")
End Sub
Sub on3_click()
	Starter.Println("SSRON3#")
End Sub
Sub off1_click()
	Starter.Println("SSROFF1#")
End Sub
Sub off2_click()
	Starter.Println("SSROFF2#")
End Sub
Sub off3_click()
	Starter.Println("SSROFF3#")
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






































































































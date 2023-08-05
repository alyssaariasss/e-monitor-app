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
	Dim btnavailability As Button
	Dim btnback As Button
	Dim webkit1 As WebView

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
	btnavailability.Initialize("btnavailability")
	btnback.Initialize("btnback")
	webkit1.Initialize("webkit1")
	btnback.Text="<<"
	btnback.TextColor=Colors.Blue
	btnavailability.Text="Location"
	btnavailability.TextColor=Colors.Blue
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
	mBase.AddView(btnavailability,0.24 * mBase.Width,0.02 * mBase.Height,0.54 * mBase.Width,0.12 * mBase.Height)
	mBase.AddView(btnback,0.03 * mBase.Width,0.02 * mBase.Height,0.19 * mBase.Width,0.12 * mBase.Height)
	mBase.AddView(webkit1,0.03 * mBase.Width,0.14 * mBase.Height,0.95 * mBase.Width,0.81 * mBase.Height)
	webkit1.Color =  0x00ffffff
	webkit1.LoadUrl("https://www.google.com.ph/maps/place/Jorge+Bocobo+St,+Manila,+Metro+Manila/@14.5732047,120.9840679,17.62z/data=!4m6!3m5!1s0x3397ca2a386ea429:0x565401dd4396c2d0!8m2!3d14.5744647!4d120.9845263!16s%2Fg%2F1tfjhnp7?hl=en")
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
Sub btnavailability_click()
End Sub
Sub btnback_click()
	Dim frmmain1 As frmmain=Starter.frmmain1
	frmmain1.Visible=True
	setVisible(False)
End Sub
Sub webkit1_click()
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

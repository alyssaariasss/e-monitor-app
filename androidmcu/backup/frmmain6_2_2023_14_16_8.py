﻿B4A=true
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
	Dim QPushButton1 As Button
	Dim QPushButton2 As Button

	Dim bkgimage As ImageView
	Dim QPushButton1 As Button
	Dim QPushButton2 As Button
	Dim QPushButton3 As Button
	Dim bkgimage As ImageView
	Dim QPushButton1 As Button
	Dim QPushButton2 As Button
	Dim QPushButton3 As Button
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
	mBase.AddView(QPushButton1,0.32 * mBase.Width,0.15 * mBase.Height,0.36 * mBase.Width,0.17 * mBase.Height)
	mBase.AddView(QPushButton2,0.32 * mBase.Width,0.42 * mBase.Height,0.36 * mBase.Width,0.17 * mBase.Height)
	'QPushButton1.Text="MALL OFF"
	QPushButton1.TextColor=Colors.Blue
	'QPushButton2.Text="FEU OFF"
	QPushButton2.TextColor=Colors.Blue
	'QPushButton3.Text="ALABANG OFF"
	QPushButton3.TextColor=Colors.Blue
	Starter.image(QPushButton1,"button 3.png")
	Starter.image(QPushButton2,"button 2.png")
	Starter.image(QPushButton3,"button 1.png")
	
	mBase.AddView(QPushButton3,0.32 * mBase.Width,0.70 * mBase.Height,0.36 * mBase.Width,0.17 * mBase.Height)
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
	'Dim frmcontrol1 As frmcontrol=Starter.frmcontrol1
	'frmcontrol1.Visible=True
	'setVisible(False)
	Dim led As String=Starter.led
	led = led.CharAt(0)&"0"&led.CharAt(2)
	Starter.led=led
	Starter.Println("LED" &led   &Chr(13))

	For Each k1 As String In Starter.clientsmap.Keys
		Starter.wsh.clientid=k1
		
		Starter.wsh.SendClient("notifarrivedEJEEP is now arriving at FEU#")
	Next
	
End Sub

Sub QPushButton3_click()
	'Dim frmcontrol1 As frmcontrol=Starter.frmcontrol1
	'frmcontrol1.Visible=True
	'setVisible(False)
	Dim led As String=Starter.led
	led = led.CharAt(0)&led.CharAt(1)&"0"
	Starter.led=led
	Starter.Println("LED" &led   &Chr(13))
	For Each k1 As String In Starter.clientsmap.Keys
		Starter.wsh.clientid=k1
		
		Starter.wsh.SendClient("notifarrivedEJEEP is now arriving at South Station#")
	Next
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




















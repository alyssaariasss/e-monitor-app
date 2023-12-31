﻿B4A=true
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
	Dim on1 As Button
	Dim on3 As Button
	Dim on2 As Button
	Dim off1 As Button
	Dim off2 As Button
	Dim off3 As Button
	Dim realtimeTitle As Label
	
	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")
	
	Dim line2Title As Label
	Dim line1Title As Label
	Dim line3Title As Label
	Dim kwh1 As Label
	Dim QLabel18 As Label
	Dim QLabel17 As Label
	Dim power1 As Label
	Dim voltage1 As Label
	Dim QLabel20 As Label
	Dim current1 As Label
	Dim QLabel22 As Label
	Dim cost1 As Label
	Dim kwh2 As Label
	Dim QLabel25 As Label
	Dim current2 As Label
	Dim QLabel27 As Label
	Dim voltage2 As Label
	Dim QLabel29 As Label
	Dim power2 As Label
	Dim QLabel31 As Label
	Dim cost2 As Label
	Dim kwh3 As Label
	Dim QLabel34 As Label
	Dim current3 As Label
	Dim QLabel36 As Label
	Dim voltage3 As Label
	Dim QLabel38 As Label
	Dim power3 As Label
	Dim QLabel40 As Label
	Dim cost3 As Label
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
	realtimeTitle.Initialize("realtimeTitle")
	line2Title.Initialize("line2Title")
	line1Title.Initialize("line1Title")
	line3Title.Initialize("line3Title")
	kwh1.Initialize("kwh1")
	QLabel18.Initialize("QLabel18")
	QLabel17.Initialize("QLabel17")
	power1.Initialize("power1")
	voltage1.Initialize("voltage1")
	QLabel20.Initialize("QLabel20")
	current1.Initialize("current1")
	QLabel22.Initialize("QLabel22")
	cost1.Initialize("cost1")
	kwh2.Initialize("kwh2")
	QLabel25.Initialize("QLabel25")
	current2.Initialize("current2")
	QLabel27.Initialize("QLabel27")
	voltage2.Initialize("voltage2")
	QLabel29.Initialize("QLabel29")
	power2.Initialize("power2")
	QLabel31.Initialize("QLabel31")
	cost2.Initialize("cost2")
	kwh3.Initialize("kwh3")
	QLabel34.Initialize("QLabel34")
	current3.Initialize("current3")
	QLabel36.Initialize("QLabel36")
	voltage3.Initialize("voltage3")
	QLabel38.Initialize("QLabel38")
	power3.Initialize("power3")
	QLabel40.Initialize("QLabel40")
	cost3.Initialize("cost3")
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
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"settings bg.png",bkgimage.Width,bkgimage.Height,False)
	
	QLabel1.Color =  0x00ffffff
	QLabel1.TextColor = 0xff000000
	QLabel1.Gravity = Gravity.Left
	
	Starter.image(on1,"update button.png")
	Starter.image(on2,"update button.png")
	Starter.image(on3,"update button.png")
	Starter.image(off1,"off button.png")
	Starter.image(off2,"off button.png")
	Starter.image(off3,"off button.png")
	Starter.image(btnback,"back button.png")
	
	btnback.Text = ""
	btnback.TextColor = 0xff000000

	realtimeTitle.Color =  0x00ffffff
	realtimeTitle.TextColor = 0xfffdb818
	realtimeTitle.Gravity = Gravity.Left
	realtimeTitle.Text = "R E A L T I M E"
	realtimeTitle.TextSize = 28
	realtimeTitle.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(realtimeTitle,0.24 * mBase.Width,0.03 * mBase.Height,0.55 * mBase.Width,0.05 * mBase.Height)
	on1.Text = "O N"
	on3.Text = "O N"
	on2.Text = "O N"
	on1.Typeface = sourcesanspro.DEFAULT_BOLD
	on2.Typeface = sourcesanspro.DEFAULT_BOLD
	on3.Typeface = sourcesanspro.DEFAULT_BOLD
	off1.Text = "O F F"
	off2.Text = "O F F"
	off3.Text = "O F F"
	off1.Typeface = sourcesanspro.DEFAULT_BOLD
	off2.Typeface = sourcesanspro.DEFAULT_BOLD
	off3.Typeface = sourcesanspro.DEFAULT_BOLD
	
	on1.TextColor = 0xffffffff
	on3.TextColor = 0xffffffff
	on2.TextColor = 0xffffffff
	off1.TextColor = 0xffffffff
	off2.TextColor = 0xffffffff
	off3.TextColor = 0xffffffff
	
	line2Title.Color =  0x00ffffff
	line2Title.TextColor = 0xff000000
	line2Title.Gravity = Gravity.Left
	line2Title.Text = "Line 2"
	line2Title.TextSize = 16
	line2Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	line1Title.Color =  0x00ffffff
	line1Title.TextColor = 0xff000000
	line1Title.Gravity = Gravity.Left
	line1Title.Text = "Line 1"
	line1Title.TextSize = 16
	line1Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	line3Title.Color =  0x00ffffff
	line3Title.TextColor = 0xff000000
	line3Title.Gravity = Gravity.Left
	line3Title.Text = "Line 3"
	line3Title.TextSize = 16
	line3Title.Typeface = sourcesanspro.DEFAULT_BOLD
	
	'LINE 1 CONTENTS
	kwh1.Color =  0x00ffffff
	kwh1.TextColor = 0xff000000
	kwh1.Gravity = Gravity.Left
	kwh1.Text = "kWh"
	kwh1.TextSize = 14
	kwh1.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(kwh1,0.14 * mBase.Width,0.20 * mBase.Height,0.33 * mBase.Width,0.04 * mBase.Height)
	
	QLabel18.Color =  0x00ffffff
	QLabel18.TextColor = 0xff000000
	QLabel18.Gravity = Gravity.Left
	QLabel18.Text = "Power"
	QLabel18.TextSize = 12
	QLabel18.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel18,0.51 * mBase.Width,0.25 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	QLabel17.Color =  0x00ffffff
	QLabel17.TextColor = 0xff000000
	QLabel17.Gravity = Gravity.Left
	QLabel17.Text = "Voltage"
	QLabel17.TextSize = 12
	QLabel17.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel17,0.14 * mBase.Width,0.29 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	power1.Color =  0x00ffffff
	power1.TextColor = 0xff000000
	power1.Gravity = Gravity.Left
	power1.Text = "Power 1"
	mBase.AddView(power1,0.69 * mBase.Width,0.25 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	voltage1.Color =  0x00ffffff
	voltage1.TextColor = 0xff000000
	voltage1.Gravity = Gravity.Left
	voltage1.Text = "Voltage 1"
	mBase.AddView(voltage1,0.31 * mBase.Width,0.29 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel20.Color =  0x00ffffff
	QLabel20.TextColor = 0xff000000
	QLabel20.Gravity = Gravity.Left
	QLabel20.Text = "Current"
	QLabel20.TextSize = 12
	QLabel20.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel20,0.14 * mBase.Width,0.25 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	current1.Color =  0x00ffffff
	current1.TextColor = 0xff000000
	current1.Gravity = Gravity.Left
	current1.Text = "Current 1"
	mBase.AddView(current1,0.31 * mBase.Width,0.25 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel22.Color =  0x00ffffff
	QLabel22.TextColor = 0xff000000
	QLabel22.Gravity = Gravity.Left
	QLabel22.Text = "Cost(Php)"
	QLabel22.TextSize = 12
	QLabel22.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel22,0.51 * mBase.Width,0.29 * mBase.Height,0.17 * mBase.Width,0.04 * mBase.Height)
	
	cost1.Color =  0x00ffffff
	cost1.TextColor = 0xff000000
	cost1.Gravity = Gravity.Left
	cost1.Text = "Cost 1"
	mBase.AddView(cost1,0.69 * mBase.Width,0.29 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	'LINE 2 CONTENTS
	kwh2.Color =  0x00ffffff
	kwh2.TextColor = 0xff000000
	kwh2.Gravity = Gravity.Left
	kwh2.Text = "kWh"
	kwh2.TextSize = 14
	kwh2.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(kwh2,0.14 * mBase.Width,0.48 * mBase.Height,0.33 * mBase.Width,0.04 * mBase.Height)
	
	QLabel25.Color =  0x00ffffff
	QLabel25.TextColor = 0xff000000
	QLabel25.Gravity = Gravity.Left
	QLabel25.Text = "Current"
	QLabel25.TextSize = 12
	QLabel25.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel25,0.14 * mBase.Width,0.53 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	current2.Color =  0x00ffffff
	current2.TextColor = 0xff000000
	current2.Gravity = Gravity.Left
	current2.Text = "Current 2"
	mBase.AddView(current2,0.31 * mBase.Width,0.53 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel27.Color =  0x00ffffff
	QLabel27.TextColor = 0xff000000
	QLabel27.Gravity = Gravity.Left
	QLabel27.Text = "Voltage"
	QLabel27.TextSize = 12
	QLabel27.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel27,0.14 * mBase.Width,0.57 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	voltage2.Color =  0x00ffffff
	voltage2.TextColor = 0xff000000
	voltage2.Gravity = Gravity.Left
	voltage2.Text = "Voltage 2"
	mBase.AddView(voltage2,0.31 * mBase.Width,0.57 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel29.Color =  0x00ffffff
	QLabel29.TextColor = 0xff000000
	QLabel29.Gravity = Gravity.Left
	QLabel29.Text = "Power"
	QLabel29.TextSize = 12
	QLabel29.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel29,0.51 * mBase.Width,0.53 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	power2.Color =  0x00ffffff
	power2.TextColor = 0xff000000
	power2.Gravity = Gravity.Left
	power2.Text = "Power 2"
	mBase.AddView(power2,0.69 * mBase.Width,0.53 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel31.Color =  0x00ffffff
	QLabel31.TextColor = 0xff000000
	QLabel31.Gravity = Gravity.Left
	QLabel31.Text = "Cost(Php)"
	QLabel31.TextSize = 12
	QLabel31.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel31,0.51 * mBase.Width,0.57 * mBase.Height,0.17 * mBase.Width,0.04 * mBase.Height)
	
	cost2.Color =  0x00ffffff
	cost2.TextColor = 0xff000000
	cost2.Gravity = Gravity.Left
	cost2.Text = "Cost 2"
	mBase.AddView(cost2,0.69 * mBase.Width,0.57 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	'LINE 3 CONTENTS
	kwh3.Color =  0x00ffffff
	kwh3.TextColor = 0xff000000
	kwh3.Gravity = Gravity.Left
	kwh3.Text = "kWh"
	kwh3.TextSize = 14
	kwh3.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(kwh3,0.14 * mBase.Width,0.77 * mBase.Height,0.33 * mBase.Width,0.04 * mBase.Height)
	
	QLabel34.Color =  0x00ffffff
	QLabel34.TextColor = 0xff000000
	QLabel34.Gravity = Gravity.Left
	QLabel34.Text = "Current"
	QLabel34.TextSize = 12
	QLabel34.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel34,0.14 * mBase.Width,0.82 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	current3.Color =  0x00ffffff
	current3.TextColor = 0xff000000
	current3.Gravity = Gravity.Left
	current3.Text = "Current 3"
	mBase.AddView(current3,0.31 * mBase.Width,0.82 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel36.Color =  0x00ffffff
	QLabel36.TextColor = 0xff000000
	QLabel36.Gravity = Gravity.Left
	QLabel36.Text = "Voltage"
	QLabel36.TextSize = 12
	QLabel36.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel36,0.14 * mBase.Width,0.87 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	voltage3.Color =  0x00ffffff
	voltage3.TextColor = 0xff000000
	voltage3.Gravity = Gravity.Left
	voltage3.Text = "Voltage 3"
	mBase.AddView(voltage3,0.31 * mBase.Width,0.87 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel38.Color =  0x00ffffff
	QLabel38.TextColor = 0xff000000
	QLabel38.Gravity = Gravity.Left
	QLabel38.Text = "Power"
	QLabel38.TextSize = 12
	QLabel38.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel38,0.51 * mBase.Width,0.82 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	
	power3.Color =  0x00ffffff
	power3.TextColor = 0xff000000
	power3.Gravity = Gravity.Left
	power3.Text = "Power 3"
	mBase.AddView(power3,0.69 * mBase.Width,0.82 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	QLabel40.Color =  0x00ffffff
	QLabel40.TextColor = 0xff000000
	QLabel40.Gravity = Gravity.Left
	QLabel40.Text = "Cost(Php)"
	QLabel40.TextSize = 12
	QLabel40.Typeface = sourcesanspro.DEFAULT_BOLD
	mBase.AddView(QLabel40,0.51 * mBase.Width,0.87 * mBase.Height,0.17 * mBase.Width,0.04 * mBase.Height)
	
	cost3.Color =  0x00ffffff
	cost3.TextColor = 0xff000000
	cost3.Gravity = Gravity.Left
	cost3.Text = "Cost 3"
	mBase.AddView(cost3,0.69 * mBase.Width,0.87 * mBase.Height,0.19 * mBase.Width,0.04 * mBase.Height)
	
	mBase.AddView(btnback,0.06 * mBase.Width,0.03 * mBase.Height,0.09 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(on1,0.49 * mBase.Width,0.16 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(on3,0.49 * mBase.Width,0.73 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(on2,0.49 * mBase.Width,0.44 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(off1,0.69 * mBase.Width,0.16 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(off2,0.69 * mBase.Width,0.44 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(off3,0.69 * mBase.Width,0.73 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	
	mBase.AddView(line1Title,0.14 * mBase.Width,0.16 * mBase.Height,0.20 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(line2Title,0.14 * mBase.Width,0.44 * mBase.Height,0.20 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(line3Title,0.14 * mBase.Width,0.73 * mBase.Height,0.20 * mBase.Width,0.04 * mBase.Height)
End Sub

Sub btnback_click()
	Dim frmmain1 As frmmain=Starter.frmmain1
	frmmain1.Visible=True
	setVisible(False)
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
	Starter.wsh.SendClient("SSRON1#")
	saveline(1,"ON",Starter.enKW1)
	ToastMessageShow("LINE 1 ON", False)
End Sub
Sub saveline(line As String,state As String,kw As String)
	Dim cc As clswidget
	cc.Initialize(Me)
	Dim sql As String=$"insert into history(Line,State,KW,Date) values ('${line}','${state}','${kw}','${Starter.wsh.DateTimeSQL}')"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
End Sub
Sub on2_click()
	Starter.wsh.SendClient("SSRON2#")
	saveline(2,"ON",Starter.enKW2)
	ToastMessageShow("LINE 2 ON", False)
End Sub
Sub on3_click()
	Starter.wsh.SendClient("SSRON3#")
	saveline(3,"ON",Starter.enKW3)
	ToastMessageShow("LINE 3 ON", False)
End Sub
Sub off1_click()
	Starter.wsh.SendClient("SSROFF1#")
	saveline(1,"OFF",Starter.enKW1)
	ToastMessageShow("LINE 1 OFF", False)
End Sub
Sub off2_click()
	Starter.wsh.SendClient("SSROFF2#")
	saveline(2,"OFF",Starter.enKW2)
	ToastMessageShow("LINE 2 OFF", False)
End Sub
Sub off3_click()
	Starter.wsh.SendClient("SSROFF3#")
	saveline(3,"OFF",Starter.enKW3)
	ToastMessageShow("LINE 3 OFF", False)
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





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































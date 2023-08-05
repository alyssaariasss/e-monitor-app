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

	Dim sourcesanspro As Typeface
	sourcesanspro = Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")

	Dim QLabel5 As Label
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
	
	QLabel5.Initialize("QLabel5")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
public Sub getdata
	Dim cc As clswidget
	cc.Initialize(Me)

	Dim sql As String
	sql=$"Select * from trigger1"$
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"xx")
	Wait For(rs) Complete (Result1 As List)
	Log(Result1)
	
	sql=$"Select * from trigger2"$
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"xx")
	Wait For(rs) Complete (Result1 As List)
	Log(Result1)
	
	
	sql=$"Select * from trigger3"$
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"xx")
	Wait For(rs) Complete (Result1 As List)
	Log(Result1)
	
	
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	bkgimage.Bitmap = LoadBitmapResize(File.DirAssets,"home bg.png",bkgimage.Width,bkgimage.Height,False)
	mBase.AddView(QPushButton1,0.92 * mBase.Width,0.00 * mBase.Height,0.08 * mBase.Width,0.03 * mBase.Height)
	mBase.AddView(QPushButton2,0.92 * mBase.Width,0.03 * mBase.Height,0.08 * mBase.Width,0.03 * mBase.Height)
	Starter.image(QPushButton1,"cat.png")
	Starter.image(QPushButton2,"cat.png")
	Starter.image(QPushButton3,"cat.png")

	mBase.AddView(QPushButton3,0.92 * mBase.Width,0.06 * mBase.Height,0.08 * mBase.Width,0.03 * mBase.Height)
	QPushButton1.TextColor = 0xff000000
	QPushButton1.Text = ""
	QPushButton2.TextColor = 0xffffffff
	QPushButton2.Text = ""
	QPushButton3.TextColor = 0xffffffff
	QPushButton3.Text = ""
	
	QLabel5.Color =  0x00ffffff
	QLabel5.TextColor = 0xfffdb818
	QLabel5.Gravity = Gravity.CENTER
	QLabel5.Text = "E - S A L B A  M C U"
	QLabel5.TextSize = 28
	QLabel5.Typeface = sourcesanspro.DEFAULT_BOLD
	
	mBase.AddView(QLabel5,0.11 * mBase.Width,0.51 * mBase.Height,0.76 * mBase.Width,0.06 * mBase.Height)
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub bkgimage_click()
End Sub
public Sub UpdateKW(x As Float,line As String)
	Dim cc As clswidget
	cc.Initialize(Me)

	Dim sql As String
	sql=$"Select * from trigger${line}"$
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"xx")
	Wait For(rs) Complete (Result1 As List)
	Log(Result1)
	Dim ll As List=Result1.Get(0)
	Dim curKW As Float=ll.Get(1)
	
	If curKW<=0 Then Return
	
	Dim val As Float=curKW-x
	If val<=0 Then
		Log("Shut Down L1(KW) Now")
		Starter.Println($"SSROFF${line}#"$)
		
		If line=1 Then
			saveline(1,"OFF",Starter.en1)
		Else If line=2 Then
			saveline(2,"OFF",Starter.en2)
		Else
			saveline(3,"OFF",Starter.en3)
		End If
	End If
	
	sql=$"Update trigger${line} set KW='${val}'"$
	Log(sql)
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (Result1 As List)
	Log( val)
End Sub

public Sub UpdateTime(x As Float,line As String)
	Dim cc As clswidget
	cc.Initialize(Me)

	Dim sql As String
	sql=$"Select * from trigger${line}"$
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"xx"&line)
	Wait For(rs) Complete (Result1 As List)
	Log(sql)
	Log(Result1)
	Dim ll As List=Result1.Get(0)
	Dim curKW As Float=ll.Get(0)
	
	If curKW<=0 Then Return
	
	Dim val As Float=curKW-x
	If val<=0 Then
		Log("Shut Down L1(T) Now")
		Starter.Println($"SSROFF${line}#"$)
		
		If line=1 Then
			saveline(1,"OFF",Starter.en1)
		Else If line=2 Then
			saveline(2,"OFF",Starter.en2)
		Else
			saveline(3,"OFF",Starter.en3)
		End If
	End If
	
	sql=$"Update trigger${line} set Time='${val}'"$
	Log(sql)
	'"Select * from schedule where StartTime >= time('%s') and EndTime <= time('%s') and Day='%s' and Room='%s'" % (self.txtStartTime_schedule.Text,self.txtEndTime_schedule.Text,self.txtDay_schedule.Text,self.txtRoom_schedule.Text))
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (Result1 As List)
	Log( val)
End Sub
Sub saveline(line As String,state As String,kw As String)
	Dim cc As clswidget
	cc.Initialize(Me)
	Dim sql As String=$"insert into history(Line,State,KW,Date) values ('${line}','${state}','${kw}','${Starter.wsh.DateTimeSQL}')"$
	Dim rs As ResumableSub = cc.Querry(sql,"QUERRY")
	Wait For(rs) Complete (l As List)
End Sub

Sub QPushButton1_click()
	Log("T1")
	UpdateTime(1,1)
End Sub
Sub QPushButton2_click()
	Log("T2")
	UpdateTime(1,2)
End Sub
Sub QPushButton3_click()
	Log("T3")
	UpdateTime(1,3)
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




















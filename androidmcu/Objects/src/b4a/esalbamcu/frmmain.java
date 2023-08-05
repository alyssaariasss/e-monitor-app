package b4a.esalbamcu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbamcu.frmmain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbamcu.frmmain.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qpushbutton1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qpushbutton2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qpushbutton3 = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _sourcesanspro = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel5 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbamcu.main _main = null;
public b4a.esalbamcu.starter _starter = null;
public b4a.esalbamcu.vb6 _vb6 = null;
public b4a.esalbamcu.b4xcollections _b4xcollections = null;
public b4a.esalbamcu.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 36;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 37;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 38;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 14;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim QPushButton1 As Button";
_qpushbutton1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim QPushButton2 As Button";
_qpushbutton2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim QPushButton1 As Button";
_qpushbutton1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim QPushButton2 As Button";
_qpushbutton2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim QPushButton3 As Button";
_qpushbutton3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim QPushButton1 As Button";
_qpushbutton1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim QPushButton2 As Button";
_qpushbutton2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim QPushButton3 As Button";
_qpushbutton3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim sourcesanspro As Typeface";
_sourcesanspro = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 28;BA.debugLine="sourcesanspro = Typeface.LoadFromAssets(\"SourceSa";
_sourcesanspro = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")));
 //BA.debugLineNum = 30;BA.debugLine="Dim QLabel5 As Label";
_qlabel5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 52;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 53;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 223;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public void  _getdata() throws Exception{
ResumableSub_getdata rsub = new ResumableSub_getdata(this);
rsub.resume(ba, null);
}
public static class ResumableSub_getdata extends BA.ResumableSub {
public ResumableSub_getdata(b4a.esalbamcu.frmmain parent) {
this.parent = parent;
}
b4a.esalbamcu.frmmain parent;
b4a.esalbamcu.clswidget _cc = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _result1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 56;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbamcu.clswidget();
 //BA.debugLineNum = 57;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 59;BA.debugLine="Dim sql As String";
_sql = "";
 //BA.debugLineNum = 60;BA.debugLine="sql=$\"Select * from trigger1\"$";
_sql = ("Select * from trigger1");
 //BA.debugLineNum = 62;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"xx\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"xx");
 //BA.debugLineNum = 63;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="Log(Result1)";
parent.__c.LogImpl("43145737",BA.ObjectToString(_result1),0);
 //BA.debugLineNum = 66;BA.debugLine="sql=$\"Select * from trigger2\"$";
_sql = ("Select * from trigger2");
 //BA.debugLineNum = 68;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"xx\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"xx");
 //BA.debugLineNum = 69;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 70;BA.debugLine="Log(Result1)";
parent.__c.LogImpl("43145743",BA.ObjectToString(_result1),0);
 //BA.debugLineNum = 73;BA.debugLine="sql=$\"Select * from trigger3\"$";
_sql = ("Select * from trigger3");
 //BA.debugLineNum = 75;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"xx\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"xx");
 //BA.debugLineNum = 76;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 77;BA.debugLine="Log(Result1)";
parent.__c.LogImpl("43145750",BA.ObjectToString(_result1),0);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.List _result1) throws Exception{
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 213;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 83;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 84;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 85;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 86;BA.debugLine="mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 87;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"home bg.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(QPushButton1,0.92 * mBase.Width,0.0";
_mbase.AddView((android.view.View)(_qpushbutton1.getObject()),(int) (0.92*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (0.08*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="mBase.AddView(QPushButton2,0.92 * mBase.Width,0.0";
_mbase.AddView((android.view.View)(_qpushbutton2.getObject()),(int) (0.92*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()),(int) (0.08*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 90;BA.debugLine="Starter.image(QPushButton1,\"cat.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton1.getObject())),"cat.png");
 //BA.debugLineNum = 91;BA.debugLine="Starter.image(QPushButton2,\"cat.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton2.getObject())),"cat.png");
 //BA.debugLineNum = 92;BA.debugLine="Starter.image(QPushButton3,\"cat.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton3.getObject())),"cat.png");
 //BA.debugLineNum = 94;BA.debugLine="mBase.AddView(QPushButton3,0.92 * mBase.Width,0.0";
_mbase.AddView((android.view.View)(_qpushbutton3.getObject()),(int) (0.92*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()),(int) (0.08*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="QPushButton1.TextColor = 0xff000000";
_qpushbutton1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 96;BA.debugLine="QPushButton1.Text = \"\"";
_qpushbutton1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 97;BA.debugLine="QPushButton2.TextColor = 0xffffffff";
_qpushbutton2.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 98;BA.debugLine="QPushButton2.Text = \"\"";
_qpushbutton2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 99;BA.debugLine="QPushButton3.TextColor = 0xffffffff";
_qpushbutton3.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 100;BA.debugLine="QPushButton3.Text = \"\"";
_qpushbutton3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 102;BA.debugLine="QLabel5.Color =  0x00ffffff";
_qlabel5.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 103;BA.debugLine="QLabel5.TextColor = 0xfffdb818";
_qlabel5.setTextColor(((int)0xfffdb818));
 //BA.debugLineNum = 104;BA.debugLine="QLabel5.Gravity = Gravity.CENTER";
_qlabel5.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 105;BA.debugLine="QLabel5.Text = \"E - S A L B A  M C U\"";
_qlabel5.setText(BA.ObjectToCharSequence("E - S A L B A  M C U"));
 //BA.debugLineNum = 106;BA.debugLine="QLabel5.TextSize = 28";
_qlabel5.setTextSize((float) (28));
 //BA.debugLineNum = 107;BA.debugLine="QLabel5.Typeface = sourcesanspro.DEFAULT_BOLD";
_qlabel5.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 109;BA.debugLine="mBase.AddView(QLabel5,0.11 * mBase.Width,0.51 * m";
_mbase.AddView((android.view.View)(_qlabel5.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.51*_mbase.getHeight()),(int) (0.76*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 41;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 42;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 43;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 44;BA.debugLine="QPushButton1.Initialize(\"QPushButton1\")";
_qpushbutton1.Initialize(ba,"QPushButton1");
 //BA.debugLineNum = 45;BA.debugLine="QPushButton2.Initialize(\"QPushButton2\")";
_qpushbutton2.Initialize(ba,"QPushButton2");
 //BA.debugLineNum = 46;BA.debugLine="QPushButton3.Initialize(\"QPushButton3\")";
_qpushbutton3.Initialize(ba,"QPushButton3");
 //BA.debugLineNum = 48;BA.debugLine="QLabel5.Initialize(\"QLabel5\")";
_qlabel5.Initialize(ba,"QLabel5");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _qpushbutton1_click() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub QPushButton1_click()";
 //BA.debugLineNum = 200;BA.debugLine="Log(\"T1\")";
__c.LogImpl("43538945","T1",0);
 //BA.debugLineNum = 201;BA.debugLine="UpdateTime(1,1)";
_updatetime((float) (1),BA.NumberToString(1));
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _qpushbutton2_click() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub QPushButton2_click()";
 //BA.debugLineNum = 204;BA.debugLine="Log(\"T2\")";
__c.LogImpl("43604481","T2",0);
 //BA.debugLineNum = 205;BA.debugLine="UpdateTime(1,2)";
_updatetime((float) (1),BA.NumberToString(2));
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _qpushbutton3_click() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub QPushButton3_click()";
 //BA.debugLineNum = 208;BA.debugLine="Log(\"T3\")";
__c.LogImpl("43670017","T3",0);
 //BA.debugLineNum = 209;BA.debugLine="UpdateTime(1,3)";
_updatetime((float) (1),BA.NumberToString(3));
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public void  _saveline(String _line,String _state,String _kw) throws Exception{
ResumableSub_saveline rsub = new ResumableSub_saveline(this,_line,_state,_kw);
rsub.resume(ba, null);
}
public static class ResumableSub_saveline extends BA.ResumableSub {
public ResumableSub_saveline(b4a.esalbamcu.frmmain parent,String _line,String _state,String _kw) {
this.parent = parent;
this._line = _line;
this._state = _state;
this._kw = _kw;
}
b4a.esalbamcu.frmmain parent;
String _line;
String _state;
String _kw;
b4a.esalbamcu.clswidget _cc = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _l = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 192;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbamcu.clswidget();
 //BA.debugLineNum = 193;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 194;BA.debugLine="Dim sql As String=$\"insert into history(Line,Stat";
_sql = ("insert into history(Line,State,KW,Date) values ('"+parent.__c.SmartStringFormatter("",(Object)(_line))+"','"+parent.__c.SmartStringFormatter("",(Object)(_state))+"','"+parent.__c.SmartStringFormatter("",(Object)(_kw))+"','"+parent.__c.SmartStringFormatter("",(Object)(parent._starter._wsh /*b4a.esalbamcu.wtaserver*/ ._datetimesql /*String*/ ()))+"')");
 //BA.debugLineNum = 195;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 196;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 219;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 216;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public void  _updatekw(float _x,String _line) throws Exception{
ResumableSub_UpdateKW rsub = new ResumableSub_UpdateKW(this,_x,_line);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateKW extends BA.ResumableSub {
public ResumableSub_UpdateKW(b4a.esalbamcu.frmmain parent,float _x,String _line) {
this.parent = parent;
this._x = _x;
this._line = _line;
}
b4a.esalbamcu.frmmain parent;
float _x;
String _line;
b4a.esalbamcu.clswidget _cc = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _result1 = null;
anywheresoftware.b4a.objects.collections.List _ll = null;
float _curkw = 0f;
float _val = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 118;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbamcu.clswidget();
 //BA.debugLineNum = 119;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 121;BA.debugLine="Dim sql As String";
_sql = "";
 //BA.debugLineNum = 122;BA.debugLine="sql=$\"Select * from trigger${line}\"$";
_sql = ("Select * from trigger"+parent.__c.SmartStringFormatter("",(Object)(_line))+"");
 //BA.debugLineNum = 124;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"xx\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"xx");
 //BA.debugLineNum = 125;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 126;BA.debugLine="Log(Result1)";
parent.__c.LogImpl("43342345",BA.ObjectToString(_result1),0);
 //BA.debugLineNum = 127;BA.debugLine="Dim ll As List=Result1.Get(0)";
_ll = new anywheresoftware.b4a.objects.collections.List();
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_result1.Get((int) (0))));
 //BA.debugLineNum = 128;BA.debugLine="Dim curKW As Float=ll.Get(1)";
_curkw = (float)(BA.ObjectToNumber(_ll.Get((int) (1))));
 //BA.debugLineNum = 130;BA.debugLine="If curKW<=0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_curkw<=0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 132;BA.debugLine="Dim val As Float=curKW-x";
_val = (float) (_curkw-_x);
 //BA.debugLineNum = 133;BA.debugLine="If val<=0 Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_val<=0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 134;BA.debugLine="Log(\"Shut Down L1(KW) Now\")";
parent.__c.LogImpl("43342353","Shut Down L1(KW) Now",0);
 //BA.debugLineNum = 135;BA.debugLine="Starter.Println($\"SSROFF${line}#\"$)";
parent._starter._println /*String*/ (("SSROFF"+parent.__c.SmartStringFormatter("",(Object)(_line))+"#"));
 //BA.debugLineNum = 137;BA.debugLine="If line=1 Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_line).equals(BA.NumberToString(1))) { 
this.state = 12;
}else if((_line).equals(BA.NumberToString(2))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 12:
//C
this.state = 17;
 //BA.debugLineNum = 138;BA.debugLine="saveline(1,\"OFF\",Starter.en1)";
parent._saveline(BA.NumberToString(1),"OFF",parent._starter._en1 /*String*/ );
 if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 140;BA.debugLine="saveline(2,\"OFF\",Starter.en2)";
parent._saveline(BA.NumberToString(2),"OFF",parent._starter._en2 /*String*/ );
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 142;BA.debugLine="saveline(3,\"OFF\",Starter.en3)";
parent._saveline(BA.NumberToString(3),"OFF",parent._starter._en3 /*String*/ );
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 146;BA.debugLine="sql=$\"Update trigger${line} set KW='${val}'\"$";
_sql = ("Update trigger"+parent.__c.SmartStringFormatter("",(Object)(_line))+" set KW='"+parent.__c.SmartStringFormatter("",(Object)(_val))+"'");
 //BA.debugLineNum = 147;BA.debugLine="Log(sql)";
parent.__c.LogImpl("43342366",_sql,0);
 //BA.debugLineNum = 149;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 150;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 20;
return;
case 20:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 151;BA.debugLine="Log( val)";
parent.__c.LogImpl("43342370",BA.NumberToString(_val),0);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _updatetime(float _x,String _line) throws Exception{
ResumableSub_UpdateTime rsub = new ResumableSub_UpdateTime(this,_x,_line);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateTime extends BA.ResumableSub {
public ResumableSub_UpdateTime(b4a.esalbamcu.frmmain parent,float _x,String _line) {
this.parent = parent;
this._x = _x;
this._line = _line;
}
b4a.esalbamcu.frmmain parent;
float _x;
String _line;
b4a.esalbamcu.clswidget _cc = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _result1 = null;
anywheresoftware.b4a.objects.collections.List _ll = null;
float _curkw = 0f;
float _val = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 155;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbamcu.clswidget();
 //BA.debugLineNum = 156;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 158;BA.debugLine="Dim sql As String";
_sql = "";
 //BA.debugLineNum = 159;BA.debugLine="sql=$\"Select * from trigger${line}\"$";
_sql = ("Select * from trigger"+parent.__c.SmartStringFormatter("",(Object)(_line))+"");
 //BA.debugLineNum = 161;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"xx\"&line)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"xx"+_line);
 //BA.debugLineNum = 162;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 163;BA.debugLine="Log(sql)";
parent.__c.LogImpl("43407881",_sql,0);
 //BA.debugLineNum = 164;BA.debugLine="Log(Result1)";
parent.__c.LogImpl("43407882",BA.ObjectToString(_result1),0);
 //BA.debugLineNum = 165;BA.debugLine="Dim ll As List=Result1.Get(0)";
_ll = new anywheresoftware.b4a.objects.collections.List();
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_result1.Get((int) (0))));
 //BA.debugLineNum = 166;BA.debugLine="Dim curKW As Float=ll.Get(0)";
_curkw = (float)(BA.ObjectToNumber(_ll.Get((int) (0))));
 //BA.debugLineNum = 168;BA.debugLine="If curKW<=0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_curkw<=0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 170;BA.debugLine="Dim val As Float=curKW-x";
_val = (float) (_curkw-_x);
 //BA.debugLineNum = 171;BA.debugLine="If val<=0 Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_val<=0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 172;BA.debugLine="Log(\"Shut Down L1(T) Now\")";
parent.__c.LogImpl("43407890","Shut Down L1(T) Now",0);
 //BA.debugLineNum = 173;BA.debugLine="Starter.Println($\"SSROFF${line}#\"$)";
parent._starter._println /*String*/ (("SSROFF"+parent.__c.SmartStringFormatter("",(Object)(_line))+"#"));
 //BA.debugLineNum = 175;BA.debugLine="If line=1 Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_line).equals(BA.NumberToString(1))) { 
this.state = 12;
}else if((_line).equals(BA.NumberToString(2))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 12:
//C
this.state = 17;
 //BA.debugLineNum = 176;BA.debugLine="saveline(1,\"OFF\",Starter.en1)";
parent._saveline(BA.NumberToString(1),"OFF",parent._starter._en1 /*String*/ );
 if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 178;BA.debugLine="saveline(2,\"OFF\",Starter.en2)";
parent._saveline(BA.NumberToString(2),"OFF",parent._starter._en2 /*String*/ );
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 180;BA.debugLine="saveline(3,\"OFF\",Starter.en3)";
parent._saveline(BA.NumberToString(3),"OFF",parent._starter._en3 /*String*/ );
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 184;BA.debugLine="sql=$\"Update trigger${line} set Time='${val}'\"$";
_sql = ("Update trigger"+parent.__c.SmartStringFormatter("",(Object)(_line))+" set Time='"+parent.__c.SmartStringFormatter("",(Object)(_val))+"'");
 //BA.debugLineNum = 185;BA.debugLine="Log(sql)";
parent.__c.LogImpl("43407903",_sql,0);
 //BA.debugLineNum = 187;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 188;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 20;
return;
case 20:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 189;BA.debugLine="Log( val)";
parent.__c.LogImpl("43407907",BA.NumberToString(_val),0);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

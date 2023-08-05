package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.frmmain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.frmmain.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _qlabel4 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 28;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 29;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 30;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim QPushButton1 As Button";
_qpushbutton1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim QPushButton2 As Button";
_qpushbutton2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim QPushButton3 As Button";
_qpushbutton3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim sourcesanspro As Typeface";
_sourcesanspro = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 22;BA.debugLine="sourcesanspro = Typeface.LoadFromAssets(\"SourceSa";
_sourcesanspro = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")));
 //BA.debugLineNum = 23;BA.debugLine="Dim QLabel4 As ImageView";
_qlabel4 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 45;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 46;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 183;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 173;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 49;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 50;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 51;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 52;BA.debugLine="mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 53;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"cat.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 54;BA.debugLine="mBase.AddView(QPushButton1,0.23 * mBase.Width,0.3";
_mbase.AddView((android.view.View)(_qpushbutton1.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.32*_mbase.getHeight()),(int) (0.54*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 55;BA.debugLine="mBase.AddView(QPushButton2,0.23 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_qpushbutton2.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.50*_mbase.getHeight()),(int) (0.54*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 57;BA.debugLine="QPushButton1.TextColor=Colors.Blue";
_qpushbutton1.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 59;BA.debugLine="QPushButton2.TextColor=Colors.Blue";
_qpushbutton2.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 61;BA.debugLine="QPushButton3.TextColor=Colors.Blue";
_qpushbutton3.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 62;BA.debugLine="Starter.image(QPushButton1,\"main button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton1.getObject())),"main button.png");
 //BA.debugLineNum = 63;BA.debugLine="Starter.image(QPushButton2,\"main button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton2.getObject())),"main button.png");
 //BA.debugLineNum = 64;BA.debugLine="Starter.image(QPushButton3,\"main button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_qpushbutton3.getObject())),"main button.png");
 //BA.debugLineNum = 66;BA.debugLine="mBase.AddView(QPushButton3,0.23 * mBase.Width,0.6";
_mbase.AddView((android.view.View)(_qpushbutton3.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.68*_mbase.getHeight()),(int) (0.54*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 67;BA.debugLine="QPushButton1.TextColor = 0xff000000";
_qpushbutton1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 68;BA.debugLine="QPushButton1.Text = \"REALTIME\"";
_qpushbutton1.setText(BA.ObjectToCharSequence("REALTIME"));
 //BA.debugLineNum = 69;BA.debugLine="QPushButton1.Typeface = sourcesanspro.DEFAULT_BOL";
_qpushbutton1.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 70;BA.debugLine="QPushButton2.TextColor = 0xff000000";
_qpushbutton2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 71;BA.debugLine="QPushButton2.Text = \"SETTINGS\"";
_qpushbutton2.setText(BA.ObjectToCharSequence("SETTINGS"));
 //BA.debugLineNum = 72;BA.debugLine="QPushButton2.Typeface = sourcesanspro.DEFAULT_BOL";
_qpushbutton2.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 73;BA.debugLine="QPushButton3.TextColor = 0xff000000";
_qpushbutton3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 74;BA.debugLine="QPushButton3.Text = \"HISTORY\"";
_qpushbutton3.setText(BA.ObjectToCharSequence("HISTORY"));
 //BA.debugLineNum = 75;BA.debugLine="QPushButton3.Typeface = sourcesanspro.DEFAULT_BOL";
_qpushbutton3.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 76;BA.debugLine="QPushButton1.TextColor = 0xffffffff";
_qpushbutton1.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 77;BA.debugLine="QPushButton2.TextColor = 0xffffffff";
_qpushbutton2.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 78;BA.debugLine="QPushButton3.TextColor = 0xffffffff";
_qpushbutton3.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 80;BA.debugLine="mBase.AddView(QLabel4,0.33 * mBase.Width,0.07 * m";
_mbase.AddView((android.view.View)(_qlabel4.getObject()),(int) (0.33*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()),(int) (0.33*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()));
 //BA.debugLineNum = 81;BA.debugLine="QLabel4.Bitmap = LoadBitmapResize(File.DirAssets,";
_qlabel4.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"driver module.png",_qlabel4.getWidth(),_qlabel4.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 35;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 36;BA.debugLine="QPushButton1.Initialize(\"QPushButton1\")";
_qpushbutton1.Initialize(ba,"QPushButton1");
 //BA.debugLineNum = 37;BA.debugLine="QPushButton2.Initialize(\"QPushButton2\")";
_qpushbutton2.Initialize(ba,"QPushButton2");
 //BA.debugLineNum = 38;BA.debugLine="QPushButton3.Initialize(\"QPushButton3\")";
_qpushbutton3.Initialize(ba,"QPushButton3");
 //BA.debugLineNum = 41;BA.debugLine="QLabel4.Initialize(\"QLabel4\")";
_qlabel4.Initialize(ba,"QLabel4");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _qpushbutton1_click() throws Exception{
b4a.esalbaapp.frmcontrol _x = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub QPushButton1_click()";
 //BA.debugLineNum = 91;BA.debugLine="Dim x As frmcontrol=Starter.frmcontrol1";
_x = (b4a.esalbaapp.frmcontrol)(_starter._frmcontrol1 /*Object*/ );
 //BA.debugLineNum = 92;BA.debugLine="x.Visible=True";
_x._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 93;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public void  _qpushbutton2_click() throws Exception{
ResumableSub_QPushButton2_click rsub = new ResumableSub_QPushButton2_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_QPushButton2_click extends BA.ResumableSub {
public ResumableSub_QPushButton2_click(b4a.esalbaapp.frmmain parent) {
this.parent = parent;
}
b4a.esalbaapp.frmmain parent;
b4a.esalbaapp.frmsettings _x = null;
b4a.esalbaapp.clswidget _cc = null;
b4a.esalbaapp.clsparser _cls = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.List _ll = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 99;BA.debugLine="Dim x As frmsettings=Starter.frmsettings1";
_x = (b4a.esalbaapp.frmsettings)(parent._starter._frmsettings1 /*Object*/ );
 //BA.debugLineNum = 100;BA.debugLine="x.Visible=True";
_x._setvisible /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 101;BA.debugLine="setVisible(False)";
parent._setvisible(parent.__c.False);
 //BA.debugLineNum = 102;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 103;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 105;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 106;BA.debugLine="Dim sql As String=$\"select * from `price`\"$";
_sql = ("select * from `price`");
 //BA.debugLineNum = 107;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 108;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 110;BA.debugLine="If l.Size<>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_l.getSize()!=0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 114;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 115;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 118;BA.debugLine="Starter.price=  ll.Get(0)";
parent._starter._price /*float*/  = (float)(BA.ObjectToNumber(_ll.Get((int) (0))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 121;BA.debugLine="Dim sql As String=$\"select * from `trigger1`\"$";
_sql = ("select * from `trigger1`");
 //BA.debugLineNum = 122;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 123;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 125;BA.debugLine="If l.Size<>0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_l.getSize()!=0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 129;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 130;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 131;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 132;BA.debugLine="x.txtkw1.Text=ll.Get(1)";
_x._txtkw1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (1))));
 //BA.debugLineNum = 133;BA.debugLine="x.txttime1.Text=ll.Get(0)";
_x._txttime1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 136;BA.debugLine="Dim sql As String=$\"select * from `trigger2`\"$";
_sql = ("select * from `trigger2`");
 //BA.debugLineNum = 137;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 138;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 9;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 140;BA.debugLine="If l.Size<>0 Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_l.getSize()!=0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 144;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 145;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 146;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 147;BA.debugLine="x.txtkw2.Text=ll.Get(1)";
_x._txtkw2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (1))));
 //BA.debugLineNum = 148;BA.debugLine="x.txttime2.Text=ll.Get(0)";
_x._txttime2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 151;BA.debugLine="Dim sql As String=$\"select * from `trigger3`\"$";
_sql = ("select * from `trigger3`");
 //BA.debugLineNum = 152;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 153;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 155;BA.debugLine="If l.Size<>0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_l.getSize()!=0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 159;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 160;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 161;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 162;BA.debugLine="x.txtkw3.Text=ll.Get(1)";
_x._txtkw3 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (1))));
 //BA.debugLineNum = 163;BA.debugLine="x.txttime3.Text=ll.Get(0)";
_x._txttime3 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.List _l) throws Exception{
}
public String  _qpushbutton3_click() throws Exception{
b4a.esalbaapp.frmhist _frmhist1 = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub QPushButton3_click()";
 //BA.debugLineNum = 168;BA.debugLine="Dim frmhist1 As frmhist=Starter.frmhist1";
_frmhist1 = (b4a.esalbaapp.frmhist)(_starter._frmhist1 /*Object*/ );
 //BA.debugLineNum = 169;BA.debugLine="frmhist1.Visible=True";
_frmhist1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 170;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 179;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 176;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

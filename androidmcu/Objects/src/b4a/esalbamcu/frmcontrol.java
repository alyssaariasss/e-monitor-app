package b4a.esalbamcu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmcontrol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbamcu.frmcontrol");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbamcu.frmcontrol.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _on1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _on3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _on2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _off1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _off2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _off3 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbamcu.main _main = null;
public b4a.esalbamcu.starter _starter = null;
public b4a.esalbamcu.vb6 _vb6 = null;
public b4a.esalbamcu.b4xcollections _b4xcollections = null;
public b4a.esalbamcu.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 26;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 27;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 28;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _btnavailability_click() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub btnavailability_click()";
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.esalbamcu.frmmain _frmmain1 = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub btnback_click()";
 //BA.debugLineNum = 90;BA.debugLine="Dim frmmain1 As frmmain=Starter.frmmain1";
_frmmain1 = (b4a.esalbamcu.frmmain)(_starter._frmmain1 /*Object*/ );
 //BA.debugLineNum = 91;BA.debugLine="frmmain1.Visible=True";
_frmmain1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 92;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _btnnotif_click() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub btnnotif_click()";
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _cbolocation_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub cbolocation_ItemClick (Position As Int, Value";
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 12;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Dim QLabel1 As Label";
_qlabel1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim btnback As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim on1 As Button";
_on1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim on3 As Button";
_on3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim on2 As Button";
_on2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim off1 As Button";
_off1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim off2 As Button";
_off2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim off3 As Button";
_off3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 136;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 137;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 127;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 54;BA.debugLine="QLabel1.Color =  0x00ffffff";
_qlabel1.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 55;BA.debugLine="QLabel1.TextColor = Colors.White";
_qlabel1.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 56;BA.debugLine="QLabel1.Textsize = 18";
_qlabel1.setTextSize((float) (18));
 //BA.debugLineNum = 57;BA.debugLine="QLabel1.Gravity = Gravity.Left";
_qlabel1.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 58;BA.debugLine="QLabel1.Text = \"QLabel1\"";
_qlabel1.setText(BA.ObjectToCharSequence("QLabel1"));
 //BA.debugLineNum = 59;BA.debugLine="mBase.AddView(QLabel1,0.10 * mBase.Width,0.04 * m";
_mbase.AddView((android.view.View)(_qlabel1.getObject()),(int) (0.10*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()),(int) (0.79*_mbase.getWidth()),(int) (0.53*_mbase.getHeight()));
 //BA.debugLineNum = 60;BA.debugLine="btnback.TextColor = 0xff000000";
_btnback.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 61;BA.debugLine="btnback.Text = \"<<\"";
_btnback.setText(BA.ObjectToCharSequence("<<"));
 //BA.debugLineNum = 62;BA.debugLine="mBase.AddView(btnback,0.10 * mBase.Width,0.57 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.10*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 63;BA.debugLine="on1.TextColor = 0xff000000";
_on1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 64;BA.debugLine="on1.Text = \"ON1\"";
_on1.setText(BA.ObjectToCharSequence("ON1"));
 //BA.debugLineNum = 65;BA.debugLine="mBase.AddView(on1,0.33 * mBase.Width,0.57 * mBase";
_mbase.AddView((android.view.View)(_on1.getObject()),(int) (0.33*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 66;BA.debugLine="on3.TextColor = 0xff000000";
_on3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 67;BA.debugLine="on3.Text = \"ON3\"";
_on3.setText(BA.ObjectToCharSequence("ON3"));
 //BA.debugLineNum = 68;BA.debugLine="mBase.AddView(on3,0.57 * mBase.Width,0.57 * mBase";
_mbase.AddView((android.view.View)(_on3.getObject()),(int) (0.57*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 69;BA.debugLine="on2.TextColor = 0xff000000";
_on2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 70;BA.debugLine="on2.Text = \"ON2\"";
_on2.setText(BA.ObjectToCharSequence("ON2"));
 //BA.debugLineNum = 71;BA.debugLine="mBase.AddView(on2,0.45 * mBase.Width,0.57 * mBase";
_mbase.AddView((android.view.View)(_on2.getObject()),(int) (0.45*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 72;BA.debugLine="off1.TextColor = 0xff000000";
_off1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 73;BA.debugLine="off1.Text = \"OFF1\"";
_off1.setText(BA.ObjectToCharSequence("OFF1"));
 //BA.debugLineNum = 74;BA.debugLine="mBase.AddView(off1,0.33 * mBase.Width,0.65 * mBas";
_mbase.AddView((android.view.View)(_off1.getObject()),(int) (0.33*_mbase.getWidth()),(int) (0.65*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 75;BA.debugLine="off2.TextColor = 0xff000000";
_off2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 76;BA.debugLine="off2.Text = \"OFF2\"";
_off2.setText(BA.ObjectToCharSequence("OFF2"));
 //BA.debugLineNum = 77;BA.debugLine="mBase.AddView(off2,0.45 * mBase.Width,0.65 * mBas";
_mbase.AddView((android.view.View)(_off2.getObject()),(int) (0.45*_mbase.getWidth()),(int) (0.65*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 78;BA.debugLine="off3.TextColor = 0xff000000";
_off3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 79;BA.debugLine="off3.Text = \"OFF3\"";
_off3.setText(BA.ObjectToCharSequence("OFF3"));
 //BA.debugLineNum = 80;BA.debugLine="mBase.AddView(off3,0.57 * mBase.Width,0.65 * mBas";
_mbase.AddView((android.view.View)(_off3.getObject()),(int) (0.57*_mbase.getWidth()),(int) (0.65*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 81;BA.debugLine="off2.TextColor = 0xff000000";
_off2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 82;BA.debugLine="off2.Text = \"OFF2\"";
_off2.setText(BA.ObjectToCharSequence("OFF2"));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 34;BA.debugLine="QLabel1.Initialize(\"QLabel1\")";
_qlabel1.Initialize(ba,"QLabel1");
 //BA.debugLineNum = 35;BA.debugLine="btnback.Initialize(\"btnback\")";
_btnback.Initialize(ba,"btnback");
 //BA.debugLineNum = 36;BA.debugLine="on1.Initialize(\"on1\")";
_on1.Initialize(ba,"on1");
 //BA.debugLineNum = 37;BA.debugLine="on3.Initialize(\"on3\")";
_on3.Initialize(ba,"on3");
 //BA.debugLineNum = 38;BA.debugLine="on2.Initialize(\"on2\")";
_on2.Initialize(ba,"on2");
 //BA.debugLineNum = 39;BA.debugLine="off1.Initialize(\"off1\")";
_off1.Initialize(ba,"off1");
 //BA.debugLineNum = 40;BA.debugLine="off2.Initialize(\"off2\")";
_off2.Initialize(ba,"off2");
 //BA.debugLineNum = 41;BA.debugLine="off3.Initialize(\"off3\")";
_off3.Initialize(ba,"off3");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _off1_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub off1_click()";
 //BA.debugLineNum = 116;BA.debugLine="Starter.Println(\"SSROFF1#\")";
_starter._println /*String*/ ("SSROFF1#");
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _off2_click() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub off2_click()";
 //BA.debugLineNum = 119;BA.debugLine="Starter.Println(\"SSROFF2#\")";
_starter._println /*String*/ ("SSROFF2#");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _off3_click() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub off3_click()";
 //BA.debugLineNum = 122;BA.debugLine="Starter.Println(\"SSROFF3#\")";
_starter._println /*String*/ ("SSROFF3#");
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _on1_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub on1_click()";
 //BA.debugLineNum = 107;BA.debugLine="Starter.Println(\"SSRON1#\")";
_starter._println /*String*/ ("SSRON1#");
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _on2_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub on2_click()";
 //BA.debugLineNum = 110;BA.debugLine="Starter.Println(\"SSRON2#\")";
_starter._println /*String*/ ("SSRON2#");
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _on3_click() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub on3_click()";
 //BA.debugLineNum = 113;BA.debugLine="Starter.Println(\"SSRON3#\")";
_starter._println /*String*/ ("SSRON3#");
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _seat2_click() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub seat2_click()";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 133;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 130;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

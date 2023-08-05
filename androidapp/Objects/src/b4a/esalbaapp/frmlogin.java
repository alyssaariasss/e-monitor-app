package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmlogin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.frmlogin");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.frmlogin.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtemail = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnupdate3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _settingstitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _sourcesanspro = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _qlineedit7 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 35;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 36;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 37;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _btnupdate3_click() throws Exception{
b4a.esalbaapp.frmmain _frmmain1 = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub btnupdate3_click()";
 //BA.debugLineNum = 132;BA.debugLine="If txtEmail.Text=\"admin\" And txtPassword.Text=\"12";
if ((_txtemail.getText()).equals("admin") && (_txtpassword.getText()).equals("1234")) { 
 //BA.debugLineNum = 133;BA.debugLine="Dim frmmain1 As frmmain=Starter.frmmain1";
_frmmain1 = (b4a.esalbaapp.frmmain)(_starter._frmmain1 /*Object*/ );
 //BA.debugLineNum = 134;BA.debugLine="frmmain1.Visible=True";
_frmmain1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 135;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 }else {
 //BA.debugLineNum = 137;BA.debugLine="ToastMessageShow(\"Invalid username/password\",Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid username/password"),__c.False);
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim bkgimage As ImageView";
_bkgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim QLabel5 As Label";
_qlabel5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim txtEmail As EditText";
_txtemail = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnupdate3 As Button";
_btnupdate3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim settingsTitle As Label";
_settingstitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim QLabel5 As Label";
_qlabel5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim QLabel6 As Label";
_qlabel6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim QLabel7 As Label";
_qlabel7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim txtPassword As EditText";
_txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim sourcesanspro As Typeface";
_sourcesanspro = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 26;BA.debugLine="sourcesanspro = Typeface.LoadFromAssets(\"SourceSa";
_sourcesanspro = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")));
 //BA.debugLineNum = 28;BA.debugLine="Dim QLabel8 As Label";
_qlabel8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim QLineEdit7 As EditText";
_qlineedit7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 57;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 58;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 160;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 150;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 61;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 62;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 63;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 65;BA.debugLine="mBase.AddView(bkgimage,0.00 * mBase.Width,-0.01 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.00*_mbase.getWidth()),(int) (-0.01*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 66;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"cat.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 67;BA.debugLine="QLabel5.Color =  0x00ffffff";
_qlabel5.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 68;BA.debugLine="QLabel5.TextColor = 0xff000000";
_qlabel5.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 69;BA.debugLine="QLabel5.Gravity = Gravity.Left";
_qlabel5.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 70;BA.debugLine="QLabel5.Text = \"Username\"";
_qlabel5.setText(BA.ObjectToCharSequence("Username"));
 //BA.debugLineNum = 71;BA.debugLine="QLabel5.Typeface = sourcesanspro.DEFAULT_BOLD";
_qlabel5.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 72;BA.debugLine="mBase.AddView(QLabel5,0.11 * mBase.Width,0.41 * m";
_mbase.AddView((android.view.View)(_qlabel5.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.41*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 74;BA.debugLine="txtEmail.Color =  0xffffffff";
_txtemail.setColor(((int)0xffffffff));
 //BA.debugLineNum = 75;BA.debugLine="txtEmail.TextColor = 0xfff6f7f7";
_txtemail.setTextColor(((int)0xfff6f7f7));
 //BA.debugLineNum = 76;BA.debugLine="txtEmail.Gravity = Gravity.Left";
_txtemail.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 77;BA.debugLine="txtEmail.Text = \"admin\"";
_txtemail.setText(BA.ObjectToCharSequence("admin"));
 //BA.debugLineNum = 78;BA.debugLine="mBase.AddView(txtEmail,0.31 * mBase.Width,0.39 *";
_mbase.AddView((android.view.View)(_txtemail.getObject()),(int) (0.31*_mbase.getWidth()),(int) (0.39*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 80;BA.debugLine="txtEmail.TextColor=Colors.black";
_txtemail.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 81;BA.debugLine="btnupdate3.TextColor = 0xffffffff";
_btnupdate3.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 82;BA.debugLine="btnupdate3.Text = \"Login\"";
_btnupdate3.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 83;BA.debugLine="Starter.image(btnupdate3,\"main button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnupdate3.getObject())),"main button.png");
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(btnupdate3,0.11 * mBase.Width,0.68";
_mbase.AddView((android.view.View)(_btnupdate3.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.68*_mbase.getHeight()),(int) (0.78*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 86;BA.debugLine="settingsTitle.Color =  0x00ffffff";
_settingstitle.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 87;BA.debugLine="settingsTitle.TextColor = 0xfffdb818";
_settingstitle.setTextColor(((int)0xfffdb818));
 //BA.debugLineNum = 88;BA.debugLine="settingsTitle.Gravity = Gravity.CENTER";
_settingstitle.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 89;BA.debugLine="settingsTitle.Text = \"L O G I N\"";
_settingstitle.setText(BA.ObjectToCharSequence("L O G I N"));
 //BA.debugLineNum = 90;BA.debugLine="settingsTitle.TextSize = 28";
_settingstitle.setTextSize((float) (28));
 //BA.debugLineNum = 91;BA.debugLine="settingsTitle.Typeface = sourcesanspro.DEFAULT_BO";
_settingstitle.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(settingsTitle,0.28 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_settingstitle.getObject()),(int) (0.28*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()),(int) (0.45*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 94;BA.debugLine="QLabel7.Color =  0x00ffffff";
_qlabel7.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 95;BA.debugLine="QLabel7.TextColor = 0xff000000";
_qlabel7.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 96;BA.debugLine="QLabel7.Gravity = Gravity.Left";
_qlabel7.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 97;BA.debugLine="QLabel7.Text = \"Password\"";
_qlabel7.setText(BA.ObjectToCharSequence("Password"));
 //BA.debugLineNum = 98;BA.debugLine="QLabel7.Typeface = sourcesanspro.DEFAULT_BOLD";
_qlabel7.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 99;BA.debugLine="mBase.AddView(QLabel7,0.11 * mBase.Width,0.48 * m";
_mbase.AddView((android.view.View)(_qlabel7.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.48*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 101;BA.debugLine="txtPassword.Color =  0x00ffffff";
_txtpassword.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 102;BA.debugLine="txtPassword.TextColor = 0xfff6f7f7";
_txtpassword.setTextColor(((int)0xfff6f7f7));
 //BA.debugLineNum = 103;BA.debugLine="txtPassword.Gravity = Gravity.Left";
_txtpassword.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 104;BA.debugLine="txtPassword.Text = \"1234\"";
_txtpassword.setText(BA.ObjectToCharSequence("1234"));
 //BA.debugLineNum = 105;BA.debugLine="mBase.AddView(txtPassword,0.31 * mBase.Width,0.47";
_mbase.AddView((android.view.View)(_txtpassword.getObject()),(int) (0.31*_mbase.getWidth()),(int) (0.47*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 107;BA.debugLine="txtEmail.Color =  0xfff6f7f7";
_txtemail.setColor(((int)0xfff6f7f7));
 //BA.debugLineNum = 108;BA.debugLine="txtEmail.TextColor = 0xff000000";
_txtemail.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 109;BA.debugLine="txtPassword.Color =  0xfff6f7f7";
_txtpassword.setColor(((int)0xfff6f7f7));
 //BA.debugLineNum = 110;BA.debugLine="txtPassword.TextColor = 0xff000000";
_txtpassword.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 112;BA.debugLine="QLabel8.Text = \"Login to view your household's el";
_qlabel8.setText(BA.ObjectToCharSequence("Login to view your household's electricity consumption."));
 //BA.debugLineNum = 113;BA.debugLine="txtPassword.TextColor=Colors.black";
_txtpassword.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 115;BA.debugLine="QLabel8.Color =  0x00ffffff";
_qlabel8.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 116;BA.debugLine="QLabel8.TextColor = 0xff000000";
_qlabel8.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 117;BA.debugLine="QLabel8.Gravity = Gravity.CENTER";
_qlabel8.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(QLabel8,0.09 * mBase.Width,0.23 * m";
_mbase.AddView((android.view.View)(_qlabel8.getObject()),(int) (0.09*_mbase.getWidth()),(int) (0.23*_mbase.getHeight()),(int) (0.82*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 40;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 41;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 43;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 44;BA.debugLine="QLabel5.Initialize(\"QLabel5\")";
_qlabel5.Initialize(ba,"QLabel5");
 //BA.debugLineNum = 45;BA.debugLine="txtEmail.Initialize(\"txtEmail\")";
_txtemail.Initialize(ba,"txtEmail");
 //BA.debugLineNum = 46;BA.debugLine="btnupdate3.Initialize(\"btnupdate3\")";
_btnupdate3.Initialize(ba,"btnupdate3");
 //BA.debugLineNum = 47;BA.debugLine="settingsTitle.Initialize(\"settingsTitle\")";
_settingstitle.Initialize(ba,"settingsTitle");
 //BA.debugLineNum = 48;BA.debugLine="QLabel5.Initialize(\"QLabel5\")";
_qlabel5.Initialize(ba,"QLabel5");
 //BA.debugLineNum = 49;BA.debugLine="QLabel6.Initialize(\"QLabel6\")";
_qlabel6.Initialize(ba,"QLabel6");
 //BA.debugLineNum = 50;BA.debugLine="QLabel7.Initialize(\"QLabel7\")";
_qlabel7.Initialize(ba,"QLabel7");
 //BA.debugLineNum = 51;BA.debugLine="QLabel8.Initialize(\"QLabel8\")";
_qlabel8.Initialize(ba,"QLabel8");
 //BA.debugLineNum = 52;BA.debugLine="txtPassword.Initialize(\"txtPassword\")";
_txtpassword.Initialize(ba,"txtPassword");
 //BA.debugLineNum = 53;BA.debugLine="QLineEdit7.Initialize(\"QLineEdit7\")";
_qlineedit7.Initialize(ba,"QLineEdit7");
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _qlabel5_click() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub QLabel5_click()";
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _qlabel6_click() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub QLabel6_click()";
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _qlabel7_click() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub QLabel7_click()";
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 156;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _settingstitle_click() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub settingsTitle_click()";
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 153;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _txtemail_click() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub txtEmail_click()";
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _txtpassword_click() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub txtPassword_click()";
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

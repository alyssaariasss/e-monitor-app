package b4a.esalbamcu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbamcu.frmmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbamcu.frmmap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnavailability = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webkit1 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbamcu.main _main = null;
public b4a.esalbamcu.starter _starter = null;
public b4a.esalbamcu.vb6 _vb6 = null;
public b4a.esalbamcu.b4xcollections _b4xcollections = null;
public b4a.esalbamcu.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 23;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 24;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 25;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _btnavailability_click() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub btnavailability_click()";
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.esalbamcu.frmmain _frmmain1 = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub btnback_click()";
 //BA.debugLineNum = 66;BA.debugLine="Dim frmmain1 As frmmain=Starter.frmmain1";
_frmmain1 = (b4a.esalbamcu.frmmain)(_starter._frmmain1 /*Object*/ );
 //BA.debugLineNum = 67;BA.debugLine="frmmain1.Visible=True";
_frmmain1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 68;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnavailability As Button";
_btnavailability = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnback As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim webkit1 As WebView";
_webkit1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 41;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 42;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 84;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 74;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 46;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 47;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 48;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 49;BA.debugLine="mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 50;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"cat.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 51;BA.debugLine="mBase.AddView(btnavailability,0.24 * mBase.Width,";
_mbase.AddView((android.view.View)(_btnavailability.getObject()),(int) (0.24*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.54*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 52;BA.debugLine="mBase.AddView(btnback,0.03 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.03*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 53;BA.debugLine="mBase.AddView(webkit1,0.03 * mBase.Width,0.14 * m";
_mbase.AddView((android.view.View)(_webkit1.getObject()),(int) (0.03*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()),(int) (0.95*_mbase.getWidth()),(int) (0.81*_mbase.getHeight()));
 //BA.debugLineNum = 54;BA.debugLine="webkit1.Color =  0x00ffffff";
_webkit1.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 55;BA.debugLine="webkit1.LoadUrl(\"https://www.google.com.ph/maps/p";
_webkit1.LoadUrl("https://www.google.com.ph/maps/place/Jorge+Bocobo+St,+Manila,+Metro+Manila/@14.5732047,120.9840679,17.62z/data=!4m6!3m5!1s0x3397ca2a386ea429:0x565401dd4396c2d0!8m2!3d14.5744647!4d120.9845263!16s%2Fg%2F1tfjhnp7?hl=en");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 30;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 31;BA.debugLine="btnavailability.Initialize(\"btnavailability\")";
_btnavailability.Initialize(ba,"btnavailability");
 //BA.debugLineNum = 32;BA.debugLine="btnback.Initialize(\"btnback\")";
_btnback.Initialize(ba,"btnback");
 //BA.debugLineNum = 33;BA.debugLine="webkit1.Initialize(\"webkit1\")";
_webkit1.Initialize(ba,"webkit1");
 //BA.debugLineNum = 34;BA.debugLine="btnback.Text=\"<<\"";
_btnback.setText(BA.ObjectToCharSequence("<<"));
 //BA.debugLineNum = 35;BA.debugLine="btnback.TextColor=Colors.Blue";
_btnback.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 36;BA.debugLine="btnavailability.Text=\"Location\"";
_btnavailability.setText(BA.ObjectToCharSequence("Location"));
 //BA.debugLineNum = 37;BA.debugLine="btnavailability.TextColor=Colors.Blue";
_btnavailability.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 80;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 77;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _webkit1_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub webkit1_click()";
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

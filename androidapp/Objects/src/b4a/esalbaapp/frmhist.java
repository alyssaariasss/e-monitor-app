package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmhist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.frmhist");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.frmhist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public b4a.esalbaapp.table _datagrid1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrefresh = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel4 = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _sourcesanspro = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfilter = null;
public anywheresoftware.b4a.objects.EditTextWrapper _linenum = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel7 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 31;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 32;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 33;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.esalbaapp.frmmain _frmmain1 = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub btnback_click()";
 //BA.debugLineNum = 144;BA.debugLine="Dim frmmain1 As frmmain=Starter.frmmain1";
_frmmain1 = (b4a.esalbaapp.frmmain)(_starter._frmmain1 /*Object*/ );
 //BA.debugLineNum = 145;BA.debugLine="frmmain1.Visible=True";
_frmmain1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 146;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public void  _btnfilter_click() throws Exception{
ResumableSub_btnfilter_click rsub = new ResumableSub_btnfilter_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnfilter_click extends BA.ResumableSub {
public ResumableSub_btnfilter_click(b4a.esalbaapp.frmhist parent) {
this.parent = parent;
}
b4a.esalbaapp.frmhist parent;
b4a.esalbaapp.clsparser _cls = null;
String _sql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 119;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 120;BA.debugLine="Dim sql As String=$\"select * from history where L";
_sql = ("select * from history where Line='"+parent.__c.SmartStringFormatter("",(Object)(parent._linenum.getText()))+"'");
 //BA.debugLineNum = 121;BA.debugLine="cls=Starter.QuerryServer(\"HIST\",Chr(13),sql)";
_cls = parent._starter._querryserver /*b4a.esalbaapp.clsparser*/ ("HIST",BA.ObjectToString(parent.__c.Chr((int) (13))),_sql);
 //BA.debugLineNum = 122;BA.debugLine="Do While Starter.mapparser.Get(cls)=\"NOTFINISH\"";
if (true) break;

case 1:
//do while
this.state = 4;
while ((parent._starter._mapparser /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_cls))).equals((Object)("NOTFINISH"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 123;BA.debugLine="Sleep(1)";
parent.__c.Sleep(ba,this,(int) (1));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 125;BA.debugLine="Log(cls.data)";
parent.__c.LogImpl("810747911",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 126;BA.debugLine="If cls.data<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_cls._data /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 127;BA.debugLine="Starter.wsh.DataGrid(DataGrid1,cls.data,\"LIne,St";
parent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._datagrid /*String*/ (parent._datagrid1,_cls._data /*String*/ ,"LIne,State,KW,Date");
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnrefresh_click() throws Exception{
ResumableSub_btnrefresh_click rsub = new ResumableSub_btnrefresh_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnrefresh_click extends BA.ResumableSub {
public ResumableSub_btnrefresh_click(b4a.esalbaapp.frmhist parent) {
this.parent = parent;
}
b4a.esalbaapp.frmhist parent;
b4a.esalbaapp.clsparser _cls = null;
String _sql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 132;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 133;BA.debugLine="Dim sql As String=$\"select * from history\"$";
_sql = ("select * from history");
 //BA.debugLineNum = 134;BA.debugLine="cls=Starter.QuerryServer(\"HIST\",Chr(13),sql)";
_cls = parent._starter._querryserver /*b4a.esalbaapp.clsparser*/ ("HIST",BA.ObjectToString(parent.__c.Chr((int) (13))),_sql);
 //BA.debugLineNum = 135;BA.debugLine="Do While Starter.mapparser.Get(cls)=\"NOTFINISH\"";
if (true) break;

case 1:
//do while
this.state = 4;
while ((parent._starter._mapparser /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_cls))).equals((Object)("NOTFINISH"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 136;BA.debugLine="Sleep(1)";
parent.__c.Sleep(ba,this,(int) (1));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 138;BA.debugLine="Log(cls.data)";
parent.__c.LogImpl("810813447",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 139;BA.debugLine="If cls.data<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_cls._data /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 140;BA.debugLine="Starter.wsh.DataGrid(DataGrid1,cls.data,\"LIne,Sta";
parent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._datagrid /*String*/ (parent._datagrid1,_cls._data /*String*/ ,"LIne,State,KW,Date");
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
 //BA.debugLineNum = 16;BA.debugLine="Dim DataGrid1 As Table";
_datagrid1 = new b4a.esalbaapp.table();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnrefresh As Button";
_btnrefresh = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnback As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim QLabel4 As Label";
_qlabel4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim sourcesanspro As Typeface";
_sourcesanspro = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 23;BA.debugLine="sourcesanspro = Typeface.LoadFromAssets(\"SourceSa";
_sourcesanspro = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")));
 //BA.debugLineNum = 24;BA.debugLine="Dim btnfilter As Button";
_btnfilter = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim linenum As EditText";
_linenum = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim QLabel7 As Label";
_qlabel7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _datagrid1_cellclick(int _col,int _row) throws Exception{
String _val = "";
 //BA.debugLineNum = 112;BA.debugLine="Sub DataGrid1_CellClick (Col As Int, Row As Int)";
 //BA.debugLineNum = 113;BA.debugLine="Log(\"CellClick: \" & Col & \" , \" & Row)";
__c.LogImpl("810682369","CellClick: "+BA.NumberToString(_col)+" , "+BA.NumberToString(_row),0);
 //BA.debugLineNum = 114;BA.debugLine="Dim val As String = DataGrid1.GetValue(Col, Row)";
_val = _datagrid1._getvalue /*String*/ (_col,_row);
 //BA.debugLineNum = 115;BA.debugLine="ToastMessageShow(val,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_val),__c.False);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 53;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 54;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 56;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 57;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 58;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 59;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 61;BA.debugLine="mBase.AddView(bkgimage,0.00 * mBase.Width,0.00 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 62;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"history bg.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 63;BA.debugLine="DataGrid1.AddToParent(mBase,0.12 * mBase.Width,0.";
_datagrid1._addtoparent /*String*/ ((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_mbase.getObject())),(int) (0.12*_mbase.getWidth()),(int) (0.23*_mbase.getHeight()),(int) (0.74*_mbase.getWidth()),(int) (0.68*_mbase.getHeight()));
 //BA.debugLineNum = 66;BA.debugLine="btnrefresh.TextColor = 0xff000000";
_btnrefresh.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 67;BA.debugLine="btnrefresh.Text = \"Refresh\"";
_btnrefresh.setText(BA.ObjectToCharSequence("Refresh"));
 //BA.debugLineNum = 68;BA.debugLine="mBase.AddView(btnrefresh,0.85 * mBase.Width,0.04";
_mbase.AddView((android.view.View)(_btnrefresh.getObject()),(int) (0.85*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()),(int) (0.06*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 69;BA.debugLine="btnback.TextColor = 0xff000000";
_btnback.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 70;BA.debugLine="btnback.Text = \"\"";
_btnback.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 71;BA.debugLine="Starter.image(btnrefresh,\"refresh button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnrefresh.getObject())),"refresh button.png");
 //BA.debugLineNum = 72;BA.debugLine="Starter.image(btnback,\"back button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnback.getObject())),"back button.png");
 //BA.debugLineNum = 73;BA.debugLine="Starter.image(btnfilter,\"update button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnfilter.getObject())),"update button.png");
 //BA.debugLineNum = 74;BA.debugLine="mBase.AddView(btnback,0.07 * mBase.Width,0.03 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()),(int) (0.09*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="btnrefresh.TextColor = 0xffffffff";
_btnrefresh.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 77;BA.debugLine="btnback.Text = \"\"";
_btnback.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 78;BA.debugLine="QLabel4.Color =  0x00ffffff";
_qlabel4.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 79;BA.debugLine="QLabel4.TextColor = 0xfffdb818";
_qlabel4.setTextColor(((int)0xfffdb818));
 //BA.debugLineNum = 80;BA.debugLine="QLabel4.Gravity = Gravity.CENTER";
_qlabel4.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 81;BA.debugLine="QLabel4.Text = \"H I S T O R Y\"";
_qlabel4.setText(BA.ObjectToCharSequence("H I S T O R Y"));
 //BA.debugLineNum = 82;BA.debugLine="QLabel4.TextSize = 28";
_qlabel4.setTextSize((float) (28));
 //BA.debugLineNum = 83;BA.debugLine="QLabel4.Typeface = sourcesanspro.DEFAULT_BOLD";
_qlabel4.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(QLabel4,0.30 * mBase.Width,0.03 * m";
_mbase.AddView((android.view.View)(_qlabel4.getObject()),(int) (0.30*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()),(int) (0.47*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 85;BA.debugLine="QLabel4.Gravity = Gravity.Left";
_qlabel4.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 86;BA.debugLine="btnfilter.TextColor = 0xffffffff";
_btnfilter.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 87;BA.debugLine="btnfilter.Text = \"Filter\"";
_btnfilter.setText(BA.ObjectToCharSequence("Filter"));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(btnfilter,0.56 * mBase.Width,0.12 *";
_mbase.AddView((android.view.View)(_btnfilter.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.23*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="QLabel7.Color =  0x00ffffff";
_qlabel7.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 90;BA.debugLine="QLabel7.TextColor = 0xff000000";
_qlabel7.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 91;BA.debugLine="QLabel7.Gravity = Gravity.Left";
_qlabel7.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 92;BA.debugLine="QLabel7.Text = \"Enter Line #\"";
_qlabel7.setText(BA.ObjectToCharSequence("Enter Line #"));
 //BA.debugLineNum = 93;BA.debugLine="QLabel7.TextSize = 12";
_qlabel7.setTextSize((float) (12));
 //BA.debugLineNum = 94;BA.debugLine="QLabel7.Typeface = sourcesanspro.DEFAULT_BOLD";
_qlabel7.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 96;BA.debugLine="linenum.Color =  0xfff6f7f7";
_linenum.setColor(((int)0xfff6f7f7));
 //BA.debugLineNum = 97;BA.debugLine="linenum.TextColor = 0xff000000";
_linenum.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 98;BA.debugLine="linenum.Gravity = Gravity.CENTER";
_linenum.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 99;BA.debugLine="linenum.Text = \"0\"";
_linenum.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 100;BA.debugLine="Starter.image(linenum,\"history box.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_linenum.getObject())),"history box.png");
 //BA.debugLineNum = 101;BA.debugLine="mBase.AddView(linenum,0.38 * mBase.Width,0.12 * m";
_mbase.AddView((android.view.View)(_linenum.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 103;BA.debugLine="mBase.AddView(QLabel7,0.17 * mBase.Width,0.14 * m";
_mbase.AddView((android.view.View)(_qlabel7.getObject()),(int) (0.17*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 104;BA.debugLine="btnrefresh.Text = \"\"";
_btnrefresh.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 36;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 37;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 39;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 40;BA.debugLine="DataGrid1.Initialize(Me,\"DataGrid1\",4)";
_datagrid1._initialize /*String*/ (ba,this,"DataGrid1",(int) (4));
 //BA.debugLineNum = 43;BA.debugLine="btnrefresh.Initialize(\"btnrefresh\")";
_btnrefresh.Initialize(ba,"btnrefresh");
 //BA.debugLineNum = 44;BA.debugLine="btnback.Initialize(\"btnback\")";
_btnback.Initialize(ba,"btnback");
 //BA.debugLineNum = 46;BA.debugLine="QLabel4.Initialize(\"QLabel4\")";
_qlabel4.Initialize(ba,"QLabel4");
 //BA.debugLineNum = 47;BA.debugLine="btnfilter.Initialize(\"btnfilter\")";
_btnfilter.Initialize(ba,"btnfilter");
 //BA.debugLineNum = 48;BA.debugLine="linenum.Initialize(\"linenum\")";
_linenum.Initialize(ba,"linenum");
 //BA.debugLineNum = 49;BA.debugLine="QLabel7.Initialize(\"QLabel7\")";
_qlabel7.Initialize(ba,"QLabel7");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 156;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 153;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

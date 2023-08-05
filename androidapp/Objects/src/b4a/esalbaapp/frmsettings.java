package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmsettings extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.frmsettings");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.frmsettings.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _bkgimage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttime1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtkw1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnupdate1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttime2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtkw2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttime3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _qlabel14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtkw3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnupdate2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnupdate3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _settingstitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _line1title = null;
public anywheresoftware.b4a.objects.LabelWrapper _limit1title = null;
public anywheresoftware.b4a.objects.LabelWrapper _line2title = null;
public anywheresoftware.b4a.objects.LabelWrapper _limit2title = null;
public anywheresoftware.b4a.objects.LabelWrapper _line3title = null;
public anywheresoftware.b4a.objects.LabelWrapper _limit3title = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _sourcesanspro = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrefresh1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvoice = null;
public int _lastedit1 = 0;
public int _lastedit2 = 0;
public int _lastedit3 = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 53;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 54;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 55;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _bkgimage_click() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub bkgimage_click()";
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.esalbaapp.frmmain _frmmain1 = null;
 //BA.debugLineNum = 270;BA.debugLine="Sub btnback_click()";
 //BA.debugLineNum = 271;BA.debugLine="Dim frmmain1 As frmmain=Starter.frmmain1";
_frmmain1 = (b4a.esalbaapp.frmmain)(_starter._frmmain1 /*Object*/ );
 //BA.debugLineNum = 272;BA.debugLine="frmmain1.Visible=True";
_frmmain1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 273;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public void  _btnrefresh1_click() throws Exception{
ResumableSub_btnrefresh1_click rsub = new ResumableSub_btnrefresh1_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnrefresh1_click extends BA.ResumableSub {
public ResumableSub_btnrefresh1_click(b4a.esalbaapp.frmsettings parent) {
this.parent = parent;
}
b4a.esalbaapp.frmsettings parent;
b4a.esalbaapp.clswidget _cc = null;
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
 //BA.debugLineNum = 276;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 277;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 279;BA.debugLine="Dim sql As String=$\"select * from `trigger1`\"$";
_sql = ("select * from `trigger1`");
 //BA.debugLineNum = 280;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 281;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 283;BA.debugLine="If l.Size<>0 Then";
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
 //BA.debugLineNum = 287;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 288;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 289;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 290;BA.debugLine="txtkw1.Text=ll.Get(1)";
parent._txtkw1.setText(BA.ObjectToCharSequence(_ll.Get((int) (1))));
 //BA.debugLineNum = 291;BA.debugLine="txttime1.Text=ll.Get(0)";
parent._txttime1.setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 294;BA.debugLine="Dim sql As String=$\"select * from `trigger2`\"$";
_sql = ("select * from `trigger2`");
 //BA.debugLineNum = 295;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 296;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 14;
return;
case 14:
//C
this.state = 5;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 298;BA.debugLine="If l.Size<>0 Then";
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
 //BA.debugLineNum = 302;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 303;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 304;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 305;BA.debugLine="txtkw2.Text=0.012";
parent._txtkw2.setText(BA.ObjectToCharSequence(0.012));
 //BA.debugLineNum = 306;BA.debugLine="txttime2.Text=ll.Get(0)";
parent._txttime2.setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 309;BA.debugLine="Dim sql As String=$\"select * from `trigger3`\"$";
_sql = ("select * from `trigger3`");
 //BA.debugLineNum = 310;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 311;BA.debugLine="Wait For(rs) Complete (l As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 15;
return;
case 15:
//C
this.state = 9;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 313;BA.debugLine="If l.Size<>0 Then";
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
 //BA.debugLineNum = 317;BA.debugLine="Dim ll As List";
_ll = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 318;BA.debugLine="ll.Initialize";
_ll.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="ll=l.get(0)";
_ll = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_l.Get((int) (0))));
 //BA.debugLineNum = 320;BA.debugLine="txtkw3.Text=ll.Get(1)";
parent._txtkw3.setText(BA.ObjectToCharSequence(_ll.Get((int) (1))));
 //BA.debugLineNum = 321;BA.debugLine="txttime3.Text=ll.Get(0)";
parent._txttime3.setText(BA.ObjectToCharSequence(_ll.Get((int) (0))));
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.List _l) throws Exception{
}
public void  _btnupdate1_click() throws Exception{
ResumableSub_btnupdate1_click rsub = new ResumableSub_btnupdate1_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnupdate1_click extends BA.ResumableSub {
public ResumableSub_btnupdate1_click(b4a.esalbaapp.frmsettings parent) {
this.parent = parent;
}
b4a.esalbaapp.frmsettings parent;
b4a.esalbaapp.clswidget _cc = null;
b4a.esalbaapp.clsparser _cls = null;
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
this.state = 1;
 //BA.debugLineNum = 358;BA.debugLine="If lastedit1=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._lastedit1==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 359;BA.debugLine="txttime1.Text=\"0\"";
parent._txttime1.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 361;BA.debugLine="txtkw1.Text=\"0\"";
parent._txtkw1.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 363;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 364;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 365;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 366;BA.debugLine="Dim sql As String=$\"UPDATE `trigger1` SET Time='$";
_sql = ("UPDATE `trigger1` SET Time='"+parent.__c.SmartStringFormatter("",(Object)(parent._txttime1.getText()))+"',KW='"+parent.__c.SmartStringFormatter("",(Object)(parent._txtkw1.getText()))+"'");
 //BA.debugLineNum = 367;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 368;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 369;BA.debugLine="ToastMessageShow(\"LINE 1 LIMIT SET\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("LINE 1 LIMIT SET"),parent.__c.False);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnupdate2_click() throws Exception{
ResumableSub_btnupdate2_click rsub = new ResumableSub_btnupdate2_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnupdate2_click extends BA.ResumableSub {
public ResumableSub_btnupdate2_click(b4a.esalbaapp.frmsettings parent) {
this.parent = parent;
}
b4a.esalbaapp.frmsettings parent;
b4a.esalbaapp.clswidget _cc = null;
b4a.esalbaapp.clsparser _cls = null;
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
this.state = 1;
 //BA.debugLineNum = 372;BA.debugLine="If lastedit2=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._lastedit2==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 373;BA.debugLine="txttime2.Text=\"0\"";
parent._txttime2.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 375;BA.debugLine="txtkw2.Text=\"0\"";
parent._txtkw2.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 377;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 378;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 379;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 380;BA.debugLine="Dim sql As String=$\"UPDATE `trigger2` SET Time='$";
_sql = ("UPDATE `trigger2` SET Time='"+parent.__c.SmartStringFormatter("",(Object)(parent._txttime2.getText()))+"',KW='"+parent.__c.SmartStringFormatter("",(Object)(parent._txtkw2.getText()))+"'");
 //BA.debugLineNum = 381;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 382;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 383;BA.debugLine="ToastMessageShow(\"LINE 2 LIMIT SET\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("LINE 2 LIMIT SET"),parent.__c.False);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnupdate3_click() throws Exception{
ResumableSub_btnupdate3_click rsub = new ResumableSub_btnupdate3_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnupdate3_click extends BA.ResumableSub {
public ResumableSub_btnupdate3_click(b4a.esalbaapp.frmsettings parent) {
this.parent = parent;
}
b4a.esalbaapp.frmsettings parent;
b4a.esalbaapp.clswidget _cc = null;
b4a.esalbaapp.clsparser _cls = null;
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
this.state = 1;
 //BA.debugLineNum = 386;BA.debugLine="If lastedit3=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._lastedit3==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 387;BA.debugLine="txttime3.Text=\"0\"";
parent._txttime3.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 389;BA.debugLine="txtkw3.Text=\"0\"";
parent._txtkw3.setText(BA.ObjectToCharSequence("0"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 391;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 392;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent)));
 //BA.debugLineNum = 393;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 394;BA.debugLine="Dim sql As String=$\"UPDATE `trigger3` SET Time='$";
_sql = ("UPDATE `trigger3` SET Time='"+parent.__c.SmartStringFormatter("",(Object)(parent._txttime3.getText()))+"',KW='"+parent.__c.SmartStringFormatter("",(Object)(parent._txtkw3.getText()))+"'");
 //BA.debugLineNum = 395;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 396;BA.debugLine="Wait For(rs) Complete (Result1 As List)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result1 = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 397;BA.debugLine="ToastMessageShow(\"LINE 3 LIMIT SET\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("LINE 3 LIMIT SET"),parent.__c.False);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnvoice_click() throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub btnvoice_click()";
 //BA.debugLineNum = 325;BA.debugLine="CallSub(Main,\"Speak\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"Speak");
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim btnback As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim QLabel3 As Label";
_qlabel3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim txttime1 As EditText";
_txttime1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim QLabel5 As Label";
_qlabel5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim txtkw1 As EditText";
_txtkw1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim btnupdate1 As Button";
_btnupdate1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim QLabel8 As Label";
_qlabel8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim txttime2 As EditText";
_txttime2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim QLabel10 As Label";
_qlabel10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim txtkw2 As EditText";
_txtkw2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim QLabel12 As Label";
_qlabel12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim txttime3 As EditText";
_txttime3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim QLabel14 As Label";
_qlabel14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim txtkw3 As EditText";
_txtkw3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim btnupdate2 As Button";
_btnupdate2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim btnupdate3 As Button";
_btnupdate3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim settingsTitle As Label";
_settingstitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim line1Title As Label";
_line1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Dim limit1Title As Label";
_limit1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim line2Title As Label";
_line2title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Dim limit2Title As Label";
_limit2title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Dim line3Title As Label";
_line3title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Dim limit3Title As Label";
_limit3title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Dim sourcesanspro As Typeface";
_sourcesanspro = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 42;BA.debugLine="sourcesanspro = Typeface.LoadFromAssets(\"SourceSa";
_sourcesanspro = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets("SourceSansPro-Regular.ttf")));
 //BA.debugLineNum = 44;BA.debugLine="Dim btnrefresh1 As Button";
_btnrefresh1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Dim btnvoice As Button";
_btnvoice = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Dim lastedit1 As Int";
_lastedit1 = 0;
 //BA.debugLineNum = 47;BA.debugLine="Dim lastedit2 As Int";
_lastedit2 = 0;
 //BA.debugLineNum = 48;BA.debugLine="Dim lastedit3 As Int";
_lastedit3 = 0;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 92;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 93;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 411;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 401;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 96;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor(((int)0x000000));
 //BA.debugLineNum = 97;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 98;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 100;BA.debugLine="mBase.AddView(bkgimage,0.01 * mBase.Width,-0.01 *";
_mbase.AddView((android.view.View)(_bkgimage.getObject()),(int) (0.01*_mbase.getWidth()),(int) (-0.01*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 101;BA.debugLine="bkgimage.Bitmap = LoadBitmapResize(File.DirAssets";
_bkgimage.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"settings bg.png",_bkgimage.getWidth(),_bkgimage.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 102;BA.debugLine="mBase.AddView(btnback,0.06 * mBase.Width,0.03 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()),(int) (0.09*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 103;BA.debugLine="QLabel3.Color =  0x00ffffff";
_qlabel3.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 104;BA.debugLine="QLabel3.TextColor = 0xff000000";
_qlabel3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 105;BA.debugLine="QLabel3.Gravity = Gravity.Left";
_qlabel3.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 106;BA.debugLine="QLabel3.Text = \"Time 1\"";
_qlabel3.setText(BA.ObjectToCharSequence("Time 1"));
 //BA.debugLineNum = 107;BA.debugLine="mBase.AddView(QLabel3,0.16 * mBase.Width,0.28 * m";
_mbase.AddView((android.view.View)(_qlabel3.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.28*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 108;BA.debugLine="txttime1.Color =  0xffffffff";
_txttime1.setColor(((int)0xffffffff));
 //BA.debugLineNum = 109;BA.debugLine="txttime1.TextColor = 0xff000000";
_txttime1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 110;BA.debugLine="txttime1.Gravity = Gravity.Left";
_txttime1.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 111;BA.debugLine="txttime1.Text = \"0\"";
_txttime1.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 112;BA.debugLine="mBase.AddView(txttime1,0.29 * mBase.Width,0.26 *";
_mbase.AddView((android.view.View)(_txttime1.getObject()),(int) (0.29*_mbase.getWidth()),(int) (0.26*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 113;BA.debugLine="txttime1.TextColor=Colors.black";
_txttime1.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 114;BA.debugLine="QLabel5.Color =  0x00ffffff";
_qlabel5.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 115;BA.debugLine="QLabel5.TextColor = 0xff000000";
_qlabel5.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 116;BA.debugLine="QLabel5.Gravity = Gravity.Left";
_qlabel5.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 117;BA.debugLine="QLabel5.Text = \"KW 1\"";
_qlabel5.setText(BA.ObjectToCharSequence("KW 1"));
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(QLabel5,0.54 * mBase.Width,0.28 * m";
_mbase.AddView((android.view.View)(_qlabel5.getObject()),(int) (0.54*_mbase.getWidth()),(int) (0.28*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 119;BA.debugLine="txtkw1.Color =  0xffffffff";
_txtkw1.setColor(((int)0xffffffff));
 //BA.debugLineNum = 120;BA.debugLine="txtkw1.TextColor = 0xff000000";
_txtkw1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 121;BA.debugLine="txtkw1.Gravity = Gravity.Left";
_txtkw1.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 122;BA.debugLine="txtkw1.Text = \"0\"";
_txtkw1.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 123;BA.debugLine="mBase.AddView(txtkw1,0.65 * mBase.Width,0.26 * mB";
_mbase.AddView((android.view.View)(_txtkw1.getObject()),(int) (0.65*_mbase.getWidth()),(int) (0.26*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 124;BA.debugLine="txtkw1.TextColor=Colors.black";
_txtkw1.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 125;BA.debugLine="btnupdate1.TextColor = 0xff000000";
_btnupdate1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 126;BA.debugLine="btnupdate1.Text = \"Update\"";
_btnupdate1.setText(BA.ObjectToCharSequence("Update"));
 //BA.debugLineNum = 127;BA.debugLine="btnupdate1.Typeface = sourcesanspro.DEFAULT_BOLD";
_btnupdate1.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 128;BA.debugLine="mBase.AddView(btnupdate1,0.62 * mBase.Width,0.15";
_mbase.AddView((android.view.View)(_btnupdate1.getObject()),(int) (0.62*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()),(int) (0.23*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 129;BA.debugLine="QLabel8.Color =  0x00ffffff";
_qlabel8.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 130;BA.debugLine="QLabel8.TextColor = 0xff000000";
_qlabel8.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 131;BA.debugLine="QLabel8.Gravity = Gravity.Left";
_qlabel8.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 132;BA.debugLine="QLabel8.Text = \"KW 2\"";
_qlabel8.setText(BA.ObjectToCharSequence("KW 2"));
 //BA.debugLineNum = 133;BA.debugLine="mBase.AddView(QLabel8,0.16 * mBase.Width,0.56 * m";
_mbase.AddView((android.view.View)(_qlabel8.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.56*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 134;BA.debugLine="txttime2.Color =  0xffffffff";
_txttime2.setColor(((int)0xffffffff));
 //BA.debugLineNum = 135;BA.debugLine="txttime2.TextColor = 0xff000000";
_txttime2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 136;BA.debugLine="txttime2.Gravity = Gravity.Left";
_txttime2.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 137;BA.debugLine="txttime2.Text = \"0\"";
_txttime2.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 138;BA.debugLine="mBase.AddView(txttime2,0.29 * mBase.Width,0.54 *";
_mbase.AddView((android.view.View)(_txttime2.getObject()),(int) (0.29*_mbase.getWidth()),(int) (0.54*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 139;BA.debugLine="txttime2.TextColor=Colors.black";
_txttime2.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 140;BA.debugLine="QLabel10.Color =  0x00ffffff";
_qlabel10.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 141;BA.debugLine="QLabel10.TextColor = 0xff000000";
_qlabel10.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 142;BA.debugLine="QLabel10.Gravity = Gravity.Left";
_qlabel10.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 143;BA.debugLine="QLabel10.Text = \"KW 2\"";
_qlabel10.setText(BA.ObjectToCharSequence("KW 2"));
 //BA.debugLineNum = 144;BA.debugLine="mBase.AddView(QLabel10,0.54 * mBase.Width,0.56 *";
_mbase.AddView((android.view.View)(_qlabel10.getObject()),(int) (0.54*_mbase.getWidth()),(int) (0.56*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 145;BA.debugLine="txtkw2.Color =  0xffffffff";
_txtkw2.setColor(((int)0xffffffff));
 //BA.debugLineNum = 146;BA.debugLine="txtkw2.TextColor = 0xff000000";
_txtkw2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 147;BA.debugLine="txtkw2.Gravity = Gravity.Left";
_txtkw2.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 148;BA.debugLine="txtkw2.Text = \"0\"";
_txtkw2.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 149;BA.debugLine="mBase.AddView(txtkw2,0.65 * mBase.Width,0.54 * mB";
_mbase.AddView((android.view.View)(_txtkw2.getObject()),(int) (0.65*_mbase.getWidth()),(int) (0.54*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 150;BA.debugLine="txtkw2.TextColor=Colors.black";
_txtkw2.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 151;BA.debugLine="QLabel12.Color =  0x00ffffff";
_qlabel12.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 152;BA.debugLine="QLabel12.TextColor = 0xff000000";
_qlabel12.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 153;BA.debugLine="QLabel12.Gravity = Gravity.Left";
_qlabel12.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 154;BA.debugLine="QLabel12.Text = \"KW 3\"";
_qlabel12.setText(BA.ObjectToCharSequence("KW 3"));
 //BA.debugLineNum = 155;BA.debugLine="mBase.AddView(QLabel12,0.16 * mBase.Width,0.84 *";
_mbase.AddView((android.view.View)(_qlabel12.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.84*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 156;BA.debugLine="txttime3.Color =  0xffffffff";
_txttime3.setColor(((int)0xffffffff));
 //BA.debugLineNum = 157;BA.debugLine="txttime3.TextColor = 0xff000000";
_txttime3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 158;BA.debugLine="txttime3.Gravity = Gravity.Left";
_txttime3.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 159;BA.debugLine="txttime3.Text = \"0\"";
_txttime3.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 160;BA.debugLine="mBase.AddView(txttime3,0.29 * mBase.Width,0.82 *";
_mbase.AddView((android.view.View)(_txttime3.getObject()),(int) (0.29*_mbase.getWidth()),(int) (0.82*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 161;BA.debugLine="txttime3.TextColor=Colors.black";
_txttime3.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 162;BA.debugLine="QLabel14.Color =  0x00ffffff";
_qlabel14.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 163;BA.debugLine="QLabel14.TextColor = 0xff000000";
_qlabel14.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 164;BA.debugLine="QLabel14.Gravity = Gravity.Left";
_qlabel14.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 165;BA.debugLine="QLabel14.Text = \"KW 3\"";
_qlabel14.setText(BA.ObjectToCharSequence("KW 3"));
 //BA.debugLineNum = 166;BA.debugLine="mBase.AddView(QLabel14,0.55 * mBase.Width,0.84 *";
_mbase.AddView((android.view.View)(_qlabel14.getObject()),(int) (0.55*_mbase.getWidth()),(int) (0.84*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 167;BA.debugLine="txtkw3.Color =  0xffffffff";
_txtkw3.setColor(((int)0xffffffff));
 //BA.debugLineNum = 168;BA.debugLine="txtkw3.TextColor = 0xff000000";
_txtkw3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 169;BA.debugLine="txtkw3.Gravity = Gravity.Left";
_txtkw3.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 170;BA.debugLine="txtkw3.Text = \"0\"";
_txtkw3.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 171;BA.debugLine="mBase.AddView(txtkw3,0.66 * mBase.Width,0.82 * mB";
_mbase.AddView((android.view.View)(_txtkw3.getObject()),(int) (0.66*_mbase.getWidth()),(int) (0.82*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 172;BA.debugLine="txtkw3.TextColor=Colors.black";
_txtkw3.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 173;BA.debugLine="btnupdate2.TextColor = 0xff000000";
_btnupdate2.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 174;BA.debugLine="btnupdate2.Text = \"Update\"";
_btnupdate2.setText(BA.ObjectToCharSequence("Update"));
 //BA.debugLineNum = 175;BA.debugLine="btnupdate2.Typeface = sourcesanspro.DEFAULT_BOLD";
_btnupdate2.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 176;BA.debugLine="mBase.AddView(btnupdate2,0.62 * mBase.Width,0.44";
_mbase.AddView((android.view.View)(_btnupdate2.getObject()),(int) (0.62*_mbase.getWidth()),(int) (0.44*_mbase.getHeight()),(int) (0.23*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 177;BA.debugLine="btnupdate3.TextColor = 0xff000000";
_btnupdate3.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 178;BA.debugLine="btnupdate3.Text = \"Update\"";
_btnupdate3.setText(BA.ObjectToCharSequence("Update"));
 //BA.debugLineNum = 179;BA.debugLine="btnupdate3.Typeface = sourcesanspro.DEFAULT_BOLD";
_btnupdate3.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 180;BA.debugLine="mBase.AddView(btnupdate3,0.64 * mBase.Width,0.72";
_mbase.AddView((android.view.View)(_btnupdate3.getObject()),(int) (0.64*_mbase.getWidth()),(int) (0.72*_mbase.getHeight()),(int) (0.23*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 181;BA.debugLine="Starter.image(btnupdate1,\"update button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnupdate1.getObject())),"update button.png");
 //BA.debugLineNum = 182;BA.debugLine="Starter.image(btnupdate2,\"update button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnupdate2.getObject())),"update button.png");
 //BA.debugLineNum = 183;BA.debugLine="Starter.image(btnupdate3,\"update button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnupdate3.getObject())),"update button.png");
 //BA.debugLineNum = 184;BA.debugLine="Starter.image(btnback,\"back button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnback.getObject())),"back button.png");
 //BA.debugLineNum = 185;BA.debugLine="Starter.image(btnrefresh1,\"refresh button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnrefresh1.getObject())),"refresh button.png");
 //BA.debugLineNum = 186;BA.debugLine="Starter.image(btnvoice,\"voice button.png\")";
_starter._image /*String*/ ((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnvoice.getObject())),"voice button.png");
 //BA.debugLineNum = 188;BA.debugLine="settingsTitle.Color =  0x00ffffff";
_settingstitle.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 189;BA.debugLine="settingsTitle.TextColor = 0xfffdb818";
_settingstitle.setTextColor(((int)0xfffdb818));
 //BA.debugLineNum = 190;BA.debugLine="settingsTitle.Gravity = Gravity.Left";
_settingstitle.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 191;BA.debugLine="settingsTitle.Text = \"S E T T I N G S\"";
_settingstitle.setText(BA.ObjectToCharSequence("S E T T I N G S"));
 //BA.debugLineNum = 192;BA.debugLine="settingsTitle.TextSize = 28";
_settingstitle.setTextSize((float) (28));
 //BA.debugLineNum = 193;BA.debugLine="settingsTitle.Typeface = sourcesanspro.DEFAULT_BO";
_settingstitle.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 195;BA.debugLine="mBase.AddView(settingsTitle,0.26 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_settingstitle.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()),(int) (0.55*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 196;BA.debugLine="line1Title.Color =  0x00ffffff";
_line1title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 197;BA.debugLine="line1Title.TextColor = 0xff000000";
_line1title.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 198;BA.debugLine="line1Title.Gravity = Gravity.Left";
_line1title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 199;BA.debugLine="line1Title.Text = \"Line 1\"";
_line1title.setText(BA.ObjectToCharSequence("Line 1"));
 //BA.debugLineNum = 200;BA.debugLine="line1Title.TextSize = 18";
_line1title.setTextSize((float) (18));
 //BA.debugLineNum = 201;BA.debugLine="line1Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_line1title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 203;BA.debugLine="mBase.AddView(line1Title,0.16 * mBase.Width,0.16";
_mbase.AddView((android.view.View)(_line1title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.16*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 204;BA.debugLine="limit1Title.Color =  0x00ffffff";
_limit1title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 205;BA.debugLine="limit1Title.TextColor = 0xff4a5759";
_limit1title.setTextColor(((int)0xff4a5759));
 //BA.debugLineNum = 206;BA.debugLine="limit1Title.Gravity = Gravity.Left";
_limit1title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 207;BA.debugLine="limit1Title.Text = \"Set time / kWh limit\"";
_limit1title.setText(BA.ObjectToCharSequence("Set time / kWh limit"));
 //BA.debugLineNum = 208;BA.debugLine="limit1Title.TextSize = 14";
_limit1title.setTextSize((float) (14));
 //BA.debugLineNum = 209;BA.debugLine="limit1Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_limit1title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 211;BA.debugLine="mBase.AddView(limit1Title,0.16 * mBase.Width,0.21";
_mbase.AddView((android.view.View)(_limit1title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.21*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 212;BA.debugLine="btnupdate1.TextColor = 0xffffffff";
_btnupdate1.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 213;BA.debugLine="settingsTitle.Gravity = Gravity.Left";
_settingstitle.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 214;BA.debugLine="btnupdate2.TextColor = 0xffffffff";
_btnupdate2.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 215;BA.debugLine="btnupdate3.TextColor = 0xffffffff";
_btnupdate3.setTextColor(((int)0xffffffff));
 //BA.debugLineNum = 217;BA.debugLine="line2Title.Color =  0x00ffffff";
_line2title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 218;BA.debugLine="line2Title.TextColor = 0xff000000";
_line2title.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 219;BA.debugLine="line2Title.Gravity = Gravity.Left";
_line2title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 220;BA.debugLine="line2Title.Text = \"Line 2\"";
_line2title.setText(BA.ObjectToCharSequence("Line 2"));
 //BA.debugLineNum = 221;BA.debugLine="line2Title.TextSize = 18";
_line2title.setTextSize((float) (18));
 //BA.debugLineNum = 222;BA.debugLine="line2Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_line2title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 224;BA.debugLine="mBase.AddView(line2Title,0.16 * mBase.Width,0.44";
_mbase.AddView((android.view.View)(_line2title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.44*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 225;BA.debugLine="limit2Title.Color =  0x00ffffff";
_limit2title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 226;BA.debugLine="limit2Title.TextColor = 0xff4a5759";
_limit2title.setTextColor(((int)0xff4a5759));
 //BA.debugLineNum = 227;BA.debugLine="limit2Title.Gravity = Gravity.Left";
_limit2title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 228;BA.debugLine="limit2Title.Text = \"Set time / kWh limit\"";
_limit2title.setText(BA.ObjectToCharSequence("Set time / kWh limit"));
 //BA.debugLineNum = 229;BA.debugLine="limit2Title.TextSize = 14";
_limit2title.setTextSize((float) (14));
 //BA.debugLineNum = 230;BA.debugLine="limit2Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_limit2title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 232;BA.debugLine="mBase.AddView(limit2Title,0.16 * mBase.Width,0.49";
_mbase.AddView((android.view.View)(_limit2title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.49*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 233;BA.debugLine="line3Title.Color =  0x00ffffff";
_line3title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 234;BA.debugLine="line3Title.TextColor = 0xff000000";
_line3title.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 235;BA.debugLine="line3Title.Gravity = Gravity.Left";
_line3title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 236;BA.debugLine="line3Title.Text = \"Line 3\"";
_line3title.setText(BA.ObjectToCharSequence("Line 3"));
 //BA.debugLineNum = 237;BA.debugLine="line3Title.TextSize = 18";
_line3title.setTextSize((float) (18));
 //BA.debugLineNum = 238;BA.debugLine="line3Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_line3title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 240;BA.debugLine="mBase.AddView(line3Title,0.16 * mBase.Width,0.72";
_mbase.AddView((android.view.View)(_line3title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.72*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 241;BA.debugLine="limit3Title.Color =  0x00ffffff";
_limit3title.setColor(((int)0x00ffffff));
 //BA.debugLineNum = 242;BA.debugLine="limit3Title.TextColor = 0xff4a5759";
_limit3title.setTextColor(((int)0xff4a5759));
 //BA.debugLineNum = 243;BA.debugLine="limit3Title.Gravity = Gravity.Left";
_limit3title.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 244;BA.debugLine="limit3Title.Text = \"Set time / kWh limit\"";
_limit3title.setText(BA.ObjectToCharSequence("Set time / kWh limit"));
 //BA.debugLineNum = 245;BA.debugLine="limit3Title.TextSize = 14";
_limit3title.setTextSize((float) (14));
 //BA.debugLineNum = 246;BA.debugLine="limit3Title.Typeface = sourcesanspro.DEFAULT_BOLD";
_limit3title.setTypeface(_sourcesanspro.DEFAULT_BOLD);
 //BA.debugLineNum = 248;BA.debugLine="mBase.AddView(limit3Title,0.16 * mBase.Width,0.78";
_mbase.AddView((android.view.View)(_limit3title.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.78*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 249;BA.debugLine="btnback.Text = \"\"";
_btnback.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 250;BA.debugLine="btnback.TextColor = 0xff000000";
_btnback.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 251;BA.debugLine="btnrefresh1.TextColor = 0xff000000";
_btnrefresh1.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 252;BA.debugLine="btnrefresh1.Text = \"\"";
_btnrefresh1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 253;BA.debugLine="mBase.AddView(btnrefresh1,0.86 * mBase.Width,0.04";
_mbase.AddView((android.view.View)(_btnrefresh1.getObject()),(int) (0.86*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()),(int) (0.06*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 254;BA.debugLine="btnvoice.TextColor = 0xff000000";
_btnvoice.setTextColor(((int)0xff000000));
 //BA.debugLineNum = 255;BA.debugLine="btnvoice.Text = \"\"";
_btnvoice.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 256;BA.debugLine="mBase.AddView(btnvoice,0.80 * mBase.Width,0.88 *";
_mbase.AddView((android.view.View)(_btnvoice.getObject()),(int) (0.80*_mbase.getWidth()),(int) (0.88*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 257;BA.debugLine="QLabel3.Text = \"Time\"";
_qlabel3.setText(BA.ObjectToCharSequence("Time"));
 //BA.debugLineNum = 258;BA.debugLine="QLabel5.Text = \"kWh\"";
_qlabel5.setText(BA.ObjectToCharSequence("kWh"));
 //BA.debugLineNum = 259;BA.debugLine="QLabel8.Text = \"Time\"";
_qlabel8.setText(BA.ObjectToCharSequence("Time"));
 //BA.debugLineNum = 260;BA.debugLine="QLabel10.Text = \"kWh\"";
_qlabel10.setText(BA.ObjectToCharSequence("kWh"));
 //BA.debugLineNum = 261;BA.debugLine="QLabel12.Text = \"Time\"";
_qlabel12.setText(BA.ObjectToCharSequence("Time"));
 //BA.debugLineNum = 262;BA.debugLine="QLabel14.Text = \"kWh\"";
_qlabel14.setText(BA.ObjectToCharSequence("kWh"));
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 57;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 58;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 59;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 61;BA.debugLine="bkgimage.Initialize(\"bkgimage\")";
_bkgimage.Initialize(ba,"bkgimage");
 //BA.debugLineNum = 62;BA.debugLine="btnback.Initialize(\"btnback\")";
_btnback.Initialize(ba,"btnback");
 //BA.debugLineNum = 63;BA.debugLine="QLabel3.Initialize(\"QLabel3\")";
_qlabel3.Initialize(ba,"QLabel3");
 //BA.debugLineNum = 64;BA.debugLine="txttime1.Initialize(\"txttime1\")";
_txttime1.Initialize(ba,"txttime1");
 //BA.debugLineNum = 65;BA.debugLine="QLabel5.Initialize(\"QLabel5\")";
_qlabel5.Initialize(ba,"QLabel5");
 //BA.debugLineNum = 66;BA.debugLine="txtkw1.Initialize(\"txtkw1\")";
_txtkw1.Initialize(ba,"txtkw1");
 //BA.debugLineNum = 67;BA.debugLine="btnupdate1.Initialize(\"btnupdate1\")";
_btnupdate1.Initialize(ba,"btnupdate1");
 //BA.debugLineNum = 68;BA.debugLine="QLabel8.Initialize(\"QLabel8\")";
_qlabel8.Initialize(ba,"QLabel8");
 //BA.debugLineNum = 69;BA.debugLine="txttime2.Initialize(\"txttime2\")";
_txttime2.Initialize(ba,"txttime2");
 //BA.debugLineNum = 70;BA.debugLine="QLabel10.Initialize(\"QLabel10\")";
_qlabel10.Initialize(ba,"QLabel10");
 //BA.debugLineNum = 71;BA.debugLine="txtkw2.Initialize(\"txtkw2\")";
_txtkw2.Initialize(ba,"txtkw2");
 //BA.debugLineNum = 72;BA.debugLine="QLabel12.Initialize(\"QLabel12\")";
_qlabel12.Initialize(ba,"QLabel12");
 //BA.debugLineNum = 73;BA.debugLine="txttime3.Initialize(\"txttime3\")";
_txttime3.Initialize(ba,"txttime3");
 //BA.debugLineNum = 74;BA.debugLine="QLabel14.Initialize(\"QLabel14\")";
_qlabel14.Initialize(ba,"QLabel14");
 //BA.debugLineNum = 75;BA.debugLine="txtkw3.Initialize(\"txtkw3\")";
_txtkw3.Initialize(ba,"txtkw3");
 //BA.debugLineNum = 76;BA.debugLine="btnupdate2.Initialize(\"btnupdate2\")";
_btnupdate2.Initialize(ba,"btnupdate2");
 //BA.debugLineNum = 77;BA.debugLine="btnupdate3.Initialize(\"btnupdate3\")";
_btnupdate3.Initialize(ba,"btnupdate3");
 //BA.debugLineNum = 79;BA.debugLine="settingsTitle.Initialize(\"settingsTitle\")";
_settingstitle.Initialize(ba,"settingsTitle");
 //BA.debugLineNum = 80;BA.debugLine="line1Title.Initialize(\"line1Title\")";
_line1title.Initialize(ba,"line1Title");
 //BA.debugLineNum = 81;BA.debugLine="limit1Title.Initialize(\"limit1Title\")";
_limit1title.Initialize(ba,"limit1Title");
 //BA.debugLineNum = 82;BA.debugLine="line2Title.Initialize(\"line2Title\")";
_line2title.Initialize(ba,"line2Title");
 //BA.debugLineNum = 83;BA.debugLine="limit2Title.Initialize(\"limit2Title\")";
_limit2title.Initialize(ba,"limit2Title");
 //BA.debugLineNum = 84;BA.debugLine="line3Title.Initialize(\"line3Title\")";
_line3title.Initialize(ba,"line3Title");
 //BA.debugLineNum = 85;BA.debugLine="limit3Title.Initialize(\"limit3Title\")";
_limit3title.Initialize(ba,"limit3Title");
 //BA.debugLineNum = 87;BA.debugLine="btnrefresh1.Initialize(\"btnrefresh1\")";
_btnrefresh1.Initialize(ba,"btnrefresh1");
 //BA.debugLineNum = 88;BA.debugLine="btnvoice.Initialize(\"btnvoice\")";
_btnvoice.Initialize(ba,"btnvoice");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _qlabel10_click() throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub QLabel10_click()";
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _qlabel12_click() throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub QLabel12_click()";
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _qlabel14_click() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub QLabel14_click()";
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public String  _qlabel3_click() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub QLabel3_click()";
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public String  _qlabel5_click() throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub QLabel5_click()";
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _qlabel8_click() throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub QLabel8_click()";
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 407;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 404;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public String  _txtkw1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Private Sub txtkw1_TextChanged (Old As String, New";
 //BA.debugLineNum = 335;BA.debugLine="lastedit1=0";
_lastedit1 = (int) (0);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return "";
}
public String  _txtkw2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Private Sub txtkw2_TextChanged (Old As String, New";
 //BA.debugLineNum = 345;BA.debugLine="lastedit2=0";
_lastedit2 = (int) (0);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public String  _txtkw3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Private Sub txtkw3_TextChanged (Old As String, New";
 //BA.debugLineNum = 355;BA.debugLine="lastedit3=0";
_lastedit3 = (int) (0);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return "";
}
public String  _txttime1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Private Sub txttime1_TextChanged (Old As String, N";
 //BA.debugLineNum = 330;BA.debugLine="lastedit1=1";
_lastedit1 = (int) (1);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public String  _txttime2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Private Sub txttime2_TextChanged (Old As String, N";
 //BA.debugLineNum = 340;BA.debugLine="lastedit2=1";
_lastedit2 = (int) (1);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public String  _txttime3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Private Sub txttime3_TextChanged (Old As String, N";
 //BA.debugLineNum = 350;BA.debugLine="lastedit3=1";
_lastedit3 = (int) (1);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

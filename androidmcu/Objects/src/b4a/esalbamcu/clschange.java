package b4a.esalbamcu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clschange extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbamcu.clschange");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbamcu.clschange.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public float _prev = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbamcu.main _main = null;
public b4a.esalbamcu.starter _starter = null;
public b4a.esalbamcu.vb6 _vb6 = null;
public b4a.esalbamcu.b4xcollections _b4xcollections = null;
public b4a.esalbamcu.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim prev As Float=-1";
_prev = (float) (-1);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public float  _getchanges(float _x) throws Exception{
float _b = 0f;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub getChanges(x As Float) As Float";
 //BA.debugLineNum = 10;BA.debugLine="If prev=-1 Then prev=x";
if (_prev==-1) { 
_prev = _x;};
 //BA.debugLineNum = 11;BA.debugLine="Dim b As Float";
_b = 0f;
 //BA.debugLineNum = 12;BA.debugLine="b=x-prev";
_b = (float) (_x-_prev);
 //BA.debugLineNum = 13;BA.debugLine="prev=x";
_prev = _x;
 //BA.debugLineNum = 14;BA.debugLine="Log(b)";
__c.LogImpl("439976965",BA.NumberToString(_b),0);
 //BA.debugLineNum = 15;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

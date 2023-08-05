package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clswidget extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.clswidget");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.clswidget.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.esalbaapp.b4xdatetemplate _date = null;
public b4a.esalbaapp.b4xdialog _dialog = null;
public b4a.esalbaapp.b4xinputtemplate _inputtemplate = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Dim date As B4XDateTemplate";
_date = new b4a.esalbaapp.b4xdatetemplate();
 //BA.debugLineNum = 4;BA.debugLine="Dim dialog As B4XDialog";
_dialog = new b4a.esalbaapp.b4xdialog();
 //BA.debugLineNum = 5;BA.debugLine="Dim InputTemplate As B4XInputTemplate";
_inputtemplate = new b4a.esalbaapp.b4xinputtemplate();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public void  _dashboard(mpandroidchartwrapper.lineChartWrapper _graphx,String _sql,String _code) throws Exception{
ResumableSub_dashboard rsub = new ResumableSub_dashboard(this,_graphx,_sql,_code);
rsub.resume(ba, null);
}
public static class ResumableSub_dashboard extends BA.ResumableSub {
public ResumableSub_dashboard(b4a.esalbaapp.clswidget parent,mpandroidchartwrapper.lineChartWrapper _graphx,String _sql,String _code) {
this.parent = parent;
this._graphx = _graphx;
this._sql = _sql;
this._code = _code;
}
b4a.esalbaapp.clswidget parent;
mpandroidchartwrapper.lineChartWrapper _graphx;
String _sql;
String _code;
b4a.esalbaapp.clsparser _cls = null;
anywheresoftware.b4a.objects.collections.List _j = null;
float[] _myfloat = null;
String[] _myxvals = null;
String _strs = "";
int _a = 0;
anywheresoftware.b4a.objects.collections.List _b = null;
int _c = 0;
String _d = "";
int step13;
int limit13;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 134;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 135;BA.debugLine="Dim sql As String=sql";
_sql = _sql;
 //BA.debugLineNum = 136;BA.debugLine="cls=Starter.QuerryServer(code,Chr(13),sql)";
_cls = parent._starter._querryserver /*b4a.esalbaapp.clsparser*/ (_code,BA.ObjectToString(parent.__c.Chr((int) (13))),_sql);
 //BA.debugLineNum = 137;BA.debugLine="Do While Starter.mapparser.Get(cls)=\"NOTFINISH\"";
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
 //BA.debugLineNum = 138;BA.debugLine="Sleep(1)";
parent.__c.Sleep(ba,this,(int) (1));
this.state = 32;
return;
case 32:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 141;BA.debugLine="Log(cls.data)";
parent.__c.LogImpl("89699336",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 142;BA.debugLine="If cls.data<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 31;
if ((_cls._data /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 144;BA.debugLine="Dim j As List=Starter.wsh.ToList(cls.data)";
_j = new anywheresoftware.b4a.objects.collections.List();
_j = parent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._tolist /*anywheresoftware.b4a.objects.collections.List*/ (_cls._data /*String*/ );
 //BA.debugLineNum = 145;BA.debugLine="Dim myfloat(j.Size+1) As Float";
_myfloat = new float[(int) (_j.getSize()+1)];
;
 //BA.debugLineNum = 146;BA.debugLine="Dim myxvals(j.Size+1) As String";
_myxvals = new String[(int) (_j.getSize()+1)];
java.util.Arrays.fill(_myxvals,"");
 //BA.debugLineNum = 147;BA.debugLine="Dim strs As String";
_strs = "";
 //BA.debugLineNum = 148;BA.debugLine="For a =0  To j.Size-1";
if (true) break;

case 8:
//for
this.state = 30;
step13 = 1;
limit13 = (int) (_j.getSize()-1);
_a = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 30;
if ((step13 > 0 && _a <= limit13) || (step13 < 0 && _a >= limit13)) this.state = 10;
if (true) break;

case 34:
//C
this.state = 33;
_a = ((int)(0 + _a + step13)) ;
if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 149;BA.debugLine="Dim b As List	=j.get(a)'Log(j.Get(a))";
_b = new anywheresoftware.b4a.objects.collections.List();
_b = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j.Get(_a)));
 //BA.debugLineNum = 150;BA.debugLine="For c =0  To b.Size-1";
if (true) break;

case 11:
//for
this.state = 29;
step15 = 1;
limit15 = (int) (_b.getSize()-1);
_c = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 29;
if ((step15 > 0 && _c <= limit15) || (step15 < 0 && _c >= limit15)) this.state = 13;
if (true) break;

case 36:
//C
this.state = 35;
_c = ((int)(0 + _c + step15)) ;
if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 151;BA.debugLine="If c=0 Then";
if (true) break;

case 14:
//if
this.state = 23;
if (_c==0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 152;BA.debugLine="Try";
if (true) break;

case 17:
//try
this.state = 22;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
 //BA.debugLineNum = 153;BA.debugLine="myfloat(a)=b.get(c)'Log(j.Get(a))";
_myfloat[_a] = (float)(BA.ObjectToNumber(_b.Get(_c)));
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 //BA.debugLineNum = 155;BA.debugLine="myfloat(a)=0";
_myfloat[_a] = (float) (0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 if (true) break;
;
 //BA.debugLineNum = 158;BA.debugLine="If c=1 Then myxvals(a)=b.get(c)'Log(j.Get(a))";

case 23:
//if
this.state = 28;
if (_c==1) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
_myxvals[_a] = BA.ObjectToString(_b.Get(_c));
if (true) break;

case 28:
//C
this.state = 36;
;
 //BA.debugLineNum = 159;BA.debugLine="Dim d As String=b.get(c)'Log(j.Get(a))";
_d = BA.ObjectToString(_b.Get(_c));
 //BA.debugLineNum = 160;BA.debugLine="d=d.Replace(\",\",\" \")' supress comma";
_d = _d.replace(","," ");
 //BA.debugLineNum = 161;BA.debugLine="strs=strs&d&\",\"";
_strs = _strs+_d+",";
 if (true) break;
if (true) break;

case 29:
//C
this.state = 34;
;
 //BA.debugLineNum = 163;BA.debugLine="strs=strs.SubString2(0,strs.Length-1)";
_strs = _strs.substring((int) (0),(int) (_strs.length()-1));
 //BA.debugLineNum = 164;BA.debugLine="strs=strs&CRLF";
_strs = _strs+parent.__c.CRLF;
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
 //BA.debugLineNum = 167;BA.debugLine="initgraph(graphx,\"Legend\",\"Title\",myfloat,myxvals";
parent._initgraph(_graphx,"Legend","Title",_myfloat,_myxvals);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _datagrid(b4a.esalbaapp.table _datagrid6,String _sql,String _fields,String _id) throws Exception{
ResumableSub_Datagrid rsub = new ResumableSub_Datagrid(this,_datagrid6,_sql,_fields,_id);
rsub.resume(ba, null);
}
public static class ResumableSub_Datagrid extends BA.ResumableSub {
public ResumableSub_Datagrid(b4a.esalbaapp.clswidget parent,b4a.esalbaapp.table _datagrid6,String _sql,String _fields,String _id) {
this.parent = parent;
this._datagrid6 = _datagrid6;
this._sql = _sql;
this._fields = _fields;
this._id = _id;
}
b4a.esalbaapp.clswidget parent;
b4a.esalbaapp.table _datagrid6;
String _sql;
String _fields;
String _id;
b4a.esalbaapp.clsparser _cls = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 170;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 171;BA.debugLine="Dim sql As String=sql'$\"select LatLonStart,LatLon";
_sql = _sql;
 //BA.debugLineNum = 172;BA.debugLine="cls=Starter.QuerryServer(id,Chr(13),sql)";
_cls = parent._starter._querryserver /*b4a.esalbaapp.clsparser*/ (_id,BA.ObjectToString(parent.__c.Chr((int) (13))),_sql);
 //BA.debugLineNum = 173;BA.debugLine="Do While Starter.mapparser.Get(cls)=\"NOTFINISH\"";
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
 //BA.debugLineNum = 174;BA.debugLine="Sleep(1)";
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
 //BA.debugLineNum = 176;BA.debugLine="Log(cls.data)";
parent.__c.LogImpl("89764871",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 177;BA.debugLine="If cls.data<>\"\" Then";
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
 //BA.debugLineNum = 179;BA.debugLine="Starter.wsh.DataGrid(DataGrid6,cls.data,fields)";
parent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._datagrid /*String*/ (_datagrid6,_cls._data /*String*/ ,_fields);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datedialog(anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
ResumableSub_DateDialog rsub = new ResumableSub_DateDialog(this,_base);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DateDialog extends BA.ResumableSub {
public ResumableSub_DateDialog(b4a.esalbaapp.clswidget parent,anywheresoftware.b4a.objects.B4XViewWrapper _base) {
this.parent = parent;
this._base = _base;
}
b4a.esalbaapp.clswidget parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base;
int _result = 0;
String _a = "";
String _b = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 116;BA.debugLine="Wait For (dialog.ShowTemplate(date, \"\", \"\", \"CANC";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._date),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 117;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 118;BA.debugLine="Log( DateTime.Date(date.Date))";
parent.__c.LogImpl("89568260",parent.__c.DateTime.Date(parent._date._getdate /*long*/ ()),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 120;BA.debugLine="Dim a As String=DateTime.Date(date.Date)";
_a = parent.__c.DateTime.Date(parent._date._getdate /*long*/ ());
 //BA.debugLineNum = 121;BA.debugLine="Dim b As String=vb6.getCSV(2,\"/\",a) & \"-\" & vb6.g";
_b = parent._vb6._getcsv /*String*/ (ba,(int) (2),"/",_a)+"-"+parent._vb6._getcsv /*String*/ (ba,(int) (0),"/",_a)+"-"+parent._vb6._getcsv /*String*/ (ba,(int) (1),"/",_a)+" ";
 //BA.debugLineNum = 122;BA.debugLine="Return b";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_b));return;};
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _filedialog(anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
ResumableSub_FileDialog rsub = new ResumableSub_FileDialog(this,_base);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FileDialog extends BA.ResumableSub {
public ResumableSub_FileDialog(b4a.esalbaapp.clswidget parent,anywheresoftware.b4a.objects.B4XViewWrapper _base) {
this.parent = parent;
this._base = _base;
}
b4a.esalbaapp.clswidget parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base;
anywheresoftware.b4a.phone.Phone.ContentChooser _cc = null;
boolean _success = false;
String _dir = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
long _size = 0L;
byte[] _xx = null;
String _realname = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 91;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 92;BA.debugLine="Dim cc As ContentChooser";
_cc = new anywheresoftware.b4a.phone.Phone.ContentChooser();
 //BA.debugLineNum = 93;BA.debugLine="cc.Initialize(\"CC\")";
_cc.Initialize("CC");
 //BA.debugLineNum = 94;BA.debugLine="cc.Show(\"*/*\", \"Bitte Bild wählen:\")";
_cc.Show(ba,"*/*","Bitte Bild wählen:");
 //BA.debugLineNum = 95;BA.debugLine="Wait For CC_Result (Success As Boolean, Dir As St";
parent.__c.WaitFor("cc_result", ba, this, null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_success = (Boolean) result[0];
_dir = (String) result[1];
_filename = (String) result[2];
;
 //BA.debugLineNum = 96;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 97;BA.debugLine="If Success = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 98;BA.debugLine="m=CreateMap(\"Dir\":Dir,\"Filename\":FileName)";
_m = parent.__c.createMap(new Object[] {(Object)("Dir"),(Object)(_dir),(Object)("Filename"),(Object)(_filename)});
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 100;BA.debugLine="Dim size As Long=GetFileInfoByIndex(\"_size\", File";
_size = (long)(Double.parseDouble(parent._getfileinfobyindex("_size",_filename)));
 //BA.debugLineNum = 101;BA.debugLine="Dim xx(size) As Byte= File.ReadBytes(Dir,FileName";
_xx = parent.__c.File.ReadBytes(_dir,_filename);
 //BA.debugLineNum = 102;BA.debugLine="Dim realname As String=GetFileInfoByIndex(\"_displ";
_realname = parent._getfileinfobyindex("_display_name",_filename);
 //BA.debugLineNum = 104;BA.debugLine="File.WriteBytes	(File.DirInternal,realname,xx)";
parent.__c.File.WriteBytes(parent.__c.File.getDirInternal(),_realname,_xx);
 //BA.debugLineNum = 105;BA.debugLine="If Success = True Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_success==parent.__c.True) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 106;BA.debugLine="Return m'Dir & \",\" & FileName";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 109;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 //BA.debugLineNum = 110;BA.debugLine="Log(\"error\")";
parent.__c.LogImpl("89502740","error",0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
}
public String  _getfileinfobyindex(String _column,String _uri) throws Exception{
String _results = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _uri1 = null;
anywheresoftware.b4a.objects.ContentResolverWrapper _cr = null;
int _i = 0;
String _id = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub GetFileInfoByIndex(column As String, uri As St";
 //BA.debugLineNum = 45;BA.debugLine="Dim results As String";
_results = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Dim Uri1 As Uri";
_uri1 = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
 //BA.debugLineNum = 49;BA.debugLine="cr.Initialize(\"\")";
_cr.Initialize("");
 //BA.debugLineNum = 52;BA.debugLine="If uri.StartsWith(\"content://media/\") Then";
if (_uri.startsWith("content://media/")) { 
 //BA.debugLineNum = 53;BA.debugLine="Dim i As Int = uri.LastIndexOf(\"/\")";
_i = _uri.lastIndexOf("/");
 //BA.debugLineNum = 54;BA.debugLine="Dim id As String = uri.SubString(i + 1)";
_id = _uri.substring((int) (_i+1));
 //BA.debugLineNum = 55;BA.debugLine="Uri1.Parse(uri)";
_uri1.Parse(_uri);
 //BA.debugLineNum = 56;BA.debugLine="Cur = cr.Query(Uri1, Null, \"_id = ?\", Array As S";
_cur = _cr.Query(_uri1,(String[])(__c.Null),"_id = ?",new String[]{_id},BA.ObjectToString(__c.Null));
 //BA.debugLineNum = 57;BA.debugLine="Cur.Position = 0";
_cur.setPosition((int) (0));
 //BA.debugLineNum = 58;BA.debugLine="If Cur.RowCount <> 0 Then";
if (_cur.getRowCount()!=0) { 
 //BA.debugLineNum = 59;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 60;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
if (_cur.GetColumnName(_i)!= null) { 
 //BA.debugLineNum = 61;BA.debugLine="If Cur.GetColumnName(i) = column Then";
if ((_cur.GetColumnName(_i)).equals(_column)) { 
 //BA.debugLineNum = 62;BA.debugLine="results = Cur.GetString2(i)";
_results = _cur.GetString2(_i);
 //BA.debugLineNum = 63;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 };
 }else {
 //BA.debugLineNum = 69;BA.debugLine="Uri1.Parse(uri)";
_uri1.Parse(_uri);
 //BA.debugLineNum = 70;BA.debugLine="Cur = cr.Query(Uri1, Null, Null, Null, Null)";
_cur = _cr.Query(_uri1,(String[])(__c.Null),BA.ObjectToString(__c.Null),(String[])(__c.Null),BA.ObjectToString(__c.Null));
 //BA.debugLineNum = 71;BA.debugLine="Cur.Position = 0";
_cur.setPosition((int) (0));
 //BA.debugLineNum = 72;BA.debugLine="If Cur.RowCount <> 0 Then";
if (_cur.getRowCount()!=0) { 
 //BA.debugLineNum = 73;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 74;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
if (_cur.GetColumnName(_i)!= null) { 
 //BA.debugLineNum = 75;BA.debugLine="If Cur.GetColumnName(i) = column Then";
if ((_cur.GetColumnName(_i)).equals(_column)) { 
 //BA.debugLineNum = 76;BA.debugLine="results = Cur.GetString2(i)";
_results = _cur.GetString2(_i);
 //BA.debugLineNum = 77;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 };
 };
 //BA.debugLineNum = 84;BA.debugLine="Cur.Close";
_cur.Close();
 //BA.debugLineNum = 86;BA.debugLine="Return results";
if (true) return _results;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _initgraph(mpandroidchartwrapper.lineChartWrapper _graphx,String _legend,String _title,float[] _myfloat,String[] _myxvals) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub initgraph(graphx As LineChart,legend As String";
 //BA.debugLineNum = 199;BA.debugLine="graphx.LegendShapeSize = 7.0        'this line of";
_graphx.setLegendShapeSize((float) (7.0));
 //BA.debugLineNum = 200;BA.debugLine="graphx.setTheLegendPositionAndForm(\"BELOW_CHART_C";
_graphx.setTheLegendPositionAndForm("BELOW_CHART_CENTER","SQUARE");
 //BA.debugLineNum = 202;BA.debugLine="graphx.TheLegendColor = Colors.Magenta";
_graphx.setTheLegendColor(__c.Colors.Magenta);
 //BA.debugLineNum = 203;BA.debugLine="graphx.TheLegendTextSize = 15.0";
_graphx.setTheLegendTextSize((float) (15.0));
 //BA.debugLineNum = 204;BA.debugLine="graphx.LegendTitle = legend'\"Cosine of x (x in de";
_graphx.setLegendTitle(_legend);
 //BA.debugLineNum = 206;BA.debugLine="graphx.ChartDescription = title'\"TITLE : A Cosine";
_graphx.setChartDescription(_title);
 //BA.debugLineNum = 207;BA.debugLine="graphx.ChartDescriptionColor = Colors.Black";
_graphx.setChartDescriptionColor(__c.Colors.Black);
 //BA.debugLineNum = 208;BA.debugLine="graphx.ChartDescriptionTextSize = 15";
_graphx.setChartDescriptionTextSize((float) (15));
 //BA.debugLineNum = 210;BA.debugLine="graphx.ValueTextColor = Colors.Black";
_graphx.setValueTextColor(__c.Colors.Black);
 //BA.debugLineNum = 211;BA.debugLine="graphx.ValueTextSize = 7.0";
_graphx.setValueTextSize((int) (7.0));
 //BA.debugLineNum = 215;BA.debugLine="graphx.LegendText = myxvals";
_graphx.setLegendText(_myxvals);
 //BA.debugLineNum = 216;BA.debugLine="graphx.ChartData = myfloat";
_graphx.setChartData(_myfloat);
 //BA.debugLineNum = 217;BA.debugLine="graphx.DoubleTapToZoomEnabled = True";
_graphx.setDoubleTapToZoomEnabled(__c.True);
 //BA.debugLineNum = 218;BA.debugLine="graphx.GridBackgroundColor = Colors.white";
_graphx.setGridBackgroundColor(__c.Colors.White);
 //BA.debugLineNum = 219;BA.debugLine="graphx.DrawBorders = True";
_graphx.setDrawBorders(__c.True);
 //BA.debugLineNum = 220;BA.debugLine="graphx.DrawGridBackground = True";
_graphx.setDrawGridBackground(__c.True);
 //BA.debugLineNum = 221;BA.debugLine="graphx.PinchZoom = True";
_graphx.setPinchZoom(__c.True);
 //BA.debugLineNum = 222;BA.debugLine="graphx.ScaleEnabled = True";
_graphx.setScaleEnabled(__c.True);
 //BA.debugLineNum = 223;BA.debugLine="graphx.BorderColor = Colors.Green";
_graphx.setBorderColor(__c.Colors.Green);
 //BA.debugLineNum = 224;BA.debugLine="graphx.BorderWidth = 5.0";
_graphx.setBorderWidth((float) (5.0));
 //BA.debugLineNum = 225;BA.debugLine="graphx.DrawDashedLine = False";
_graphx.setDrawDashedLine(__c.False);
 //BA.debugLineNum = 226;BA.debugLine="graphx.DrawGraphHollowCircles = False";
_graphx.setDrawGraphHollowCircles(__c.False);
 //BA.debugLineNum = 228;BA.debugLine="graphx.DrawGraphValues = False";
_graphx.setDrawGraphValues(__c.False);
 //BA.debugLineNum = 229;BA.debugLine="graphx.GraphCircleSize = 0.0";
_graphx.setGraphCircleSize((float) (0.0));
 //BA.debugLineNum = 230;BA.debugLine="graphx.DrawAxisLine = True";
_graphx.setDrawAxisLine(__c.True);
 //BA.debugLineNum = 231;BA.debugLine="graphx.DrawXaxisGridLines = True";
_graphx.setDrawXaxisGridLines(__c.True);
 //BA.debugLineNum = 232;BA.debugLine="graphx.DrawYaxisGridLines = True";
_graphx.setDrawYaxisGridLines(__c.True);
 //BA.debugLineNum = 233;BA.debugLine="graphx.GraphLineColor = Colors.Cyan";
_graphx.setGraphLineColor(__c.Colors.Cyan);
 //BA.debugLineNum = 234;BA.debugLine="graphx.GraphLineWidth = 2.0";
_graphx.setGraphLineWidth((float) (2.0));
 //BA.debugLineNum = 237;BA.debugLine="graphx.XaxisLabelPosition = \"TOP\"";
_graphx.setXaxisLabelPosition("TOP");
 //BA.debugLineNum = 238;BA.debugLine="graphx.XaxisTextColor = Colors.Red";
_graphx.setXaxisTextColor(__c.Colors.Red);
 //BA.debugLineNum = 239;BA.debugLine="graphx.XaxisTextSize = 15.0";
_graphx.setXaxisTextSize((float) (15.0));
 //BA.debugLineNum = 241;BA.debugLine="graphx.YaxisTextColor = Colors.Yellow";
_graphx.setYaxisTextColor(__c.Colors.Yellow);
 //BA.debugLineNum = 242;BA.debugLine="graphx.YaxisTextSize = 15.0";
_graphx.setYaxisTextSize((float) (15.0));
 //BA.debugLineNum = 243;BA.debugLine="graphx.LineData = myfloat.Length   'this number m";
_graphx.setLineData(_myfloat.length);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(base As B4XView)";
 //BA.debugLineNum = 10;BA.debugLine="dialog.Initialize(base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 11;BA.debugLine="date.Initialize";
_date._initialize /*String*/ (ba);
 //BA.debugLineNum = 12;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _querry(String _sql,String _id) throws Exception{
ResumableSub_Querry rsub = new ResumableSub_Querry(this,_sql,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Querry extends BA.ResumableSub {
public ResumableSub_Querry(b4a.esalbaapp.clswidget parent,String _sql,String _id) {
this.parent = parent;
this._sql = _sql;
this._id = _id;
}
b4a.esalbaapp.clswidget parent;
String _sql;
String _id;
b4a.esalbaapp.clsparser _cls = null;
anywheresoftware.b4a.objects.collections.List _ret = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 183;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 184;BA.debugLine="Dim sql As String=sql'$\"select LatLonStart,LatLon";
_sql = _sql;
 //BA.debugLineNum = 185;BA.debugLine="Dim ret As List";
_ret = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 186;BA.debugLine="ret.Initialize";
_ret.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="cls=Starter.QuerryServer(id,Chr(13),sql)";
_cls = parent._starter._querryserver /*b4a.esalbaapp.clsparser*/ (_id,BA.ObjectToString(parent.__c.Chr((int) (13))),_sql);
 //BA.debugLineNum = 188;BA.debugLine="Do While Starter.mapparser.Get(cls)=\"NOTFINISH\"";
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
 //BA.debugLineNum = 189;BA.debugLine="Sleep(1)";
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
 //BA.debugLineNum = 191;BA.debugLine="Log(cls.data)";
parent.__c.LogImpl("89830409",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 192;BA.debugLine="If cls.data<>\"\" Then";
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
 //BA.debugLineNum = 193;BA.debugLine="ret = Starter.wsh.ToList(cls.data)";
_ret = parent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._tolist /*anywheresoftware.b4a.objects.collections.List*/ (_cls._data /*String*/ );
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 195;BA.debugLine="Return ret";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ret));return;};
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _showinfo(String _uri) throws Exception{
String _x = "";
 //BA.debugLineNum = 14;BA.debugLine="Sub ShowInfo(uri As String) As String";
 //BA.debugLineNum = 15;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 16;BA.debugLine="Try";
try { //BA.debugLineNum = 17;BA.debugLine="x = GetFileInfoByIndex(\"_display_name\", uri)";
_x = _getfileinfobyindex("_display_name",_uri);
 //BA.debugLineNum = 18;BA.debugLine="Return x";
if (true) return _x;
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 20;BA.debugLine="x = \"error\"";
_x = "error";
 };
 //BA.debugLineNum = 22;BA.debugLine="Try";
try { //BA.debugLineNum = 23;BA.debugLine="x = GetFileInfoByIndex(\"mime_type\", uri)";
_x = _getfileinfobyindex("mime_type",_uri);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); };
 //BA.debugLineNum = 27;BA.debugLine="Try";
try { //BA.debugLineNum = 28;BA.debugLine="x = GetFileInfoByIndex(\"_size\", uri)";
_x = _getfileinfobyindex("_size",_uri);
 } 
       catch (Exception e15) {
			ba.setLastException(e15); };
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 33;BA.debugLine="x = DateTime.Date(GetFileInfoByIndex(\"last_modif";
_x = __c.DateTime.Date((long)(Double.parseDouble(_getfileinfobyindex("last_modified",_uri))));
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 35;BA.debugLine="Try";
try { //BA.debugLineNum = 36;BA.debugLine="x = DateTime.Date(GetFileInfoByIndex(\"datetaken";
_x = __c.DateTime.Date((long)(Double.parseDouble(_getfileinfobyindex("datetaken",_uri))));
 } 
       catch (Exception e22) {
			ba.setLastException(e22); };
 };
 //BA.debugLineNum = 41;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _timedialog(anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
ResumableSub_TimeDialog rsub = new ResumableSub_TimeDialog(this,_base);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TimeDialog extends BA.ResumableSub {
public ResumableSub_TimeDialog(b4a.esalbaapp.clswidget parent,anywheresoftware.b4a.objects.B4XViewWrapper _base) {
this.parent = parent;
this._base = _base;
}
b4a.esalbaapp.clswidget parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 125;BA.debugLine="InputTemplate.lblTitle.Text = \"Enter time (HH:MM)";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Enter time (HH:MM)"));
 //BA.debugLineNum = 126;BA.debugLine="InputTemplate.RegexPattern = \"^([0-9]|0[0-9]|2[0-";
parent._inputtemplate._regexpattern /*String*/  = "^([0-9]|0[0-9]|2[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
 //BA.debugLineNum = 127;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 128;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 129;BA.debugLine="Log( InputTemplate.Text)";
parent.__c.LogImpl("89633797",parent._inputtemplate._text /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 131;BA.debugLine="Return InputTemplate.Text";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._inputtemplate._text /*String*/ ));return;};
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
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

package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class wtaserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.esalbaapp.wtaserver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.esalbaapp.wtaserver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mmodule = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.SocketWrapper _wsh = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _wtaserverio = null;
public boolean _connected = false;
public String _myid = "";
public String _clientid = "";
public anywheresoftware.b4a.objects.Timer _tmrwtaserver = null;
public String _dbsql = "";
public int _notconnected = 0;
public boolean _autoconnect = false;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _socketreceive = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _socketsend = null;
public String _godaddy = "";
public int _port1 = 0;
public int _port2 = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public boolean  _checkconnection() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
 //BA.debugLineNum = 182;BA.debugLine="Sub CheckConnection As Boolean";
 //BA.debugLineNum = 183;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 185;BA.debugLine="If (p.GetDataState == \"CONNECTED\") Then";
if (((_p.GetDataState()).equals("CONNECTED"))) { 
 //BA.debugLineNum = 186;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 189;BA.debugLine="If (p.GetSettings (\"wifi_on\") == 1) Then";
if (((_p.GetSettings("wifi_on")).equals(BA.NumberToString(1)))) { 
 //BA.debugLineNum = 190;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 193;BA.debugLine="If (p.GetDataState == \"DISCONNECTED\") Then";
if (((_p.GetDataState()).equals("DISCONNECTED"))) { 
 //BA.debugLineNum = 194;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 197;BA.debugLine="If (p.GetDataState == \"SUSPENDED\") Then";
if (((_p.GetDataState()).equals("SUSPENDED"))) { 
 //BA.debugLineNum = 198;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 200;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 4;BA.debugLine="Private wsh As Socket";
_wsh = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private wtaserverIO As AsyncStreams";
_wtaserverio = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 6;BA.debugLine="Dim connected As Boolean=False";
_connected = __c.False;
 //BA.debugLineNum = 7;BA.debugLine="Dim myid As String=\"456\"";
_myid = "456";
 //BA.debugLineNum = 8;BA.debugLine="Dim clientid As String=\"123\"";
_clientid = "123";
 //BA.debugLineNum = 9;BA.debugLine="Private tmrwtaserver As Timer";
_tmrwtaserver = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 11;BA.debugLine="Private dbsql As String";
_dbsql = "";
 //BA.debugLineNum = 12;BA.debugLine="Private notconnected As Int";
_notconnected = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private autoconnect As Boolean=True";
_autoconnect = __c.True;
 //BA.debugLineNum = 14;BA.debugLine="Dim socketReceive     As UDPSocket";
_socketreceive = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 15;BA.debugLine="Dim socketSend         As UDPSocket";
_socketsend = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 17;BA.debugLine="Dim godaddy As String=\"184.168.126.221\"";
_godaddy = "184.168.126.221";
 //BA.debugLineNum = 19;BA.debugLine="Dim port1 As Int=5001";
_port1 = (int) (5001);
 //BA.debugLineNum = 20;BA.debugLine="Dim port2 As Int=5007";
_port2 = (int) (5007);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _datagrid(b4a.esalbaapp.table _grid,String _strs,String _header) throws Exception{
anywheresoftware.b4a.objects.collections.List _j = null;
 //BA.debugLineNum = 207;BA.debugLine="public Sub DataGrid(grid As Table,strs As String,h";
 //BA.debugLineNum = 208;BA.debugLine="Dim j As List=ToList(strs)";
_j = new anywheresoftware.b4a.objects.collections.List();
_j = _tolist(_strs);
 //BA.debugLineNum = 209;BA.debugLine="ToGrid(grid,j,header)";
_togrid(_grid,_j,_header);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _datetimesql() throws Exception{
String _a = "";
String _b = "";
String _date = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub DateTimeSQL() As String";
 //BA.debugLineNum = 262;BA.debugLine="Dim a As String=DateTime.Date(DateTime.Now)";
_a = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 263;BA.debugLine="Dim b As String=DateTime.Time(DateTime.Now)";
_b = __c.DateTime.Time(__c.DateTime.getNow());
 //BA.debugLineNum = 264;BA.debugLine="Dim date=vb6.getCSV(2,\"/\",a) & \"-\" & vb6.getCSV(0";
_date = _vb6._getcsv /*String*/ (getActivityBA(),(int) (2),"/",_a)+"-"+_vb6._getcsv /*String*/ (getActivityBA(),(int) (0),"/",_a)+"-"+_vb6._getcsv /*String*/ (getActivityBA(),(int) (1),"/",_a)+" "+_b;
 //BA.debugLineNum = 265;BA.debugLine="Return  date";
if (true) return _date;
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public byte[]  _encode(String _s) throws Exception{
byte[] _data = null;
 //BA.debugLineNum = 33;BA.debugLine="Sub encode(s As String) As Byte()";
 //BA.debugLineNum = 34;BA.debugLine="Dim Data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 35;BA.debugLine="Data = s.GetBytes(\"UTF8\")";
_data = _s.getBytes("UTF8");
 //BA.debugLineNum = 36;BA.debugLine="Return Data";
if (true) return _data;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _pmodule,String _peventname,String _id,String _clientid_,String _dbsql_x) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(pModule As Object, pEventNam";
 //BA.debugLineNum = 25;BA.debugLine="mModule    = pModule";
_mmodule = _pmodule;
 //BA.debugLineNum = 26;BA.debugLine="mEventName = pEventName";
_meventname = _peventname;
 //BA.debugLineNum = 27;BA.debugLine="myid=id";
_myid = _id;
 //BA.debugLineNum = 28;BA.debugLine="clientid=clientid_";
_clientid = _clientid_;
 //BA.debugLineNum = 29;BA.debugLine="dbsql=dbsql_x";
_dbsql = _dbsql_x;
 //BA.debugLineNum = 30;BA.debugLine="socketReceive.Initialize(\"sockedReceive\",5020,256";
_socketreceive.Initialize(ba,"sockedReceive",(int) (5020),(int) (256));
 //BA.debugLineNum = 31;BA.debugLine="socketSend.Initialize(\"sockedSend\",5004,256)";
_socketsend.Initialize(ba,"sockedSend",(int) (5004),(int) (256));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _initwtaserver() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub InitWTAServer";
 //BA.debugLineNum = 153;BA.debugLine="Try";
try { //BA.debugLineNum = 154;BA.debugLine="If tmrwtaserver.IsInitialized=False Then";
if (_tmrwtaserver.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 155;BA.debugLine="tmrwtaserver.Initialize(\"tmrwtaserver\",5000)";
_tmrwtaserver.Initialize(ba,"tmrwtaserver",(long) (5000));
 //BA.debugLineNum = 156;BA.debugLine="tmrwtaserver.Enabled=True";
_tmrwtaserver.setEnabled(__c.True);
 };
 //BA.debugLineNum = 158;BA.debugLine="If CheckConnection  Then";
if (_checkconnection()) { 
 //BA.debugLineNum = 159;BA.debugLine="wsh.Initialize(\"wsh\")";
_wsh.Initialize("wsh");
 //BA.debugLineNum = 160;BA.debugLine="wsh.Connect(godaddy,port1,30000)";
_wsh.Connect(ba,_godaddy,_port1,(int) (30000));
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 163;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _querry(String _strs,String _key) throws Exception{
String[] _sx = null;
 //BA.debugLineNum = 211;BA.debugLine="public Sub Querry(strs As String,key As String)";
 //BA.debugLineNum = 212;BA.debugLine="strs=strs.Trim";
_strs = _strs.trim();
 //BA.debugLineNum = 213;BA.debugLine="Dim sx() As String=Regex.Split(\" \",strs)";
_sx = __c.Regex.Split(" ",_strs);
 //BA.debugLineNum = 214;BA.debugLine="If sx(0).ToLowerCase.Contains(\"insert\") Then";
if (_sx[(int) (0)].toLowerCase().contains("insert")) { 
 //BA.debugLineNum = 215;BA.debugLine="SendServer(\"WTASQLNONQUERRY^\"&strs&\";^\"&dbsql)";
_sendserver("WTASQLNONQUERRY^"+_strs+";^"+_dbsql);
 };
 //BA.debugLineNum = 217;BA.debugLine="If sx(0).ToLowerCase.Contains(\"create\") Then";
if (_sx[(int) (0)].toLowerCase().contains("create")) { 
 //BA.debugLineNum = 218;BA.debugLine="SendServer(\"WTASQLNONQUERRY^\"&strs&\";^\"&dbsql)";
_sendserver("WTASQLNONQUERRY^"+_strs+";^"+_dbsql);
 };
 //BA.debugLineNum = 220;BA.debugLine="If sx(0).ToLowerCase.Contains(\"update\") Then";
if (_sx[(int) (0)].toLowerCase().contains("update")) { 
 //BA.debugLineNum = 221;BA.debugLine="SendServer(\"WTASQLNONQUERRY^\" & strs &\";^\"&dbsql";
_sendserver("WTASQLNONQUERRY^"+_strs+";^"+_dbsql);
 };
 //BA.debugLineNum = 223;BA.debugLine="If sx(0).ToLowerCase.Contains(\"delete\") Then";
if (_sx[(int) (0)].toLowerCase().contains("delete")) { 
 //BA.debugLineNum = 224;BA.debugLine="SendServer(\"WTASQLNONQUERRY^\"& strs &\";^\"&dbsql)";
_sendserver("WTASQLNONQUERRY^"+_strs+";^"+_dbsql);
 };
 //BA.debugLineNum = 227;BA.debugLine="If sx(0).ToLowerCase.Contains(\"select\") Then";
if (_sx[(int) (0)].toLowerCase().contains("select")) { 
 //BA.debugLineNum = 228;BA.debugLine="SendServer(\"WTASQLQUERRY^\"&strs &\";^\"&dbsql&\"^\"&";
_sendserver("WTASQLQUERRY^"+_strs+";^"+_dbsql+"^"+_key);
 };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _sendactive() throws Exception{
b4a.esalbaapp.b4xbytesbuilder _packet = null;
byte[] _client = null;
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _inviaudp = null;
 //BA.debugLineNum = 39;BA.debugLine="Sub SendActive()";
 //BA.debugLineNum = 40;BA.debugLine="Dim packet As B4XBytesBuilder";
_packet = new b4a.esalbaapp.b4xbytesbuilder();
 //BA.debugLineNum = 41;BA.debugLine="packet.Initialize";
_packet._initialize /*String*/ (ba);
 //BA.debugLineNum = 43;BA.debugLine="Dim client() As Byte = Array As Byte(0xff,0xAA,0x";
_client = new byte[]{(byte) (((int)0xff)),(byte) (((int)0xaa)),(byte) (((int)0xcc)),(byte) (((int)0x3)),(byte) (((int)0x1))};
 //BA.debugLineNum = 44;BA.debugLine="packet.Append(client)";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (_client);
 //BA.debugLineNum = 46;BA.debugLine="packet.Append(encode(myid&Chr(10)))";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (_encode(_myid+BA.ObjectToString(__c.Chr((int) (10)))));
 //BA.debugLineNum = 47;BA.debugLine="Dim InviaUDP As UDPPacket";
_inviaudp = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 48;BA.debugLine="InviaUDP.Initialize(packet.ToArray,godaddy,port2)";
_inviaudp.Initialize(_packet._toarray /*byte[]*/ (),_godaddy,_port2);
 //BA.debugLineNum = 49;BA.debugLine="socketSend.Send(InviaUDP)";
_socketsend.Send(_inviaudp);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _sendclient(String _s) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SendClient(s As String)";
 //BA.debugLineNum = 129;BA.debugLine="Try";
try { //BA.debugLineNum = 130;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (_wtaserverio.IsInitialized()) { 
 //BA.debugLineNum = 131;BA.debugLine="s=\"WTARELAY^\" & clientid & \"^\" & s & Chr(13)";
_s = "WTARELAY^"+_clientid+"^"+_s+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 132;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_s.getBytes("UTF8"));
 }else {
 //BA.debugLineNum = 134;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 135;BA.debugLine="InitWTAServer";
_initwtaserver();
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 138;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _sendpacket(byte[] _data) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SendPacket(data() As Byte)";
 //BA.debugLineNum = 52;BA.debugLine="SendPacket2(clientid,data)";
_sendpacket2(_clientid,_data);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _sendpacket2(String _clientname,byte[] _data) throws Exception{
b4a.esalbaapp.b4xbytesbuilder _packet = null;
byte[] _client = null;
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _inviaudp = null;
 //BA.debugLineNum = 54;BA.debugLine="Sub SendPacket2(clientname As String,data() As Byt";
 //BA.debugLineNum = 55;BA.debugLine="Dim packet As B4XBytesBuilder";
_packet = new b4a.esalbaapp.b4xbytesbuilder();
 //BA.debugLineNum = 56;BA.debugLine="packet.Initialize";
_packet._initialize /*String*/ (ba);
 //BA.debugLineNum = 58;BA.debugLine="Dim client() As Byte = Array As Byte(0xff,0xAA,0x";
_client = new byte[]{(byte) (((int)0xff)),(byte) (((int)0xaa)),(byte) (((int)0xcc)),(byte) (((int)0x3)),(byte) (((int)0x4))};
 //BA.debugLineNum = 59;BA.debugLine="packet.Append(client)";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (_client);
 //BA.debugLineNum = 61;BA.debugLine="packet.Append(encode(clientname))";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (_encode(_clientname));
 //BA.debugLineNum = 62;BA.debugLine="packet.Append(Array As Byte(0))";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (new byte[]{(byte) (0)});
 //BA.debugLineNum = 63;BA.debugLine="packet.Append(data)";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (_data);
 //BA.debugLineNum = 64;BA.debugLine="packet.Append(Array As Byte(0))";
_packet._append /*b4a.esalbaapp.b4xbytesbuilder*/ (new byte[]{(byte) (0)});
 //BA.debugLineNum = 65;BA.debugLine="Dim InviaUDP As UDPPacket";
_inviaudp = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 66;BA.debugLine="InviaUDP.Initialize(packet.ToArray,godaddy,port2)";
_inviaudp.Initialize(_packet._toarray /*byte[]*/ (),_godaddy,_port2);
 //BA.debugLineNum = 67;BA.debugLine="socketSend.Send(InviaUDP)";
_socketsend.Send(_inviaudp);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _sendserver(String _s) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SendServer(s As String)";
 //BA.debugLineNum = 116;BA.debugLine="Try";
try { //BA.debugLineNum = 117;BA.debugLine="s=s&Chr(13)";
_s = _s+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 118;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (_wtaserverio.IsInitialized()) { 
 //BA.debugLineNum = 119;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_s.getBytes("UTF8"));
 //BA.debugLineNum = 120;BA.debugLine="Starter.wsh.SendActive()";
_starter._wsh /*b4a.esalbaapp.wtaserver*/ ._sendactive /*String*/ ();
 }else {
 //BA.debugLineNum = 122;BA.debugLine="InitWTAServer";
_initwtaserver();
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 125;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _sockedreceive_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packetfromsender) throws Exception{
String _msg = "";
byte[] _b = null;
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _inviaudp = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub sockedReceive_PacketArrived (PacketFromSender";
 //BA.debugLineNum = 71;BA.debugLine="Log(\"Received from Sender\")";
__c.LogImpl("84980737","Received from Sender",0);
 //BA.debugLineNum = 74;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 75;BA.debugLine="msg = BytesToString(PacketFromSender.Data, Packet";
_msg = __c.BytesToString(_packetfromsender.getData(),_packetfromsender.getOffset(),_packetfromsender.getLength(),"ASCII");
 //BA.debugLineNum = 76;BA.debugLine="Dim b() As Byte=  msg.GetBytes(\"ASCII\")";
_b = _msg.getBytes("ASCII");
 //BA.debugLineNum = 77;BA.debugLine="Dim InviaUDP As UDPPacket";
_inviaudp = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 78;BA.debugLine="InviaUDP.Initialize(B,\"192.168.1.249\",9101)";
_inviaudp.Initialize(_b,"192.168.1.249",(int) (9101));
 //BA.debugLineNum = 79;BA.debugLine="socketSend.Send(InviaUDP)";
_socketsend.Send(_inviaudp);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _sockedsend_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packetfromsender) throws Exception{
String _mline = "";
 //BA.debugLineNum = 82;BA.debugLine="Sub sockedSend_PacketArrived (PacketFromSender As";
 //BA.debugLineNum = 83;BA.debugLine="Log(\"Received from Receiver\")";
__c.LogImpl("85046273","Received from Receiver",0);
 //BA.debugLineNum = 85;BA.debugLine="Dim mLine As String";
_mline = "";
 //BA.debugLineNum = 86;BA.debugLine="mLine = BytesToString(PacketFromSender.Data, Pack";
_mline = __c.BytesToString(_packetfromsender.getData(),_packetfromsender.getOffset(),_packetfromsender.getLength(),"ASCII");
 //BA.debugLineNum = 87;BA.debugLine="If SubExists(mModule,mEventName & \"_\" & \"NewData\"";
if (__c.SubExists(ba,_mmodule,_meventname+"_"+"NewData")) { 
 //BA.debugLineNum = 88;BA.debugLine="CallSub2(mModule,mEventName & \"_\" & \"NewData\",mL";
__c.CallSubNew2(ba,_mmodule,_meventname+"_"+"NewData",(Object)(_mline));
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _tmrwtaserver_tick() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub tmrwtaserver_Tick";
 //BA.debugLineNum = 167;BA.debugLine="If autoconnect Then";
if (_autoconnect) { 
 //BA.debugLineNum = 168;BA.debugLine="If notconnected=3 Then";
if (_notconnected==3) { 
 //BA.debugLineNum = 169;BA.debugLine="ToastMessageShow(\"check connection\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("check connection"),__c.False);
 //BA.debugLineNum = 170;BA.debugLine="wsh.Close";
_wsh.Close();
 //BA.debugLineNum = 171;BA.debugLine="InitWTAServer";
_initwtaserver();
 }else {
 //BA.debugLineNum = 173;BA.debugLine="notconnected=notconnected+1";
_notconnected = (int) (_notconnected+1);
 //BA.debugLineNum = 174;BA.debugLine="SendServer(\"WTASQLTIME\")'prevent disconnection";
_sendserver("WTASQLTIME");
 };
 }else {
 //BA.debugLineNum = 178;BA.debugLine="SendServer(\"x\")'prevent disconnection";
_sendserver("x");
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _togrid(b4a.esalbaapp.table _grid,anywheresoftware.b4a.objects.collections.List _j,String _header) throws Exception{
String _strs = "";
int _a = 0;
anywheresoftware.b4a.objects.collections.List _b = null;
int _c = 0;
String _d = "";
String _fname = "";
 //BA.debugLineNum = 231;BA.debugLine="private Sub ToGrid(grid As Table,j As List,header";
 //BA.debugLineNum = 232;BA.debugLine="Dim strs As String=header &CRLF";
_strs = _header+__c.CRLF;
 //BA.debugLineNum = 233;BA.debugLine="For a =0  To j.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_j.getSize()-1);
_a = (int) (0) ;
for (;_a <= limit2 ;_a = _a + step2 ) {
 //BA.debugLineNum = 234;BA.debugLine="Dim b As List	=j.get(a)'Log(j.Get(a))";
_b = new anywheresoftware.b4a.objects.collections.List();
_b = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j.Get(_a)));
 //BA.debugLineNum = 235;BA.debugLine="For c =0  To b.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_b.getSize()-1);
_c = (int) (0) ;
for (;_c <= limit4 ;_c = _c + step4 ) {
 //BA.debugLineNum = 236;BA.debugLine="Dim d As String=b.get(c)'Log(j.Get(a))";
_d = BA.ObjectToString(_b.Get(_c));
 //BA.debugLineNum = 237;BA.debugLine="d=d.Replace(\",\",\" \")' supress comma";
_d = _d.replace(","," ");
 //BA.debugLineNum = 238;BA.debugLine="strs=strs&d&\",\"";
_strs = _strs+_d+",";
 }
};
 //BA.debugLineNum = 240;BA.debugLine="strs=strs.SubString2(0,strs.Length-1)";
_strs = _strs.substring((int) (0),(int) (_strs.length()-1));
 //BA.debugLineNum = 241;BA.debugLine="strs=strs&CRLF";
_strs = _strs+__c.CRLF;
 }
};
 //BA.debugLineNum = 243;BA.debugLine="Dim fname As String=\"mycsv.csv\"";
_fname = "mycsv.csv";
 //BA.debugLineNum = 244;BA.debugLine="If File.Exists(File.DirInternal,fname) Then";
if (__c.File.Exists(__c.File.getDirInternal(),_fname)) { 
 //BA.debugLineNum = 245;BA.debugLine="File.Delete(File.DirInternal,fname)";
__c.File.Delete(__c.File.getDirInternal(),_fname);
 };
 //BA.debugLineNum = 247;BA.debugLine="File.WriteString(File.DirInternal,fname,strs)";
__c.File.WriteString(__c.File.getDirInternal(),_fname,_strs);
 //BA.debugLineNum = 248;BA.debugLine="grid.LoadTableFromCSV(File.DirInternal,fname,True";
_grid._loadtablefromcsv /*String*/ (__c.File.getDirInternal(),_fname,__c.True);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _tolist(String _s) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.List _jsls = null;
 //BA.debugLineNum = 250;BA.debugLine="Sub ToList(s As String) As List";
 //BA.debugLineNum = 251;BA.debugLine="Dim JSon As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 252;BA.debugLine="s=s.Replace(\",)\",\")\")";
_s = _s.replace(",)",")");
 //BA.debugLineNum = 253;BA.debugLine="s=s.Replace(\")\",\"]\")";
_s = _s.replace(")","]");
 //BA.debugLineNum = 254;BA.debugLine="s=s.Replace(\"(\",\"[\")";
_s = _s.replace("(","[");
 //BA.debugLineNum = 255;BA.debugLine="JSon.Initialize(s)";
_json.Initialize(_s);
 //BA.debugLineNum = 256;BA.debugLine="Dim JSLs As List";
_jsls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 257;BA.debugLine="JSLs.Initialize";
_jsls.Initialize();
 //BA.debugLineNum = 258;BA.debugLine="JSLs = JSon.nextArray";
_jsls = _json.NextArray();
 //BA.debugLineNum = 259;BA.debugLine="Return JSLs";
if (true) return _jsls;
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public String  _wsh_connected(boolean _successful) throws Exception{
String _strs = "";
 //BA.debugLineNum = 91;BA.debugLine="Sub wsh_Connected(Successful As Boolean)";
 //BA.debugLineNum = 92;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 93;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 94;BA.debugLine="wtaserverIO.Initialize(wsh.InputStream,wsh.Outpu";
_wtaserverio.Initialize(ba,_wsh.getInputStream(),_wsh.getOutputStream(),"wsh");
 //BA.debugLineNum = 95;BA.debugLine="Dim strs As String=\"WTAREGISTER^\"&myid & Chr(13)";
_strs = "WTAREGISTER^"+_myid+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 96;BA.debugLine="SendActive";
_sendactive();
 //BA.debugLineNum = 97;BA.debugLine="wtaserverIO.Write(strs.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_strs.getBytes("UTF8"));
 //BA.debugLineNum = 98;BA.debugLine="connected=True";
_connected = __c.True;
 }else {
 //BA.debugLineNum = 100;BA.debugLine="wsh.Close";
_wsh.Close();
 //BA.debugLineNum = 101;BA.debugLine="ToastMessageShow(\"No net\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No net"),__c.False);
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _wsh_newdata(byte[] _buffer) throws Exception{
String _mline = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub wsh_NewData(Buffer() As Byte)";
 //BA.debugLineNum = 106;BA.debugLine="Dim mLine As String";
_mline = "";
 //BA.debugLineNum = 107;BA.debugLine="mLine = BytesToString(Buffer,0,Buffer.Length,\"UTF";
_mline = __c.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
 //BA.debugLineNum = 108;BA.debugLine="notconnected=0";
_notconnected = (int) (0);
 //BA.debugLineNum = 109;BA.debugLine="If SubExists(mModule,mEventName & \"_\" & \"NewData\"";
if (__c.SubExists(ba,_mmodule,_meventname+"_"+"NewData")) { 
 //BA.debugLineNum = 110;BA.debugLine="CallSub2(mModule,mEventName & \"_\" & \"NewData\",mL";
__c.CallSubNew2(ba,_mmodule,_meventname+"_"+"NewData",(Object)(_mline));
 };
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_error() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub wtaserver_Error()";
 //BA.debugLineNum = 147;BA.debugLine="wtaserverIO.Close";
_wtaserverio.Close();
 //BA.debugLineNum = 148;BA.debugLine="wsh.Close";
_wsh.Close();
 //BA.debugLineNum = 149;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"wtaserver_Error\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("wtaserver_Error"),__c.False);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_terminated() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub wtaserver_Terminated()";
 //BA.debugLineNum = 143;BA.debugLine="ToastMessageShow(\"Terminated raks\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Terminated raks"),__c.False);
 //BA.debugLineNum = 144;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

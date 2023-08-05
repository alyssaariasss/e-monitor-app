package b4a.esalbaapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.esalbaapp", "b4a.esalbaapp.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.esalbaapp.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor _sms_rx = null;
public static anywheresoftware.b4a.phone.Phone.PhoneSms _sms = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.objects.Timer _timer2 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public static boolean _connected_bt = false;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static int _msec_ = 0;
public static anywheresoftware.b4a.objects.collections.List _customview = null;
public static Object _bluetoothview1 = null;
public static Object _frmcontrols1 = null;
public static b4a.esalbaapp.wtaserver _wsh = null;
public static b4a.esalbaapp.clsparser _myparser = null;
public static b4a.esalbaapp.clsparser _parse1 = null;
public static b4a.esalbaapp.clsparser _volt = null;
public static b4a.esalbaapp.clsparser _amp = null;
public static b4a.esalbaapp.clsparser _powerwatt = null;
public static b4a.esalbaapp.clsparser _energy = null;
public static String _voltx = "";
public static String _ampx = "";
public static String _powerwattx = "";
public static String _energyx = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static Object _frmmain1 = null;
public static String _uuid = "";
public static String _filepath = "";
public static String _statequerry = "";
public static b4a.esalbaapp.clsparser _connected = null;
public static b4a.esalbaapp.clsparser _hist = null;
public static Object _frmcontrol1 = null;
public static Object _frmmap1 = null;
public static b4a.esalbaapp.clsparser _uno = null;
public static b4a.esalbaapp.clsparser _gpsparser = null;
public static b4a.esalbaapp.clsparser _register = null;
public static anywheresoftware.b4a.objects.collections.Map _clientsmap = null;
public static b4a.esalbaapp.clsparser _mall = null;
public static b4a.esalbaapp.clsparser _feu = null;
public static b4a.esalbaapp.clsparser _alabang = null;
public static String _led = "";
public static float _lat = 0f;
public static float _lon = 0f;
public static boolean _notifflag = false;
public static Object _frmhist1 = null;
public static anywheresoftware.b4a.objects.collections.Map _mapparser = null;
public static Object _frmsettings1 = null;
public static Object _frmlogin1 = null;
public static float _price = 0f;
public static String _enkw1 = "";
public static String _enkw2 = "";
public static String _enkw3 = "";
public static float _oldkw1 = 0f;
public static float _accumkw1 = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.main _main = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 307;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return false;
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
String _str = "";
int _aa = 0;
b4a.esalbaapp.frmcontrol _x = null;
String _z = "";
String _k = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub astream_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 236;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 237;BA.debugLine="str=BytesToString(Buffer, 0, Buffer.Length, \"UTF8";
_str = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");
 //BA.debugLineNum = 239;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 240;BA.debugLine="Dim x As frmcontrol";
_x = new b4a.esalbaapp.frmcontrol();
 //BA.debugLineNum = 241;BA.debugLine="x=frmcontrol1";
_x = (b4a.esalbaapp.frmcontrol)(_frmcontrol1);
 //BA.debugLineNum = 242;BA.debugLine="x.QLabel1.Text=UNO.data";
_x._qlabel1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_uno._data /*String*/ ));
 //BA.debugLineNum = 243;BA.debugLine="For aa = 0 To str.Length-1";
{
final int step7 = 1;
final int limit7 = (int) (_str.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit7 ;_aa = _aa + step7 ) {
 //BA.debugLineNum = 244;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 245;BA.debugLine="z=str.SubString2(aa,aa+1)";
_z = _str.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 247;BA.debugLine="If UNO.available(z)=True Then";
if (_uno._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 248;BA.debugLine="For Each k As String In clientsmap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _clientsmap.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 249;BA.debugLine="wsh.clientid=k";
_wsh._clientid /*String*/  = _k;
 //BA.debugLineNum = 250;BA.debugLine="wsh.SendClient(\"UNO\"&UNO.data&\"#\")";
_wsh._sendclient /*String*/ ("UNO"+_uno._data /*String*/ +"#");
 }
};
 };
 }
};
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public static String  _conns(int _res,anywheresoftware.b4a.objects.collections.Map _paireddevices,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub conns(res As Int, PairedDevices As Map, L As L";
 //BA.debugLineNum = 221;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 317;BA.debugLine="lat= NumberFormat(Location1.Latitude, 1, 6)";
_lat = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLatitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 318;BA.debugLine="lon= NumberFormat(Location1.Longitude, 1, 6)";
_lon = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLongitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public static String  _image(anywheresoftware.b4a.objects.ConcreteViewWrapper _qpushbutton1,String _fname) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub image(QPushButton1 As View,fname As String)";
 //BA.debugLineNum = 155;BA.debugLine="Dim bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 156;BA.debugLine="bm.Initialize(File.DirAssets,fname)";
_bm.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_fname);
 //BA.debugLineNum = 157;BA.debugLine="QPushButton1.SetBackgroundImage(bm)";
_qpushbutton1.SetBackgroundImageNew((android.graphics.Bitmap)(_bm.getObject()));
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _map(String _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mm = null;
anywheresoftware.b4a.objects.collections.JSONParser _j = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub map(m As String) As Map";
 //BA.debugLineNum = 101;BA.debugLine="Dim mm As Map";
_mm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 102;BA.debugLine="Dim j As JSONParser";
_j = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 103;BA.debugLine="j.Initialize(m)";
_j.Initialize(_m);
 //BA.debugLineNum = 104;BA.debugLine="mm=j.NextObject()";
_mm = _j.NextObject();
 //BA.debugLineNum = 105;BA.debugLine="Return mm";
if (true) return _mm;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public static String  _mnuconnect_click() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub mnuConnect_Click";
 //BA.debugLineNum = 271;BA.debugLine="If connected_BT=False Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 272;BA.debugLine="Try";
try { //BA.debugLineNum = 273;BA.debugLine="Serial1.Connect3(\"98:DA:50:01:7A:40\",1)";
_serial1.Connect3(processBA,"98:DA:50:01:7A:40",(int) (1));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5); //BA.debugLineNum = 275;BA.debugLine="ToastMessageShow(\"Bluetooth mcu is OFF\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Bluetooth mcu is OFF"),anywheresoftware.b4a.keywords.Common.False);
 };
 };
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public static String  _mnudisconnect_click() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub mnuDisconnect_Click";
 //BA.debugLineNum = 213;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 214;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 215;BA.debugLine="timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 216;BA.debugLine="Serial1.Disconnect";
_serial1.Disconnect();
 //BA.debugLineNum = 217;BA.debugLine="connected_BT=False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _msec(int _xa) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub msec(xa As Int)";
 //BA.debugLineNum = 293;BA.debugLine="msec_ = xa";
_msec_ = _xa;
 //BA.debugLineNum = 294;BA.debugLine="Do While(msec_<>0)";
while ((_msec_!=0)) {
 //BA.debugLineNum = 295;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 }
;
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public static String  _println(String _str) throws Exception{
String _x = "";
 //BA.debugLineNum = 142;BA.debugLine="public Sub Println(str As String)";
 //BA.debugLineNum = 143;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 144;BA.debugLine="str=str&Chr(13)";
_str = _str+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 145;BA.debugLine="x=str.Length";
_x = BA.NumberToString(_str.length());
 //BA.debugLineNum = 146;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 147;BA.debugLine="astream.Write(str.GetBytes(\"UTF8\"))";
_astream.Write(_str.getBytes("UTF8"));
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim sms_rx As SmsInterceptor";
_sms_rx = new anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor();
 //BA.debugLineNum = 14;BA.debugLine="Dim sms As PhoneSms";
_sms = new anywheresoftware.b4a.phone.Phone.PhoneSms();
 //BA.debugLineNum = 17;BA.debugLine="Dim timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 18;BA.debugLine="Dim timer2 As Timer";
_timer2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 19;BA.debugLine="Private astream As AsyncStreams";
_astream = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 20;BA.debugLine="Dim connected_BT As Boolean";
_connected_bt = false;
 //BA.debugLineNum = 21;BA.debugLine="Dim Serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 22;BA.debugLine="Dim msec_ As Int'in 100 ms";
_msec_ = 0;
 //BA.debugLineNum = 23;BA.debugLine="Dim customview As List";
_customview = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="Dim bluetoothview1 As Object";
_bluetoothview1 = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Dim frmcontrols1 As Object";
_frmcontrols1 = new Object();
 //BA.debugLineNum = 26;BA.debugLine="Dim wsh As WTAServer";
_wsh = new b4a.esalbaapp.wtaserver();
 //BA.debugLineNum = 27;BA.debugLine="Dim myparser As clsParser";
_myparser = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 28;BA.debugLine="Dim parse1 As clsParser";
_parse1 = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 29;BA.debugLine="Dim volt As clsParser";
_volt = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 30;BA.debugLine="Dim amp As clsParser";
_amp = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 31;BA.debugLine="Dim powerWatt As clsParser";
_powerwatt = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 32;BA.debugLine="Dim energy As clsParser";
_energy = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 33;BA.debugLine="Dim voltx As String=\"0\"";
_voltx = "0";
 //BA.debugLineNum = 34;BA.debugLine="Dim ampx As String=\"0\"";
_ampx = "0";
 //BA.debugLineNum = 35;BA.debugLine="Dim powerWattx As String=\"0\"";
_powerwattx = "0";
 //BA.debugLineNum = 36;BA.debugLine="Dim energyx As String=\"0\"";
_energyx = "0";
 //BA.debugLineNum = 37;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 40;BA.debugLine="Dim GPS1 As GPS";
_gps1 = new anywheresoftware.b4a.gps.GPS();
 //BA.debugLineNum = 41;BA.debugLine="Dim frmmain1 As Object";
_frmmain1 = new Object();
 //BA.debugLineNum = 42;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 44;BA.debugLine="Dim uuid As String";
_uuid = "";
 //BA.debugLineNum = 45;BA.debugLine="Dim FilePath As String";
_filepath = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim statequerry As String";
_statequerry = "";
 //BA.debugLineNum = 47;BA.debugLine="Dim CONNECTED As clsParser";
_connected = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 48;BA.debugLine="Dim HIST As clsParser";
_hist = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 49;BA.debugLine="Dim frmcontrol1 As Object";
_frmcontrol1 = new Object();
 //BA.debugLineNum = 50;BA.debugLine="Dim frmmap1 As Object";
_frmmap1 = new Object();
 //BA.debugLineNum = 51;BA.debugLine="Dim UNO As clsParser";
_uno = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 52;BA.debugLine="Dim gpsparser As clsParser";
_gpsparser = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 53;BA.debugLine="Dim REGISTER As clsParser";
_register = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 54;BA.debugLine="Dim clientsmap As Map";
_clientsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 55;BA.debugLine="Dim Mall As clsParser";
_mall = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 56;BA.debugLine="Dim FEU As clsParser";
_feu = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 57;BA.debugLine="Dim Alabang As clsParser";
_alabang = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 58;BA.debugLine="Dim led As String=\"000\"";
_led = "000";
 //BA.debugLineNum = 59;BA.debugLine="Dim lat As Float";
_lat = 0f;
 //BA.debugLineNum = 60;BA.debugLine="Dim lon As Float";
_lon = 0f;
 //BA.debugLineNum = 61;BA.debugLine="Dim notifflag As Boolean=False";
_notifflag = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 62;BA.debugLine="Dim frmhist1 As Object";
_frmhist1 = new Object();
 //BA.debugLineNum = 63;BA.debugLine="Dim mapparser As Map";
_mapparser = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 64;BA.debugLine="Dim frmsettings1 As Object";
_frmsettings1 = new Object();
 //BA.debugLineNum = 65;BA.debugLine="Dim frmlogin1 As Object";
_frmlogin1 = new Object();
 //BA.debugLineNum = 66;BA.debugLine="Dim price As Float=11.91";
_price = (float) (11.91);
 //BA.debugLineNum = 67;BA.debugLine="Dim enKW1 As String";
_enkw1 = "";
 //BA.debugLineNum = 68;BA.debugLine="Dim enKW2 As String";
_enkw2 = "";
 //BA.debugLineNum = 69;BA.debugLine="Dim enKW3 As String";
_enkw3 = "";
 //BA.debugLineNum = 70;BA.debugLine="Dim oldKW1 As Float=0";
_oldkw1 = (float) (0);
 //BA.debugLineNum = 71;BA.debugLine="Dim accumKW1 As Float=0";
_accumkw1 = (float) (0);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static b4a.esalbaapp.clsparser  _querryserver(String _header,String _terminator,String _sql) throws Exception{
b4a.esalbaapp.clsparser _cls = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub QuerryServer(header As String,terminator As St";
 //BA.debugLineNum = 94;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 95;BA.debugLine="cls.Initialize(header,terminator,1)";
_cls._initialize /*String*/ (processBA,_header,_terminator,(int) (1));
 //BA.debugLineNum = 96;BA.debugLine="mapparser.Put(cls,\"NOTFINISH\")";
_mapparser.Put((Object)(_cls),(Object)("NOTFINISH"));
 //BA.debugLineNum = 97;BA.debugLine="wsh.Querry(sql,header)";
_wsh._querry /*String*/ (_sql,_header);
 //BA.debugLineNum = 98;BA.debugLine="Return cls";
if (true) return _cls;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public static void  _querrytable() throws Exception{
ResumableSub_QuerryTable rsub = new ResumableSub_QuerryTable(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_QuerryTable extends BA.ResumableSub {
public ResumableSub_QuerryTable(b4a.esalbaapp.starter parent) {
this.parent = parent;
}
b4a.esalbaapp.starter parent;
b4a.esalbaapp.clsparser _cls = null;
String _sql = "";
anywheresoftware.b4a.objects.collections.List _l = null;
int _a = 0;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 121;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbaapp.clsparser();
 //BA.debugLineNum = 122;BA.debugLine="Dim sql As String=$\"SELECT * FROM sqlite_master W";
_sql = ("SELECT * FROM sqlite_master WHERE type='table';");
 //BA.debugLineNum = 123;BA.debugLine="cls=QuerryServer(\"LOGIN\",Chr(13),sql)";
_cls = _querryserver("LOGIN",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),_sql);
 //BA.debugLineNum = 124;BA.debugLine="Do While mapparser.Get(cls)=\"NOTFINISH\"";
if (true) break;

case 1:
//do while
this.state = 4;
while ((parent._mapparser.Get((Object)(_cls))).equals((Object)("NOTFINISH"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 125;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,this,(int) (1));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 127;BA.debugLine="Log(cls.data)";
anywheresoftware.b4a.keywords.Common.LogImpl("812648458",_cls._data /*String*/ ,0);
 //BA.debugLineNum = 128;BA.debugLine="If cls.data<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 18;
if ((_cls._data /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 129;BA.debugLine="Dim l As List= wsh.ToList(cls.data)";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = parent._wsh._tolist /*anywheresoftware.b4a.objects.collections.List*/ (_cls._data /*String*/ );
 //BA.debugLineNum = 130;BA.debugLine="If l.Size<>0 Then";
if (true) break;

case 8:
//if
this.state = 17;
if (_l.getSize()!=0) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 131;BA.debugLine="For a=0 To l.Size-1";
if (true) break;

case 11:
//for
this.state = 14;
step11 = 1;
limit11 = (int) (_l.getSize()-1);
_a = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if ((step11 > 0 && _a <= limit11) || (step11 < 0 && _a >= limit11)) this.state = 13;
if (true) break;

case 21:
//C
this.state = 20;
_a = ((int)(0 + _a + step11)) ;
if (true) break;

case 13:
//C
this.state = 21;
 //BA.debugLineNum = 132;BA.debugLine="Log(l.Get(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("812648463",BA.ObjectToString(_l.Get((int) (0))),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 136;BA.debugLine="ToastMessageShow(\"Invalid user/password\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Invalid user/password"),anywheresoftware.b4a.keywords.Common.False);
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
 //BA.debugLineNum = 139;BA.debugLine="mapparser.Remove(cls)'important";
parent._mapparser.Remove((Object)(_cls));
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sendwsh(String _strs) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub sendwsh(strs As String)";
 //BA.debugLineNum = 152;BA.debugLine="wsh.SendClient(strs & \",\" &uuid & \"#\")";
_wsh._sendclient /*String*/ (_strs+","+_uuid+"#");
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Serial1_Connected (Success As Boolean)";
 //BA.debugLineNum = 225;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 226;BA.debugLine="ToastMessageShow(\"Connected successfully\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connected successfully"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 227;BA.debugLine="astream.Initialize(Serial1.InputStream, Serial1.";
_astream.Initialize(processBA,_serial1.getInputStream(),_serial1.getOutputStream(),"astream");
 //BA.debugLineNum = 228;BA.debugLine="connected_BT = True";
_connected_bt = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 230;BA.debugLine="connected_BT = False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 231;BA.debugLine="ToastMessageShow(\"Check BT connection\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Check BT connection"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 77;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 78;BA.debugLine="r.Target=r.RunStaticMethod(\"java.util.UUID\", \"ran";
_r.Target = _r.RunStaticMethod("java.util.UUID","randomUUID",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 79;BA.debugLine="uuid =r.RunMethod(\"toString\")";
_uuid = BA.ObjectToString(_r.RunMethod("toString"));
 //BA.debugLineNum = 80;BA.debugLine="Serial1.Initialize(\"Serial1\")";
_serial1.Initialize("Serial1");
 //BA.debugLineNum = 83;BA.debugLine="wsh.Initialize(Me,\"wsh\",uuid,\"ESALBAMCU\",\"esalba.";
_wsh._initialize /*String*/ (processBA,starter.getObject(),"wsh",_uuid,"ESALBAMCU","esalba.sqlite3");
 //BA.debugLineNum = 84;BA.debugLine="wsh.InitWTAServer()";
_wsh._initwtaserver /*String*/ ();
 //BA.debugLineNum = 85;BA.debugLine="CONNECTED.Initialize(\"connected\",\".\",3)";
_connected._initialize /*String*/ (processBA,"connected",".",(int) (3));
 //BA.debugLineNum = 86;BA.debugLine="HIST.Initialize(\"HIST\",Chr(13),1)";
_hist._initialize /*String*/ (processBA,"HIST",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 87;BA.debugLine="UNO.Initialize(\"UNO\",\"#\",1)";
_uno._initialize /*String*/ (processBA,"UNO","#",(int) (1));
 //BA.debugLineNum = 88;BA.debugLine="REGISTER.Initialize(\"REGISTER\",\"#\",1)";
_register._initialize /*String*/ (processBA,"REGISTER","#",(int) (1));
 //BA.debugLineNum = 90;BA.debugLine="clientsmap.Initialize";
_clientsmap.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="mapparser.Initialize";
_mapparser.Initialize();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 311;BA.debugLine="ToastMessageShow(\"exit\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("exit"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public static boolean  _sms_rx_messagereceived(String _from,String _body) throws Exception{
String _strsend = "";
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 256;BA.debugLine="Sub sms_rx_MessageReceived(From As String, Body As";
 //BA.debugLineNum = 257;BA.debugLine="Dim strsend As String";
_strsend = "";
 //BA.debugLineNum = 258;BA.debugLine="If Body=\"Hello\" Then";
if ((_body).equals("Hello")) { 
 //BA.debugLineNum = 259;BA.debugLine="sms.Send(From,\"what the hell\")";
_sms.Send(_from,"what the hell");
 };
 //BA.debugLineNum = 261;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 262;BA.debugLine="For aa = 0 To Body.Length-1";
{
final int step6 = 1;
final int limit6 = (int) (_body.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit6 ;_aa = _aa + step6 ) {
 //BA.debugLineNum = 263;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 264;BA.debugLine="z=Body.SubString2(aa,aa+1)";
_z = _body.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 265;BA.debugLine="If myparser.available(z)=True Then";
if (_myparser._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 266;BA.debugLine="ToastMessageShow(myparser.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_myparser._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return false;
}
public static String  _startgps() throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub	StartGPS";
 //BA.debugLineNum = 314;BA.debugLine="GPS1.Start(0, 0) 'Listen to GPS with no filters.";
_gps1.Start(processBA,(long) (0),(float) (0));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 281;BA.debugLine="wsh.SendClient(\"REGISTER\" & uuid & \"#\")";
_wsh._sendclient /*String*/ ("REGISTER"+_uuid+"#");
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _timer2_tick() throws Exception{
String _k1 = "";
 //BA.debugLineNum = 283;BA.debugLine="Sub Timer2_Tick";
 //BA.debugLineNum = 284;BA.debugLine="If notifflag=True Then";
if (_notifflag==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 285;BA.debugLine="For Each k1 As String In clientsmap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _clientsmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k1 = BA.ObjectToString(group2.Get(index2));
 }
};
 //BA.debugLineNum = 289;BA.debugLine="notifflag=False";
_notifflag = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return "";
}
public static String  _update(anywheresoftware.b4a.objects.collections.Map _mp,String _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mm = null;
anywheresoftware.b4a.objects.collections.JSONParser _j = null;
String _s = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub update(mp As Map,m As String)";
 //BA.debugLineNum = 108;BA.debugLine="Dim mm As Map";
_mm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 109;BA.debugLine="Dim j As JSONParser";
_j = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 110;BA.debugLine="j.Initialize(m)";
_j.Initialize(_m);
 //BA.debugLineNum = 112;BA.debugLine="mm=j.NextObject()";
_mm = _j.NextObject();
 //BA.debugLineNum = 113;BA.debugLine="For Each s As String In mm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _mm.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_s = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 114;BA.debugLine="mp.Put(s,mm.Get(s))";
_mp.Put((Object)(_s),_mm.Get((Object)(_s)));
 }
};
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_newdata(String _data) throws Exception{
int _aa = 0;
String _z = "";
b4a.esalbaapp.clsparser _a = null;
b4a.esalbaapp.frmcontrol _x = null;
String _pow1 = "";
String _pow2 = "";
String _pow3 = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub wsh_NewData(data As String)";
 //BA.debugLineNum = 161;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 162;BA.debugLine="For aa = 0 To data.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (_data.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit2 ;_aa = _aa + step2 ) {
 //BA.debugLineNum = 163;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 164;BA.debugLine="z=data.SubString2(aa,aa+1)";
_z = _data.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 166;BA.debugLine="If CONNECTED.available(z) Then";
if (_connected._available /*boolean*/ (_z)) { 
 //BA.debugLineNum = 167;BA.debugLine="ToastMessageShow(uuid&\" connected\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_uuid+" connected"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 168;BA.debugLine="timer1.Initialize(\"Timer1\",5000)";
_timer1.Initialize(processBA,"Timer1",(long) (5000));
 //BA.debugLineNum = 169;BA.debugLine="timer1.Enabled=True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 170;BA.debugLine="wsh.SendClient(\"REGISTER\" & uuid & \"#\")";
_wsh._sendclient /*String*/ ("REGISTER"+_uuid+"#");
 };
 //BA.debugLineNum = 172;BA.debugLine="For Each a As clsParser In mapparser.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _mapparser.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_a = (b4a.esalbaapp.clsparser)(group11.Get(index11));
 //BA.debugLineNum = 173;BA.debugLine="If a.available(z) Then";
if (_a._available /*boolean*/ (_z)) { 
 //BA.debugLineNum = 174;BA.debugLine="mapparser.Put(a,\"FINISH\")";
_mapparser.Put((Object)(_a),(Object)("FINISH"));
 //BA.debugLineNum = 175;BA.debugLine="Log(\"FINISH\")";
anywheresoftware.b4a.keywords.Common.LogImpl("812910608","FINISH",0);
 };
 }
};
 //BA.debugLineNum = 178;BA.debugLine="If UNO.available(z)=True Then";
if (_uno._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 179;BA.debugLine="Dim x As frmcontrol";
_x = new b4a.esalbaapp.frmcontrol();
 //BA.debugLineNum = 180;BA.debugLine="x=frmcontrol1";
_x = (b4a.esalbaapp.frmcontrol)(_frmcontrol1);
 //BA.debugLineNum = 181;BA.debugLine="x.QLabel1.Text=UNO.data";
_x._qlabel1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_uno._data /*String*/ ));
 //BA.debugLineNum = 183;BA.debugLine="Dim pow1 As String=vb6.getCSV(2,\",\",UNO.data)";
_pow1 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (2),",",_uno._data /*String*/ );
 //BA.debugLineNum = 184;BA.debugLine="enKW1=vb6.getCSV(3,\",\",UNO.data)";
_enkw1 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (3),",",_uno._data /*String*/ );
 //BA.debugLineNum = 186;BA.debugLine="x.kwh1.Text=enKW1 & \" KWH\"";
_x._kwh1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_enkw1+" KWH"));
 //BA.debugLineNum = 187;BA.debugLine="x.voltage1.Text=vb6.getCSV(0,\",\",UNO.data) & \"";
_x._voltage1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (0),",",_uno._data /*String*/ )+" V"));
 //BA.debugLineNum = 188;BA.debugLine="x.current1.Text=vb6.getCSV(1,\",\",UNO.data) & \"";
_x._current1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (1),",",_uno._data /*String*/ )+" A"));
 //BA.debugLineNum = 189;BA.debugLine="x.power1.Text=pow1 & \" W\"";
_x._power1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_pow1+" W"));
 //BA.debugLineNum = 190;BA.debugLine="x.cost1.Text=NumberFormat(price*enKW1,0,2)";
_x._cost1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_price*(double)(Double.parseDouble(_enkw1)),(int) (0),(int) (2))));
 //BA.debugLineNum = 192;BA.debugLine="Dim pow2 As String=vb6.getCSV(8,\",\",UNO.data)";
_pow2 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (8),",",_uno._data /*String*/ );
 //BA.debugLineNum = 193;BA.debugLine="enKW2=vb6.getCSV(9,\",\",UNO.data)";
_enkw2 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (9),",",_uno._data /*String*/ );
 //BA.debugLineNum = 195;BA.debugLine="x.kwh2.Text=enKW2 & \" KWH\"";
_x._kwh2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_enkw2+" KWH"));
 //BA.debugLineNum = 196;BA.debugLine="x.voltage2.Text=vb6.getCSV(6,\",\",UNO.data) & \"";
_x._voltage2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (6),",",_uno._data /*String*/ )+" V"));
 //BA.debugLineNum = 197;BA.debugLine="x.current2.Text=vb6.getCSV(7,\",\",UNO.data) & \"";
_x._current2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (7),",",_uno._data /*String*/ )+" A"));
 //BA.debugLineNum = 198;BA.debugLine="x.power2.Text=pow2 & \" W\"";
_x._power2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_pow2+" W"));
 //BA.debugLineNum = 199;BA.debugLine="x.cost2.Text=NumberFormat(price*enKW2,0,2)";
_x._cost2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_price*(double)(Double.parseDouble(_enkw2)),(int) (0),(int) (2))));
 //BA.debugLineNum = 201;BA.debugLine="Dim pow3 As String=vb6.getCSV(14,\",\",UNO.data)";
_pow3 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (14),",",_uno._data /*String*/ );
 //BA.debugLineNum = 202;BA.debugLine="enKW3=vb6.getCSV(15,\",\",UNO.data)";
_enkw3 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (15),",",_uno._data /*String*/ );
 //BA.debugLineNum = 204;BA.debugLine="x.kwh3.Text=enKW3 & \" KWH\"";
_x._kwh3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_enkw3+" KWH"));
 //BA.debugLineNum = 205;BA.debugLine="x.voltage3.Text=vb6.getCSV(12,\",\",UNO.data) & \"";
_x._voltage3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (12),",",_uno._data /*String*/ )+" V"));
 //BA.debugLineNum = 206;BA.debugLine="x.current3.Text=vb6.getCSV(13,\",\",UNO.data) & \"";
_x._current3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (13),",",_uno._data /*String*/ )+" A"));
 //BA.debugLineNum = 207;BA.debugLine="x.power3.Text=pow3 & \" W\"";
_x._power3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_pow3+" W"));
 //BA.debugLineNum = 208;BA.debugLine="x.cost3.Text=NumberFormat(price*enKW3,0,2)";
_x._cost3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_price*(double)(Double.parseDouble(_enkw3)),(int) (0),(int) (2))));
 };
 }
};
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
}

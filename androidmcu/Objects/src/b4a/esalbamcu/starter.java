package b4a.esalbamcu;


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
		    processBA = new BA(this, null, null, "b4a.esalbamcu", "b4a.esalbamcu.starter");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.esalbamcu.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
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
public static b4a.esalbamcu.wtaserver _wsh = null;
public static b4a.esalbamcu.clsparser _myparser = null;
public static b4a.esalbamcu.clsparser _parse1 = null;
public static b4a.esalbamcu.clsparser _volt = null;
public static b4a.esalbamcu.clsparser _amp = null;
public static b4a.esalbamcu.clsparser _powerwatt = null;
public static b4a.esalbamcu.clsparser _energy = null;
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
public static b4a.esalbamcu.clsparser _connected = null;
public static b4a.esalbamcu.clsparser _hist = null;
public static Object _frmcontrol1 = null;
public static Object _frmmap1 = null;
public static b4a.esalbamcu.clsparser _uno = null;
public static b4a.esalbamcu.clsparser _gpsparser = null;
public static b4a.esalbamcu.clsparser _register = null;
public static anywheresoftware.b4a.objects.collections.Map _clientsmap = null;
public static b4a.esalbamcu.clsparser _mall = null;
public static b4a.esalbamcu.clsparser _feu = null;
public static b4a.esalbamcu.clsparser _alabang = null;
public static String _led = "";
public static float _lat = 0f;
public static float _lon = 0f;
public static boolean _notifflag = false;
public static b4a.esalbamcu.clsparser _ssron1 = null;
public static b4a.esalbamcu.clsparser _ssroff1 = null;
public static b4a.esalbamcu.clsparser _ssron2 = null;
public static b4a.esalbamcu.clsparser _ssroff2 = null;
public static b4a.esalbamcu.clsparser _ssron3 = null;
public static b4a.esalbamcu.clsparser _ssroff3 = null;
public static anywheresoftware.b4a.objects.collections.Map _mapparser = null;
public static String _en1 = "";
public static String _en2 = "";
public static String _en3 = "";
public static b4a.esalbamcu.clschange _energy1 = null;
public static b4a.esalbamcu.clschange _energy2 = null;
public static b4a.esalbamcu.clschange _energy3 = null;
public static boolean _trigtime = false;
public static b4a.esalbamcu.clsparser _resetenergy = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbamcu.main _main = null;
public b4a.esalbamcu.vb6 _vb6 = null;
public b4a.esalbamcu.b4xcollections _b4xcollections = null;
public b4a.esalbamcu.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 349;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return false;
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
String _str = "";
int _aa = 0;
b4a.esalbamcu.frmcontrol _x = null;
String _z = "";
String _pow1 = "";
String _pow2 = "";
String _pow3 = "";
b4a.esalbamcu.frmmain _fr = null;
float _pval1 = 0f;
float _pval2 = 0f;
float _pval3 = 0f;
anywheresoftware.b4a.objects.collections.Map _val = null;
String _k = "";
 //BA.debugLineNum = 232;BA.debugLine="Sub astream_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 233;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 234;BA.debugLine="str=BytesToString(Buffer, 0, Buffer.Length, \"UTF8";
_str = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");
 //BA.debugLineNum = 236;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 237;BA.debugLine="Dim x As frmcontrol";
_x = new b4a.esalbamcu.frmcontrol();
 //BA.debugLineNum = 238;BA.debugLine="x=frmcontrol1";
_x = (b4a.esalbamcu.frmcontrol)(_frmcontrol1);
 //BA.debugLineNum = 239;BA.debugLine="x.QLabel1.Text=UNO.data";
_x._qlabel1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_uno._data /*String*/ ));
 //BA.debugLineNum = 240;BA.debugLine="For aa = 0 To str.Length-1";
{
final int step7 = 1;
final int limit7 = (int) (_str.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit7 ;_aa = _aa + step7 ) {
 //BA.debugLineNum = 241;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 242;BA.debugLine="z=str.SubString2(aa,aa+1)";
_z = _str.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 243;BA.debugLine="Try";
try { //BA.debugLineNum = 244;BA.debugLine="If UNO.available(z)=True Then";
if (_uno._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 246;BA.debugLine="Dim pow1 As String=vb6.getCSV(2,\",\",UNO.data)";
_pow1 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (2),",",_uno._data /*String*/ );
 //BA.debugLineNum = 247;BA.debugLine="en1=vb6.getCSV(3,\",\",UNO.data)";
_en1 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (3),",",_uno._data /*String*/ );
 //BA.debugLineNum = 249;BA.debugLine="Dim pow2 As String=vb6.getCSV(8,\",\",UNO.data)";
_pow2 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (8),",",_uno._data /*String*/ );
 //BA.debugLineNum = 250;BA.debugLine="en2=vb6.getCSV(9,\",\",UNO.data)";
_en2 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (9),",",_uno._data /*String*/ );
 //BA.debugLineNum = 252;BA.debugLine="Dim pow3 As String=vb6.getCSV(14,\",\",UNO.data)";
_pow3 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (14),",",_uno._data /*String*/ );
 //BA.debugLineNum = 253;BA.debugLine="en3=vb6.getCSV(15,\",\",UNO.data)";
_en3 = mostCurrent._vb6._getcsv /*String*/ (processBA,(int) (15),",",_uno._data /*String*/ );
 //BA.debugLineNum = 256;BA.debugLine="Dim fr As frmmain=frmmain1";
_fr = (b4a.esalbamcu.frmmain)(_frmmain1);
 //BA.debugLineNum = 257;BA.debugLine="Dim pval1 As Float=energy1.getChanges(en1)";
_pval1 = _energy1._getchanges /*float*/ ((float)(Double.parseDouble(_en1)));
 //BA.debugLineNum = 258;BA.debugLine="If pval1<>0 Then";
if (_pval1!=0) { 
 //BA.debugLineNum = 259;BA.debugLine="fr.UpdateKW(pval1,1)";
_fr._updatekw /*void*/ (_pval1,BA.NumberToString(1));
 };
 //BA.debugLineNum = 261;BA.debugLine="Dim pval2 As Float=energy2.getChanges(en2)";
_pval2 = _energy2._getchanges /*float*/ ((float)(Double.parseDouble(_en2)));
 //BA.debugLineNum = 262;BA.debugLine="If pval2<>0 Then";
if (_pval2!=0) { 
 //BA.debugLineNum = 263;BA.debugLine="fr.UpdateKW(pval2,2)";
_fr._updatekw /*void*/ (_pval2,BA.NumberToString(2));
 };
 //BA.debugLineNum = 265;BA.debugLine="Dim pval3 As Float=energy3.getChanges(en3)";
_pval3 = _energy3._getchanges /*float*/ ((float)(Double.parseDouble(_en3)));
 //BA.debugLineNum = 266;BA.debugLine="If pval3<>0 Then";
if (_pval3!=0) { 
 //BA.debugLineNum = 267;BA.debugLine="fr.UpdateKW(pval3,3)";
_fr._updatekw /*void*/ (_pval3,BA.NumberToString(3));
 };
 //BA.debugLineNum = 270;BA.debugLine="Dim VAL As Map=CreateMap(\"P1\":pow1,\"P2\":pow2,\"";
_val = new anywheresoftware.b4a.objects.collections.Map();
_val = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("P1"),(Object)(_pow1),(Object)("P2"),(Object)(_pow2),(Object)("P3"),(Object)(_pow3),(Object)("E1"),(Object)(_en1),(Object)("E2"),(Object)(_en2),(Object)("E3"),(Object)(_en3),(Object)("C1"),(Object)(_pval1),(Object)("C2"),(Object)(_pval2),(Object)("C3"),(Object)(_pval3)});
 //BA.debugLineNum = 272;BA.debugLine="Log(VAL)";
anywheresoftware.b4a.keywords.Common.LogImpl("4983080",BA.ObjectToString(_val),0);
 //BA.debugLineNum = 273;BA.debugLine="For Each k As String In clientsmap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group33 = _clientsmap.Keys();
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_k = BA.ObjectToString(group33.Get(index33));
 //BA.debugLineNum = 275;BA.debugLine="wsh.clientid=k";
_wsh._clientid /*String*/  = _k;
 //BA.debugLineNum = 276;BA.debugLine="wsh.SendClient(\"UNO\"&UNO.data&\"#\")";
_wsh._sendclient /*String*/ ("UNO"+_uno._data /*String*/ +"#");
 }
};
 };
 } 
       catch (Exception e39) {
			processBA.setLastException(e39); //BA.debugLineNum = 280;BA.debugLine="ToastMessageShow(\"Parsing Issue\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Parsing Issue"),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _conns(int _res,anywheresoftware.b4a.objects.collections.Map _paireddevices,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub conns(res As Int, PairedDevices As Map, L As L";
 //BA.debugLineNum = 197;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 359;BA.debugLine="lat= NumberFormat(Location1.Latitude, 1, 6)";
_lat = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLatitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 360;BA.debugLine="lon= NumberFormat(Location1.Longitude, 1, 6)";
_lon = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLongitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return "";
}
public static String  _image(anywheresoftware.b4a.objects.ConcreteViewWrapper _qpushbutton1,String _fname) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub image(QPushButton1 As View,fname As String)";
 //BA.debugLineNum = 123;BA.debugLine="Dim bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 124;BA.debugLine="bm.Initialize(File.DirAssets,fname)";
_bm.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_fname);
 //BA.debugLineNum = 125;BA.debugLine="QPushButton1.SetBackgroundImage(bm)";
_qpushbutton1.SetBackgroundImageNew((android.graphics.Bitmap)(_bm.getObject()));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public static String  _mnuconnect_click() throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub mnuConnect_Click";
 //BA.debugLineNum = 300;BA.debugLine="If connected_BT=False Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 301;BA.debugLine="Try";
try { //BA.debugLineNum = 302;BA.debugLine="Serial1.Connect3(\"98:DA:50:01:7A:40\",1)'mcu zig";
_serial1.Connect3(processBA,"98:DA:50:01:7A:40",(int) (1));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5); //BA.debugLineNum = 304;BA.debugLine="ToastMessageShow(\"Bluetooth mcu is OFF\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Bluetooth mcu is OFF"),anywheresoftware.b4a.keywords.Common.False);
 };
 };
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _mnudisconnect_click() throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub mnuDisconnect_Click";
 //BA.debugLineNum = 189;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 190;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 191;BA.debugLine="timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 192;BA.debugLine="Serial1.Disconnect";
_serial1.Disconnect();
 //BA.debugLineNum = 193;BA.debugLine="connected_BT=False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public static String  _msec(int _xa) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub msec(xa As Int)";
 //BA.debugLineNum = 335;BA.debugLine="msec_ = xa";
_msec_ = _xa;
 //BA.debugLineNum = 336;BA.debugLine="Do While(msec_<>0)";
while ((_msec_!=0)) {
 //BA.debugLineNum = 337;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 }
;
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public static String  _println(String _str) throws Exception{
String _x = "";
 //BA.debugLineNum = 111;BA.debugLine="public Sub Println(str As String)";
 //BA.debugLineNum = 112;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 113;BA.debugLine="str=str&Chr(13)";
_str = _str+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 114;BA.debugLine="x=str.Length";
_x = BA.NumberToString(_str.length());
 //BA.debugLineNum = 115;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 116;BA.debugLine="astream.Write(str.GetBytes(\"UTF8\"))";
_astream.Write(_str.getBytes("UTF8"));
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
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
_wsh = new b4a.esalbamcu.wtaserver();
 //BA.debugLineNum = 27;BA.debugLine="Dim myparser As clsParser";
_myparser = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 28;BA.debugLine="Dim parse1 As clsParser";
_parse1 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 29;BA.debugLine="Dim volt As clsParser";
_volt = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 30;BA.debugLine="Dim amp As clsParser";
_amp = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 31;BA.debugLine="Dim powerWatt As clsParser";
_powerwatt = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 32;BA.debugLine="Dim energy As clsParser";
_energy = new b4a.esalbamcu.clsparser();
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
_connected = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 48;BA.debugLine="Dim HIST As clsParser";
_hist = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 49;BA.debugLine="Dim frmcontrol1 As Object";
_frmcontrol1 = new Object();
 //BA.debugLineNum = 50;BA.debugLine="Dim frmmap1 As Object";
_frmmap1 = new Object();
 //BA.debugLineNum = 51;BA.debugLine="Dim UNO As clsParser";
_uno = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 52;BA.debugLine="Dim gpsparser As clsParser";
_gpsparser = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 53;BA.debugLine="Dim REGISTER As clsParser";
_register = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 54;BA.debugLine="Dim clientsmap As Map";
_clientsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 55;BA.debugLine="Dim Mall As clsParser";
_mall = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 56;BA.debugLine="Dim FEU As clsParser";
_feu = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 57;BA.debugLine="Dim Alabang As clsParser";
_alabang = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 58;BA.debugLine="Dim led As String=\"000\"";
_led = "000";
 //BA.debugLineNum = 59;BA.debugLine="Dim lat As Float";
_lat = 0f;
 //BA.debugLineNum = 60;BA.debugLine="Dim lon As Float";
_lon = 0f;
 //BA.debugLineNum = 61;BA.debugLine="Dim notifflag As Boolean=False";
_notifflag = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 62;BA.debugLine="Dim SSRON1 As clsParser";
_ssron1 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 63;BA.debugLine="Dim SSROFF1 As clsParser";
_ssroff1 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 64;BA.debugLine="Dim SSRON2 As clsParser";
_ssron2 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 65;BA.debugLine="Dim SSROFF2 As clsParser";
_ssroff2 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 66;BA.debugLine="Dim SSRON3 As clsParser";
_ssron3 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 67;BA.debugLine="Dim SSROFF3 As clsParser";
_ssroff3 = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 68;BA.debugLine="Dim mapparser As Map";
_mapparser = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 70;BA.debugLine="Dim en1 As String";
_en1 = "";
 //BA.debugLineNum = 71;BA.debugLine="Dim en2 As String";
_en2 = "";
 //BA.debugLineNum = 72;BA.debugLine="Dim en3 As String";
_en3 = "";
 //BA.debugLineNum = 74;BA.debugLine="Dim energy1 As clschange";
_energy1 = new b4a.esalbamcu.clschange();
 //BA.debugLineNum = 75;BA.debugLine="Dim energy2 As clschange";
_energy2 = new b4a.esalbamcu.clschange();
 //BA.debugLineNum = 76;BA.debugLine="Dim energy3 As clschange";
_energy3 = new b4a.esalbamcu.clschange();
 //BA.debugLineNum = 77;BA.debugLine="Dim trigtime As Boolean=False";
_trigtime = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 78;BA.debugLine="Dim RESETENERGY As clsParser";
_resetenergy = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static b4a.esalbamcu.clsparser  _querryserver(String _header,String _terminator,String _sql) throws Exception{
b4a.esalbamcu.clsparser _cls = null;
 //BA.debugLineNum = 224;BA.debugLine="Sub QuerryServer(header As String,terminator As St";
 //BA.debugLineNum = 225;BA.debugLine="Dim cls As clsParser";
_cls = new b4a.esalbamcu.clsparser();
 //BA.debugLineNum = 226;BA.debugLine="cls.Initialize(header,terminator,1)";
_cls._initialize /*String*/ (processBA,_header,_terminator,(int) (1));
 //BA.debugLineNum = 227;BA.debugLine="mapparser.Put(cls,\"NOTFINISH\")";
_mapparser.Put((Object)(_cls),(Object)("NOTFINISH"));
 //BA.debugLineNum = 228;BA.debugLine="wsh.Querry(sql,header)";
_wsh._querry /*String*/ (_sql,_header);
 //BA.debugLineNum = 229;BA.debugLine="Return cls";
if (true) return _cls;
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public static String  _sendwsh(String _strs) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub sendwsh(strs As String)";
 //BA.debugLineNum = 120;BA.debugLine="wsh.SendClient(strs & \",\" &uuid & \"#\")";
_wsh._sendclient /*String*/ (_strs+","+_uuid+"#");
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub Serial1_Connected (Success As Boolean)";
 //BA.debugLineNum = 201;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 202;BA.debugLine="ToastMessageShow(\"Connected successfully\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connected successfully"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 207;BA.debugLine="astream.Initialize(Serial1.InputStream, Serial1.";
_astream.Initialize(processBA,_serial1.getInputStream(),_serial1.getOutputStream(),"astream");
 //BA.debugLineNum = 208;BA.debugLine="connected_BT = True";
_connected_bt = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 214;BA.debugLine="connected_BT = False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 215;BA.debugLine="ToastMessageShow(\"Check BT connection\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Check BT connection"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 84;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 85;BA.debugLine="r.Target=r.RunStaticMethod(\"java.util.UUID\", \"ran";
_r.Target = _r.RunStaticMethod("java.util.UUID","randomUUID",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 86;BA.debugLine="uuid =r.RunMethod(\"toString\")";
_uuid = BA.ObjectToString(_r.RunMethod("toString"));
 //BA.debugLineNum = 87;BA.debugLine="Serial1.Initialize(\"Serial1\")";
_serial1.Initialize("Serial1");
 //BA.debugLineNum = 90;BA.debugLine="wsh.Initialize(Me,\"wsh\",\"ESALBAMCU\",\"ESALBAAPP\",\"";
_wsh._initialize /*String*/ (processBA,starter.getObject(),"wsh","ESALBAMCU","ESALBAAPP","esalba.sqlite3");
 //BA.debugLineNum = 91;BA.debugLine="wsh.InitWTAServer()";
_wsh._initwtaserver /*String*/ ();
 //BA.debugLineNum = 92;BA.debugLine="CONNECTED.Initialize(\"connected\",\".\",3)";
_connected._initialize /*String*/ (processBA,"connected",".",(int) (3));
 //BA.debugLineNum = 93;BA.debugLine="HIST.Initialize(\"HIST\",Chr(13),1)";
_hist._initialize /*String*/ (processBA,"HIST",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 94;BA.debugLine="UNO.Initialize(\"UNO\",Chr(13),1)";
_uno._initialize /*String*/ (processBA,"UNO",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 95;BA.debugLine="REGISTER.Initialize(\"REGISTER\",\"#\",1)";
_register._initialize /*String*/ (processBA,"REGISTER","#",(int) (1));
 //BA.debugLineNum = 97;BA.debugLine="mapparser.Initialize";
_mapparser.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="clientsmap.Initialize";
_clientsmap.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="SSRON1.Initialize(\"SSRON1\",\"#\",1)";
_ssron1._initialize /*String*/ (processBA,"SSRON1","#",(int) (1));
 //BA.debugLineNum = 101;BA.debugLine="SSROFF1.Initialize(\"SSROFF1\",\"#\",1)";
_ssroff1._initialize /*String*/ (processBA,"SSROFF1","#",(int) (1));
 //BA.debugLineNum = 102;BA.debugLine="SSRON2.Initialize(\"SSRON2\",\"#\",1)";
_ssron2._initialize /*String*/ (processBA,"SSRON2","#",(int) (1));
 //BA.debugLineNum = 103;BA.debugLine="SSROFF2.Initialize(\"SSROFF2\",\"#\",1)";
_ssroff2._initialize /*String*/ (processBA,"SSROFF2","#",(int) (1));
 //BA.debugLineNum = 104;BA.debugLine="SSRON3.Initialize(\"SSRON3\",\"#\",1)";
_ssron3._initialize /*String*/ (processBA,"SSRON3","#",(int) (1));
 //BA.debugLineNum = 105;BA.debugLine="SSROFF3.Initialize(\"SSROFF3\",\"#\",1)";
_ssroff3._initialize /*String*/ (processBA,"SSROFF3","#",(int) (1));
 //BA.debugLineNum = 106;BA.debugLine="energy1.Initialize";
_energy1._initialize /*String*/ (processBA);
 //BA.debugLineNum = 107;BA.debugLine="energy2.Initialize";
_energy2._initialize /*String*/ (processBA);
 //BA.debugLineNum = 108;BA.debugLine="energy3.Initialize";
_energy3._initialize /*String*/ (processBA);
 //BA.debugLineNum = 109;BA.debugLine="RESETENERGY.Initialize(\"RESETENERGY\",\"#\",1)";
_resetenergy._initialize /*String*/ (processBA,"RESETENERGY","#",(int) (1));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 353;BA.debugLine="ToastMessageShow(\"exit\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("exit"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public static boolean  _sms_rx_messagereceived(String _from,String _body) throws Exception{
String _strsend = "";
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 285;BA.debugLine="Sub sms_rx_MessageReceived(From As String, Body As";
 //BA.debugLineNum = 286;BA.debugLine="Dim strsend As String";
_strsend = "";
 //BA.debugLineNum = 287;BA.debugLine="If Body=\"Hello\" Then";
if ((_body).equals("Hello")) { 
 //BA.debugLineNum = 288;BA.debugLine="sms.Send(From,\"what the hell\")";
_sms.Send(_from,"what the hell");
 };
 //BA.debugLineNum = 290;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 291;BA.debugLine="For aa = 0 To Body.Length-1";
{
final int step6 = 1;
final int limit6 = (int) (_body.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit6 ;_aa = _aa + step6 ) {
 //BA.debugLineNum = 292;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 293;BA.debugLine="z=Body.SubString2(aa,aa+1)";
_z = _body.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 294;BA.debugLine="If myparser.available(z)=True Then";
if (_myparser._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 295;BA.debugLine="ToastMessageShow(myparser.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_myparser._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return false;
}
public static String  _startgps() throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub	StartGPS";
 //BA.debugLineNum = 356;BA.debugLine="GPS1.Start(0, 0) 'Listen to GPS with no filters.";
_gps1.Start(processBA,(long) (0),(float) (0));
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
b4a.esalbamcu.frmmain _fr = null;
 //BA.debugLineNum = 309;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 310;BA.debugLine="Dim fr As frmmain=frmmain1";
_fr = (b4a.esalbamcu.frmmain)(_frmmain1);
 //BA.debugLineNum = 311;BA.debugLine="fr.QPushButton1_click";
_fr._qpushbutton1_click /*String*/ ();
 //BA.debugLineNum = 312;BA.debugLine="fr.QPushButton2_click";
_fr._qpushbutton2_click /*String*/ ();
 //BA.debugLineNum = 313;BA.debugLine="fr.QPushButton3_click";
_fr._qpushbutton3_click /*String*/ ();
 //BA.debugLineNum = 314;BA.debugLine="ToastMessageShow(\"Time timer1\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Time timer1"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _timer2_tick() throws Exception{
String _k1 = "";
 //BA.debugLineNum = 316;BA.debugLine="Sub Timer2_Tick";
 //BA.debugLineNum = 317;BA.debugLine="If notifflag=True Then";
if (_notifflag==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 318;BA.debugLine="For Each k1 As String In clientsmap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _clientsmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k1 = BA.ObjectToString(group2.Get(index2));
 }
};
 //BA.debugLineNum = 322;BA.debugLine="notifflag=False";
_notifflag = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_newdata(String _data) throws Exception{
int _aa = 0;
String _z = "";
b4a.esalbamcu.clsparser _a = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub wsh_NewData(data As String)";
 //BA.debugLineNum = 129;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 130;BA.debugLine="For aa = 0 To data.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (_data.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit2 ;_aa = _aa + step2 ) {
 //BA.debugLineNum = 131;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 132;BA.debugLine="z=data.SubString2(aa,aa+1)";
_z = _data.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 133;BA.debugLine="If CONNECTED.available(z) Then";
if (_connected._available /*boolean*/ (_z)) { 
 //BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(uuid&\" connected\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_uuid+" connected"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 142;BA.debugLine="timer1.Initialize(\"Timer1\",1000*60)";
_timer1.Initialize(processBA,"Timer1",(long) (1000*60));
 //BA.debugLineNum = 143;BA.debugLine="timer1.Enabled=True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 149;BA.debugLine="mnuConnect_Click";
_mnuconnect_click();
 };
 //BA.debugLineNum = 152;BA.debugLine="If REGISTER.available(z)=True Then";
if (_register._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 153;BA.debugLine="If clientsmap.ContainsKey(REGISTER.data)=False";
if (_clientsmap.ContainsKey((Object)(_register._data /*String*/ ))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 154;BA.debugLine="clientsmap.Put(REGISTER.data,\"CLIENT\")";
_clientsmap.Put((Object)(_register._data /*String*/ ),(Object)("CLIENT"));
 };
 };
 //BA.debugLineNum = 157;BA.debugLine="For Each a As clsParser In mapparser.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _mapparser.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_a = (b4a.esalbamcu.clsparser)(group16.Get(index16));
 //BA.debugLineNum = 158;BA.debugLine="If a.available(z) Then";
if (_a._available /*boolean*/ (_z)) { 
 //BA.debugLineNum = 159;BA.debugLine="mapparser.Put(a,\"FINISH\")";
_mapparser.Put((Object)(_a),(Object)("FINISH"));
 };
 }
};
 //BA.debugLineNum = 164;BA.debugLine="If SSRON1.available(z)=True Then";
if (_ssron1._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 165;BA.debugLine="Println(\"SSRON1#\")";
_println("SSRON1#");
 };
 //BA.debugLineNum = 167;BA.debugLine="If SSROFF1.available(z)=True Then";
if (_ssroff1._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 168;BA.debugLine="Println(\"SSROFF1#\")";
_println("SSROFF1#");
 };
 //BA.debugLineNum = 170;BA.debugLine="If SSRON2.available(z)=True Then";
if (_ssron2._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 171;BA.debugLine="Println(\"SSRON2#\")";
_println("SSRON2#");
 };
 //BA.debugLineNum = 173;BA.debugLine="If SSROFF2.available(z)=True Then";
if (_ssroff2._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 174;BA.debugLine="Println(\"SSROFF2#\")";
_println("SSROFF2#");
 };
 //BA.debugLineNum = 176;BA.debugLine="If SSRON3.available(z)=True Then";
if (_ssron3._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 177;BA.debugLine="Println(\"SSRON3#\")";
_println("SSRON3#");
 };
 //BA.debugLineNum = 179;BA.debugLine="If SSROFF3.available(z)=True Then";
if (_ssroff3._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 180;BA.debugLine="Println(\"SSROFF3#\")";
_println("SSROFF3#");
 };
 //BA.debugLineNum = 182;BA.debugLine="If RESETENERGY.available(z)=True Then";
if (_resetenergy._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 183;BA.debugLine="Println(\"RESETENERGY#\")";
_println("RESETENERGY#");
 //BA.debugLineNum = 184;BA.debugLine="Log(\"RESETENERGY\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4655417","RESETENERGY",0);
 };
 }
};
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
}

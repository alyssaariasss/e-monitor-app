package b4a.esalbaapp;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.esalbaapp", "b4a.esalbaapp.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.esalbaapp", "b4a.esalbaapp.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.esalbaapp.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.phone.Phone.VoiceRecognition _vr = null;
public b4a.esalbaapp.frmmain _frmmain1 = null;
public b4a.esalbaapp.frmcontrol _frmcontrol1 = null;
public b4a.esalbaapp.frmhist _frmhist1 = null;
public b4a.esalbaapp.frmsettings _frmsettings1 = null;
public b4a.esalbaapp.frmlogin _frmlogin1 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.esalbaapp.vb6 _vb6 = null;
public b4a.esalbaapp.starter _starter = null;
public b4a.esalbaapp.b4xcollections _b4xcollections = null;
public b4a.esalbaapp.xuiviewsutils _xuiviewsutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 32;BA.debugLine="If FirstTime=True Then";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout1\")";
mostCurrent._activity.LoadLayout("Layout1",mostCurrent.activityBA);
 //BA.debugLineNum = 34;BA.debugLine="Activity.Title=\"MyTitle\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("MyTitle"));
 //BA.debugLineNum = 35;BA.debugLine="frmlogin1.SetLayout(0,0,100%x,100%y)";
mostCurrent._frmlogin1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 36;BA.debugLine="frmlogin1.Visible=True";
mostCurrent._frmlogin1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 37;BA.debugLine="frmmain1.SetLayout(0,0,100%x,100%y)";
mostCurrent._frmmain1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 38;BA.debugLine="frmmain1.Visible=False";
mostCurrent._frmmain1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 39;BA.debugLine="VR.Initialize(\"VR\")";
_vr.Initialize("VR");
 };
 //BA.debugLineNum = 41;BA.debugLine="If VR.IsSupported Then";
if (_vr.IsSupported()) { 
 //BA.debugLineNum = 42;BA.debugLine="ToastMessageShow(\"Voice recognition is supported";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Voice recognition is supported."),anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 44;BA.debugLine="ToastMessageShow(\"Voice recognition is not suppo";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Voice recognition is not supported."),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 46;BA.debugLine="VR.Prompt = \"Say your message\"";
_vr.setPrompt("Say your message");
 //BA.debugLineNum = 47;BA.debugLine="frmcontrol1.SetLayout(0,0,100%x,100%y)";
mostCurrent._frmcontrol1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 48;BA.debugLine="frmcontrol1.Visible=False";
mostCurrent._frmcontrol1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 49;BA.debugLine="frmhist1.SetLayout(0,0,100%x,100%y)";
mostCurrent._frmhist1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 50;BA.debugLine="frmhist1.Visible=False";
mostCurrent._frmhist1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 51;BA.debugLine="frmsettings1.SetLayout(0,0,100%x,100%y)";
mostCurrent._frmsettings1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 52;BA.debugLine="frmsettings1.Visible=False";
mostCurrent._frmsettings1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 110;BA.debugLine="If UserClosed=True Then";
if (_userclosed==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 111;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 102;BA.debugLine="Starter.frmmain1=frmmain1";
mostCurrent._starter._frmmain1 /*Object*/  = (Object)(mostCurrent._frmmain1);
 //BA.debugLineNum = 103;BA.debugLine="Starter.frmcontrol1=frmcontrol1";
mostCurrent._starter._frmcontrol1 /*Object*/  = (Object)(mostCurrent._frmcontrol1);
 //BA.debugLineNum = 104;BA.debugLine="Starter.frmhist1=frmhist1";
mostCurrent._starter._frmhist1 /*Object*/  = (Object)(mostCurrent._frmhist1);
 //BA.debugLineNum = 105;BA.debugLine="Starter.frmsettings1=frmsettings1";
mostCurrent._starter._frmsettings1 /*Object*/  = (Object)(mostCurrent._frmsettings1);
 //BA.debugLineNum = 106;BA.debugLine="Starter.frmlogin1=frmlogin1";
mostCurrent._starter._frmlogin1 /*Object*/  = (Object)(mostCurrent._frmlogin1);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _done_click() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub done_click()";
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private frmmain1 As frmmain";
mostCurrent._frmmain1 = new b4a.esalbaapp.frmmain();
 //BA.debugLineNum = 22;BA.debugLine="Private frmcontrol1 As frmcontrol";
mostCurrent._frmcontrol1 = new b4a.esalbaapp.frmcontrol();
 //BA.debugLineNum = 23;BA.debugLine="Private frmhist1 As frmhist";
mostCurrent._frmhist1 = new b4a.esalbaapp.frmhist();
 //BA.debugLineNum = 24;BA.debugLine="Private frmsettings1 As frmsettings";
mostCurrent._frmsettings1 = new b4a.esalbaapp.frmsettings();
 //BA.debugLineNum = 25;BA.debugLine="Private frmlogin1 As frmlogin";
mostCurrent._frmlogin1 = new b4a.esalbaapp.frmlogin();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
vb6._process_globals();
starter._process_globals();
b4xcollections._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 18;BA.debugLine="Dim VR As VoiceRecognition";
_vr = new anywheresoftware.b4a.phone.Phone.VoiceRecognition();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _refresh_click() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub refresh_click()";
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static void  _saveline(String _line,String _state,String _kw) throws Exception{
ResumableSub_saveline rsub = new ResumableSub_saveline(null,_line,_state,_kw);
rsub.resume(processBA, null);
}
public static class ResumableSub_saveline extends BA.ResumableSub {
public ResumableSub_saveline(b4a.esalbaapp.main parent,String _line,String _state,String _kw) {
this.parent = parent;
this._line = _line;
this._state = _state;
this._kw = _kw;
}
b4a.esalbaapp.main parent;
String _line;
String _state;
String _kw;
b4a.esalbaapp.clswidget _cc = null;
String _sql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _l = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 57;BA.debugLine="Dim cc As clswidget";
_cc = new b4a.esalbaapp.clswidget();
 //BA.debugLineNum = 58;BA.debugLine="cc.Initialize(Me)";
_cc._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(main.getObject())));
 //BA.debugLineNum = 59;BA.debugLine="Dim sql As String=$\"insert into history(Line,Stat";
_sql = ("insert into history(Line,State,KW,Date) values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_line))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_state))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_kw))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._starter._wsh /*b4a.esalbaapp.wtaserver*/ ._datetimesql /*String*/ ()))+"')");
 //BA.debugLineNum = 60;BA.debugLine="Dim rs As ResumableSub = cc.Querry(sql,\"QUERRY\")";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _cc._querry /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sql,"QUERRY");
 //BA.debugLineNum = 61;BA.debugLine="Wait For(rs) Complete (l As List)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_l = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(anywheresoftware.b4a.objects.collections.List _l) throws Exception{
}
public static String  _speak() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Speak";
 //BA.debugLineNum = 28;BA.debugLine="VR.Listen";
_vr.Listen(processBA);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _sr_beginningofspeech() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub sr_BeginningOfSpeech";
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _sr_endofspeech() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub sr_EndOfSpeech";
 //BA.debugLineNum = 140;BA.debugLine="Activity.Title = \"Recognition Ended\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Recognition Ended"));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _sr_error(String _msg) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub sr_Error(Msg As String)";
 //BA.debugLineNum = 149;BA.debugLine="ToastMessageShow(Msg,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_msg),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _sr_partialresults(anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub sr_PartialResults(Texts As List)";
 //BA.debugLineNum = 128;BA.debugLine="If Texts.Size > 0 Then";
if (_texts.getSize()>0) { 
 }else {
 };
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static String  _sr_readyforspeech() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub sr_ReadyForSpeech";
 //BA.debugLineNum = 144;BA.debugLine="Activity.Title = \"Speak Now\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Speak Now"));
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _sr_results(anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
String _text = "";
String _t = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub sr_Results(Texts As List)";
 //BA.debugLineNum = 117;BA.debugLine="Dim Text As String = \"\"";
_text = "";
 //BA.debugLineNum = 118;BA.debugLine="For Each t As String In Texts";
{
final anywheresoftware.b4a.BA.IterableList group2 = _texts;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_t = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 119;BA.debugLine="Text = Text & t";
_text = _text+_t;
 //BA.debugLineNum = 120;BA.debugLine="Exit";
if (true) break;
 }
};
 //BA.debugLineNum = 122;BA.debugLine="Activity.Title=Text";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _sr_rmschanged(float _rmsvalue) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub sr_RmsChanged(RmsValue As Float)";
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public static String  _vr_result(boolean _success,anywheresoftware.b4a.objects.collections.List _texts) throws Exception{
b4a.esalbaapp.frmcontrol _f = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub VR_Result (Success As Boolean, Texts As List)";
 //BA.debugLineNum = 64;BA.debugLine="If Success = True Then";
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(Texts.Get(0), True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_texts.Get((int) (0))),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 66;BA.debugLine="If Texts.Get(0)=\"line 1 on\" Or Texts.Get(0)=\"lin";
if ((_texts.Get((int) (0))).equals((Object)("line 1 on")) || (_texts.Get((int) (0))).equals((Object)("line one on")) || (_texts.Get((int) (0))).equals((Object)("line wan on"))) { 
 //BA.debugLineNum = 67;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 68;BA.debugLine="f.on1_click";
_f._on1_click /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="saveline(1,\"ON\",Starter.enKW1)";
_saveline(BA.NumberToString(1),"ON",mostCurrent._starter._enkw1 /*String*/ );
 };
 //BA.debugLineNum = 71;BA.debugLine="If Texts.Get(0)=\"line to on\" Or Texts.Get(0)=\"li";
if ((_texts.Get((int) (0))).equals((Object)("line to on")) || (_texts.Get((int) (0))).equals((Object)("line 2 on")) || (_texts.Get((int) (0))).equals((Object)("line two on")) || (_texts.Get((int) (0))).equals((Object)("line too on"))) { 
 //BA.debugLineNum = 72;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 73;BA.debugLine="f.on2_click";
_f._on2_click /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="saveline(2,\"ON\",Starter.enKW1)";
_saveline(BA.NumberToString(2),"ON",mostCurrent._starter._enkw1 /*String*/ );
 };
 //BA.debugLineNum = 76;BA.debugLine="If Texts.Get(0)=\"line 3 on\" Or Texts.Get(0)=\"lin";
if ((_texts.Get((int) (0))).equals((Object)("line 3 on")) || (_texts.Get((int) (0))).equals((Object)("line three on")) || (_texts.Get((int) (0))).equals((Object)("line tree on"))) { 
 //BA.debugLineNum = 77;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 78;BA.debugLine="f.on3_click";
_f._on3_click /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="saveline(3,\"ON\",Starter.enKW1)";
_saveline(BA.NumberToString(3),"ON",mostCurrent._starter._enkw1 /*String*/ );
 };
 //BA.debugLineNum = 81;BA.debugLine="If Texts.Get(0)=\"line 1 off\" Or Texts.Get(0)=\"li";
if ((_texts.Get((int) (0))).equals((Object)("line 1 off")) || (_texts.Get((int) (0))).equals((Object)("line one off")) || (_texts.Get((int) (0))).equals((Object)("line wan off"))) { 
 //BA.debugLineNum = 82;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 83;BA.debugLine="f.off1_click";
_f._off1_click /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="saveline(1,\"OFF\",Starter.enKW1)";
_saveline(BA.NumberToString(1),"OFF",mostCurrent._starter._enkw1 /*String*/ );
 };
 //BA.debugLineNum = 86;BA.debugLine="If Texts.Get(0)=\"line 2 off\" Or Texts.Get(0)=\"li";
if ((_texts.Get((int) (0))).equals((Object)("line 2 off")) || (_texts.Get((int) (0))).equals((Object)("line to off")) || (_texts.Get((int) (0))).equals((Object)("line two off"))) { 
 //BA.debugLineNum = 87;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 88;BA.debugLine="f.off2_click";
_f._off2_click /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="saveline(2,\"OFF\",Starter.enKW1)";
_saveline(BA.NumberToString(2),"OFF",mostCurrent._starter._enkw1 /*String*/ );
 };
 //BA.debugLineNum = 91;BA.debugLine="If Texts.Get(0)=\"line 3 off\" Or Texts.Get(0)=\"li";
if ((_texts.Get((int) (0))).equals((Object)("line 3 off")) || (_texts.Get((int) (0))).equals((Object)("line three off")) || (_texts.Get((int) (0))).equals((Object)("line tree off"))) { 
 //BA.debugLineNum = 92;BA.debugLine="Dim f As frmcontrol=frmcontrol1";
_f = mostCurrent._frmcontrol1;
 //BA.debugLineNum = 93;BA.debugLine="f.off3_click";
_f._off3_click /*String*/ ();
 //BA.debugLineNum = 94;BA.debugLine="saveline(3,\"OFF\",Starter.enKW1)";
_saveline(BA.NumberToString(3),"OFF",mostCurrent._starter._enkw1 /*String*/ );
 };
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
}

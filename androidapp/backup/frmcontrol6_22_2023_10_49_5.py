from PyQt5 import QtCore, QtWidgets
from PyQt5.QtGui import * 
from wired_module import * 
#	Generated By WiredQT for Python: by Rocky Nuarin, 2021 Phils
class Handler(QtWidgets.QWidget,usercontrol):
	def __init__(self, *param):    
		super(Handler, self).__init__(None)
		w,h=DeskTopSize()
		initUI(self,param,w=w,h=h,title="WiredQTv5.0",controlbox=True,startpos=(0,30),timeoutdestroy=-1)
		self.GTKForms()
		self.timer=QtCore.QTimer()
		self.timer.timeout.connect(self.loop)
		self.timer.start(10)       

		self.sch=Scheduler(5000)#500 ms
		self.sch.Start()
		import pdb;pdb.set_trace()
		strs=self.GetFileStrX("frmcontrol.bas")
		s=strs.split("\r\n")
		for a in s:
			print(a)
			if a.find("\r")!=-1:
				import pdb;pdb.set_trace()
				pass
		pass
	def GetFileStrX(self,fname):
		fname=fname.replace('\\','/')
		fo = open(fname, "rb")
		str = fo.read(GetFileSize(fname))
		return str.decode()					
	def createwidget(self,prop,control,parent,event=[]):
		createWidget(self,prop,control,parent,event)         
	def GTKForms(self):
		self.createwidget("{'Name': 'mBase', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '0', 'Width': '400', 'ParentsType': '', 'Picture': 'Files/settings bg.png', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '600', 'Left': '-5', 'Tag': '', 'Text': '', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'QLabel1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '15', 'Width': '65', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '300', 'Tag': '', 'Text': 'QLabel1', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'btnback', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '15', 'Width': '35', 'ParentsType': '', 'Picture': 'Files/back button.png', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '30', 'Left': '25', 'Tag': '', 'Text': '', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on1', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '100', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '100', 'Tag': '', 'Text': 'O N', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on3', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '440', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '100', 'Tag': '', 'Text': 'O N', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on2', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '270', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '100', 'Tag': '', 'Text': 'O N', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off1', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '100', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '215', 'Tag': '', 'Text': 'O F F', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off2', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '270', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '215', 'Tag': '', 'Text': 'O F F', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off3', 'Var': '', 'Font': 'Arial Rounded MT Bold 9', 'Enable': 'True', 'Top': '440', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '215', 'Tag': '', 'Text': 'O F F', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'line1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '165', 'Width': '300', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '50', 'Tag': '', 'Text': 'Line 1', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'line2', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '335', 'Width': '300', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '50', 'Tag': '', 'Text': 'Line 2', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'line3', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '505', 'Width': '300', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '50', 'Tag': '', 'Text': 'QLabel9', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'realtimeTitle', 'Var': '', 'Font': 'Arial Rounded MT Bold 16', 'Enable': 'True', 'Top': '15', 'Width': '220', 'ParentsType': '', 'Picture': '', 'ForeColor': '[0.9921568627450981, 0.7215686274509804, 0.09411764705882353, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '30', 'Left': '105', 'Tag': '', 'Text': 'R E A L T I M E', 'Help': ''}",'QLabel','usercontrol',"[]")
	def Widget(self):
		return self    
	def loop(self):
		if self.form_load==False:
			self.form_load=True
		if self.sch.Event():#timer routine
			#code here
			if self.timeoutdestroy!=-1:
				self.timeoutdestroy-=1
				if self.timeoutdestroy==0:
					pass#self.unload(None)
			self.sch.Start()#restart scheduler      
		
	def connect(self,ev,evusr):
		self.wiredevents.update({ev:evusr})     
	def activeXcreated(self,*args):
		pass    
	def eventFilter(self, obj, event):
		return super(Handler, self).eventFilter(obj, event)
	
if __name__ == '__main__':
	import sys
	app = QtWidgets.QApplication(sys.argv)
	w = Handler()
	w.show()
	sys.exit(app.exec_())

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
		self.createwidget("{'Name': 'mBase', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '0', 'Width': '400', 'ParentsType': '', 'Picture': 'cat.png', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '600', 'Left': '0', 'Tag': '', 'Text': '', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'QLabel1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '270', 'Width': '345', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '65', 'Left': '30', 'Tag': '', 'Text': 'QLabel1', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'btnback', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '345', 'Width': '80', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '40', 'Tag': '', 'Text': '<<', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '345', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '130', 'Tag': '', 'Text': 'ON1', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on3', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '345', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '230', 'Tag': '', 'Text': 'ON3', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'on2', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '345', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '180', 'Tag': '', 'Text': 'ON2', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '390', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '130', 'Tag': '', 'Text': 'OFF1', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off2', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '390', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '180', 'Tag': '', 'Text': 'OFF2', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'off3', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '390', 'Width': '45', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '40', 'Left': '230', 'Tag': '', 'Text': 'OFF3', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'line1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '10', 'Width': '345', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '30', 'Tag': '', 'Text': 'QLabel9', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'line2', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '55', 'Width': '345', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '30', 'Tag': '', 'Text': 'QLabel9', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'line3', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '100', 'Width': '345', 'ParentsType': '', 'Picture': '', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '35', 'Left': '30', 'Tag': '', 'Text': 'QLabel9', 'Help': ''}",'QLabel','usercontrol',"[]")
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

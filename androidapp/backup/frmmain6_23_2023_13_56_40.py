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
		

	def createwidget(self,prop,control,parent,event=[]):
		createWidget(self,prop,control,parent,event)         
	def GTKForms(self):
		self.createwidget("{'Name': 'mBase', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '0', 'Width': '400', 'ParentsType': '', 'Picture': 'cat.png', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '600', 'Left': '0', 'Tag': '', 'Text': '', 'Help': ''}",'QLabel','usercontrol',"[]")
		self.createwidget("{'Name': 'QPushButton1', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '145', 'Width': '215', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '70', 'Left': '90', 'Tag': '', 'Text': 'Realtime', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'QPushButton2', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '275', 'Width': '215', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '70', 'Left': '90', 'Tag': '', 'Text': 'Settings', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'QPushButton3', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '390', 'Width': '215', 'ParentsType': '', 'Picture': '', 'ForeColor': '[1.0, 1.0, 1.0, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '70', 'Left': '90', 'Tag': '', 'Text': 'History', 'Help': ''}",'QPushButton','usercontrol',"[]")
		self.createwidget("{'Name': 'QLabel4', 'Var': '', 'Font': '', 'Enable': 'True', 'Top': '45', 'Width': '200', 'ParentsType': '', 'Picture': '', 'ForeColor': '[0.9921568627450981, 0.7215686274509804, 0.09411764705882353, 1.0]', 'Visible': 'True', 'BackColor': '(1,1,1,0.25)', 'Events': [], 'Height': '30', 'Left': '100', 'Tag': '', 'Text': 'E - S A L B A   A P P', 'Help': ''}",'QLabel','usercontrol',"[]")
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

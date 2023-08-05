B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Dim prev As Float=-1
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub
Public Sub getChanges(x As Float) As Float
	If prev=-1 Then prev=x
	Dim b As Float
	b=x-prev
	prev=x
	Log(b)
	Return b
End Sub

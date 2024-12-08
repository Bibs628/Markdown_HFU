#Semester2 #Studium #Godot #ChristophMüller #Code 
```

init();
while (true)
{
	processInput();
	traverse();
	update();
	render();
}
```

https://de.wikipedia.org/wiki/Game_Loop

Computerspiele bestehen in aller Regel aus vielen, gleichzeitig und in Echtzeit arbeitenden Subsystemen, die beispielsweise für die Ein- und Ausgabe, die [Bildsynthese](https://de.wikipedia.org/wiki/Bildsynthese "Bildsynthese"), die Animationen, die Physik-Simulation oder auch für die Netzwerkkommunikation in Mehrspielerpartien zuständig sind. All diese Subsysteme werden von einem zentralen Programmteil angesteuert, der durch seine zentrale Rolle häufig _Game Loop_ genannt wird. Dieser steuert alle Subsysteme solange und in der Frequenz an, wie die jeweiligen Systeme benötigt werden. Solange das Spiel läuft, läuft also auch die Game Loop. Vereinfacht ausgedrückt ist die Game Loop demnach eine „ewige“ [Schleife](https://de.wikipedia.org/wiki/Schleife_(Programmierung) "Schleife (Programmierung)"), die nach Initialisierung der Spieldaten gestartet wird und erst durch einen internen oder externen Eingriff wieder beendet wird.[[1]](https://de.wikipedia.org/wiki/Game_Loop#cite_note-gregory-1)


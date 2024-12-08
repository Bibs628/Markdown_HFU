#Code #ChristophMüller #Godot #Semester2 #Studium 

Ein Szenengraph ist basically nur die Struktur der einzelnen Elemente als Parent und Child, Subchild und so weiter...
Es ist mehr oder weniger die Übliche ansicht wie in Blender, FileExplorer, Godot oder weiteren. 

Ein Aufbau könnte wie folgt aus sehen:

- Baum (Hauptobjekt)
	- Stamm
	  $transformation,~Rotation,~Mesh,~usw\dots$
		- Ast
		  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
	- Krone
	  $transformation,~Rotation,~Mesh,~usw\dots$
		- Ast
		  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
		- Ast
		  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
		- Ast
		  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$
			- Blatt
			  $transformation,~Rotation,~Mesh,~usw\dots$

Jede dieser Knotenpunkten beinhalten zumindest in Blender weitere Eigenschaften wie Transformation, Mesh, Rotation und diese Werden 
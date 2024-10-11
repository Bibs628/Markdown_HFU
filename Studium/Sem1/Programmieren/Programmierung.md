#Studium #Programmieren #Prof_Dr_Dirk_Eisenbiegler

# Übersicht:

Grundlagen:
- [[Enumerations]]
- [[Exceptions]]
- [[Generics]]
- [[Objekte]]
- [[Imperatives Programmieren]]
- [[Grundlagen Programmieren]]
## Programme
- Ist für einen bestimmten Adressaten bestimmt
- Es muss für den Adressaten in verss in ein zweidimensionales Array
    	int p [][] = loadRtändlicher Sprache verfasst sein. Gegebenenfalls ist es notwendig, das Programm in die Sprache des Adressaten zu übersetzten.
- Dem Adressaten muss bekannt sein, wie die elementaren Schritte auszuführen sind
- Das Programm muss frei von [[Syntaxfehler]] sein
- Das Programm soll eindeutig sein.
- [[Natürliche Sprachen]] (Englisch, Deutsch,...) bieten Raum für Mehrdeutigkeiten und ungenaue Aussagen, dies kann bei einer Programmiersprachen nicht passieren.
- Die Ausführung von Programmen geschieht im Mikroprozessor.
- Der Mikroprozessor liest die Anwendungen in Form von binären Daten aus dem Hauptspeicher (RAM, Random Access Memory)
- Die Anweisung, die in ein Mikroprozessor bearbeiten kann, werden als [[Maschienenbefehle]] bezeichnet

### Ausführung von [[Maschienenbefehle]]

Der Mikroprozessor arbeitet in Zyklen, die als Maschinenzyklus bezeichnet werden. In jedem Maschienenzyklus arbeitet er einen Maschinenbefehl ab.

### [[höhere Programmiersprachen]] 

Durch den Einsatz von höheren Programmiersprachen und den Einsatz von mehreren Assemblern und Übersetztern kann ein Programm für verschiedene Betriebsysteme und PC-Teilen konvertiert werden.

## Arten von Programmiersprachen

- imperative Programmiersprachen (befehlsorientiert)
	- nicht Objektorientiert
	- objektorientiert
- funktionale Programmiersprachen
- prädikatenlogische Programmiersprachen

Heutzutage sind universelle Programmiersprachen der Standard, die sind so gut wie für alle Anwendungszwecke und Geräte möglich. Wir verwenden _[[Studium/Sem1/Programmieren/Java]]_


### Variabeln

[[Variabeln]] dienen der Aufbewahrung von Daten
Variablen haben einen
- Wert
- Namen
- Typ

### [[Zuweisung]]

````
int x;
x = 3;

int y;
y = 3*x+4;
````

> Dies ist ein Beispiel den man so in ein IDE (Eclipse) einfügen kann, angezeigt werden die durch den Befehl: System.out.println(x);

- Eine Zuweisung ust eine Anweisung, die den Wert einer Variablen ändert
- Die Variable, deren Wert verändert werden soll, steht links vom Gleichheitszeichen
- Durch die Ausführung der Zuweisung nimmt die Variable den Wert an, der aus dem Ausdruck rechts des Gleichheitszeichens ergibt.
- Der Wert, den man der Variable zuweist, muss der Typ sein, der in der Variablendekleration festgelegt wurde.

````
x = x + 1
x++
````

> Hier würde nach Ausführung des Programmes der Wert x um 1 erhöht. Das gleiche kann durch den Befehl *x++* geschehen.

### Initialisierung

[[Initialisierung]]

Man kann die Deklaration und die [[Initialisierung]] in [[Studium/Sem1/Programmieren/Java]] in einem Befehl zusammenfassen.

````
int x = 3
`````

Durch den Befehl $\uparrow$ kann sowohl eine [[Initialisierung]] als auch eine [[Zuweisung]] sein


## [[Einfache Datentypen]]


| Type    | Bedeutung                                   | Werte                                        | Speicherbedarf |
| ------- | ------------------------------------------- | -------------------------------------------- | -------------- |
| byte    | ganze Zahlen in Zweierkomplementdarstellung | -128,...127                                  | 8 Bit          |
| short   | ganze Zahlen in Zweierkomplementdarstellung | -32768,...32767                              | 16 Bit         |
| int     | ganze Zahlen in Zweierkomplementdarstellung | -2147483648,... 2147483647                   | 32 Bit         |
| long    | ganze Zahlen in Zweierkomplementdarstellung | -9223372036854775808,... 9223372036854775807 | 64 Bit         |
| float   | Fließkommazahlen                            | -3.40383*$10^{38}$,...3.40383*$10^{38}$      | 32 Bit         |
| double  | Fließkommazahlen                            |                                              | 64 Bit         |
| char    | Zeichen in Unicode                          | die gängingen Buchstaben und Sonderzeichen   | 32 Bit         |
| boolean | Boolescher Wert                             | true, false                                  | 1 Bit          |
> Wert ohne Vorzeichen 255 (-128+127= 255 ohne Null , also 256. --> Overflow, also nächster bit)
## Operationen für einfachen Datentypen

### [[Arithmetische Operationen]]

| +*-/  | Grundrechearten für byte, float, short, int, long, double |
| ----- | --------------------------------------------------------- |
| a ^ b | Potenz $a^b$                                              |
| a / b | Ganzzahlige Division ohne Rest                            |
| a % b | Rest der Division von $\frac{a}{b}$                       |

### [[Vergleiche]] 
zwei Zahlen werden Verglichen, Ergebnis vom Typ boolean


| < > <= >= | kleiner als, größer als, kleiner gleich, größer  gleich |
| --------- | ------------------------------------------------------- |
| ==        | Gleichheit                                              |
| !=        | Ungleichheit                    logisches Und: a und b  |
| a \|\|b   | logisches Oder: a oder b                                |
| ! a       | Negation: nicht                                         |

Beispiel:

```
int x = 16
boolean b = x < 22
boolean c = b && (x <15)
```
### Boolsche Opperatoren
![[Boolsche Operationen]]
### Strings
![[Strings]]

### Einfache Datentypen in Strings umwandeln

"Addiert" man einen String mit einem einfachen atentyo, so entsteht en Strings. Um einen einfachen Datentyp in einem String konvertierten, addiert man einfach den leeren String.

```
int x = 257;
String s = ""17"";
```

### Stings in Zahlen umwandeln
Zur Konvertierung von Strings in Zahlen gibt es parse-Funktionen:

```
Strings s1 = "117";
byte b = Byte.parseByte(s1);
short s = Short.parseShort(s1);
int i = Integer.parselnt(s1);

Code Vervollständigen S. 79 pdf
```


 ## Zugriffsrechte in Objektorientierte orientieren (Acsess Modifyer)

- public
	- Es kann von Überall Zugegriffen werden, dies ist in der Regel der Standard
- protected
	- Es kann nur von anderen klassen gelesen werden, wo diese integriert ist. 
- privat
	- Es kann nur von dieser Klasse zugegriffen werden. 

### Klassenmethoden
Mit Klassenmethoden werden mehrere Anweisungen zu einer größeren Anweisung zusammengefasst.

```
public class Test{

	public static void main(String[] args){
		~ hier steht Code ~
		liesUndQuadriere("a");
		liesUndQuadriere("b");
		}
	public static void liesUndQuadriere(String v){
		~	hier steht Code ~
	}

}
```
> Hier sind 2 Befehle abgebildet, "public static void main" und "public static void liesUndQuadriere"

Eine Klasse, die ausgeführt werden sill, muss eine main-Klassenmethode enthalten
```
public static voud main (String[] args){
...
}
```
> ![[Folien_Prog_Sem1.pdf#page=94]]

## Rückgabewert
![[Folien_Prog_Sem1.pdf#page=97]]

Methoden können Werte zurückgeben. Der Typ des Rückgabewertes wird in der Methoden-Deklaration festgelegt (statt void).

Der Wert wird mit dem Befehl ~return~ an den Aufrufer zurückgegeben.


## Mehrere Methoden in einem Code

![[Folien_Prog_Sem1.pdf#page=100]]

Die methode main öffnet hier mehrere andere Methoden nach einander, dargestellung der reinfolge in der folgenden Folie:
![[Folien_Prog_Sem1.pdf#page=101]]

Immer die Zuletzt aufgerufene Methode wird als erstes Verlassen. 

## Rekursion
Eine Methode darf sich selbst Aufrufen. 
### Beispiel:
![[Folien_Prog_Sem1.pdf#page=102]]
Hier wird der Wert x mit em Wert x multipliziert, bis der Wert y den Wert 0 hat, in diesem Beispiel wird x 3mal mit sich selbst Multipliziert und 1 mal mit sich selbst. Dargestellt in:
![[Folien_Prog_Sem1.pdf#page=103]]

#### Direkte Rekursion
Aufruf einer Methode aus der Methode selbst heraus.

#### Indirekte Rekursion
Eine Methode ruft eine andere Methode durch diese wird wiederum (direkt oder indirekt) die erste Methode aufgerufen.



## Lokale Variabeln
Als lokale Variablen einer Methode bezeichnet man
	-> die Variablen, die in einer Methode deklariert wurden und
	-> die Variablen, die einer Methode als Parameter übergeben werden.

- Lokale Variablen beziehen sich immer auf den Aufruf einer Methode: eine lokale Variablen lebt genau so lange wie der Aufruf der Methode.
- Bei rekursiven Methoden wird jede lokale Variablen eine Methode gleichzeitig mehrfach benötigt. 
- Bei dem Aufruf einer methode kann aus der Methode heraus immer nur auf die eigene (lokalen) variablen zugreifen.
- Auf die lokalen Variablen anderer Methoden und auf die lokalen variablen anderer AUfrufe der selben Methode kann nicht zugegriffen werden. 


## Lokale variablen und der Stack
- lokale Variablen werden durch den Stack organisiert. 
- Beim Aufruf einer Methode werden deren lokale variablen auf den stack gelegt.
- Nach der Beendigung des Aufrufs werden sie vom Stack genommen
- Es gilt: Last-In, First-Out
		Variablen, die zuletzt aus den Speicher gelegt werden, werden als erste wieder vom Stack genommen
- Ein stack sit ein Bereich im Hauptspeicher mit einer festen unteren Adresse und einer variablen oberen Adresse. Der benutzte Speicherbereich wächst mit jede Aufruf an und schrumpft, wenn Methoden verlassen werden. 

Darstellung so eines Stacks:
![[Folien_Prog_Sem1.pdf#page=107]]

# Aufruf von Klassenmethoden anderer Klassen

## Aufruf

![[Folien_Prog_Sem1.pdf#page=110]]

## Klasse
- Eine Klasse kann als Sammlung von Methoden betrachtet werden
- Bsp.: Die Klasse math, die in Java standardmäßig enthalten ist, einhält zahlreiche arithmetischen Methoden.
- Wenn man eine Sammlung von Methoden implementiert, wäre es sinnvoll zur Realisierung der Methoden eventuell andere Hilfsmethoden schreiben wollen. 
- public: alle Methoden, die die Klasse nach außen zur Verfügung stellen soll-
- private: alle Methoden, die innerhalb der Klasse verwendet werden, die aber nicht nach außen zur Verfügung werden soll


## Packages

Es sind eine Art Ordner, ein abgegrenzter Bereich, um Kollisionen bei Namen und anderem zu vermeiden.

### Verwendung
- Packages gruppieren die Klasse in hierarchischer Weise
- Diese Hierarchie sollte eine systematische Gliederung des Codes darstellt.
- Diese Gliederung des Codes kann in einem Softwareprojekt gleich oder ähnlich sein zur Augabenaufteilung auf die Entwickler oder Teilgruppe des Entwicklungsteams.
- Programmieren in einem Softwareprojekt mehrere Entwickler an Klassen im gleichen Package, so müssen sich die Entwickler bzgl. der Namensgebung bei den Klassen abstimmen.
- Beschränkt sih hingegen jeder Programmierer auf seine eigenen Packages, so ist diese Abstimmung nicht notwendig.

## import
Programmcode, in dem viele Klassen mit langem Package-Namen verwendet werden, wirkt unübersichtlich.
Zur Abhilfe gibt es import-Anweisungen und entsprechende Konventionen:

- Import-Anweisungen können im Programmcode unterhalb der package-Deklaration und noch vor der Klassendeklaration stehen.
- Import-Anweisungen beschreiben Packagenamen und Klassennamen von Klassen andrer Packages.
- Die in import-Anweisungen aufgezählten Klassen, dürfen ohne Angabe des Package-Namen im Programmcode verwendet werden.#

## CLASSPATH
Dies ist mehr oder weniger ein Register, in dem auf verschiedene Verzeichnisse zugegriffen werden können.


## Libraries
- Anstelle eines Verzeichnis-Pfads kann auch eine Datei mit der Endung .jar oder eine .zip angegeben werden. 
- Dateien mit der Endung .jar und .zip bezeichnet man als Libraries.
- Libraries sind komprimierte Verzeichnisstrukturen ("gezippt"), in denen sich Pacages (Verzeichnisse) mit Klassen (.class-Datein) befinden.

# Objekte
## Objekte = Instanzen von Klassen
Bisher wurden Klassen als Sammelbehälter für Klassenmethoden und Klassenattribute verwendet.

- Jetzt werden durch Klassen neue Datentypen deklariert.
	- z.B. Die lokalen Variable k hat den Typ koordinate.
- Die Inhalte von skalaren Variablen werden als Wert bezeichnet. Die Menge der zulässigen Werte ist durch den Datentyp vorgegeben.
- Klassen stehen für einen Datentyp dessen Elemente als Objekte oder als Instanzen der Klasse bezeichnet werden.

| skalare Datentypen | Klasse                         |
| ------------------ | ------------------------------ |
| Werte              | Objekte (Instanzen der Klasse) |

## Objekte und Objektattribute
Die in deiser Klasse deklarierten Variablen bezeichet man als Objektattribute. Ein Objekt ist eine Datenstruktur, die sich aus mehreren Variablen, seinen Objektattributen, zusammensetzt.


#Studium #Programmieren #Prof_Dr_Dirk_Eisenbiegler #Java


# Operatoren
| Operator:                  | Beschreibung:                        |
| -------------------------- | ------------------------------------ |
| *Arithmetische Operatoren* |                                      |
| +                          | Addition                             |
| -                          | Subtraktion                          |
| *                          | Multiplikation                       |
| /                          | Division                             |
| %                          | Modulo, Rest einer Ganzzahl-Division |
| -                          | Negatives Vorzeichen                 |
| - -                        | Dekrement                            |
| ++                         | Inkrement                            |
| *Vergleichsoperatoren*     |                                      |
| ==                         | gleich                               |
| !=                         | ungleich                             |
| >                          | größer                               |
| <                          | kleiner                              |
| >=                         | größer gleich                        |
| <=                         | kleiner gleich                       |
| *Boolsche Operatoren*      |                                      |
| &&                         | Und                                  |
| \|                         | Oder                                 |
| !                          | Negation (!true == false)            |

# Schlüsselwörter

| Schlüsselwörter            | Beschreibung                                                                                                                                                                                                                                                                                        |
| -------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| new                        | instanziiert neue Objekte                                                                                                                                                                                                                                                                           |
| return                     | gibt Werte aus einer Methode zurück                                                                                                                                                                                                                                                                 |
| class                      | definiert eine Klasse                                                                                                                                                                                                                                                                               |
| void                       | Rückgabetyp einer Methode, die nichts zurückgibt                                                                                                                                                                                                                                                    |
| static                     | Statische Methoden können auf der Klasse aufgerufen werden. Es muss dafür kein Objekt der Klasse existieren. Statische Attribute werden über alle Objekte hinweg geteilt. Der Zustand ist also nicht an ein konkretes Objekt gebunden, sondern eine statische Eigenschaft über alle Objekte hinweg. |
| private, protected, public | Sichtbarkeitsmodifikatoren                                                                                                                                                                                                                                                                          |
| abstract                   | Sichtbarkeitsmodifikatoren                                                                                                                                                                                                                                                                          |
| extends                    | Schlüsselwort zum Erweitern einer Klasse                                                                                                                                                                                                                                                            |
| this.                      | Zugriff auf eigene Attribute und Methoden innerhalb einer Klasse. In der Regel optional. Wichtig wenn innerhalb einer Methode zwischen gleichnamigem Parameter und Attribut unterschieden werden soll                                                                                               |
| super.                     | Direkter Zugriff auf Methoden einer SuperKlasse. Nur dann notwendig wenn diese Methode in der aktuellen Klasse überschrieben wird.                                                                                                                                                                  |
| this()                     | Aufruf eines überladenen Konstruktors der aktuellen Klasse. Kann nur im Konstruktor verwendet werden und muss dort an erster Stelle stehen.                                                                                                                                                         |
| super()                    | Aufruf des Konstruktors der SuperKlasse. Kann nur im Konstruktor verwendet werden und muss dort an erster Stelle stehen.                                                                                                                                                                            |

# Begriffe

| Schlüsselwörter | Beschreibung                                                                                          |
| --------------- | ----------------------------------------------------------------------------------------------------- |
| Attribut        | Eigenschaft eines Objekts oder einer Klasse                                                           |
| Argument        | Übergabewert an eine Methode                                                                          |
| Klasse          | Modell einer Entität der realen Welt oder eines Konzepts. Dient als eine Art "Blaupause" für Objekte. |
| Konstruktor     | Spezielle Methode, die ein neues Objekt ihrer Klasse erzeugt                                          |
| Methode         | Funktionalität, die auf Objekten oder Klassen aufgerufen werden kann. Bildet Verhalten ab.            |
| Objekt          | Instanz einer Klasse                                                                                  |

# Klassen und Objekte

## Klassen
- Vorlage (Bauplan) für Objekte
- eine Klasse kann viele Objekte haben
## Objekte
- auch Instanz genannt
- werden mit new instanziiert
## Methoden
- bilden Verhalten ab
- werden immer innerhalb einer Klasse definiert
- haben einen eindeutigen Bezeichner
- innerhalb einer Methode können Variablen definiert werden
## Attribute
- bilden den Zustand ab
- werden innerhalb einer Klasse definiert
- haben einen eindeutigen Bezeichner

# Kontrollstrukturen

### Verzweigung
```
if(<boolsche Bedingung>){
     //Anweisungen
}else if(<boolsche Bedingung>){
    //Anweisung
}else{
    //Anweisung
}
```

### Kopfgesteuerte While-Schleife:
```
while(<boolsche Bedingung>){
    //Anweisung
}
```

### Fußgesteuerte While-Schleife:

```
do {
    //Anweisung
} while(<boolsche Bedingung>);
```

### Zählschleife:
```
for(int i = 0; i < 10; i++){
    //Anweisung
}
```

# Methodensignatur
Die Methodesignatur definiert die Schnittstelle einer Methode und beeinhaltet sowohl die Sichtbarkeit, den Rückgabetypen sowie den Bezeichner der Methode, weiterhin alle notwendigen Parameter für den Aufruf.

In Java findet man die Methodensignatur immer bei der Definition der Methode. In der Form public String myMethod(int number, String name){...} bzw. in der Form public abstract void myOtherMethod(double anotherNumber); können diese Vorliegen.

Wenn Methoden überladen werden, muss der Bezeichner der überladenen und der überladenden Methode identisch sein, die Parameterliste sich jedoch unterscheiden. Zumeist wird die Anzahl der übergebbaren Parameter erweitert, um mehr Optionen zu erlauben, oder verringert, um Standardwerte zuzuweisen (und dem Programmierer damit etwas Schreibarbeit abzunehmen). Wenn die Anzahl der Parameter gleich bleibt, ermöglicht man durch Überladung die Nutzung einer Funktion mit anderen Datentypen (beispielsweise eine Additions Methode für Integer, eine für Double, eine für gemischte Berechnungen, etc.). Hinsichtlich der tatsächlichen Arbeitsweise einer Methode kann anhand der Methodensignatur keine Aussage getroffen werden. Meist rufen Methoden mit ähnlichen Methodensignaturen, die lediglich um einige Parameter gekürzt wurden, die jeweils längeren Methodendefinitionen mit Standardwerten auf - dies muss aber nicht der Fall sein.

Für Programmierer ist die Kenntnis der Methodensignatur, zusammen mit einer Beschreibung der Parameter und der Ergebnisse der Methode, hilfreich. Im sogenannten JavaDoc ist dies für fremde Methoden von anderen Programmierern angegeben, sodass die Funktionalität genutzt werden kann, ohne die tatsächliche Arbeitsweise der Methode nachvollziehen zu müssen.

# Komplexität eines Algorithmus

### O-Notation 
Obere Komplexitätsgrenze (höchstens) 
### Ω−Notation 
Untere Komplexitätsgrenze (mindestens) 

Die Funktion T(n) = Ω(g(n)), wenn es positive Konstanten c und $n_0$ gibt, so dass T(n) ≥c . g(n) für alle n ≥$n_0$
### θ-Notation 
Genaue Komplexität (genau)

Die Funktion T(n) = θ(g(n)) genau dann, wenn T(n) = O(g(n)) und T(n) = Ω(g(n))




# Codebeispiele

### Kommentatre
``` // Dies ist ein einzeiliger Kommentar

/* Dies ist ein
mehrzeiliger Kommentar*/
```

### Output

```
System.out.print()
```
eine einfache Ausgabe

```
System.out.println()
```
Ausgabe in einer neuen Zeile




# Nützliche Links
[Rekursion](https://openhpi-public.s3.openhpicloud.de/courses/4H0PlIvB5Pl3LVRzqcZF8x/rtfiles/5zTioLmUl8WXlhhCf2qvG6/rekursion.pdf)
[Laufzeitspeicher](https://openhpi-public.s3.openhpicloud.de/courses/4H0PlIvB5Pl3LVRzqcZF8x/rtfiles/o3T4rzEGYu3TADFhajWVl/laufzeitspeicher.pdf)
[OpenHPI Cheat Sheet](https://open.hpi.de/courses/javaeinstieg2020/items/3jlmZimnubTLllEf8PjMs0)

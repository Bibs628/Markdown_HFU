#Code #Java #Programmieren #Prof_Dr_Dirk_Eisenbiegler #Uwe_Hahne #Lichtschwert 

Das hier ist eine kurze Zusammenfassung der Java-Funktionen um ein "elegantes" multifunktionales Tool für die Programmierhilfe zu erstellen.
# Kommentieren
## Kommentare
Ein Kommentar ist eine Beschreibung des Code, sinnvoll um eine Klarstellung der Intentionen im Programm selbst zu haben. 

```
// Dies ist ein Kommentar

/* Dies ist ein Kommentar,
der mehrere Zeilen umfasst. +/
```

# Grundrechenfunktionen

## Addition

## Subtraktion

## Multiplikation

## Division

# Textbearbeitung

## Textausgabe in der Konsole

```
System.out.print()
System.out.println()
```
Dies sind die beiden Befehle um Texte generell in der Konsole ausgeben zu können. 
- Print ist dabei die Funktion um Text einfach in die Konsole einzufügen, diese werden einfach im nächst freien Platz gepackt.
- Println fügt immer den Text in eine neue Zeile ein.

# Externe Pakete
In Java können "Extensions" zu Programmen hinzugefügt werden, dies geschieht durch ein:
```
import static ....
```

## Konsoleneingaben lesen
Es können in einem Programm die Aufforderung der Eingabe von Zeichen oder ähnliches hinzugefügt werden. 

In unserem Beispiel heißt diese "Extensions" *prog.ConsoleReader*
diese wird dann durch den Befehl hinzugefügt:
```
import static prog.ConsoleReader.*;
```

Um dann im Code eine Eingabe einzubinden wird die Funktion *readInt* verendet, dies kann dann so aussehen:
```
int x = readInt("x");
```

Hier wollen sie dann eine Eingabe für x haben, welche man in der Konsole eintippen soll. 



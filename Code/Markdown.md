#Code #Markdown 

# Definition

Markdown ist eine vereinfachte Auszeichnungssprache, die von John Gruber entworfen und im Dezember 2004 mit Version 1.0.1 spezifiziert wurde. Aaron Swartz war einziger Beta-Tester und half maßgeblich bei der Entwicklung der Syntax. Ein Ziel von Markdown ist eine leicht lesbare Ausgangsform bla bla bla...


# Textbefehle

## Überschriften

Überschriften werden mit einem oder mehreren `#` am Anfang einer Zeile markiert. Die Anzahl der `#` bestimmt die Ebene der Überschrift. Es gibt sechs Ebenen von Überschriften, wobei `#` die höchste und `######` die niedrigste ist. Zum Beispiel:

```
# Überschrift 1
## Überschrift 2
### Überschrift 3
#### Überschrift 4
##### Überschrift 5
###### Überschrift 6
```
## Absätze und Umbrüche

Absätze werden durch Leerzeilen voneinander getrennt. Einen Umbruch erzwingt man durch zwei Leerzeichen am Ende einer Zeile. Zum Beispiel:

```
Dies ist ein Absatz.

Dies ist ein anderer Absatz.

Dies ist eine Zeile mit einem Umbruch.␣␣
Und dies ist die nächste Zeile.
```

## Textauszeichnung

Text kann **fett**, _kursiv_ oder _**fett und kursiv**_ hervorgehoben werden. Dazu verwendet man entweder Sternchen (`*`) oder Unterstriche (`_`) um den Text zu umschließen. Zum Beispiel:

```
Dieser Text ist **fett**.
Dieser Text ist *kursiv*.
Dieser Text ist ***fett und kursiv***.
Dieser Text ist __fett__.
Dieser Text ist _kursiv_.
Dieser Text ist ___fett und kursiv___.
```

## Listen und Aufzählungen

Listen können ungeordnet oder geordnet sein. Ungeordnete Listen beginnen mit einem `*`, `-` oder `+` gefolgt von einem Leerzeichen. Geordnete Listen beginnen mit einer Zahl gefolgt von einem Punkt und einem Leerzeichen. Listen können verschachtelt werden, indem man die Einträge mit mindestens zwei Leerzeichen oder einem Tab einrückt. Zum Beispiel:

```
* Dies ist ein ungeordneter Listeneintrag
- Dies ist ein anderer ungeordneter Listeneintrag
+ Dies ist noch ein ungeordneter Listeneintrag
  * Dies ist ein verschachtelter ungeordneter Listeneintrag
    - Dies ist noch ein verschachtelter ungeordneter Listeneintrag

1. Dies ist ein geordneter Listeneintrag
2. Dies ist ein anderer geordneter Listeneintrag
9. Die richtige Nummerierung ist nicht wichtig
  1. Dies ist ein verschachtelter geordneter Listeneintrag
    3. Dies ist noch ein verschachtelter geordneter Listeneintrag
```
## Hyperlinks

Hyperlinks können entweder inline oder referenziert sein. Inline-Links bestehen aus dem Linktext in eckigen Klammern gefolgt von der URL in runden Klammern. Optional kann man auch ein Title-Attribut in Anführungszeichen angeben. Zum Beispiel:

```
Dies ist ein Link ohne Title-Attribut.
Dies ist ein Link mit Title-Attribut.
```

Referenzierte Links bestehen aus dem Linktext in eckigen Klammern gefolgt von einer ID in eckigen Klammern. Die ID wird dann an einer anderen Stelle im Dokument definiert, wo die URL und das optionale Title-Attribut angegeben werden. Zum Beispiel:

```
Dies ist ein [referenzi[erter Link][bing].
Dies ist ein [anderer referenzierter Link][google] mit Title-Attribut.

[bing]: https://www.bing.com
[google]: https://www.google.com "Google"
```

## Bilder

Bilder werden ähnlich wie Links formatiert, nur dass sie ein Ausrufezeichen (`!`) vor den eckigen Klammern haben. Der Text in den eckigen Klammern ist der Alternativtext für das Bild. Die URL in den runden Klammern ist der Pfad oder die Adresse des Bildes. Optional kann man auch ein Title-Attribut in Anführungszeichen angeben. Zum Beispiel:

```
!Ein Bild ohne Title-Attribut.
!Ein anderes Bild mit Title-Attribut.
```

Bilder können auch referenziert werden, wie Links. Zum Beispiel:

```
![Ein referenziertes Bild][logo].
![Ein anderes referenziertes Bild][foto] mit Title-Attribut.

[logo]: pfad/logo.png
[foto]: https://www.bing.com/images/foto.jpg "Bing Foto"
```
## Zitate

Zitate werden mit einem `>` am Anfang einer Zeile markiert. Zitate können mehrere Absätze umfassen, indem man die `>` an jeder Zeile wiederholt. Zitate können auch verschachtelt werden, indem man mehrere `>` verwendet. Zum Beispiel:

```
> Dies ist ein Zitat.
>
> Dies ist ein anderer Absatz im Zitat.

> Dies ist ein verschachteltes Zitat.
>> Dies ist ein noch tiefer verschachteltes Zitat.
```

## Code

Code kann entweder inline oder als Block formatiert werden. Inline-Code wird mit einfachen Backticks (`) umschlossen. Zum Beispiel:

```
Dies ist ein Satz mit `inline-code` darin.
```

Code-Blöcke werden mit vier Leerzeichen oder einem Tab am Anfang jeder Zeile eingerückt. Zum Beispiel:

```
    Dies ist ein Code-Block
    mit mehreren Zeilen
    und Einrückung
```

## Mathematische Ausdrücke

Mathematische Ausdrücke können mit LaTeX-Syntax geschrieben werden. Um einen mathematischen Ausdruck inline zu formatieren, umschließt man ihn mit zwei Dollarzeichen (`$$`). Zum Beispiel:

```
Die Quadratwurzel von 2 ist $$\sqrt{2}$$.
```

Um einen mathematischen Ausdruck als Block zu formatieren, umschließt man ihn mit vier Dollarzeichen (`$$$$`). Zum Beispiel:

```
Die Quadratwurzel von 2 ist
$$$$
\sqrt{2}
$$$$
```


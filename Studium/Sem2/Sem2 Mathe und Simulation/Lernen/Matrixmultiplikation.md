Vorgehensweise bei der Multiplikation von Matrixen


| 0   | **0** | **1** |     | **0** | **1** | **0** |     | 0   | 0   | 1   |
| --- | ----- | ----- | --- | ----- | ----- | ----- | --- | --- | --- | --- |
| 0   | 1     | 0     | x   | 1     | 0     | 0     | =   | 1   | 0   | 0   |
| 1   | 0     | 0     |     | 0     | 0     | 0     |     | 0   | 1   | 0   |
Die Vorgehensweise ist dabei recht simpel.
Um die Lösung für das erste Feld zu erhalten muss man folgende Rechnung aufstellen:

| <mark style="background: #FFB8EBA6;">0</mark> | <mark style="background: #FFB8EBA6;">0</mark> | <mark style="background: #FFB8EBA6;">1</mark> |     | <mark style="background: #FFB8EBA6;">0</mark> | 1   | 0   |     | <mark style="background: #FFB8EBA6;">0</mark> | 0   | 1   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --- | --------------------------------------------- | --- | --- | --- | --------------------------------------------- | --- | --- |
| 0                                             | 1                                             | 0                                             | x   | <mark style="background: #FFB8EBA6;">1</mark> | 0   | 0   | =   | 1                                             | 0   | 0   |
| 1                                             | 0                                             | 0                                             |     | <mark style="background: #FFB8EBA6;">0</mark> | 0   | 0   |     | 0                                             | 1   | 0   |
man berechnet das erste feld pro Zeile mit dem ersten Feld der Spalte und immer so weiter um das ergebnis in der 3. 
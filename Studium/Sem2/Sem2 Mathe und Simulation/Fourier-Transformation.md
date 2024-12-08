#Mathe #Ruxandra_Lasowski #Semester2 #Studium 

### Orthogonale Projektionen

gegeben: 2 Signalvektoren x, y
gesucht: Projektion von x auf y

Proj (x)



Beispiel:
$x=(\frac{0,75}{1,25})$
$y=(\frac{\frac{1}{\sqrt{2}}}{\frac{1}{\sqrt{2}}})=(\frac{\frac{\sqrt{2}}{2}}{\frac{\sqrt{2}}{2}})$ 

![[GeoGebraCalculator_XJdSxZsAKQ.png]]

Proj y (x) = $x_{II}=\frac{(\frac{0,75}{1,25})*(\frac{\frac{1}{\sqrt{2}}}{\frac{1}{\sqrt{2}}})}{1}$ 


Projektionskoeffizinet $\frac{2}{\sqrt2}=\sqrt{2}$ 



$x=P_{P0}(x)+P_{P1}(x)=(\frac{x_0}{0})+(\frac{0}{x1})=(\frac{x_0}{x_1})$ 

> Int--- it der Fall, wenn wir das Signal und eine andere ?m Basis projezieren. Das kann man als Koordinatentransformation oder als Basiswechsel interpretieren. 
> Im Fall des DFF (Diskrete Fourier-Transformation) sind die Vektoren auf denen man die Signale projeziert komplexe ...

Vektoren auf denen wir projezieren wollen:
$S_{0}= (\frac{1}{1})$ $S_1=(\frac{1}{-1})$ 

$Proj_{s0}(x)=\frac{(\frac{x_0}{x_1})*(\frac{1}{1})}{1^2*1^2}(\frac{1}{1})=\frac{x_0+x_1}{2}(\frac{1}{1})$ 
$Proj_{s1}(x)=\frac{(\frac{x_0}{x_{1}})*(\frac{1}{-1})}{1^2*1^2}(\frac{1}{-1})=\frac{x_0+x_1}{2}(\frac{1}{-1})$ 

Summe der Projektion $Proj_{s0}(x)+Proj_{s1}(x)=\frac{x_0+x_1}{2}(\frac{x_0}{x_1})$ 

DFT 
$X(k)= \frac{1}{N}<X|s_k>=\frac{1}{N}$

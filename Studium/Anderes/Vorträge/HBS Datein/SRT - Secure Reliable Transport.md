#Studium #Wiki 

**Secure Reliable Transport** ist ein Videostreamingprotokoll. Es wurde 2017 von [Haivision](https://www.haivision.com) vorgestellt. Das [Protokoll](https://de.wikipedia.org/wiki/Protokollstapel "Protokollstapel") ist [Open Source](https://de.wikipedia.org/wiki/Open_Source "Open Source") und frei von Herstellern implementierbar. Als [UDP](https://de.wikipedia.org/wiki/User_Datagram_Protocol) Protokoll ist es ein Rivale zum von [Adobe](https://de.wikipedia.org/wiki/Adobe_Inc. "Adobe Inc.") entwickelten proprietären [RTMP](https://de.wikipedia.org/wiki/Real_Time_Messaging_Protocol "Real Time Messaging Protocol").

SRT ist ein „Point to Point“-Protokoll und dient zur direkten Verbindung von einem Sender und einem Empfänger, also [Quelle und Senke](https://de.wikipedia.org/wiki/Quelle_und_Senke "Quelle und Senke"). Broadcasting und Distribution an mehrere Empfänger wird nicht unterstützt. SRT unterstützt eine [Ende-zu-Ende-Verschlüsselung](https://de.wikipedia.org/wiki/Ende-zu-Ende-Verschl%C3%BCsselung "Ende-zu-Ende-Verschlüsselung") mittels [AES-128](https://de.wikipedia.org/wiki/Advanced_Encryption_Standard "Advanced Encryption Standard").[[1]](https://de.wikipedia.org/wiki/Secure_Reliable_Transport#cite_note-1)

Ein häufiger Anwendungsbereich ist der [Uplink](https://de.wikipedia.org/wiki/Uplink "Uplink"), also die Videoübertragung von einem [Außenreporter](https://de.wikipedia.org/wiki/Reporter "Reporter") ins [Studio](https://de.wikipedia.org/wiki/Fernsehstudio "Fernsehstudio"), oder von einem Studio in ein [Content Delivery Network](https://de.wikipedia.org/wiki/Content_Delivery_Network "Content Delivery Network") (CDN). SRT ist nicht standardisiert.

Anders als viele alternative Protokolle wie zum Beispiel [RTMP](https://de.wikipedia.org/wiki/Real_Time_Messaging_Protocol "Real Time Messaging Protocol") unterstützt SRT neuere Kodierungsverfahren wie [H.265 HEVC](https://de.wikipedia.org/wiki/H.265 "H.265"). So kann bei gleichbleibender Bitrate eine höhere Videoqualität erreicht werden.

# Funktionsweise
Die beiden Enden der „[Point to Point](https://de.wikipedia.org/wiki/Point_to_Point "Point to Point")“-Verbindung werden entweder als _Caller_ oder als _Listener_ bezeichnet.[[3]](https://de.wikipedia.org/wiki/Secure_Reliable_Transport#cite_note-3) Dabei gibt es keine klare Zuordnung von Modus und Verbindungsteilnehmer. Es kann also der Empfänger als Caller oder Listener arbeiten, ebenso aber auch der Sender.

Caller und Listener definieren nur, welches Ende den Verbindungsaufbau initiiert und die technischen Parameter der aufzubauenden Verbindung definiert.

Neben den Betriebsmodi _Caller_ und _Listener_ der Verbindungsteilnehmer gibt es noch einen Rendezvous-Modus. Hier versuchen beide Teilnehmer eine Verbindung herzustellen. Der Teilnehmer, dem es gelingt, kann dann mit seinen gesetzten Parametern die Verbindung aufbauen. Dieser Modus ist vor allem praktisch bei mehreren [Firewalls](https://de.wikipedia.org/wiki/Firewall "Firewall") und [NATs](https://de.wikipedia.org/wiki/Network_Address_Translation "Network Address Translation"), die überbrückt werden müssen. Gerade im Bereich der Außenberichterstattung kann dieser Modus genutzt werden um Sender die im Mobilfunknetz angebunden sind einfacher zu empfangen.

SRT hat keinen speziellen dezidierten Port. So kann theoretisch für jeden auf einem Computer laufenden Empfänger ein neuer Port zugewiesen und die Datenströme getrennt werden. Mehrere Programme bieten eine [GUI](https://de.wikipedia.org/wiki/GUI "GUI") um die Parameter zu definieren, anders als [FFmpeg](https://de.wikipedia.org/wiki/FFmpeg "FFmpeg"), welches als reines [Konsolenprogramm](https://de.wikipedia.org/wiki/Kommandozeile "Kommandozeile") nur direkte Links unterstützt. Ein direkter Link kann wie folgt aussehen und noch weitere Streamingparameter beinhalten:

- `srt://ip.des.ser.vers:port?mode=caller`
- `srt://ip.des.ser.vers:port?mode=listener`
- `srt://ip.des.ser.vers:port?mode=rendezvous`
# Implementierung
Stand Juli 2021 gibt es nur eine Implementierung des Protokolls, eine open-source [Bibliothek](https://de.wikipedia.org/wiki/Bibliothek_(Programmierung) "Bibliothek (Programmierung)") geschrieben in der Programmiersprache [C](https://de.wikipedia.org/wiki/C_(Programmiersprache) "C (Programmiersprache)"). SRT ermöglicht den Betrieb in mehreren Modi.

- Dateiübertragung mittels eines UDP Paketstreams
- File-stream Modus: wie [TCP](https://de.wikipedia.org/wiki/Transmission_Control_Protocol "Transmission Control Protocol")
- Live-Modus: Hier wird ein Videostream in einen MPEG-TS Transportstream gepackt und päckchenweise über das Netzwerk ausgeliefert.

Weitere Eigenschaften:

1. Verschlüsselung mit einem [Pre-shared Key](https://de.wikipedia.org/wiki/Pre-shared_key "Pre-shared key") mit Unterstützung von [OpenSSL](https://de.wikipedia.org/wiki/OpenSSL "OpenSSL")
2. SRT Access Control (aka "StreamID") kann von Programmen genutzt werden um mehrere Streams zu separieren und zu schützen. Die mehreren Streams können dann auch über den gleichen Port empfangen und von der gleichen Empfängerinstanz verarbeitet werden.
3. Optional auch Fehlerbehebung während des Streams mittels [Vorwärtsfehlerkorrektur](https://de.wikipedia.org/wiki/Vorw%C3%A4rtsfehlerkorrektur "Vorwärtsfehlerkorrektur").

## SRT Allianz
Die SRT Allianz ist eine Organisation mit über 400 Mitgliedern. Diese entwickeln und verbreiten das Protokoll weiter und entwickeln eigene Programme und Implementierungen. Gründungsmitglieder sind [Haivision](https://de.wikipedia.org/w/index.php?title=Haivision&action=edit&redlink=1 "Haivision (Seite nicht vorhanden)") und [Wowza](https://de.wikipedia.org/w/index.php?title=Wowza&action=edit&redlink=1 "Wowza (Seite nicht vorhanden)").[[4]](https://de.wikipedia.org/wiki/Secure_Reliable_Transport#cite_note-4)

## Siehe auch

- [FFmpeg](https://de.wikipedia.org/wiki/FFmpeg "FFmpeg")
- [Open Broadcaster Software (OBS)](https://de.wikipedia.org/wiki/Open_Broadcaster_Software "Open Broadcaster Software")
- [GStreamer](https://de.wikipedia.org/wiki/GStreamer "GStreamer")
- VMix
- [RTMP](https://de.wikipedia.org/wiki/Real_Time_Messaging_Protocol "Real Time Messaging Protocol")
- Liste der [Streaming-Protokolle](https://de.wikipedia.org/wiki/Streaming-Protokoll "Streaming-Protokoll")

# Quellen
- https://de.wikipedia.org/w/index.php?title=Secure_Reliable_Transport&oldid=240827319
- 
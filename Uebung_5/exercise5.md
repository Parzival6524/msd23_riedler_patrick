Übung 5:

Logging Branch statud:

![Image](../resources/images/ex5_1.png)

Auffälligkeiten:

Der Output der Konsole beinhaltet nur den logger.errror und nicht de logger.info text.

![Image](../resources/images/ex5_2.png)

# Projektkonfiguration

## Log4j2 Konfiguration

Um sicherzustellen, dass Logs korrekt in einer Datei gespeichert werden, stellen Sie sicher, dass die Log4j2-Konfigurationsdatei an der richtigen Stelle und mit dem richtigen Namen vorhanden ist.

1. Platzieren Sie die `log4j2.xml` Datei im Verzeichnis `src/main/resources`.
2. Benennen Sie die Datei exakt `log4j2.xml`.

Ein Template für diese Datei finden Sie unter `log4j2.xml.template`. Kopieren Sie diese Datei und benennen Sie sie in `log4j2.xml` um, bevor Sie das Projekt ausführen.

Outputdatei:

![Image](../resources/images/ex5_3.png)
public class App {
    public static void main(String[] args) throws Exception {
        
        //test der Funktionen

        //Objekte erstellen
        Dozierender dozent  = new Dozierender("Prof. Nestler", "Informatik", "B-123");
        Lehrveranstaltung swe = new Lehrveranstaltung("Objektorientierte Programmierung", dozent, 5);
        Studierender student  = new Studierender("Max Mustermann", 123456, "Informatik");
        Studierender student2 = new Studierender("Felix Franz",123457, "UXD");
        Studierender student3= new Studierender("Mona Seitz", 123120, "Flug- und fahrzeuginformatik");

        //Methoden der Lehrveranstaltung testen
        swe.hinzufuegenStudierenden(student);
        swe.hinzufuegenStudierenden(student2);
        swe.entfernenStudierenden(student2);
        swe.anzeigeTeilnehmer();
        swe.hinzufügenVorlessungstunde("Liste Arrays", "24.12.2025", "23:10", "G106");
        swe.erzeugePraktikumsstunde("Übung zu OOP", "04.04.2025", "14:00", "E303", "Vorstellung von Git-Aufgabe mit Peddingten");
        swe.anzeigeTeilnehmer();

        //Methoden der Studierender testen
        student3.anmeldenfürVeranstaltung(swe);
        student3.frageStellen(dozent,"Was kommte heute dran?");
        student3.sprechStundenanfrage("20.04.2025", "B0-13", dozent, "12:30");
        student3.feedbackGeben(dozent, student3.getName(),"war gut", "24.12.2025");

        //Methoden der Dozierender testen
        //dozent.feedbackErhalten(student3, "war gut", "24.12.2025");
        dozent.sprechstundeoke("20.04.2025", "B0-13", "12:30");
        dozent.feedbackanzeigen();
        dozent.feedbackLoeschen(0);
        dozent.feedbackanzeigen();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        //test 1
        Dozierender dozent  = new Dozierender("Prof. Nestler", "Informatik", "B-123");
        Lehrveranstaltung swe = new Lehrveranstaltung("Objektorientierte Programmierung", dozent, 5);

        
        Studierender student  = new Studierender("Max Mustermann", 123456, "Informatik");
        Studierender student2 = new Studierender("Felix Franz",123457, "UXD");
        Studierender student3= new Studierender("Mona Seitz", 123120, "Flug- und fahrzeuginformatik");


        swe.hinzufuegenStudierenden(student);
        swe.hinzufuegenStudierenden(student2);
        
        swe.entfernenStudierenden(student2);

        swe.anzeigeTeilnehmer();

        swe.hinzufügenVorlessungstunde("Liste Arrays", "24.12.2025", "23:10", "G106");
        swe.erzeugePraktikumsstunde("Übung zu OOP", "04.04.2025", "14:00", "E303", "Vorstellung von Git-Aufgabe mit Peddingten");
        
        swe.anzeigeTeilnehmer();

        student3.anmeldenfürVeranstaltung(swe);
    }
}

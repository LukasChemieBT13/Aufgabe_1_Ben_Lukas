public class App {
    public static void main(String[] args) throws Exception {
        //test
        
        Dozierender dozent  = new Dozierender("Dr. Schmidt", "Informatik", "B-123");
        Lehrveranstaltung swe = new Lehrveranstaltung("Objektorientierte Programmierung", dozent, 5);
        Studierender student  = new Studierender("Max Mustermann", 123456, "Informatik");

    }
}

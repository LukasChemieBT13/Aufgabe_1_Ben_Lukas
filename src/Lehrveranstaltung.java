public class Lehrveranstaltung {
    public String titel;
    public Dozierender dozierender;
    public Studierender[] teilnehmer;
    public Vorlesungsstunde vorlesungsstunde;
    public Praktikumsstunde praktikumsstunde;

    //Konstruktor für Lehrveranstaltung
    public Lehrveranstaltung(String titel, Dozierender dozierender, int maxTeilnehmer) {
        this.titel = titel;
        this.dozierender = dozierender;
        this.teilnehmer = new Studierender[maxTeilnehmer]; // Feste Größe für Teilnehmerliste
        this.vorlesungsstunde = null;
        this.praktikumsstunde = null;
    }

    //Aufgabe 4
    public void hinzufuegenStudierenden(Studierender studierender) {
        for (int i = 0; i < teilnehmer.length; i++) {
            if (teilnehmer[i] == null) { // Freien Platz suchen
                teilnehmer[i] = studierender;
                System.out.println(studierender.getName() + " wurde zur Lehrveranstaltung hinzugefügt.");
                return;
            }
        }
        System.out.println("Kein Platz mehr frei für " + studierender.getName());
    }

    //Aufgabe 4
    public void entfernenStudierenden(Studierender studierender) {
        for (int i = 0; i < teilnehmer.length; i++) {
            if (teilnehmer[i] != null && teilnehmer[i].getName().equals(studierender.getName())) {
                teilnehmer[i] = null;
                System.out.println(studierender.getName() + " wurde aus der Lehrveranstaltung entfernt.");
                return;
            }
        }
        System.out.println(studierender.getName() + " ist nicht in der Lehrveranstaltung.");
    }

    //Aufgabe 4
    public void anzeigeTeilnehmer(){
        for (int i =0; i< teilnehmer.length; i++){
                System.out.println(teilnehmer[i]);
        }
    }

    //Aufgabe 4
    public void hinzufügenVorlessungstunde(String thema, String datum, String uhrzeit, String raum) {
        Vorlesungsstunde vorlesung = new Vorlesungsstunde(thema, datum, uhrzeit, raum);
        System.out.println("Eine neue Vorlesungsstunde wurde erstellt: " + thema);
    }

    //Aufgabe 4
    public void erzeugePraktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgabe) {
        Praktikumsstunde praktikum = new Praktikumsstunde(thema, datum, uhrzeit, raum, aufgabe);
        System.out.println("Eine neue Praktikumsstunde wurde erstellt:" +thema);
    }







}

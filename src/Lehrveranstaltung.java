public class Lehrveranstaltung {
    public String titel;
    public Dozierender dozierender;
    public String [] teilnehmer;
    public Vorlesungsstunde vorlesungsstunde;
    public Praktikumsstunde praktikumsstunde;

    //Konstruktor für Lehrveranstaltung
    public Lehrveranstaltung(String titel, Dozierender dozierender, String [] teilnehmer, Vorlesungsstunde vorlesungsstunde, Praktikumsstunde praktikumsstunde){
        this.titel=titel;
        this.dozierender=dozierender;
        this.teilnehmer=teilnehmer;
        this.vorlesungsstunde=vorlesungsstunde;
        this.praktikumsstunde=praktikumsstunde;
    }

    //Aufgabe 4
    public void hinzufügenStudierende(Studierender studierender, int nummer){
        
        if(teilnehmer[nummer]==null){
            this.teilnehmer[nummer]=studierender.getName();
            System.out.println("Der Teilnehmer " + studierender.getName() + "wurde erfolgreich hinzugefügt.");
        } else {
            System.out.println("Diese Studentennummer ist bereits vergeben!");
        }

    }

    //Aufgabe 4
    public void entferneStudierende(int nummer){

        if(teilnehmer[nummer]==null){
            System.out.println("Dieser Student wurde bereits entfertn!");
        } else{
            teilnehmer[nummer]=null;
            System.out.println("Sie haben den Teilnehmer mit der Nummer "+ nummer+ " erfolgreich entfertn.");
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

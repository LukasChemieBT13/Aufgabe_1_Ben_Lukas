public class Praktikumsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String aufgabe;

    //Konstruktor für die Klasse Praktikumsstunde
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgabe){
        this.thema=thema;
        this.datum=datum;
        this.uhrzeit=uhrzeit;
        this.raum=raum;
        this.aufgabe=aufgabe;
    }

    //Aufgabe 4
    public void zeigDetails(){
        System.out.println("Die Infos zur Praktikumsstunde: ");
        System.out.println("Thema: "+ this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: "+ this.uhrzeit);
        System.out.println("Raum: "+ this.raum);
        System.out.println("Aufgaben: " + this.aufgabe);
    }

}

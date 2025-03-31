public class Praktikumsstunde {
    public String thema;
    public String datum;
    public String uhrzeit;
    public String raum;
    public String aufgabe;

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

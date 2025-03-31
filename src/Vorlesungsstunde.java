public class Vorlesungsstunde {
    public String thema;
    public String datum;
    public String uhrzeit;
    public String raum;

    //Konstruktor für die Klasse Vorlesungsstunde
    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum){
        this.thema=thema;
        this.datum=datum;
        this.uhrzeit=uhrzeit;
        this.raum=raum;
    }

    public void zeigDetails(){
        System.out.println("Die Infos zur Vorlesungsstunde: ");
        System.out.println("Thema: "+ this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: "+ this.uhrzeit);
        System.out.println("Raum: "+ this.raum);
    }


}

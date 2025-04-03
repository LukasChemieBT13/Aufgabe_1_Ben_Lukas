public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    //Konstruktor für die Klasse Vorlesungsstunde
    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum){
        this.thema=thema;
        this.datum=datum;
        this.uhrzeit=uhrzeit;
        this.raum=raum;
    }

    //getter Methoden
    public String getThema(){
        return this.thema;
    }

    public String getDatum(){
        return this.datum;
    }

    public String getUhrzeit(){
        return this.uhrzeit;
    }

    public String getRaum(){
        return this.raum;
    }
    
    //setter Methoden
    public void setThema(String thema){
        this.thema = thema;
    }

    public void setDatum(String datum){
        this.datum=datum;
    }

    public void setUhrzeit(String uhrzeit){
        this.uhrzeit=uhrzeit;
    }

    public void setRaum(String raum){
        this.raum=raum;
    }

    //Aufgabe 4
    public void zeigDetails(){
        System.out.println("Die Infos zur Vorlesungsstunde: ");
        System.out.println("Thema: "+ this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: "+ this.uhrzeit);
        System.out.println("Raum: "+ this.raum);
    }


}

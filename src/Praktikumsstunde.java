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

    public String getAufgabe(){
        return this.aufgabe;
    }

    //Aufgabe 4
    public void zeigDetails(){
        System.out.println("Die Infos zur Praktikumsstunde: ");
        System.out.println("Thema: "+ this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: "+ this.uhrzeit);
        System.out.println("Raum: "+ this.raum);
        System.out.println("Aufgaben: " + this.aufgabe);
        System.out.println("Ben ist der tollste!");
    }

}

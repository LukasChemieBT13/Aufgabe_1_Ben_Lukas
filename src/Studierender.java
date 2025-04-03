public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;
    
    //Konstruktor für die Klase Studierende
    public Studierender(String name, int matrikelnummer, String studiengang){
        this.name=name;
        this.matrikelnummer=matrikelnummer;
        this.studiengang=studiengang;
    }

    //getter Methoden
    public String getName(){
        return this.name;
    }

    public int getMartikelnummer(){
        return this.matrikelnummer;
    }

    public String getStudiengang(){
        return this.studiengang;
    }

    //setter Methoden
    public void setName(String name){
        this.name=name;
    }

    public void setMartrikelnummer(int matrikelnummer){
        this.matrikelnummer=matrikelnummer;
    }

    public void setStudiengang(String studiengang){
        this.studiengang=studiengang;
    }


    //Aufgabe 2
    public void frageStellen(Dozierender dozierender, String frage){
        System.out.println("Die/der Student/in " + name + " stellt eine Frage an " + dozierender.getName() + ": " + frage);
        //dozierender.frageBeantworten(this);
    }

    //Aufgabe 3 
    public void sprechStundenanfrage(String datum, String raum, Dozierender dozierender, String uhrzeit) {
        System.out.println(this.name + " bittet um eine Sprechstunde am " + datum + " um " + uhrzeit + " bei " + dozierender.getName());
        dozierender.sprechstundeoke(datum, raum, uhrzeit);
    }

    //Aufgabe 3
    public void feedbackGeben(Dozierender dozierender, String name, String feedback, String date){
        System.out.println("Sie geben folgendes Feedback: "+ feedback + " an den Dozenten: " + dozierender.getName() +".");
        dozierender.feedbackErhalten(this, feedback, date);
    }

    //Aufgabe 4
    public void anmeldenfürVeranstaltung(Lehrveranstaltung kurs){
        System.out.println("Sie versuchen sich für den Kurs " + kurs.getTitel() + " einzuschreiben.");
        kurs.hinzufuegenStudierenden(this);
    }

    
}

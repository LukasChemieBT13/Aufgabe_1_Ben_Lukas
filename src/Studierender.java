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

    //getter Methode für Name
    public String getName(){
        return name;
    }

    //Aufgabe 2
    public void frageStellen(Dozierender dozierender, String frage){
        System.out.println("Der Student" + name + " stellt eine Frage an " + dozierender.getName() + ": " + frage);
        dozierender.frageBeantworten(this);
    }

    //Aufgabe 3 
    public void sprechStundenanfrage (String date, String room, Dozierender dozierender, String uhrzeit){
        System.out.println(this.name + "bittet um eine Spreckstunde am " + date + " um " + uhrzeit+ " bei Ihnen." );
        dozierender.sprechstundeoke(date, room, dozierender, uhrzeit);
    }

    //Aufgabe 3
    public void feedbackGeben(Dozierender dozierender, String name, String feedback){
        System.out.println("Sie geben folgendes Feedback "+ feedback + "an den Dozenten " + dozierender.getName() +".");
        dozierender.feedbackErhalten(this, feedback, feedback);
    }

    
}

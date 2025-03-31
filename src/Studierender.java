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

    public String getName(){
        return name;
    }

    public void frageStellen(Dozierender dozierender, String frage){
        System.out.println("Der Student" + name + " stellt eine Frage an " + dozierender.getName() + ": " + frage);
        dozierender.frageBeantworten(this);
    }

    public void sprechStundenanfrage (String date, String room, Dozierender dozierender, String uhrzeit){
        System.out.println(this.name + "bittet um eine Spreckstunde am " + date + " um " + uhrzeit+ " bei Ihnen." );
        dozierender.sprechstundeoke(date, room, dozierender, uhrzeit);
    }

    public void feedbackGeben(Dozierender dozierender, String name, String feedback){
        System.out.println("Sie geben folgendes Feedback "+ feedback + "an den Dozenten " + dozierender.getName() +".");
        dozierender.feedbackErhalten(this, feedback, feedback);
    }

    
}

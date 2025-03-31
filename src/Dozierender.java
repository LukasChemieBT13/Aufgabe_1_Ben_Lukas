public class Dozierender {
    private String name;
    private char fakultaet;
    private String bueronummer;
    private String[] feedback;

    //Konstruktor für die Klasse Dozierender
    public Dozierender(String name, char fakultaet, String bueronummer){
        this.name=name;
        this.fakultaet=fakultaet;
        this.bueronummer=bueronummer;
    }

    //getter Methode für Namen
    public String getName(){
        return name;
    }

    //Aufgabe 2
    public void frageBeantworten(Studierender studierender){
        System.out.println("Der Dozierende " + name + " beantwortet die Frage von " + studierender.getName() + ": ");
    }

    //Aufgabe 3
    public boolean sprechstundeoke(String date, String room, Dozierender dozierender, String uhrzeit){
        System.out.println("Hier mit bestätige ich Ihre Sprechstunde am "+ date + " um " + uhrzeit + " VG" + getName());
        return true;
    }

    //Aufgabe 3
    public void feedbackErhalten(Studierender studierender, String feedback, String date){
        System.out.println("Sie haben folgendes Feedback: " + feedback + "von "+ studierender.getName()+ "erhalten.");
        this.feedback[0]=feedback;
    }
}

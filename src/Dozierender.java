public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;
    private String letztesFeedback;

    //Konstruktor für die Klasse Dozierender
    public Dozierender(String name, String fakultaet, String bueronummer){
        this.name=name;
        this.fakultaet=fakultaet;
        this.bueronummer=bueronummer;
        this.letztesFeedback=null;
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
    public boolean sprechstundeoke(String datum, String raum, String uhrzeit) {
        System.out.println("Hiermit bestätige ich Ihre Sprechstunde am " + datum + " um " + uhrzeit + ". VG, " + getName());
        return true;
    }

    //Aufgabe 3
    public void feedbackErhalten(Studierender studierender, String feedback, String date){
        System.out.println("Sie haben folgendes Feedback: " + feedback + "von "+ studierender.getName()+ "erhalten.");
        this.letztesFeedback=feedback;
    }
}

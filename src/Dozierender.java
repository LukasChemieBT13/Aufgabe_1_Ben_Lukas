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

    public String getName(){
        return name;
    }

    public void frageBeantworten(Studierender studierender){
        System.out.println("Der Dozierende " + name + " beantwortet die Frage von " + studierender.getName() + ": ");
    }

    public boolean sprechstundeoke(String date, String room, Dozierender dozierender, String uhrzeit){
        System.out.println("Hier mit bestätige ich Ihre Sprechstunde am "+ date + " um " + uhrzeit + " VG" + getName());
        return true;
    }

    public void feedbackErhalten(Studierender studierender, String feedback, String date){
        System.out.println("Sie haben folgendes Feedback: " + feedback + "von "+ studierender.getName()+ "erhalten.");
        this.feedback[0]=feedback;
    }
}

public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;
    private static int feedbackstelle;
    private String [] letztesFeedback=new String[20]; //speicherplatz auf maximal 100 manuell gesetzt

    //Konstruktor für die Klasse Dozierender
    public Dozierender(String name, String fakultaet, String bueronummer){
        this.name=name;
        this.fakultaet=fakultaet;
        this.bueronummer=bueronummer;
    }

    //getter Methoden
    public String getName(){
        return this.name;
    }

    public String getFakultaet(){
        return this.fakultaet;
    }

    public String getBueronummer(){
        return this.bueronummer;
    }

    public String [] getLetztesfeedback(){
        return letztesFeedback;
    }

    //setter Methoden 
    public void setName(String name){
        this.name=name;
    }

    public void setFakultaet(String fakultaet){
        this.fakultaet=fakultaet;
    }

    public void setBueronummer (String bueronummer){
        this.bueronummer=bueronummer;
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
        
        if (feedbackstelle < letztesFeedback.length){
            this.letztesFeedback[feedbackstelle] = feedback;
            
            feedbackstelle++;
            System.out.println("Sie haben das Feedback an Stelle " + feedbackstelle+ " erfolgreich abgespeichert.");
        } else {
            
            System.out.println("Kein Platz mehr zum abspeicheren!");
        }

    }

    //Aufgabe 3
    public void feedbackanzeigen(){
        System.out.println("Hier bisheriges feedback:");
        
        for (int i=0; i< letztesFeedback.length;i++){
            System.out.println(letztesFeedback[i]);
        }
    }
}

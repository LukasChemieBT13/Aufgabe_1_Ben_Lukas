public class Dozierender {
    private String name;
    private char fakultaet;
    private String bueronummer;
    
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
}

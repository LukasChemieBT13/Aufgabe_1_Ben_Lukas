public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;
    
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

    public void sprechStundenanfrage (String date, String room, Studierender studierender){
        
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
    Studierender student1 = new Studierender("Franz",1235,"UXD");
    Dozierender dozent1= new Dozierender("Chef", 'E',"b014");

    student1.frageStellen(dozent1,"Was ist heute?");
    }
}

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader("Cin", 33);
        Reader anotherReader = new Reader("Norman", 60);

        Newspaper newspaper = new Newspaper("COndoricosas");

        newspaper.addObserver(reader);
        newspaper.addObserver(anotherReader);

        newspaper.publish();
    }
}
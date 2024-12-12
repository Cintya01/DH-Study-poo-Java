public class Main {
    public static void main(String[] args) {

    University university = new University("Monster University");

    university.generateStudent(1, "mike");
    university.generateCourse(101,"learning java");

    try {
        university.subscribeStudent(101,1);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }




    }
}
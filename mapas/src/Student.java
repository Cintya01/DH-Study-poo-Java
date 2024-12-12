public class Student {

    private String name;
    private Double averageGrades;
    private Integer id;

    public Student(String name, Double averageGrades, Integer id) {
        this.name = name;
        this.averageGrades = averageGrades;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrades=" + averageGrades +
                ", id=" + id +
                '}';
    }
}

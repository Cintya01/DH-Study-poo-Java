import java.util.HashSet;
import java.util.Set;

public class University {

    private String name;
    private Set<Course> courseSet;
    private Set<Student> studentSet;

    public University(String name) {
        this.name = name;
        courseSet = new HashSet<>();
        studentSet = new HashSet<>();
    }

    public void generateStudent(Integer idStudent, String nameStudent){
        Student student = new Student(idStudent, nameStudent);
        studentSet.add(student);
    }

    public void generateCourse(Integer idCourse, String nameCourse){
        Course course = new Course(idCourse, nameCourse);
        courseSet.add(course);
    }

    public void subscribeStudent(Integer idCourse, Integer idStudent ) throws Exception{
        Course course = findCourse(idCourse);
        Student student = findStudent(idStudent);
        if (course == null){
            throw new CourseNotFoundException(idCourse + "is not a valid id");
        }
        if (student == null){
            throw new StudentNotFoundException(idStudent + "is not a valid id");
        }

        course.addStudent(student);
        System.out.println(student.getName() + " was enrolled in " + course.getSubject());
    }

    private Course findCourse(Integer idCourse){
        Course wantedCourse = null;
        for (Course course:courseSet){
          if (course.getCourseId().equals(idCourse)){
              wantedCourse = course;
          }
        }
        return wantedCourse;
    }

    private Student findStudent(Integer idStudent) {
        Student wantedStudent = null;
        for (Student student : studentSet) {
            if (student.getStudentId().equals(idStudent)) {
                wantedStudent = student;
            }
        }
        return wantedStudent;
    }


}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> studentPassedCourses1 = new ArrayList<>();
        ArrayList<String> studentCurrentCourses = new ArrayList<>();
        Student student = new Student("Zia", studentPassedCourses1, studentCurrentCourses);

        ArrayList<String> teacherCanTeach = new ArrayList<>();
        teacherCanTeach.add("Lise");
        ArrayList<String> teacherCurrentCourses = new ArrayList<>();
        Teacher teacher = new Teacher("Petersen", teacherCanTeach, teacherCurrentCourses);

        persons.add(student);
        persons.add(teacher);

        for (Person person : persons) {
            boolean added = person.addCourse("Java");
            if (added) {
                System.out.println(person.getName());
            }
        }
    }
}

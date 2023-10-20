import java.util.ArrayList;
class Student extends Person {
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student (String name,ArrayList<String>passedCourses,ArrayList<String>currentCourses) {
        super(name);
        this.passedCourses = currentCourses;
        this.currentCourses = currentCourses;
    }
    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            System.out.println("Allered har bestået dette kursus");
            return false;
        }
    }

}



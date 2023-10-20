import java.util.ArrayList;

class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;
    public Teacher(String name ){
        super(name);
        this.canTeach=canTeach;
        this.currentCourses=currentCourses;
    }
    @Override
    public boolean addCourse (String course){
        if (canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }else {
            System.out.println(getName()+"can not teach this subject.");
            return false;
        }
    }
}

import java.util.ArrayList;

public class Module {
    private String title;
    private Lecturer lecturer;
    private ArrayList<Student> students;

    public Module(String title){
        this.title = title;
        this.students = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void enrolStudent(Student s){
        if (!students.contains(s)){
            students.add(s);
        }
    }

    public void removeStudent(Student s){
        students.remove(s);
    }

    public ArrayList<Student>getStudentsOnModule(){
        return students;
    }
}

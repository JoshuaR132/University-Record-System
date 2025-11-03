import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Module>modulesTaken;

    public Student(String idNumber, String name){
        super(idNumber, name);

        this.modulesTaken = new ArrayList<>();
    }

    public void takesModule(Module m){
        if (!modulesTaken.contains(m)){
            modulesTaken.add(m);

            m.enrolStudent(this);
        }
    }

    public void dropModule(Module m){
        modulesTaken.remove(m);

        m.removeStudent(this);
    }

    public ArrayList<Module> getAllModulesTaken() {
        return modulesTaken;
    }
}

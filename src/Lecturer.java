import java.util.ArrayList;

public class Lecturer extends Person {
    private ArrayList<Module>modulesTaught;

    public Lecturer(String idNumber, String name){
        super(idNumber, name);

        this.modulesTaught = new ArrayList<>();
    }

    public void teachesModule(Module m){
        if (!modulesTaught.contains(m)){
            modulesTaught.add(m);

            m.setLecturer(this);
        }
    }

    public void dropModule(Module m){
        modulesTaught.remove(m);
        m.setLecturer(null);
    }

    public ArrayList<Module> getAllModulesTaught() {
        return modulesTaught;
    }
}

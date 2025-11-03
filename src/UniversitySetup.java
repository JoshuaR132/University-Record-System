import java.util.ArrayList;

public class UniversitySetup {
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public UniversitySetup() {
        lecturers = new ArrayList<>();
        modules = new ArrayList<>();
        students = new ArrayList<>();

        // Create Lecturers
        Lecturer kris = new Lecturer("1234", "Kris");
        Lecturer david = new Lecturer("3456", "David");
        Lecturer kaleem = new Lecturer("5678", "Kaleem");
        Lecturer darren = new Lecturer("7890", "Darren");

        lecturers.add(kris);
        lecturers.add(david);
        lecturers.add(kaleem);
        lecturers.add(darren);

        // Create Modules and assign Lecturers
        Module advProg = new Module("Advanced Programming");
        kris.teachesModule(advProg);

        Module algos = new Module("Algorithms and Data Structures");
        david.teachesModule(algos);

        Module prog = new Module("Programming");
        david.teachesModule(prog);

        Module entProg = new Module("Enterprise Programming");
        kaleem.teachesModule(entProg);

        Module sem = new Module("Software Engineering Methodologies");
        darren.teachesModule(sem);

        Module introMT = new Module("Introduction to Matthew-Taming");
        darren.teachesModule(introMT);

        modules.add(advProg);
        modules.add(algos);
        modules.add(prog);
        modules.add(entProg);
        modules.add(sem);
        modules.add(introMT);

        // Create Students and enroll them in Modules
        Student mohammed = new Student("251234", "Mohammed");
        mohammed.takesModule(prog);
        mohammed.takesModule(algos);

        Student james = new Student("252345", "James");
        james.takesModule(advProg);
        james.takesModule(prog);

        Student matthew = new Student("253456", "Matthew");
        matthew.takesModule(algos);
        matthew.takesModule(prog);

        Student indranath = new Student("254567", "Indranath");
        indranath.takesModule(sem);
        indranath.takesModule(entProg);

        Student connah = new Student("255678", "Connah");
        connah.takesModule(entProg);
        connah.takesModule(introMT);

        Student john = new Student("256789", "John");
        john.takesModule(introMT);
        john.takesModule(entProg);

        Student elaine = new Student("257890", "Elaine");
        elaine.takesModule(prog);
        elaine.takesModule(entProg);

        Student annabel = new Student("258901", "Annabel");
        annabel.takesModule(algos);
        annabel.takesModule(entProg);

        Student susan = new Student("259012", "Susan");
        susan.takesModule(introMT);
        susan.takesModule(advProg);

        students.add(mohammed);
        students.add(james);
        students.add(matthew);
        students.add(indranath);
        students.add(connah);
        students.add(john);
        students.add(elaine);
        students.add(annabel);
        students.add(susan);
    }

    // Optional: Add getters to access the lists
    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

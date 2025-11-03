
import java.util.ArrayList;

public class UniversityRecordSystem {
    private ArrayList<Student> allStudents = new ArrayList<>();
    private ArrayList<Lecturer> allLecturers = new ArrayList<>();
    private ArrayList<Module> allModules = new ArrayList<>();

    public UniversityRecordSystem() {
        // Lecturers
        Lecturer kris = new Lecturer("1234", "Kris");
        Lecturer david = new Lecturer("3456", "David");
        Lecturer kaleem = new Lecturer("5678", "Kaleem");
        Lecturer darren = new Lecturer("7890", "Darren");

        allLecturers.add(kris);
        allLecturers.add(david);
        allLecturers.add(kaleem);
        allLecturers.add(darren);

        // Modules
        Module advancedProgramming = new Module("Advanced Programming");
        Module algorithms = new Module("Algorithms and Data Structures");
        Module programming = new Module("Programming");
        Module enterprise = new Module("Enterprise Programming");
        Module softwareEng = new Module("Software Engineering Methodologies");
        Module introMatthew = new Module("Introduction to Matthew-Taming");

        allModules.add(advancedProgramming);
        allModules.add(algorithms);
        allModules.add(programming);
        allModules.add(enterprise);
        allModules.add(softwareEng);
        allModules.add(introMatthew);

        // Assign lecturers to modules
        kris.teachesModule(advancedProgramming);
        david.teachesModule(algorithms);
        david.teachesModule(programming);
        kaleem.teachesModule(enterprise);
        darren.teachesModule(softwareEng);
        darren.teachesModule(introMatthew);

        // Students
        Student mohammed = new Student("251234", "Mohammed");
        Student james = new Student("252345", "James");
        Student matthew = new Student("253456", "Matthew");
        Student indranath = new Student("254567", "Indranath");
        Student connah = new Student("255678", "Connah");
        Student john = new Student("256789", "John");
        Student elaine = new Student("257890", "Elaine");
        Student annabel = new Student("258901", "Annabel");
        Student susan = new Student("259012", "Susan");

        allStudents.add(mohammed);
        allStudents.add(james);
        allStudents.add(matthew);
        allStudents.add(indranath);
        allStudents.add(connah);
        allStudents.add(john);
        allStudents.add(elaine);
        allStudents.add(annabel);
        allStudents.add(susan);

        // Enroll students in modules
        mohammed.takesModule(programming);
        mohammed.takesModule(algorithms);

        james.takesModule(advancedProgramming);
        james.takesModule(programming);

        matthew.takesModule(algorithms);
        matthew.takesModule(programming);

        indranath.takesModule(softwareEng);
        indranath.takesModule(enterprise);

        connah.takesModule(enterprise);
        connah.takesModule(introMatthew);

        john.takesModule(introMatthew);
        john.takesModule(enterprise);

        elaine.takesModule(programming);
        elaine.takesModule(enterprise);

        annabel.takesModule(algorithms);
        annabel.takesModule(enterprise);

        susan.takesModule(introMatthew);
        susan.takesModule(advancedProgramming);
    }


    // 1. Print modules taken by John
    public void printModulesTakenByJohn() {
        for (Student s : allStudents) {
            if (s.getName().equalsIgnoreCase("John")) {
                System.out.println("Modules taken by John:");
                for (Module m : s.getAllModulesTaken()) {
                    System.out.println("- " + m.getTitle());
                }
            }
        }
    }

    // 2. Print students taught by Kris
    public void printStudentsTaughtByKris() {
        for (Lecturer l : allLecturers) {
            if (l.getName().equalsIgnoreCase("Kris")) {
                System.out.println("Students taught by Kris:");
                for (Module m : l.getAllModulesTaught()) {
                    for (Student s : m.getStudentsOnModule()) {
                        System.out.println("- " + s.getName() + " (ID: " + s.getIdNumber() + ")");
                    }
                }
            }
        }
    }

    // 3. Print modules taken by more than two students
    public void printPopularModules() {
        System.out.println("Modules taken by more than two students:");
        for (Module m : allModules) {
            if (m.getStudentsOnModule().size() > 2) {
                System.out.println("- " + m.getTitle());
            }
        }
    }

    // 4. Print students not taught by Kris or Darren
    public void printStudentsNotTaughtByKrisOrDarren() {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : allStudents) {
            boolean taughtByKrisOrDarren = false;
            for (Module m : s.getAllModulesTaken()) {
                Lecturer l = m.getLecturer();
                if (l != null && (l.getName().equalsIgnoreCase("Kris") || l.getName().equalsIgnoreCase("Darren"))) {
                    taughtByKrisOrDarren = true;
                    break;
                }
            }
            if (!taughtByKrisOrDarren) {
                result.add(s);
            }
        }

        System.out.println("Students not taught by Kris or Darren:");
        for (Student s : result) {
            System.out.println("- " + s.getName());
        }
    }

    // 5. Print the most popular module
    public void printMostPopularModule() {
        Module mostPopular = null;
        int maxCount = 0;

        for (Module m : allModules) {
            int count = m.getStudentsOnModule().size();
            if (count > maxCount) {
                maxCount = count;
                mostPopular = m;
            }
        }

        if (mostPopular != null) {
            System.out.println("Most popular module: " + mostPopular.getTitle() + " (" + maxCount + " students)");
        }
    }

    // Main method to test everything
    public static void main(String[] args) {
        UniversityRecordSystem system = new UniversityRecordSystem();
        system.printModulesTakenByJohn();
        system.printStudentsTaughtByKris();
        system.printPopularModules();
        system.printStudentsNotTaughtByKrisOrDarren();
        system.printMostPopularModule();
    }
}
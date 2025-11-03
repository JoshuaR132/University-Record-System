public class Main {
    public static void main(String[] args) {
        UniversitySetup setup = new UniversitySetup();

        for (Lecturer lecturer : setup.getLecturers()) {
            if (lecturer.getName().equals("David")) {
                System.out.println("Modules taught by David:");

                for (Module m : lecturer.getAllModulesTaught()) {
                    System.out.println("- " + m.getTitle());
                }
            }
        }
    }
}
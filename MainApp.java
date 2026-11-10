public class MainApp {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ahmad";
        student1.id = 2026001;
        student1.major = "Computer Engineering";

        Student student2 = new Student();
        student2.name = "Sara";
        student2.id = 2026002;
        student2.major = "Cybersecurity";
        Student student3 = new Student();
        student3.name = "mohammed laid ";
        student3.id = 1485167;
        student3.major = "Cybersecurity";

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        student1.major = "Artificial Intelligence";
        student1.displayInfo();
        student2.study();
    }

}

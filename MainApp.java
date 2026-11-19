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
        Student student31 = new Student();
        student31.name = "mohammed laid ";
        student31.id = 1485167;
        student31.major = "Cybersecurity";
        student1.name = "Ahmad";
        student1.id = 2026001;
        student1.major = "Computer Engineering";

        Student student21 = new Student();
        student21.name = "Sara";
        student21.id = 2026002;
        student21.major = "Cybersecurity";

       

        student1.displayInfo();
        student21.displayInfo();
        student31.displayInfo();

        student1.major = "Artificial Intelligence";
        student1.displayInfo();
        student21.study();
    }

}

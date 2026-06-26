//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {


        Student student = new Student(101, "Neer Malik", "A");


        StudentView view = new StudentView();


        StudentController controller =
                new StudentController(student, view);


        System.out.println("Initial Student Information:");
        controller.updateView();


        controller.setStudentName("Neer Kumar");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Information:");
        controller.updateView();
    }
}
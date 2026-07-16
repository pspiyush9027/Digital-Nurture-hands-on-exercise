public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rahul Sharma", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        System.out.println("Initial student details:");
        controller.updateView();

        System.out.println();
        System.out.println("After updating through controller:");

        controller.setStudentName("Rahul Verma");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}

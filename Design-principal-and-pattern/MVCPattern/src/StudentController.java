public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String newName) {
        model.setName(newName);
    }

    public void setStudentId(String newId) {
        model.setId(newId);
    }

    public void setStudentGrade(String newGrade) {
        model.setGrade(newGrade);
    }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}

import java.util.ArrayList;

public class School {
    private String schoolName;
    private int yearFounded;

    ArrayList<Student> students = new ArrayList<>();
    //int sizeStudents = 10;
    //Student[] estudiantes = new Student[sizeStudents];


    // ─────────────────────────────────────────────────────────────── GETTERS ─────

    public String getSchoolName() {
        return schoolName;
    }

    public int getYearFounded() {
        return yearFounded;
    }


    // ─────────────────────────────────────────────────────────────── SETTERS ─────

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;

    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }
}
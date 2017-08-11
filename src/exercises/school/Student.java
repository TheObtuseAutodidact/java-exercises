package exercises.school;

public class Student {

    private String name;
    private int  studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }
}

package entities;


public class Student extends Person
{

    private int CollegeID;
    private String StudyLevel;
    private String Email;
    private double GPA;
    private String Specialization;
    
    public Student(){}

    public void setCollegeID(int ID) {

        CollegeID = ID;
    }

    public int getCollegeID() {
        return CollegeID;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail() {

        return Email;
    }

    public void setStudyLevel(String StudyLevel) {

        this.StudyLevel = StudyLevel;
    }

    public String getStudyLevel() {
        return StudyLevel;
    }

    public void setGPA(double gpa) {
        
        GPA=gpa;
    }

    public double getGPA() {
        return GPA;
    }

    public void setSpecialization(String specialization) {
        this.Specialization = specialization;
    }

    public String getSpecialization() {
        return Specialization;
    }
}

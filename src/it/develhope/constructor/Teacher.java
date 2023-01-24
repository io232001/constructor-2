package it.develhope.constructor;

public class Teacher
{
    public String teacherName;
    public Teacher(String teacherName)
    {
        System.out.println("The teacher is created "+teacherName);
        this.teacherName=teacherName;
    }
    public void assignGrade(Student student, int finalGrade) {
        student.setGrade(finalGrade);
    }
}

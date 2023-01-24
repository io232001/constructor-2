package it.develhope.constructor;

public class Student
{
    public String name;
    public int grade;
    public Student(String name)
    {
        System.out.println("The create a new student "+name);
        this.name=name;
    }
    public void getStudentDetails()
    {
        System.out.println(name+"-"+grade);
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
}

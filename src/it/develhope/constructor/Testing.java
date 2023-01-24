package it.develhope.constructor;

public class Testing
{
    public static void main(String args[])
    {
        Student Student1, Student2;
        Student1=new Student("Marco");
        Student2=new Student("Edoardo");

        Teacher teacher1;
        teacher1=new Teacher("Paola");
        Student1.grade=4;
        Student2.grade=8;
        Student1.getStudentDetails();
        Student2.getStudentDetails();
    }
}

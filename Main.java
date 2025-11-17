class Student{
    private String name;
    private double marks;
    private int rollNo;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }
    public void setMarks(double marks)
    {
        this.marks=marks;
    }
    public double getMarks()
    {
        return marks;
    }
}
public class Main {
    public static void main(String args[])
    {
        Student s = new Student();
        s.setName("Payal");
        System.out.println(s.getName());
        s.setRollNo(21);
        System.out.println(s.getRollNo());
        s.setMarks(98.00);
        System.out.println(s.getMarks());
    }
    
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeIllegal {
        System.out.println("Enter the students details");
        Scanner s=new Scanner(System.in);
        int rollNo=s.nextInt();
        int age=s.nextInt();
        String name=s.next();
        String course=s.next();
        Student student=new Student(rollNo,age,name,course);
        try{
            student.validateName();
        } catch (NamenotValid e) {
            System.out.println(e.getMessage());
        }
        try {
            student.display();
        }
        catch (AgeIllegal e)
        {
            System.out.println(e.getMessage());
        }
    }
}
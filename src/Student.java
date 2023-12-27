import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    int rollNo;
    int age;
    String name;
    String course;
    Student(int rollNo,int age,String name,String course){
        this.age=age;
        this.rollNo=rollNo;
        this.course=course;
        this.name=name;
    }
    public void validateName() throws NamenotValid {
        Pattern p=Pattern.compile("[^aA-zZ]");
        Matcher match=p.matcher(name);
        boolean matchResult=match.find();
        if(matchResult)
        {
            throw new NamenotValid("Name is not valid");
        }
    }
    public  void display() throws AgeIllegal {
        if((this.age<=15) || (this.age>=21)) {

            throw new AgeIllegal("Age not within the range");
        }

        else{
            System.out.println("Student details are");
            System.out.println("RollNo: "+rollNo+" Age: "+age+" Name: "+name+" Course: "+course);
        }
    }
}

import java.util.Scanner;

class Voter{
    int voterid;
    int age;
    String name;
    Voter(int voterid,int age,String name) {
        this.age = age;
        this.name = name;
        this.voterid = voterid;
    }
        public void validate(int age) throws ArithmeticException {
        if(age<18) {

            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");

    }
    }


}
public class TestThrow1 {
      public static void main(String args[]){
          System.out.println("Enter the person details");
          Scanner scan=new Scanner(System.in);
          int voterId=scan.nextInt();
          int age=scan.nextInt();
          String name=scan.next();
          Voter v=new Voter(voterId,age,name);
          try {
              v.validate(13);
          }
          catch (Exception e){
              System.out.println(e.getMessage());
          }

    }
}

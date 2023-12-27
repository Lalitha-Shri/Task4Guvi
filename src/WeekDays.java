import java.util.Scanner;

public class WeekDays {
    public static void display(int position,String day) {
        if (position > 6) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println(day);
        }
    }


    public static void main(String[] a) throws ArrayIndexOutOfBoundsException {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the position of day in integer");
        try{
        int position = scan.nextInt();
        String day=weekDays[position];
            display(position,day);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter valid input");
        }
      //  System.out.println("hi");
    }
}
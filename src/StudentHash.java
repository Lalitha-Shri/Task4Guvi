import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHash {
    public static void add(String name, Integer grade, Map map)
    {
       map.put(name,grade);
    }
    public  static void remove(String name,Map map)
    {
        map.remove(name);
    }
    public  static  void display(Map map)
    {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
    public  static  void main(String[] a) {
        Map<String, Integer> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total Student to be added");
        int n=s.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter Student "+(i+1)+" name and grade");
            String name = s.next();
            Integer grade = s.nextInt();
            add(name, grade, map);

        }
        display(map);
        System.out.println("Enter the Student name to be removed");
        String name=s.next();
        remove(name,map);
        System.out.println("After removing");
        display(map);


    }
}

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void stack_push(Stack<Integer> stack,Integer n)
    {
        stack.push(n);
    }
    public static void stack_pop(Stack<Integer> stack)
    {
        if(!stack.isEmpty()){
        System.out.println("Pop operation");
        Integer i= stack.pop();
        System.out.println(i+" is popped from stack");}
        else{
            System.out.println("Stack is empty");
        }
    }
    public  static void isEmpty1(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
    public static void main(String[] a)
    {
        Stack<Integer> stack=new Stack<>();
        System.out.println("Enter the total integer to be pushed");
        Scanner scan=new Scanner(System.in);
        int tot=scan.nextInt();
        System.out.println("Enter the "+tot+" elements to be pushed in...");
        for(int i=1;i<=tot;i++) {
            Integer n = scan.nextInt();
            stack_push(stack, n);
        }
        System.out.println("elements in stack is"+stack);
        stack_pop(stack);
        isEmpty1(stack);

    }
}

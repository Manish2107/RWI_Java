import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("First Number: "+a);
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("Second Number: "+b);
        System.out.println("What to do");
        System.out.println("Press 1 to Add");
        System.out.println("Press 2 to Subtract");
        System.out.println("Press 3 to Multiply");
        System.out.println("Press 4 to Division");
        System.out.println("Press 5 to Modulus");
        int result=sc.nextInt();

        switch(result){
            case 1: result = a + b;
                System.out.println("Result: "+result);
                break;
            case 2: result=a-b;
                System.out.println("Result: "+result);
                break;
            case 3: result=a*b;
                System.out.println("Result: "+result);
                break;
            case 4: if(b==0)
                System.out.println("Invalid Division");
            else
                System.out.println("Result: "+(a/b));
                break;
            case 5: if(b==0)
                System.out.println("Invalid Modulus");
            else
                System.out.println("Result: "+(a%b));
                break;
            default:
                System.out.println("ERROR !!! please enter correct option");
        }

    }
}

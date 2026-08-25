
import java.util.*;


public class java3 {
    Scanner sc=new Scanner(System.in);
    void meth1()
    {
        System.out.println("Enter the value of no1:-");
        int no1=sc.nextInt();
        System.out.println("Enter the value of no2:-");
        int no2=sc.nextInt();
        int a=no1+no2;
        System.out.println("Addition of no1 and no2 is "+a);
    }
    public static void main(String[] args) {
        System.err.println("Hello Kunal!!!!");
        System.out.println("Once again we are writing a java code for creating pipeline");
        new java3().meth1();
    }
    
}

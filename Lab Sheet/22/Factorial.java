// WAP to find factorial of a number.
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt(),fact=1;
        for(int i=1;i<=num;i++)
            fact*=i;
        System.out.println("Factorial of "+num+" is "+fact);
    }    
}
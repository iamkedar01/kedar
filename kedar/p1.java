import java.util.Scanner;
class p1 {
    public static void main (String[] args ){
        Scanner scanner =new Scanner (System.in);
        int num1,num2,sum;
        System.out.print("Enter the First number:");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        num2 = scanner.nextInt();
        sum = num1 + num2 ;
        System.out.print("The sum of two number is:"+sum);

    }
}
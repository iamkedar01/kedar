import java.util.Scanner;
class p2 
{
    public static void main(String[] args){
        Scanner k= new Scanner (System.in);
         Double num1,num2,result;
        System.out.print("Enter the Frist Number:");
        num1 = k.nextDouble();
        System.out.print("Enter the Second number:");
        num2 = k.nextDouble();
        result = num1 * num2;
        System.out.print("The multification of two number is:"+ result);

    }
}
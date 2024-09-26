import java.util.Scanner;
// import java.util."*";
public class p3
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1,num2,result;
        char opertion;
        System.out.print("Enter the First number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter the Second Number:");
        num2 = scanner.nextDouble();
        System.out.print("Choose the opertion (+,-,*,/):");
        opertion = scanner.next().charAt(0);
        switch (opertion)
        {
            case '+' : result = num1 + num2;
                      break; 
            case '-' : result = num1 - num2;
                      break;
            case '*' : result = num1 * num2;
                      break;
            case '/' : result = num1 / num2; 
                      break;
            default:
                    System.out.println("Choose the correct opertion...!");
                    return;
         }
    System.out.print("The result of is:" + result);
}
}

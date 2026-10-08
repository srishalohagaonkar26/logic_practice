import java.util.*;

class LB6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int iAge = sobj.nextInt();

        System.out.println("Enter your montly income : ");
        int iMontlyIncome = sobj.nextInt();

        System.out.println("Enter your credit score : ");
        int iCreditScore = sobj.nextInt();

        if (iAge >= 21 && iAge <= 60)
        {
            System.out.println("First step of loan approved");
        }
        else if(iMontlyIncome >= 25000)
        {
            System.out.println("Second step of loan approved");
        }
        else if (iCreditScore >= 700) 
        {
            System.out.println("Third step of loan approved");
        }
        else 
        {
            boolean unpaidloan = false;

            if (unpaidloan == true) 
            {
                System.out.println("Fourth step of loan approved"); 
                System.out.println("Your are eligible for a loan"); 
                System.out.println("Loan is approved");  
            }
            else
            {
                System.out.println("Loan is rejected as you are not eligible for loan");
            }
        }
    }
}
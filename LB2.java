import java.util.*;

class LB2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter current balance : ");
        int balance = sobj.nextInt();

        System.out.println("Enter withdrawal amount : ");
        int withdrawAmount = sobj.nextInt();

        if (balance < 0 || withdrawAmount <= 0)
        {
            System.out.println("Invalid input");
        }
        else if (withdrawAmount % 100 != 0)
        {
            System.out.println("Transaction Failed: Amount must be a multiple of 100");
        }
        else if (withdrawAmount > 25000)
        {
            System.out.println("Transaction Failed: Cannot withdraw more than 25000 per transaction");
        }
        else if (balance - withdrawAmount < 1000)
        {
            System.out.println("Transaction Failed: Balance cannot go below 1000");
        }
        else
        {
            int newBalance = balance - withdrawAmount;
            System.out.println("Transaction Successful. Remaining Balance : " + newBalance);
        }
    }
}
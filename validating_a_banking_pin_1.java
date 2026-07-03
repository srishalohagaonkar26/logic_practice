import java.util.*;

class BankingPin
{
    boolean checkPin(int iValue)
    {
        if (iValue < 1000 || iValue > 9999) 
        {
            return false;    
        }
        else
        {
            return true;
        }
    }
}

public class validating_a_banking_pin_1
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the PIN..");
        iValue = sobj.nextInt();

        BankingPin bobj = new BankingPin();
        boolean result = bobj.checkPin(iValue); //forgot to write this line

        if (result == true) 
        {
            System.out.println("Valid PIN ");    
        }
        else
        {
            System.out.println("Invalid PIN ");
        }
    }
}
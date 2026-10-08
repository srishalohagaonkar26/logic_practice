import java.util.*;

class DigitalLock
{
    boolean EvenNumber(int iValue)
    {
        if (iValue % 2 == 0) 
        {
            return true;    
        }
        else
        {
            return false;
        }
    }
}

public class digital_lock_2
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the PIN..");
        iValue = sobj.nextInt();

        DigitalLock dobj = new DigitalLock();
        boolean result = dobj.EvenNumber(iValue); //forgot to write this line

        if (result == true) 
        {
            System.out.println("Access Granted ");    
        }
        else
        {
            System.out.println("Access Denied ");
        }
    }
}
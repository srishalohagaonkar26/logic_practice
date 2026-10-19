import java.util.*;

class problem9
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigitCount = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            System.out.println("Rejected");
            return;    
        }

        while (iNo > 0) 
        {
            iDigitCount++;
            iNo = iNo / 10;
        }
        if (iDigitCount > 5) 
        {
            System.out.println("Accepted");    
        }
        else
        {
        System.out.println("Rejected");
        }
    }
}
import java.util.*;

class problem15
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0;
        int iDigit = 0;
        int iFirst = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            System.out.println("Not valid");    
            return;
        }

        iFirst = iNo % 10;  //  saves the last digit of number before loop starts

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if (iDigit != iFirst) 
            {
                System.out.println("Not valid");
                return;
            }
            iNo = iNo / 10;    
        }
        System.out.println("Valid");
    }
}
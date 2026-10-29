import java.util.*;

class problem13
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iCount = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            iNo = -iNo;    
        }
        if (iNo == 0) 
        {
            iCount = 1;    
        }

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if (iDigit == 0) 
            {
                iCount++;    
            }
            iNo = iNo / 10;    
        }
        System.out.println("Count of Zero digits : "+iCount);
    }
}
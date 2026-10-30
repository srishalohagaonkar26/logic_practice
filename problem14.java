import java.util.*;

class problem14
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0;
        int iDigit = 0;
        int iMax = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            iNo = -iNo;    
        }
        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if (iDigit > iMax) 
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;    
        }
  
        System.out.println("Largest no is : "+iMax);
    }
}
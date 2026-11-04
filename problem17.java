import java.util.*;

class problem16
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if (iNo < 0) 
        {
            iNo = -iNo;
        }

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if (iDigit % 2 != 0) 
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;    
        }
        System.out.println("Sum of Odd digits : "+iSum);    
    }
}
import java.util.*;

class problem18
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iProduct = 1;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iNo = Math.abs(iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if (iDigit % 2 != 0) 
            {
                iProduct = iProduct * iDigit;     
            }
            iNo = iNo / 10;
        }

        if (iDigit % 2 == 0) 
        {
            iProduct = 0;    
        }

        System.out.println("Product of Odd Digits : "+iProduct);
    }
}
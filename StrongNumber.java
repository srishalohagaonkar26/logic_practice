import java.util.Scanner;

public class StrongNumber
{
    StrongNumber(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo > 0)
        {
            iDigit = iDigit % iNo;
            
            int iFact = 0;
            for(int j = iDigit; j >= 1; j--)
            {
                iFact = iFact * j;
            }

            iSum = iSum + iFact;
            iDigit = iDigit / 10;
        }
    }
}

class LB17
{
    public static void main(String A[])
    {
        int no = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        no = sobj.nextInt();

        StrongNumber(no);
    }
}
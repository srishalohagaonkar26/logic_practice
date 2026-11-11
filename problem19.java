import java.util.*;

//  Perfect number checker

class problem19
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iSum = 0;
        int iCount = 1;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iNo = Math.abs(iNo);

        while(iCount <= (iNo / 2))
        {   
            if ((iNo % iCount) == 0) 
            {
                iSum = iSum + iCount;
            }
            iCount++;
        }

        if (iSum == iNo) 
        {
            System.out.println("It is a perfect no");
        }
        else
        {
            System.out.println("It is not a perfect no");

        }
    }
}
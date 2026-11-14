import java.util.*;

// Zero replacement processor
class problem20
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iResult = 0;
        int iPlace = 1;
        boolean bNegative = false;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        if(iNo == 0)
        {
            System.out.println("Modified number is : 1");
            return;
        }

        if(iNo < 0)
        {
            bNegative = true;
        }

        iNo = Math.abs(iNo);

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            iResult = iResult + (iDigit * iPlace);
            iPlace = iPlace * 10;
            iNo = iNo / 10;
        }

        if(bNegative == true)
        {
            iResult = -iResult;
        }

        System.out.println("Modified number is : " + iResult);
    }
}
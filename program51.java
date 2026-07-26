import java.util.Scanner;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum > iNo)
        {
            break;
        }
        if(iSum == iNo)
        {
            return true;
        }
        
    }
}

class program51
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        boolean iRet = nobj.CheckPerfect(iValue);
        System.out.println("Summation of factors :" + iRet);
    }
}
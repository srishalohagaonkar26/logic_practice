import java.util.*;

class problem11
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iReverse = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        while (iNo > 0 || iNo < 0) 
        {
            iDigit = iNo % 10;
            iReverse = (iReverse * 10) + iDigit;    //  actual logic to reverse the number
            iNo = iNo / 10;    
        }
        System.out.println(iDigit);
    }
}

/*
!   DRY RUN FOR REVERSE

    iNo=1234 → digit=4, iReverse = 0*10+4 = 4, iNo=123
    iNo=123 → digit=3, iReverse = 4*10+3 = 43, iNo=12
    iNo=12 → digit=2, iReverse = 43*10+2 = 432, iNo=1
    iNo=1 → digit=1, iReverse = 432*10+1 = 4321, iNo=0 → loop ends
*/
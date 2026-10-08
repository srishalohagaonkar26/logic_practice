import java.util.*;

class LB6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total parking hours : ");
        int iNo = sobj.nextInt();

        if (iNo < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int fee = 0;

            if (iNo <= 2)
            {
                fee = 20;
            }
            else
            {
                fee = 20 + (iNo - 2) * 10;
            }

            if (iNo > 10)
            {
                fee = fee + 50;
            }

            System.out.println("Total Parking Duration : " + iNo + " hours");
            System.out.println("Total Parking Fee : " + fee);
        }
    }
}
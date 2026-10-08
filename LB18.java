import java.util.*;

class LB16
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iTime = 0;
        int iData = 0;
        int iSMS = 0;

        System.out.println("Enter the time in mins : ");
        iTime = sobj.nextInt();

        System.out.println("Enter the data in GB : ");
        iData = sobj.nextInt();

        System.out.println("Enter the SMS count : ");
        iSMS = sobj.nextInt();

        if (iTime >= 500 && iTime <= 600 && iData <= 2 && iSMS <= 100)
        {
            if(iTime > 600)
            {
                System.out.println("cheapest plan is planA");

                
            }
        }
        else if(iTime == 1000 )
    }
}
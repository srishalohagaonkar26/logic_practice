import java.util.Scanner;

class LB11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iTotal = 0;
        int Distance = 0;
        int Distgrettenhrs = 0;
        String Distgretten = "";
        String PeakHour = "";

        System.out.println("Enter the distance : ");
        Distance = sobj.nextInt();

        if (Distance <= 10) 
        {
            iTotal = 50 + (12 * Distance);
        }
        else
        {
            System.out.println("Are you going to ride more than 10 hrs ??");
            Distgretten = sobj.nextLine();
            System.out.println("For how many hours ?? ");
            Distgrettenhrs = sobj.nextInt();

            if (Distgretten.equalsIgnoreCase("Yes")) 
            {
                iTotal = 50 + (15 * Distgrettenhrs);    
            }
        }

        System.out.println("Do you want peak hours ??");
        PeakHour = sobj.nextLine();

        if (PeakHour.equalsIgnoreCase("Yes")) 
        {
            iTotal = 60 + (15 * Distgrettenhrs);    
        }
        else
        {
            return;
        }

        System.out.println("Total fare is : "+iTotal);
    }
}
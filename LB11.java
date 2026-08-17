import java.util.Scanner;

//  compare the code from comment and actual code written
//  comment vala code is written by me and the other is written by claude i just want to compare it to undertsand my logic where i was wrong
/*
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
*/

import java.util.Scanner;

class LB11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iTotal = 0;
        int Distance = 0;
        String PeakHour = "";

        System.out.println("Enter the distance : ");
        Distance = sobj.nextInt();
        sobj.nextLine();   // consume leftover newline

        if (Distance < 0)
        {
            System.out.println("Distance cannot be negative");
            return;
        }

        if (Distance <= 10)
        {
            iTotal = 50 + (12 * Distance);
        }
        else
        {
            iTotal = 50 + (12 * 10) + (15 * (Distance - 10));
        }

        System.out.println("Do you want peak hours ??");
        PeakHour = sobj.nextLine();

        if (PeakHour.equalsIgnoreCase("Yes"))
        {
            iTotal = iTotal + (iTotal * 20 / 100);
        }

        System.out.println("Distance: " + Distance + " km");
        System.out.println("Peak Hour: " + PeakHour);
        System.out.println("Total Fare: Rs" + iTotal);
    }
}
import java.util.*;

class LB16
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iDist = 0;
        String ClassType = "";
        String SeniorCitizen = "";
        int iBookingHoursBefore = 0;
        int iAge = 0;
        int itatkal = 0;

        System.out.println("Enter the distance : ");
        iDist = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter the class type : ");
        ClassType = sobj.nextLine();

        System.out.println("Enter the Booking Hours Before : ");
        iBookingHoursBefore = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter your senior citizen status (Yes/No) : ");
        SeniorCitizen = sobj.nextLine();

        System.out.println("Enter your age : ");
        iAge = sobj.nextInt();
    
        int iFinalFare = 500;

        if ((ClassType.equalsIgnoreCase("Sleeper")) || (ClassType.equalsIgnoreCase("3AC")) || (ClassType.equalsIgnoreCase("2AC"))) 
        {
            iFinalFare = iFinalFare + 2000;    
        }

        if(iBookingHoursBefore <= 24)
        {
            iFinalFare = iFinalFare + (iFinalFare * 30) / 100;
        }

        if (SeniorCitizen.equalsIgnoreCase("Yes")) 
        {
            iFinalFare = iFinalFare - (iFinalFare * 40) / 100;    
        }
        
        System.out.println("Your Final Fare is : "+iFinalFare);
    }
}
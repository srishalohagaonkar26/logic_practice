import java.util.Scanner;

class LB9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iTotal = 0;

        String helmet = '\0';
        System.out.println("Is your helmet worn ??");
        helmet = sobj.nextLine();

        String license = '\0';
        System.out.println("Is your license available ??");
        license = sobj.nextLine();

        String OverSpeeding = '\0';
        System.out.println("Are you overspeeding ??");
        OverSpeeding = sobj.nextLine();
    
        if (helmet.equalsIgnoreCase("No")) 
        {
            System.out.println("Your fine is of rupees 500/-"); 
            iTotal = iTotal + 500;   
        }
        if(license.equalsIgnoreCase("No"))
        {
            System.out.println("Your fine is of rupees 1000");
            iTotal = iTotal + 1000;
        }
        if(OverSpeeding.equalsIgnoreCase("Yes"))
        {
            System.out.println("Your fine is of rupees 1500");
            iTotal = iTotal + 1500;
        }

        System.out.println("Your total fine amount will be : "+iTotal);
    }
}
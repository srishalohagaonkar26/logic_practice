import java.util.*;

class LB20
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iDay = 0;
        String iRetain = "";
        int iAmount = 0;

        System.out.println("Enter the no of days stayed : ");
        iDay = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Are you a retain customer (Yes / No) : ");
        iRetain = sobj.nextLine();

        iAmount = iDay * 3000;

        if (iDay > 7 && iRetain.equalsIgnoreCase("Yes")) 
        {
            iAmount = iAmount - (iAmount * 15) / 100;  
            System.out.println("Final AMount is : "+iAmount);

            if (iDay > 7) 
            {
                iAmount = iAmount - (iAmount * 5) / 100;    
                System.out.println("TOtal Bill Amount is : "+iAmount);
            }
            else
            {
                System.out.println("Total Bill Amount is : "+iAmount);
            }


        }
        else
        {
            System.out.println("Final AMount is : "+iAmount);
        }
    }
}
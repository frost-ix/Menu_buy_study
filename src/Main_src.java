import java.util.Scanner;

public class Main_src
{
    static Scanner input_sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        introduceProgram();
        System.out.println("<Menu input>");
        Menu_control.inputMenu();

        // Guset_data Object >> Name & Coast
        System.out.println("<Input Guest Data>");
        Guest guest_data = new Guest(input_sc.nextLine(), input_sc.nextInt());
        // Push empty string
        input_sc.nextLine();
        Menu_control.getAllMenu();
        while (true)
        {
            // Select string is choose buy or out.
            // When other string is incoming, Retry input string
            System.out.print("Select module >> "); String select = input_sc.nextLine();
            if (select.equals("buy"))
            {
                System.out.println("Now wallet coast : "+guest_data.getGuest_wallet_coast());
                guest_data.setGuest_wallet_coast(Menu_control.calCoast(guest_data.getGuest_wallet_coast()));
                System.out.println("After wallet coast : "+guest_data.getGuest_wallet_coast());
            }
            else if(select.equals("out"))
            {
                System.out.println("Out this market");
                System.exit(0);
            }
            else
            {
                System.out.println("No command this program, retry");
            }
        }
    }
    public static void introduceProgram()
    {
        System.out.println("Anything Menu input if you want");
        System.out.println();
        System.out.println("If geust entry >> ");
        System.out.println("1. buy menu  | 2.  no show");
        System.out.println("out command is same");
        System.out.println();
    }
}
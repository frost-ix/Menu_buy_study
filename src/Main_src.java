import java.util.Scanner;

public class Main_src
{
    static Scanner input_sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        introduceProgram();
        System.out.println("<Menu input>");
        Menu_control.inputMenu();

        Guest guest_data = new Guest();

        // Guset_data Object >> Name & Coast
        System.out.println("<Input Guest Data>");
        System.out.print("Guest Name : "); guest_data = new Guest(input_sc.next());
        System.out.print("Guest Wallet Coast : "); guest_data = new Guest(guest_data.getGuset_name(), input_sc.nextInt());
        input_sc.nextLine();
        
        // Push empty string
        Menu_control.getAllMenu();
        while (true)
        {
            if (guest_data.getGuest_wallet_coast()!=0)
            {
                // Select string is choose buy or out.
                // When other string is incoming, Retry input string
                System.out.print("Select module >> "); String select = input_sc.nextLine();
                if (select.equals("buy"))
                {
                    System.out.println("Now wallet coast : "+guest_data.getGuest_wallet_coast());
                    guest_data.setGuestWalletCoast(Menu_control.calCoast(guest_data.getGuest_wallet_coast()));
                    System.out.println("After wallet coast : "+guest_data.getGuest_wallet_coast());
                }
                else if(select.equals("out"))
                {
                    System.out.println("Out this market");
                    System.exit(0);
                }
                else if(select.equals("re"))
                {
                    Main_src.main(args);
                }
                else
                {
                    System.out.println("No command this program, retry");
                }
            }
            else
            {
                System.out.println("GUEST : NO COAST IN WALLET");
                System.out.println("Out this market");
                System.exit(0);
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
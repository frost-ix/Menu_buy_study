import java.util.Scanner;

public class Menu_control
{
	static Scanner input_sc = new Scanner(System.in);

	static MenuOBJ menu_in[];
	static int menu_count;

	public static void setMenuArrayCount()
	{
		int value = input_sc.nextInt();
		menu_count = value;
	}

	public static void inputMenu()
	{
		System.out.print("Set menu count >> "); setMenuArrayCount();
		menu_in = new MenuOBJ[Menu_control.menu_count];
		for (int i = 0; i < menu_in.length; i++)
		{
			System.out.print("Input Menu name >> "); String input_name = input_sc.next();
			System.out.print("Input Menu value >> "); int input_value = input_sc.nextInt();
			menu_in[i] = new MenuOBJ(input_name, input_value);
		}
	}
	public static void getAllMenu()
	{
		System.out.println("Number | Menu      | Coast");
		for (int i = 0; i < menu_in.length; i++)
		{
			System.out.print(i+"       "+menu_in[i].getMenuName()+"        "+menu_in[i].getMenuValue());
		}
		System.out.println();
	}
	public static int calCoast(int wallet_coast)
	{
		System.out.print("Choose menu >> "); int choose_menu = input_sc.nextInt();
		int result = wallet_coast - menu_in[choose_menu].getMenuValue();
		return result;
	}
}

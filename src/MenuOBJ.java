class MenuOBJ
{
	public String name;
	public int menu_value;
	public MenuOBJ()
	{
		this("not set",0);
	}
	public MenuOBJ(String _name, int _value)
	{
		this.name = _name;
		this.menu_value = _value;
	}
	public String getMenuName()
	{
		return this.name;
	}
	public int getMenuValue()
	{
		return this.menu_value;
	}
}
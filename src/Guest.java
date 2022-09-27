class Guest
{
	private String guest_name;
	private int guest_wallet_coast;
	
	public Guest(String _name, int wallet_coast)
	{
		this.guest_name = _name;
		this.guest_wallet_coast = wallet_coast;
	}
	public String getGuset_name()
	{
		return this.guest_name;
	}
	public int getGuest_wallet_coast()
	{
		return this.guest_wallet_coast;
	}
	public void setGuest_wallet_coast(int coast)
	{
		this.guest_wallet_coast = coast;
	}
}
class Guest
{
	private String guest_name;
	private int guest_wallet_coast;

	public Guest()
	{
		this("no guest", 0);
	}
	public Guest(String _name)
	{
		this.guest_name = _name; this.guest_wallet_coast = 0;
	}
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
	public void setGuestName(String _name)
	{
		this.guest_name = _name;
	}
	public void setGuestWalletCoast(int coast)
	{
		this.guest_wallet_coast = coast;
	}
}
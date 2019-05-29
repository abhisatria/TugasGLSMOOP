package karakter;

import interfaces.*;

public class Driver extends BaseCharacter implements IDriver{

	public Driver() {
		// TODO Auto-generated constructor stub
		name = "Driver";
		description = "Seseorang yang bisa menyetir";
		id="1";
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name +" menyetir");
		
	}


}

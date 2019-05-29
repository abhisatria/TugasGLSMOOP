package karakter;

import interfaces.IArtist;
import interfaces.IDriver;

public class Artist  extends BaseCharacter implements IArtist,IDriver{

	public Artist() {
		// TODO Auto-generated constructor stub
		name = "Artist";
		description = "seseorang yang bisa melukis dan menyetir";
		id="4";
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name +" menyetir");
		
	}

	@Override
	public void Paint() {
		System.out.println(name +" melukis");
		
	}
	

}

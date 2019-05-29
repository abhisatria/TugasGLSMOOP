package karakter;

import interfaces.IArtist;
import interfaces.IChef;
import interfaces.IDriver;
import interfaces.IWorker;

public class Master extends BaseCharacter implements IWorker,IArtist,IDriver,IChef {

	public Master() {
		// TODO Auto-generated constructor stub
		name = "Master";
		description = "Seseorang yang bisa bekerja,melukis,menyetir, dan memasak";
		id="3";
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name +" memasak");
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name +" menyetir");
		
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name +" melukis");
		
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name +" bekerja");
		
	}

}

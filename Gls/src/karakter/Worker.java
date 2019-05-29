package karakter;

import interfaces.IDriver;
import interfaces.IWorker;

public class Worker extends BaseCharacter implements IWorker,IDriver {

	public Worker() {
		// TODO Auto-generated constructor stub
		name = "Worker";
		description = "seseorang yang bisa bekerja dan menyetir";
		id="5";
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name +" menyetir");
		
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name +" bekerja");
		
	}

}

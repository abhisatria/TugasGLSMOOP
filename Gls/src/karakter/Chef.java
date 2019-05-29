package karakter;

import interfaces.IChef;

public class Chef extends BaseCharacter implements IChef {

	public Chef() {
		// TODO Auto-generated constructor stub
		name = "Chef";
		description = "Seseorang yang ahli memasak";
		id="0";
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name +" memasak");
	}

	

}

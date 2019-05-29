import java.util.ArrayList;
import java.util.Scanner;

import interfaces.*;
import karakter.*;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<BaseCharacter>  listOrang = new ArrayList<>();
	
	public Main() {
		listOrang.add(new Chef());
		listOrang.add(new Driver());
		listOrang.add(new Child());
		listOrang.add(new Artist());
		listOrang.add(new Master());
		listOrang.add(new Worker());
	
		
		String input;
		do
		{
			clrscr();
			menu();
			input=scan.nextLine();
			if(input.equalsIgnoreCase("Exit")|| input.equals("6")) return;
			String[] temp = input.split(" ");
			String[] id = temp[1].split(",");
			
			for(int i=0;i<id.length;i++)
			{
				if(temp[0].equalsIgnoreCase("Info"))
				{
					listOrang.get(i).getInfo();
				}
				else if(temp[0].equalsIgnoreCase("Cook")) 
				{
					if(listOrang.get(i) instanceof IChef) {
						((IChef)listOrang.get(i)).Cook();
					}
					else System.out.println("Karakter tidak bisa melakukan aksi");
				}
				else if(temp[0].equalsIgnoreCase("Drive")) 
				{
					if(listOrang.get(i) instanceof IDriver) {
						((IDriver)listOrang.get(i)).Drive();
					}
					else System.out.println("Karakter tidak bisa melakukan aksi");
				}
				else if(temp[0].equalsIgnoreCase("Work")) 
				{
					if(listOrang.get(i) instanceof IWorker) {
						((IWorker)listOrang.get(i)).Work();
					}
					else System.out.println("Karakter tidak bisa melakukan aksi");
				}
				else if(temp[0].equalsIgnoreCase("Paint")) 
				{
					if(listOrang.get(i) instanceof IArtist) {
						((IArtist)listOrang.get(i)).Paint();
					}
					else System.out.println("Karakter tidak bisa melakukan aksi");
				}
			}
			scan.nextLine();
		}while(input.equalsIgnoreCase("Exit"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	private void clrscr(){
		for(int i=0;i<45;i++)
		{
			System.out.println();
		}
	}
	public void menu()
	{
		System.out.println("Simulasi kelompok kemampuan");
		System.out.println("0:Chef");
		System.out.println("1:Driver");
		System.out.println("2:Child");
		System.out.println("3:Artist");
		System.out.println("4:Master");
		System.out.println("5:Worker");
		System.out.println("6.Exit");
		System.out.println("Input: ");
	}

}

import java.io.*;
		import java.util.*;
		import java.text.*; 
public class Tester {
	public static void main(String[] args) {
				NumberFormat formatter = NumberFormat.getNumberInstance();
				formatter.setMinimumFractionDigits(2);
				formatter.setMaximumFractionDigits(2);
				String name;
				List<Store>aryList = new ArrayList<Store>();
			do{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Enter the name the customer or Exit to compare: ");
			name = kbReader.nextLine();
				if(!name.equalsIgnoreCase("EXIT")){
					System.out.print("Enter final subtotal.");
					Double amount = kbReader.nextDouble();
					System.out.println(" ");
					Store nalpha = new Store(name, amount);
					aryList.add(nalpha);}} 
			while(!name.equalsIgnoreCase("EXIT"));
		Store ba = aryList.get(0);
		double maxspent = ba.spent;
		String maxName = ba.name;
		for(int j = 1; j < aryList.size(); j++){
			Store a = aryList.get(j);
			if(maxspent < a.spent){
				maxspent = a.spent;
				ba = a;
				maxName = ba.name;}}
		System.out.println("The best customer today was: " + maxName);}}
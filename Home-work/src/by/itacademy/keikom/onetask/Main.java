package by.itacademy.keikom.onetask;

import java.util.Scanner;

import by.itacademy.keikom.onetask.distance.Carat;
import by.itacademy.keikom.onetask.distance.Grams;
import by.itacademy.keikom.onetask.distance.Kilogram;
import by.itacademy.keikom.onetask.distance.Pound;
import by.itacademy.keikom.onetask.weight.Ft;
import by.itacademy.keikom.onetask.weight.Meter;
import by.itacademy.keikom.onetask.weight.Mile;
import by.itacademy.keikom.onetask.weight.Yard;

public class Main {

	public static void main(String args[]) throws ExeptionInput {

		Scanner sc = new Scanner(System.in);

		DistanceAndWeight DistanceAndWeight = null;
		SetData setData = null;
		Integer choice = null;

		System.out.println("Выберите что переводить");
		System.out.println(">[1] масса ");
		System.out.println(">[2] растояние ");
		System.out.print(">  ");
		Integer coice_1 = sc.nextInt();
		
		if (coice_1 != 1 || coice_1 != 2) {
			throw new ExeptionInput();
		}

		if (coice_1 == 1) {
			setData = new SetData("килограмм", "грамм", "фунт", "карат");
			choice = setData.setChoice();

			if (choice == 1)
				DistanceAndWeight = new Kilogram(setData.getCount());
			if (choice == 2)
				DistanceAndWeight = new Grams(setData.getCount());
			if (choice == 3)
				DistanceAndWeight = new Pound(setData.getCount());
			if (choice == 4)
				DistanceAndWeight = new Carat(setData.getCount());
		}

		if (coice_1 == 2) {
			setData = new SetData("метр", "миля", "ярд", "фут");
			choice = setData.setChoice();

			if (choice == 1)
				DistanceAndWeight = new Meter(setData.getCount());
			if (choice == 2)
				DistanceAndWeight = new Mile(setData.getCount());
			if (choice == 3)
				DistanceAndWeight = new Yard(setData.getCount());
			if (choice == 4)
				DistanceAndWeight = new Ft(setData.getCount());
		}

		DistanceAndWeight.execute();

	}

}

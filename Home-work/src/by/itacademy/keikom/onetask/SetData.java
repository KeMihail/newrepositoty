package by.itacademy.keikom.onetask;

import java.util.Scanner;

public class SetData {
	Scanner sc = new Scanner(System.in);
	String arg_1;
	String arg_2;
	String arg_3;
	String arg_4;

	public SetData(String arg_1, String arg_2, String arg_3, String arg_4) {

		this.arg_1 = arg_1;
		this.arg_2 = arg_2;
		this.arg_3 = arg_3;
		this.arg_4 = arg_4;
	}

	public Integer setChoice() {
		Integer choice = null;
		boolean error = true;
		
		do {
				System.out.println("Выберите еденицу измерения: ");
				System.out.println(">[1]" +  arg_1);
				System.out.println(">[2]" + arg_2);
				System.out.println(">[3]" + arg_3);
				System.out.println(">[4]" +  arg_4);
				System.out.print(": ");
				choice = sc.nextInt();
			
				if (choice < 1 || choice > 4) {
					System.out.println("Ошибка ввода !!! Повторите, пожалуйста.\n");
				}
				
				else {
					error = false;
				}
			} 
		
		while(error);
		
		return choice;
	}

	public Double getCount() {

		System.out.print("Введите число: ");
		Double number = sc.nextDouble();
		return number;
	}
}

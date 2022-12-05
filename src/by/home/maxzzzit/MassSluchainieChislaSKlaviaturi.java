package by.home.maxzzzit;

import java.util.Scanner;

// Класс заполняющий массив случайными числами и выводящего на экран значения ячеек массива.
// При этом размер массива устанавливается гибко, то есть, вводится с клавиатуры!
public class MassSluchainieChislaSKlaviaturi {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int klava, rand;
		System.out.println("Введите размер массива:");
		klava = scn.nextInt();
		System.out.println("Массив: ");
		int [] massiv = new int[klava];
		for (int i=0; i<klava; i++) {
			massiv[i] = (int)(Math.random()*1000);
			System.out.print(massiv[i]+" ");
		}
	}
}

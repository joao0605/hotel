package application;

import java.util.Scanner;

import entities.Booking;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Booking[] vect = new Booking[10];

		int n;

		System.out.print("How many rooms will be rented?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("What's the name? ");
			String name = sc.nextLine();
			System.out.print("Your e-mail: ");
			String email = sc.nextLine();
			System.out.print("Which room? ");
			int room = sc.nextInt();
			vect[room] = new Booking(name, email, room);
			System.out.println(" ");
		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < 10; i++) {

			if (vect[i] != null) {
				System.out.print("Room " + vect[i].getRoom() + ": ");
				System.out.print(vect[i].getName() + ", ");
				System.out.println(vect[i].getEmail());
			} else {

			}

		}

		sc.close();
	}

}

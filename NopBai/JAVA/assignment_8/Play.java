//
package assignment_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is Play. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 26, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 26, 2020
 */
public class Play {
	
	//create static list
	static List<Bee> Bees;
	
	/**
	 * This method is main. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;

		Play Bee = new Play();
		while (true) {
			System.out.println("Please select : ");
			System.out.println("1-Create a Bee army");
			System.out.println("2-Attack");
			select = ScannerUtil.readInt(sc, "Chi chon 1 hoac 2. Xin nhap lai : ");

			switch (select) {
			case 1:
				Bee.createBeeArmy();
				break;
			case 2:				
					Bee.Attack();
					Bee.Status();
					break;				
			}
		}
	}

	/**
	 * This method is show status bees. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	private void Status() {
		int i = 1;
		for (Bee bee : Bees) {
			System.out.println("Bee " + i);
			i++;
			bee.CheckHealthStatus();
			System.out.println("-----------------------------------------");
		}
	}

	private void Attack() {
		for (Bee bee : Bees) {
			bee.Damage();
		}
		System.out.println("ATTACKED");
		System.out.println("-----------------------------------------");
		System.out.println();
	}

	private void createBeeArmy() {
		Bees = new ArrayList<>();
		int rnd = 0;
		int rnd1 = 1 + new Random().nextInt(11 - rnd);
		int rnd2 = 10 - (rnd1 + rnd);	
		for (int i = 0; i <= rnd; i++) {
			Bee bee1 = new Queen();
			Bees.add(bee1);
		}
		for (int i = 1; i <= rnd1; i++) {
			Bee bee2 = new Drone();
			Bees.add(bee2);
		}
		for (int i = 0; i < rnd2; i++) {
			Bee bee3 = new Worker();
			Bees.add(bee3);
		}
		 Collections.shuffle(Bees);
		System.out.println("Bee Army is ready...");
	}
}

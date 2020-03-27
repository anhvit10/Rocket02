//
package assignment_8;

import java.util.Random;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 26, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 26, 2020
 */
public class Queen extends Bee{
	
	/**
	 * This method is attacking bee. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	@Override
	public void Damage(){
		Random rd = new Random();
		int dame = 1 + rd.nextInt(80);
		if(floatingPointHealth > 19){
			floatingPointHealth -= dame;
		}
		if(floatingPointHealth < 20){
			floatingPointHealth -= 0;
		}
	}
	
	
	/**
	 * This method is check hit point. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	@Override
	public void CheckHealthStatus() {
		if(floatingPointHealth > 19){
			System.out.println("Queen : con song !");
		}
		if (floatingPointHealth < 20) {
			System.out.println("Queen : da chet !");
		}
		System.out.println("Hit Point = " + floatingPointHealth);
	}

}

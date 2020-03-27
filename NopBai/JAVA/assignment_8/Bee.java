package assignment_8;
/**
 * This class is Bee. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 26, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 26, 2020
 */
public abstract class Bee {
	
	protected int floatingPointHealth;
	
	/**
	 * Constructor for class Bee.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 26, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 26, 2020
	 */
	public Bee(){
		floatingPointHealth = 100;
	}
	
	/**
	 * @return the floatingPointHealth
	 */
	protected int getFloatingPointHealth() {
		return floatingPointHealth;
	}

	/**
	 * This method is CheckHealthStatus of bees. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	public void CheckHealthStatus() {
	}

	/**
	 * This method is attack bees. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	public void Damage() {
	}
	
	
}

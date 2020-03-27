package com.vti.template.utils.jdbc;


/**
 * This class is SqlParameter. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class SqlParameter {

	private int number;
	private Object values;

	
	/**
	 * Constructor for class SqlParameter.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 25, 2020
	 * @param number
	 * @param values
	 */
	public SqlParameter(int number, Object values) {
		this.number = number;
		this.values = values;
	}

	public int getNumber() {
		return number;
	}

	public Object getValues() {
		return values;
	}

}

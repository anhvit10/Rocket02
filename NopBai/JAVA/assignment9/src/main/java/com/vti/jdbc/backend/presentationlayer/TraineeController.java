//
package com.vti.jdbc.backend.presentationlayer;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.vti.jdbc.backend.businesslayer.ITraineeService;
import com.vti.jdbc.backend.businesslayer.TraineeService;
import com.vti.jdbc.entity.Trainee;


/**
 * This class control trainee. 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 27, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 27, 2020
 */
public class TraineeController {
	private ITraineeService service;

	
	/**
	 * Constructor for class TraineeController.
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 */
	public TraineeController() {
		service = new TraineeService();
	}

	
	/**
	 * This method is trainee list. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @return
	 */
	public List<Trainee> getAllTrainee() {
		return service.getAllTrainee();
	}

	
	/**
	 * This method check insert trainee . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param trainee
	 * @return
	 */
	public boolean insertTrainee(Trainee trainee) {
		return service.insertTrainee(trainee);
	}

	
	/**
	 * This method check update trainee. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param trainee
	 * @return
	 */
	public boolean updateTrainee(Trainee trainee) {
		return service.updateTrainee(trainee);
	}

	
	/**
	 * This method check delete trainee . 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param id
	 * @return
	 */
	public boolean deleteTrainee(int id) {
		return service.deleteTrainee(id);
	}
	
	
	/**
	 * This method check login trainee. 
	 * 
	 * @Description: .
	 * @author: NVAnh
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: NVAnh
	 * @modifer_date: Mar 27, 2020
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public boolean login(String userName, String passWord) {
		return service.login(userName, passWord);
	}
}

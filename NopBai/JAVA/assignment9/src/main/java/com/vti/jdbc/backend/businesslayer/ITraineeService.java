//
package com.vti.jdbc.backend.businesslayer;

import java.util.List;

import com.vti.jdbc.entity.Trainee;


/**
 * This class is interface ITraineeService . 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 27, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 27, 2020
 */
public interface ITraineeService {
	boolean login(String userName, String passWord);

	List<Trainee> getAllTrainee();

	boolean insertTrainee(Trainee trainee);

	boolean updateTrainee(Trainee trainee);

	boolean deleteTrainee(int id);
}

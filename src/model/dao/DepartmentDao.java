package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	
	void insert (DepartmentDao obj);
	void update (DepartmentDao obj);
	void deletById (Integer id);
	Department findById (Integer id);
	List <Department> findAll();
	

}

package application.workshopjavafxjdbc.model.dao;

import application.workshopjavafxjdbc.model.entities.Department;

import java.util.List;

public interface DepartmentDAO {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}

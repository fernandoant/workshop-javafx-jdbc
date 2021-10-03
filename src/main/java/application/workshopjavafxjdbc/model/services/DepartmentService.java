package application.workshopjavafxjdbc.model.services;

import application.workshopjavafxjdbc.model.dao.DAOFactory;
import application.workshopjavafxjdbc.model.dao.DepartmentDAO;
import application.workshopjavafxjdbc.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDAO dao = DAOFactory.createDepartmentDAO();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

}

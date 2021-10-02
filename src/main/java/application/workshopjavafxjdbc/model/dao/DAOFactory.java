package application.workshopjavafxjdbc.model.dao;

import application.workshopjavafxjdbc.db.DB;
import application.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import application.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDAO createDepartmentDAO() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}

package application.workshopjavafxjdbc.model.dao;

import application.workshopjavafxjdbc.model.entities.Seller;

import java.util.List;

public interface SellerDAO {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findByDepartmentId(Integer departmentId);
    List<Seller> findAll();

}

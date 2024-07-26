package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() { // expoem um metodo que vai retornar um tipo da interface
        return new SellerDaoJDBC(DB.getConnection()); // mas por dentro instancia uma implementacao
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}

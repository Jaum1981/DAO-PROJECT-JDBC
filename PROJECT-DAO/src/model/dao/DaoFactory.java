package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() { // expoem um metodo que vai retornar um tipo da interface
        return new SellerDaoJDBC(); // mas por dentro instancia uma implementacao
    }
}

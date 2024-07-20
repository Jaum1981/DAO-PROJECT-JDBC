package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller objSeller = new Seller(21, "Jaum", "jaum@email.com", new Date(), 9050.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao(); // conhece somente a interface e nao a implementacao

        System.out.println(obj);
        System.out.println(objSeller);
    }
}
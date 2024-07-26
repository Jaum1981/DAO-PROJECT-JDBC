package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // conhece somente a interface e nao a implementacao

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: seller insert ===");
        Seller seller2 = new Seller(null, "Jaum", "Jaum1981@gmail.com", new Date(), 9000.0, dep);
        sellerDao.insert(seller2);
        System.err.println(seller2);
        System.out.println("Inserted! New id = " + seller2.getId());

        System.out.println("=== TEST 4: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
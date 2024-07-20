package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // conhece somente a interface e nao a implementacao

        Seller seller = sellerDao.findById(2);

        System.out.println(seller);

    }
}
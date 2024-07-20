package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller objSeller = new Seller(21, "Jaum", "jaum@email.com", new Date(), 9050.0, obj);

        System.out.println(obj);
        System.out.println(objSeller);
    }
}
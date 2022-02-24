package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.abstracts.Entity;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //TODO: will solved with Spring IoC
        ProductService productService =
                new ProductManager(new HibernateProductDao()
                ,new JLoggerManagerAdapter()
                        );

        Product product = new Product(
                1,
                2,
                "Apple",
                12,
                50
        );

        productService.add(product);
    }
}

package org.sda.java19.util;

import org.sda.java19.models.Currency;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;

import java.math.BigDecimal;
import java.util.List;

/**
 * An acting database to store the values
 *
 * @author Vinod John
 */
public class Data {
    public static Warehouse WAREHOUSE = null;

    public static List<Product> getInitialProducts() {
        Product product = new Product();
        product.setName("Cake");
        product.setProductCategory(ProductCategory.FOOD);
        product.setPrice(BigDecimal.ONE);
        product.setQuantity(100);
        product.setAvailable(true);
        product.setCurrency(Currency.EUR);


        Product product1 = new Product();
        product1.setName("Black dotted Shirt");
        product1.setProductCategory(ProductCategory.CLOTHING);
        product1.setPrice(BigDecimal.valueOf(22.34));
        product1.setQuantity(25);
        product1.setAvailable(true);
        product1.setCurrency(Currency.EUR);

        Product product2 = new Product();
        product2.setName("Black Jeans");
        product2.setProductCategory(ProductCategory.CLOTHING);
        product2.setPrice(BigDecimal.valueOf(15.34));
        product2.setQuantity(25);
        product2.setAvailable(true);
        product2.setCurrency(Currency.EUR);

        Product product3 = new Product();
        product3.setName("Shirt");
        product3.setProductCategory(ProductCategory.CLOTHING);
        product3.setPrice(BigDecimal.valueOf(9.34));
        product3.setQuantity(25);
        product3.setAvailable(true);
        product3.setCurrency(Currency.EUR);

        Product product4 = new Product();
        product4.setName("Black dotted Shirt");
        product4.setProductCategory(ProductCategory.CLOTHING);
        product4.setPrice(BigDecimal.valueOf(22.34));
        product4.setQuantity(25);
        product4.setAvailable(true);
        product4.setCurrency(Currency.EUR);

        Product product5 = new Product();
        product5.setName("Pizza");
        product5.setProductCategory(ProductCategory.FOOD);
        product5.setPrice(BigDecimal.valueOf(14.04));
        product5.setQuantity(25);
        product5.setAvailable(true);
        product5.setCurrency(Currency.EUR);

        Product product6 = new Product();
        product6.setName("Pie");
        product6.setProductCategory(ProductCategory.FOOD);
        product6.setPrice(BigDecimal.valueOf(8.84));
        product6.setQuantity(25);
        product6.setAvailable(true);
        product6.setCurrency(Currency.EUR);

        Product product7 = new Product();
        product7.setName("Coat");
        product7.setProductCategory(ProductCategory.CLOTHING);
        product7.setPrice(BigDecimal.valueOf(105.84));
        product7.setQuantity(25);
        product7.setAvailable(true);
        product7.setCurrency(Currency.EUR);

        Product product8 = new Product();
        product8.setName("Hat");
        product8.setProductCategory(ProductCategory.CLOTHING);
        product8.setPrice(BigDecimal.valueOf(10.24));
        product8.setQuantity(25);
        product8.setAvailable(true);
        product8.setCurrency(Currency.EUR);

        Product product9 = new Product();
        product9.setName("Gloves");
        product9.setProductCategory(ProductCategory.CLOTHING);
        product9.setPrice(BigDecimal.valueOf(8.44));
        product9.setQuantity(25);
        product9.setAvailable(true);
        product9.setCurrency(Currency.EUR);

        return List.of(product, product1, product2, product3, product4, product5, product6, product7, product8, product9);
    }
}

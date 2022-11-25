package org.sda.java19;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;
import org.sda.java19.services.ProductService;
import org.sda.java19.services.WarehouseService;
import org.sda.java19.services.implementation.ProductServiceImpl;
import org.sda.java19.services.implementation.WarehouseServiceImpl;
import org.sda.java19.util.Data;

import java.math.BigDecimal;
import java.util.*;

/**
 * 2. Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * “pliers:30”
 * “scissors:+4”
 *
 * @author Vinod John
 */
public class Main {
    public static void main(String[] args) throws WarehouseNotFoundException {
        /*
        1. Create Warehouse, Product, ProductCategory (enum), Currency (enum) - models package
        2. Warehouse : name, List of Product, address, isActive
        3. Product: name, pricePerItem, quantity, product category, currency, isAvailable
        4. Create Warehouse object, Before create list of products.
        5. In main method, switch case for various operations.
        6. For each operation, call service method and do the operation
         */

        WarehouseService warehouseService = new WarehouseServiceImpl();
        Scanner scanner = new Scanner(System.in);

        //Initializing the warehouse
        Warehouse warehouse = new Warehouse();
        warehouse.setName("ABC E-POOD");
        warehouse.setAddress("Tallinn");
        warehouse.setActive(true);
        warehouse.setProducts(Data.getInitialProducts());


        warehouseService.addWarehouse(warehouse); // Adds new warehouse
        List<String> shoppingBag = new ArrayList<>();
        productOperations();
    }

    private static void productOperations() throws WarehouseNotFoundException {
        ProductService productService = new ProductServiceImpl();


        int option = getOption();

        switch (option) {
            case 1: //Add a product
                productService.addProduct(addProduct(new ArrayList<>()));
                break;
            case 2://Update a product

        }
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        // User should be able to: add, display all of the details, update, delete an item
        System.out.println("MAIN MENU \n----------------");
        System.out.println("1.Add items \n2.Display items \n3.Update items \n4.Delete items");
        System.out.println("Choose an option from above:");
        return getMenuOption(4);
    }

    private static int getMenuOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;
        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input
                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);
        return option;
    }


    private static Product addProduct(List<String> shoppingBag) {
        Scanner scanner = new Scanner(System.in);
        boolean addMore = true;
        System.out.println("Choose a product category: " + Arrays.toString(ProductCategory.values()));
        ProductCategory productCategory = ProductCategory.valueOf(scanner.next());
        System.out.println("Choose products from the category: " + Data.getInitialProducts());
        System.out.println("Enter the details of the product:");
        System.out.println("Product name:");
        String productName = scanner.next();
        System.out.println("Product price:");
        float price = scanner.nextFloat();
        System.out.println("'" + productName + "' added to the list. Do you want to add more item?");
        while (addMore) {
            System.out.println("Enter an item name to be added to the bag: ");
            String addProduct = scanner.next();
            System.out.println("'" + productName + "' added to the list. Do you want to add more item?");
            if (addMore == false) {
                System.out.println(getMenuOption(scanner.nextInt()));
            }

            addMore = scanner.nextBoolean();
        }


        Product product = new Product();
        product.setName(productName);
        product.setPrice(BigDecimal.valueOf(price));
        product.setProductCategory(productCategory);


        return product;
    }


    private static Product updateProduct() {
        //Need to display all the products and then ask user to which product to update.
        return null;
    }

    private static Product displayAllDetails() {
        //Need to display all the products
        Scanner scanner = new Scanner(System.in);


        return null;
    }

    private static Product deleteItems() {
        //Need to display all the products
        return null;
    }
}
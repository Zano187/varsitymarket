package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.Product;

import java.util.HashMap;

/* Product.java
Product model class
Author: Ethan Le Roux (222622172)
Date:3 April 2025
*/
public class ProductRepository implements IProductRepository {
    private static IProductRepository repository = null;
    private HashMap<Long, Product> products;

    private  ProductRepository() {
        products = new HashMap<>();
    }

    public static IProductRepository getRepository() {
        if (repository == null) {
            repository = new ProductRepository();
        }
        return repository;
    }

    @Override
    public HashMap<Long, Product> getAll() {
        if (products == null) {
            return null;
        }
        return products;
    }

    @Override
    public Product read(Long id) {
        if(!products.containsKey(id)) {
            return null;
        }
        return products.get(id);
    }

    @Override
    public Product create(Product product) {
        if(product==null){
            return null;
        }
        return products.put(product.getProductId(), product);
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public boolean delete(Product product) {
        if(product==null){
            return false;
        }
        products.remove(product.getProductId());
        return true;
    }
}

package pl.cp4.productCatalog;

import java.util.List;

public interface ProductStorage {
    List<Product> allProducts();

    void add(Product newProduct);

    Product loadById(String productId);

    List<Product> allPublishedProducts();
}
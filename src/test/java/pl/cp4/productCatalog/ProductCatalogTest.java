package pl.cp4.productCatalog;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductCatalogTest {

    @Test
    void itAllowsToListMyProducts(){
        ProductCatalog catalog = thereIsProductCatalog();
        List<Product> products = catalog.allProducts();
        assetsListIsEmpty(products);
    }

    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }

    private void assetsListIsEmpty(List<Product> products) {
        assert 0 == products.size();
    }

    @Test
    void itAllowsToChangePrice(){

    }

    @Test
    void itAllowsToChangeImage(){

    }

    @Test
    void itAllowsToPublishProduct(){

    }

    @Test
    void publicationIsPossibleWhenPriceAndImageAreDefined(){

    }
}

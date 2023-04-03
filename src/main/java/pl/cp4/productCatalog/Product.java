package pl.cp4.productCatalog;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private final String uuid;
    private final String name;
    private final String desc;
    private BigDecimal price;

    public Product(UUID uuid, String name, String desc) {
        this.uuid = uuid.toString();
        this.name = name;
        this.desc = desc;
        this.price = BigDecimal.valueOf(0);
    }

    public String getId() {
        return uuid;
    }

    public UUID getUUID() {
        return UUID.fromString(uuid);
    }

    public void changePrice(BigDecimal newPrice) {
        price = newPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
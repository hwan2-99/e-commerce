package dn2.ecommerce.domain.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String ItemName;
    private Integer price;
    private int quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, int quantity) {
        ItemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}

package dn2.ecommerce.global.entity;

import java.util.Date;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class Item {
    private Integer itemId;
    private String itemName;
    private Integer itemPrice;
    private Integer itemAmount;
    private Date lastUpdate;
    private Date firstAdd;
}

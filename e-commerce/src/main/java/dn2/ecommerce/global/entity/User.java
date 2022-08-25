package dn2.ecommerce.global.entity;

import java.util.Date;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class User {
    private Integer customer_id;
    private String id;
    private String password;
    private String name;
    private Integer type;
    private Date lastUpdate;
    private String firstAdd;
}

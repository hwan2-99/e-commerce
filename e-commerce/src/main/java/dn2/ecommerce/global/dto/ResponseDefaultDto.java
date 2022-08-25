package dn2.ecommerce.global.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseDefaultDto {
    private int code;
    private String message;
}

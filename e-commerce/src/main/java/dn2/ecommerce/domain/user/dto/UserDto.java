package dn2.ecommerce.domain.user.dto;

import dn2.ecommerce.global.entity.User;
import lombok.*;

public class UserDto {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access= AccessLevel.PROTECTED)
    public static class Login{
        private String id;
        private String password;
        public User toEntity(){
            return User.builder()
            		.id(id)
                    .password(password)
                    .build();
        }

        @Override
        public String toString() {
            return "{" +
                    "\"id\" :\"" + id + '\"' +
                    ", \"password\" : \"" + password + '\"' +
                    '}';
        }
    }
    
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access= AccessLevel.PROTECTED)
    public static class SignUp{
        private String id;
        private String password;
        private String name;
        public User toEntity(){
            return User.builder()
            		.id(id)
                    .password(password)
                    .name(name)
                    .build();
        }

        @Override
        public String toString() {
            return "{" +
                    "\"id\" :\"" + id + '\"' +
                    ", \"password\" : \"" + password + '\"' +
                    ", \"name\" : \"" + name + '\"' +
                    '}';
        }
    }

}

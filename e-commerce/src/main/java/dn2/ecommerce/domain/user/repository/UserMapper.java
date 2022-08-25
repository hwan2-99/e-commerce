package dn2.ecommerce.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import dn2.ecommerce.global.entity.Item;
import dn2.ecommerce.global.entity.User;

@Mapper
@Repository
public interface UserMapper {
	
// CREATE
	
// READ
	public User findUserByIdAndPassword(@Param("id") String id, @Param("password") String password);
	
// PATCH
	

// PUT
	
	
	
// DELETE
	

}

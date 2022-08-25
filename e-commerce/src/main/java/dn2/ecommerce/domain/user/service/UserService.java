package dn2.ecommerce.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dn2.ecommerce.domain.user.dto.UserDto;
import dn2.ecommerce.domain.user.repository.UserMapper;
import dn2.ecommerce.global.entity.Item;
import dn2.ecommerce.global.entity.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User loginService(UserDto.Login loginDto) {
		return userMapper.findUserByIdAndPassword(loginDto.getId(), loginDto.getPassword());
	}
//    public ResponseDefaultDto signService(UserDto.Inform informDto);
//    public ResponseDefaultDto updateService(UserDto.Inform informDto, String email);
//    public ResponseDefaultDto deleteService(User user);
//    public User userInformService(User user);
}

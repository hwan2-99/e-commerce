package dn2.ecommerce.domain.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import dn2.ecommerce.domain.user.dto.UserDto;
import dn2.ecommerce.domain.user.service.UserService;
import dn2.ecommerce.global.constant.ResponseMessage;
import dn2.ecommerce.global.dto.ResponseDefaultDto;
import dn2.ecommerce.global.entity.User;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping(value="/v1/user")
public class UserController {
	
	@Autowired
    private final UserService userService;
	
//    @PostMapping("/signup")
//    public ResponseEntity<ResponseDefaultDto> signup(HttpSession session,@RequestBody UserDto.SignUp signUpDto){
//    	System.out.println("ㅎㅎ");
//    	//int isSuccess = userService.signUpServcie(signUpDto);
//    	//System.out.println(isSuccess);
//    	//if( 0 != isSuccess) {throw new Exception();}
//
//    	
//    	System.out.println(session.getId());
//    	System.out.println(session.getAttribute("user"));
//    	
//    	
//    	System.out.println("ㅎㅎ");
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(ResponseDefaultDto.builder().code(200).message(ResponseMessage.RESPONSE_LOGIN_MESSAGE).build());
//    }

    
//    @PostMapping("/login")
//    public ResponseEntity<ResponseDefaultDto> login(HttpSession session,@RequestBody UserDto.Login loginDto){
//        log.info("Controller \t : " + loginDto.toString() );
//        //if(session.getAttribute("user")!=null)  throw new LoginException(ErrorCode.SESSION_EXIST);
//        User user = userService.loginService(loginDto);
//        
//        log.info("유저 \t : " + user.toString() );
//        
//        session.setAttribute("user", user); //session
//        log.info("login");
//        
//        System.out.println(session.getId()+"ㅇㅇ");
//        
//        //token 생성, Session 생성
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(ResponseDefaultDto.builder().code(200).message(ResponseMessage.RESPONSE_LOGIN_MESSAGE).build());
//    }

//    @PostMapping("/sign")
//    public ResponseEntity<ResponseDefaultDto> sign(@RequestBody UserDto.Inform informDto){
//        log.info(informDto.toString());
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(userService.signService(informDto));
//    }
//
//    @PutMapping("")
//    public ResponseEntity<ResponseDefaultDto> updateUser( @RequestBody UserDto.Inform informDto, HttpSession session){
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(userService.updateService(informDto, ((User) session.getAttribute("user")).getUserEmail()));
//    }
//    @GetMapping("")
//    public ResponseEntity<User> selectUser(HttpSession session){
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(userService.userInformService((User)session.getAttribute("user")));
//    }
//
//    @DeleteMapping("")
//    public ResponseEntity<ResponseDefaultDto> deleteUser(HttpSession session){
//        HttpHeaders headers = new HttpHeaders();
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(userService.deleteService(((User) session.getAttribute("user"))));
//    }
}

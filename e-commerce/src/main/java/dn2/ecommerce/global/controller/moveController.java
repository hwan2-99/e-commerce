package dn2.ecommerce.global.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import dn2.ecommerce.global.entity.User;
import lombok.RequiredArgsConstructor;
import dn2.ecommerce.domain.user.dto.UserDto;
import dn2.ecommerce.domain.user.service.UserService;

@RequiredArgsConstructor
@Controller
public class moveController {
	
	@Autowired
    private final UserService userService;
	
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/basket")
    public String basket(){
        return "basket";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
	  @PostMapping("/signup")
	  public String signup(HttpSession session,@ModelAttribute UserDto.SignUp signUpDto){
	  	int isSuccess = userService.signUpServcie(signUpDto);
	  	//if( 0 != isSuccess) {throw new Exception();}
	  	
	      HttpHeaders headers = new HttpHeaders();
	      return "login";
	  }
	@PostMapping("/login")
	public String login(HttpSession session,@ModelAttribute UserDto.Login loginDto){
	    //if(session.getAttribute("user")!=null)  throw new LoginException(ErrorCode.SESSION_EXIST);
	    User user = userService.loginService(loginDto);
	    session.setAttribute("user", user); //session
	    System.out.println(session.getId()+"ㅇㅇ");
	    //token 생성, Session 생성
	    HttpHeaders headers = new HttpHeaders();
	    return "basket";
	}
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/order")
    public String order(){
        return "order";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		// 컨트롤러 메소드의 반환형이 String 인경우에는
		// 반환값이 view의 이름이됨.
		// 지금은 login_form.jsp 파일이 선택됨

		return "login_form";
	}

//	@RequestMapping(value="/login.do",method=RequestMethod.POST)//post방식으로만 받음
//	public ModelAndView login(String userId, String userPw) {
//		ModelAndView mv = new ModelAndView();
//
//		if (userId.equals(userPw)) {
//			mv.setViewName("login_success");
//			mv.addObject("msg", "로그인 성공입니다.");
//			mv.addObject("loginId", userId);
//		} else {
//			mv.setViewName("login_error");
//		}
//		return mv;
//	}
	@RequestMapping(value="/login.do",method=RequestMethod.POST)//post방식으로만 받음
	public ModelAndView login(@RequestParam("userId") String id,@RequestParam("userPw") String pw,int num) {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("파라미터값"+num);

		if (id.equals(pw)) {
			mv.setViewName("login_success");
			mv.addObject("msg", "로그인 성공입니다.");
			mv.addObject("loginId", id);
		} else {
			mv.setViewName("login_error");
		}
		return mv;
	}

}

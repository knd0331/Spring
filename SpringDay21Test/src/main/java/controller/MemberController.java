package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.MemberService;
import vo.Member;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "join_form";
	}

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "login_form";
	}
	
	@RequestMapping("idCheck.do")
	@ResponseBody
	public String idCheck(String id){
		boolean rs = memberService.checkId(id);
		return rs+"";
	}
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(Member member) {
		if(memberService.joinMember(member)==true){
			return "join_success";
		}else{
			return "join_fail";
		}
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpSession session, String id, String pw) {
		if (memberService.memberCheck(id, pw)) {
			session.setAttribute("loginId", id);
			return "login_success";
		} else {
			return "login_error";
		}
	}

}

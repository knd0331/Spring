package com.sds.test20;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor 
				extends HandlerInterceptorAdapter	{
	@Override
	public boolean preHandle
	(HttpServletRequest request, 
			HttpServletResponse response, Object arg2) throws Exception {
	// Controller�� ��û�� ���� ���� �����ϰ��� �ϴ� �۾�
		HttpSession session = request.getSession();
		String loginId = 
				(String)session.getAttribute("loginId");
		
		if(loginId != null){
			return true;
		}else{
			response.sendRedirect("loginForm.do");
			return false;
		}
	}
}








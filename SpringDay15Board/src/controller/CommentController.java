package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.CommentService;
import vo.Comment;


@Controller
public class CommentController {
	
	@Autowired
	private CommentService service;
	
	public void setService(CommentService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/comment.do", method = RequestMethod.POST)
	public void write(HttpSession session, Comment comment,int articleNum,HttpServletResponse response) {

		String writer = (String) session.getAttribute("loginId");
		comment.setId(writer);
		
		service.writeCo(comment, articleNum);
		
		try {
			response.sendRedirect("read.do");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@RequestMapping("/coList.do")
	public ModelAndView coList(@RequestParam(value = "page", defaultValue = "1") int page,int articleNum) {

		ModelAndView mv = new ModelAndView("read");
		mv.addObject("coPage", service.makeCoPage(page, articleNum));

		return mv;
	}

}

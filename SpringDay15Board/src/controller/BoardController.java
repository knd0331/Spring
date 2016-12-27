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

import service.BoardService;
import service.CommentService;
import vo.Article;
import vo.Comment;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	@Autowired
	private CommentService commentService;

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	@RequestMapping("/boardList.do")
	public ModelAndView boardList(@RequestParam(value = "page", defaultValue = "1") int page) {

		ModelAndView mv = new ModelAndView("board_list");
		mv.addObject("articlePage", boardService.makePage(page));

		return mv;
	}

	@RequestMapping("/writeForm.do")
	public String writeForm(HttpSession session) {
		if (session.getAttribute("loginId") != null) {
			return "write_form";
		} else {
			return "login_form";
		}
	}

	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public ModelAndView write(HttpSession session, Article article) {

		String writer = (String) session.getAttribute("loginId");
		article.setWriter(writer);
		
		ModelAndView mv = new ModelAndView("write_result");
		mv.addObject("articleNum", boardService.write(article));
		return mv;
	}

	@RequestMapping("/read.do")
	public ModelAndView read(HttpSession session, int articleNum,
			                 @RequestParam(value = "page", defaultValue = "1") int page) {
		String loginId = (String) session.getAttribute("loginId");
		Article article = boardService.read(articleNum, loginId, page);
		
		ModelAndView mv = new ModelAndView("read");
		mv.addObject("article", article);
		mv.addObject("coPage", commentService.makeCoPage(page, articleNum));
		return mv;
	}

	@RequestMapping("/updateForm.do")
	public ModelAndView updateForm(HttpSession session, int articleNum) {

		String loginId = (String) session.getAttribute("loginId");
		Article article = boardService.nomalRead(articleNum, loginId);
		ModelAndView mv = new ModelAndView("update_form");
		mv.addObject("article", article);

		return mv;
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public ModelAndView update(HttpSession session, Article article) {
		String loginId = (String) session.getAttribute("loginId");
		boardService.modify(loginId, article);
		ModelAndView mv = new ModelAndView("update_result");

		return mv;

	}

	@RequestMapping("/deleteForm.do")
	public ModelAndView deleteForm(HttpSession session, int articleNum) {
		if (session.getAttribute("loginId") != null) {

			ModelAndView mv = new ModelAndView("delete_form");
			mv.addObject("articleNum", articleNum);
			return mv;
		}else {
			return new ModelAndView("board_list");
		}
	}

	@RequestMapping(value = "/delete.do")
	public void deledate(HttpSession session, Article article, HttpServletResponse response) {
		String loginId = (String) session.getAttribute("loginId");
		if (loginId != null) {
			boardService.delete(loginId, article);
		}
		try {
			response.sendRedirect("boardList.do");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}

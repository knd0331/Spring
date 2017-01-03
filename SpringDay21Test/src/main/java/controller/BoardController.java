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
import vo.Board;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@Autowired

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	@RequestMapping("/boardList.do")
	public ModelAndView boardList(@RequestParam(value = "page", defaultValue = "1") int page) {

		ModelAndView mv = new ModelAndView("board_list");
		mv.addObject("boardPage", boardService.makePage(page));

		return mv;
	}

	@RequestMapping("/writeForm.do")
	public String writeForm(HttpSession session) {
		if (session.getAttribute("loginId") != null) {
			return "write_form";
		} else {
			return "login_error";
		}
	}

	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public void write(HttpSession session, Board board, HttpServletResponse response) {

		String writer = (String) session.getAttribute("loginId");
		board.setWriter(writer);

		boardService.write(board);

		try {
			response.sendRedirect("boardList.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/read.do")
	public ModelAndView read(HttpSession session, int articleNum) {
		String loginId = (String) session.getAttribute("loginId");
		Board board = boardService.read(articleNum, loginId);

		ModelAndView mv = new ModelAndView("read");
		mv.addObject("board", board);
		return mv;
	}

	@RequestMapping("/updateForm.do")
	public ModelAndView updateForm(HttpSession session, int articleNum) {

		String loginId = (String) session.getAttribute("loginId");
		Board board = boardService.nomalRead(articleNum, loginId);
		ModelAndView mv = new ModelAndView("update_form");
		mv.addObject("board", board);

		return mv;
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public void update(HttpSession session, Board board, HttpServletResponse response) {
		String loginId = (String) session.getAttribute("loginId");
		boardService.modify(loginId, board);

		try {
			response.sendRedirect("boardList.do");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("/deleteForm.do")
	public ModelAndView deleteForm(HttpSession session, int articleNum) {
		if (session.getAttribute("loginId") != null) {

			ModelAndView mv = new ModelAndView("delete_form");
			mv.addObject("articleNum", articleNum);
			return mv;
		} else {
			return new ModelAndView("board_list");
		}
	}

	@RequestMapping(value = "/delete.do")
	public void deledate(HttpSession session, Board board, HttpServletResponse response) {
		String loginId = (String) session.getAttribute("loginId");
		if (loginId != null) {
			boardService.delete(loginId, board);
		}
		try {
			response.sendRedirect("boardList.do");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

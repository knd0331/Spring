package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BoardService;
import vo.Article;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
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
			// �α��� ���������� �۾��� ȭ��
			return "write_form";
		} else {
			// �α��� ���������� �α��� ȭ��
			return "login_form";
		}
	}

	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public ModelAndView write(HttpSession session, Article article) {
		// �Խñ� �ۼ��� ���� �α��ξ��̵�
		String writer = (String) session.getAttribute("loginId");
		article.setWriter(writer);
		// �۾��� ������ �߰��� ���� �۹�ȣ ��Ƽ� ��ȯ
		ModelAndView mv = new ModelAndView("write_result");
		mv.addObject("articleNum", boardService.write(article));
		return mv;
	}

	@RequestMapping("/read.do")
	public ModelAndView read(HttpSession session, int articleNum) {
		String loginId = (String) session.getAttribute("loginId");
		Article article = boardService.read(articleNum, loginId);
		ModelAndView mv = new ModelAndView("read");
		mv.addObject("article", article);
		return mv;
	}

}

package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.BookService;
import vo.Book;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	public void setService(BookService service) {
		this.service = service;
	}

	@RequestMapping("/insertForm.do")
	public String insertForm() {
		return "insert_form";
	}

	@RequestMapping(value = "/insert.do", method = RequestMethod.POST)
	public void insertBook(HttpServletResponse response, Book book) {
		// ModelAnView mv = new ModelAndView();
		service.insertBook(book);
		try {
			response.sendRedirect("list.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// mv.setViewName("index");
		// return mv;
	}

	@RequestMapping("/list.do")
	public ModelAndView list() {
		int currentPage = 1;
		ModelAndView mv = new ModelAndView();
		List<Book> list = service.bookList(currentPage);
		mv.setViewName("list_form");
		mv.addObject("listBook", list);
		return mv;
	}

	@RequestMapping("/updateForm.do")
	public String updateForm() {
		return "update_form";
	}

	@RequestMapping(value = "/updateForm2.do", method = RequestMethod.POST)
	public ModelAndView updateForm2(int bookNum) {
		ModelAndView mv = new ModelAndView();
		Book original = service.selectBook(bookNum);
		mv.setViewName("update_form2");
		mv.addObject("original", original);

		return mv;
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public void updateBook(HttpServletResponse response, Book book) {
		System.out.println("update:"+book);
		service.updateBook(book);
		try {
			response.sendRedirect("list.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

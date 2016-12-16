package test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ArticleService;
import vo.Article;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ArticleService service = context.getBean("articleService",ArticleService.class);
		Article article;
		Scanner sc = new Scanner(System.in);
		int num;
		int currentPage;
		int article_num;
		String password;
		
		while(true){
			System.out.println("1.글 목록 2.글 쓰기 3.글 읽기 4.글 내용 수정 5.글 삭제 6.글 답변");
			System.out.print("메뉴 선택: ");
			num = sc.nextInt();
			switch(num){
			case 1:
				System.out.print("페이지 입력: ");
				currentPage = sc.nextInt();
				int articleCount = 10;
				int startRow = (currentPage -1) * articleCount;
				int endRow = articleCount;
				
				List<Article> articleList = service.selectPage(startRow, endRow);
				if(articleList.size()==0){
					System.out.println("게시물이 없습니다.");
				} else {
					for(Article a : articleList){
						for(int i = 0;i<a.getDepth();i++){
							System.out.print(" ");
						}
						if(a.getDepth()!=0){
							System.out.print("ㄴ");
						}
						System.out.println(a);
					}
				}
				break;
			case 2:
				article = new Article();
				System.out.print("글 제목 : ");
				article.setTitle(sc.next());
				System.out.print("글 내용 : ");
				article.setContent(sc.next());
				System.out.print("작성자 : ");
				article.setWriter(sc.next());
				System.out.print("패스워드 : ");
				article.setPassword(sc.next());
				
				System.out.println("글 입력 : "+service.insert(article));
				service.updateFamily(article.getArticle_num());
				break;
			case 3:
				System.out.print("게시물 번호 입력: ");
				article_num = sc.nextInt();
				System.out.println(service.selectReadCount(article_num));
				break;
			case 4:
				System.out.print("게시물 번호 입력: ");
				article_num = sc.nextInt();
				System.out.print("게시물 비밀번호 입력: ");
				password = sc.next();
				if(service.isPassword(article_num, password)){
					Article savedArticle = service.selectNoReadCount(article_num);
					System.out.print("글 제목 수정 : ");
					savedArticle.setTitle(sc.next());
					System.out.print("글 내용 수정 : ");
					savedArticle.setContent(sc.next());
					System.out.print("작성자 수정 : ");
					savedArticle.setWriter(sc.next());
					System.out.print("패스워드 수정 : ");
					savedArticle.setPassword(sc.next());
					System.out.println("글 내용 수정 : "+service.update(savedArticle));
				} else {
					System.out.println("비밀번호를 확인해주세요.");
				}
				break;
			case 5:
				System.out.print("게시물 번호 입력: ");
				article_num = sc.nextInt();
				System.out.print("게시물 비밀번호 입력: ");
				password = sc.next();
				if(service.isPassword(article_num, password)){
					System.out.println("글 삭제 : "+service.delete(article_num));
				} else {
					System.out.println("비밀번호를 확인해주세요.");
				}
				break;
			case 6:
				System.out.print("답변 게시물 번호 입력: ");
				article_num = sc.nextInt();
				Article savedArticle = service.selectNoReadCount(article_num);
				article = new Article();
				System.out.print("답변 글 제목 : ");
				article.setTitle(sc.next());
				System.out.print("답변 글 내용 : ");
				article.setContent(sc.next());
				System.out.print("답변 글 작성자 : ");
				article.setWriter(sc.next());
				System.out.print("답변 글 패스워드 : ");
				article.setPassword(sc.next());
				article.setFamily(savedArticle.getFamily());
				article.setParent(savedArticle.getArticle_num());
				article.setDepth(savedArticle.getDepth()+1);
				
				System.out.println("답변 글 등록 : "+service.insertReply(article));
			}
		}
		
	}
}

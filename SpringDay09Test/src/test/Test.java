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
			System.out.println("1.�� ��� 2.�� ���� 3.�� �б� 4.�� ���� ���� 5.�� ���� 6.�� �亯");
			System.out.print("�޴� ����: ");
			num = sc.nextInt();
			switch(num){
			case 1:
				System.out.print("������ �Է�: ");
				currentPage = sc.nextInt();
				int articleCount = 10;
				int startRow = (currentPage -1) * articleCount;
				int endRow = articleCount;
				
				List<Article> articleList = service.selectPage(startRow, endRow);
				if(articleList.size()==0){
					System.out.println("�Խù��� �����ϴ�.");
				} else {
					for(Article a : articleList){
						for(int i = 0;i<a.getDepth();i++){
							System.out.print(" ");
						}
						if(a.getDepth()!=0){
							System.out.print("��");
						}
						System.out.println(a);
					}
				}
				break;
			case 2:
				article = new Article();
				System.out.print("�� ���� : ");
				article.setTitle(sc.next());
				System.out.print("�� ���� : ");
				article.setContent(sc.next());
				System.out.print("�ۼ��� : ");
				article.setWriter(sc.next());
				System.out.print("�н����� : ");
				article.setPassword(sc.next());
				
				System.out.println("�� �Է� : "+service.insert(article));
				service.updateFamily(article.getArticle_num());
				break;
			case 3:
				System.out.print("�Խù� ��ȣ �Է�: ");
				article_num = sc.nextInt();
				System.out.println(service.selectReadCount(article_num));
				break;
			case 4:
				System.out.print("�Խù� ��ȣ �Է�: ");
				article_num = sc.nextInt();
				System.out.print("�Խù� ��й�ȣ �Է�: ");
				password = sc.next();
				if(service.isPassword(article_num, password)){
					Article savedArticle = service.selectNoReadCount(article_num);
					System.out.print("�� ���� ���� : ");
					savedArticle.setTitle(sc.next());
					System.out.print("�� ���� ���� : ");
					savedArticle.setContent(sc.next());
					System.out.print("�ۼ��� ���� : ");
					savedArticle.setWriter(sc.next());
					System.out.print("�н����� ���� : ");
					savedArticle.setPassword(sc.next());
					System.out.println("�� ���� ���� : "+service.update(savedArticle));
				} else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
				break;
			case 5:
				System.out.print("�Խù� ��ȣ �Է�: ");
				article_num = sc.nextInt();
				System.out.print("�Խù� ��й�ȣ �Է�: ");
				password = sc.next();
				if(service.isPassword(article_num, password)){
					System.out.println("�� ���� : "+service.delete(article_num));
				} else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
				break;
			case 6:
				System.out.print("�亯 �Խù� ��ȣ �Է�: ");
				article_num = sc.nextInt();
				Article savedArticle = service.selectNoReadCount(article_num);
				article = new Article();
				System.out.print("�亯 �� ���� : ");
				article.setTitle(sc.next());
				System.out.print("�亯 �� ���� : ");
				article.setContent(sc.next());
				System.out.print("�亯 �� �ۼ��� : ");
				article.setWriter(sc.next());
				System.out.print("�亯 �� �н����� : ");
				article.setPassword(sc.next());
				article.setFamily(savedArticle.getFamily());
				article.setParent(savedArticle.getArticle_num());
				article.setDepth(savedArticle.getDepth()+1);
				
				System.out.println("�亯 �� ��� : "+service.insertReply(article));
			}
		}
		
	}
}

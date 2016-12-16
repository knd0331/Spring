package test_bank;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.AccountVO;

public class Test {
	
	
	public static void main(String[] args) {
		int accountNum;
		String name;
		String password;
		int price;
		int money;
		AccountDao dao;
		Scanner scan;
		ApplicationContext context = new
				ClassPathXmlApplicationContext("test_bank/applicationContext.xml");
		dao = context.getBean("dao",AccountDao.class);
		
		scan = new Scanner(System.in);

		while(true){
        System.out.println("1.계좌개설 2.입금 3.출금 4.조회 5.종료");
	    int select = scan.nextInt();
	    	if(select==5){
	    		break;
	    	}
	    	switch (select) {
			case 1:
				System.out.println("이름");
				name =scan.next();
				System.out.println("비밀번호");
				password = scan.next();
				System.out.println("초기 입금 금액");
				price = scan.nextInt();
				
				AccountVO account = new AccountVO(name,password,price);
				dao.insert(account);
				System.out.println("계좌 생성 완료");
				break;
			 case 2:
				 System.out.println("입금하실 계좌번호를  입력하세요.");
				 accountNum = scan.nextInt();
				 System.out.println("입금할 금액을 입력하세요.");
				 money  =scan.nextInt();
				 dao.deposit(accountNum, money);
				 System.out.println("입금 완료");
			 case 3:
				 System.out.println("출금하실 계좌번호를  입력하세요.");
				 accountNum  =scan.nextInt();
				 System.out.println("계좌 비밀번호를 입력하세요.");
				 password = scan.next();
				AccountVO original = dao.select(accountNum);
				if(original.getPassword().equals(password)){
					System.out.println("비밀번호 확인이 완료되었습니다.");
					System.out.println("출금하실 금액을 입력하세요.");
					money = scan.nextInt();
					dao.withdraw(accountNum, money);
					System.out.println("출금 완료");
				}else{
					System.out.println("비밀번호 오류 비밀번호를 확인해주세요.");
				}
			 case 4:
				    System.out.println("조회하실 계좌번호를 입력해주세요.");
				    accountNum = scan.nextInt();
				    
				    try{
				    	AccountVO vo = dao.select(accountNum);
				    	System.out.println("계좌번호:"+vo.getAccountNum());
				    	System.out.println("이름:"+vo.getName());
				    	System.out.println("잔액:"+vo.getPrice());
				    }catch (Exception e) {
				    	System.out.println("계좌가 존재하지않습니다.");
					}
				    
	    	}
	    	
	    }
		
	}

}

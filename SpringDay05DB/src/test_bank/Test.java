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
        System.out.println("1.���°��� 2.�Ա� 3.��� 4.��ȸ 5.����");
	    int select = scan.nextInt();
	    	if(select==5){
	    		break;
	    	}
	    	switch (select) {
			case 1:
				System.out.println("�̸�");
				name =scan.next();
				System.out.println("��й�ȣ");
				password = scan.next();
				System.out.println("�ʱ� �Ա� �ݾ�");
				price = scan.nextInt();
				
				AccountVO account = new AccountVO(name,password,price);
				dao.insert(account);
				System.out.println("���� ���� �Ϸ�");
				break;
			 case 2:
				 System.out.println("�Ա��Ͻ� ���¹�ȣ��  �Է��ϼ���.");
				 accountNum = scan.nextInt();
				 System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				 money  =scan.nextInt();
				 dao.deposit(accountNum, money);
				 System.out.println("�Ա� �Ϸ�");
			 case 3:
				 System.out.println("����Ͻ� ���¹�ȣ��  �Է��ϼ���.");
				 accountNum  =scan.nextInt();
				 System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
				 password = scan.next();
				AccountVO original = dao.select(accountNum);
				if(original.getPassword().equals(password)){
					System.out.println("��й�ȣ Ȯ���� �Ϸ�Ǿ����ϴ�.");
					System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
					money = scan.nextInt();
					dao.withdraw(accountNum, money);
					System.out.println("��� �Ϸ�");
				}else{
					System.out.println("��й�ȣ ���� ��й�ȣ�� Ȯ�����ּ���.");
				}
			 case 4:
				    System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �Է����ּ���.");
				    accountNum = scan.nextInt();
				    
				    try{
				    	AccountVO vo = dao.select(accountNum);
				    	System.out.println("���¹�ȣ:"+vo.getAccountNum());
				    	System.out.println("�̸�:"+vo.getName());
				    	System.out.println("�ܾ�:"+vo.getPrice());
				    }catch (Exception e) {
				    	System.out.println("���°� ���������ʽ��ϴ�.");
					}
				    
	    	}
	    	
	    }
		
	}

}

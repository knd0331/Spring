package test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.MemberDao;
import vo.Member;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberDao dao = context.getBean("member", MemberDao.class);

		Scanner scan = new Scanner(System.in);

		while (true) {
			String id;
			String password;
			String email;
			int number;
			int result;
			

			System.out.println("SDS.com");
			System.out.println("1.가입 2.수정 3.조회 4.탈퇴 5.종료");
			int select = scan.nextInt();

			if (select == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
			switch (select) {
			case 1:
				System.out.println("아이디 입력");
				id = scan.next();
				System.out.println("비밀번호 입력");
				password = scan.next();
				System.out.println("이메일 입력");
				email = scan.next();

				Member member = new Member(id, password, email);
				result = dao.insertMember(member);
				if (result > 0) {
					System.out.println("가입완료");
				} else {
					System.out.println("가입 실패");
				}
			case 2:
				System.out.println("회원아이디 입력");
				id = scan.next();
				System.out.println("수정할 비밀번호 입력");
				password = scan.next();
				result = dao.updatePassword(password, id);
				if (result > 0) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
			case 3:
				try {
					System.out.println("회원아이디 입력");
					id = scan.next();
					System.out.println("비밀번호 입력");
					password = scan.next();
					Member member2 = dao.selectMember(id);
					if (member2.getPassword().equals(password)) {
						System.out.println("이메일정보: " + member2.getEmail());
					} else {
						System.out.println("비밀번호 오류");
					}
				} catch (Exception e) {
					System.out.println("ID 또는 비밀번호 오류");
				}
			case 4:
				try {
					System.out.println("회원아이디 입력");
					id = scan.next();
					System.out.println("비밀번호 입력");
					password = scan.next();
					Member member3 = dao.selectMember(id);
					System.out.println(member3);
					if (member3.getPassword().equals(password)) {
						System.out.println(member3.getMemberNum());
						result = dao.deleteMember(member3.getMemberNum());
						if(result>0){
							System.out.println("탈퇴완료");
						}else{
							System.out.println("탈퇴 실패");
						}
					} else {
						System.out.println("비밀번호 오류");
					}
				} catch (Exception e) {
					System.out.println("ID 또는 비밀번호 오류");
				}


			}

		}

	}

}

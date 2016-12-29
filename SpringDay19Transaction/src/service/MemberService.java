package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.Member;

@Component
public class MemberService {

	@Autowired
	private MemberDao dao;

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	//////////////////// Ʈ����� �׽�Ʈ /////////////////////////////

	public void memberFunc() throws Exception {

		Member member1 = new Member("������", "1234", "k@k.com", "010-1111-2222");

		Member member2 = new Member("������", "5678", "p@p.com", "010-3333-4444");
		
		dao.insert(member1); // SQL1
		
		if(true){
			throw new Exception("�ǵ��� ���ܰ�ü");
		}
		
		dao.insert(member2); // SQL2

	}

}

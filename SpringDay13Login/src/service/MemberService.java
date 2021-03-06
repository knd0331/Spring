package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.Member;

@Component
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	
	public boolean join(Member member){
		//회원가입 절차 부가작업
		if(memberDao.insert(member)>0)
			return true;
		else {
			return false;
		}
	}

}

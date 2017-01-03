package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.Member;

@Component
public class MemberService {
	
	
	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public boolean joinMember(Member member){
		if(memberDao.insert(member)>0){
			return true;
		}else {
			return false;
		}
	}
	public boolean checkId(String id){
		String result = memberDao.selectId(id);
		System.out.println(id);
		System.out.println(result);
		
		if(result==null||result.length()==0)
			return false;
		else
			return true;
	}
	
	public boolean memberCheck(String id, String password){
		Member member = memberDao.select(id, password);
		
		if(member==null || 
				!member.getPassword().equals(password)){
			return false;
		}else{
			return true;
		}
	}
}








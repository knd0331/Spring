package mapper;

import java.util.List;
import java.util.Map;

import vo.Member;

public interface MemberMapper {
	
	public int insertMember(Member member);
	
	public int updatePassword(Map<String, String>map);
	
	public int deleteMember(int memberNum);
	
	public Member selectMember(String id);
	
	public List<Member>selectMemberList();
	

}

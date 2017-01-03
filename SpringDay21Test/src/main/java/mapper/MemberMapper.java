package mapper;

import vo.Member;

public interface MemberMapper {
	
	public int insert(Member member);
	
	public Member select(String id);
	
	public String selectId(String id);
}

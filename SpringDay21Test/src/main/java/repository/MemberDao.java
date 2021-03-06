package repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.MemberMapper;
import vo.Member;

@Component
public class MemberDao {
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(Member member){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.insert(member);
	}
	
	public Member select(String id){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.select(id);
	}
	public String selectId(String id){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		return mapper.selectId(id);
	}
}








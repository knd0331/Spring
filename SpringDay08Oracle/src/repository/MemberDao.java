package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.MemberMapper;
import vo.Member;

@Component("member")
public class MemberDao {

	private SqlSessionTemplate sessionTemplate;

	@Autowired
	public void setTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	public int insertMember(Member member){
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		return mapper.insertMember(member);
	}
	public int updatePassword(String pw,String id){
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		Map<String, String>map = new HashMap<>();
		map.put("password", pw);
		map.put("id", id);
		return mapper.updatePassword(map);
	}
	public int deleteMember(int memberNum){
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		return mapper.deleteMember(memberNum);
	}
	public Member selectMember(String id){
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		return mapper.selectMember(id);
	}
	public List<Member> selectMemberList(){
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		return mapper.selectMemberList();
	}

}

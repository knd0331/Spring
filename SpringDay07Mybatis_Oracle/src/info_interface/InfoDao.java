package info_interface;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SqlBuilder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.Info;

public class InfoDao {
	
	private SqlSessionFactory factory;
	
	
	public InfoDao(){
		String resource = "mybatis_xml/conf.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int insertInfo(Info info){
		SqlSession session = factory.openSession(true);
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		return mapper.insertInfo(info);
	}
	public int updateInfo(String address,int infoNum){
		SqlSession session = factory.openSession(true);
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		Map<String, Object>map = new HashMap<>();
		map.put("address", address);
		map.put("infoNum", infoNum);
		return mapper.updateInfo(map);
	}
	public int deleteInfo(int infoNum){
		SqlSession session = factory.openSession(true);
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		return mapper.deleteInfo(infoNum);
	}
	public Info selectInfo(int infoNum){ 
		SqlSession session = factory.openSession(true);
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		return mapper.selectInfo(infoNum);
	}
	public List<Info> selectInfoList(){
		SqlSession session = factory.openSession(true);
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		return mapper.selectInfoList();
	}


	
	

}

package info_interface;

import java.util.List;
import java.util.Map;

import vo.Info;

public interface InfoMapper {
	
	public int insertInfo(Info info);
	
	public int updateInfo(Map<String, Object>map);
	
	public int deleteInfo(int infoNum);
	
	public Info selectInfo(int infoNum);
	
	public List<Info> selectInfoList();
	

}

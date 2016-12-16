package info_interface;

import vo.Info;

public class Test {
	public static void main(String[] args) {
		
		InfoDao dao = new InfoDao();
		
		Info i  = new Info("PARK", "940806", "Áß±¸", "010-5678-4321");
		
		System.out.println(dao.insertInfo(i));
		
	}

}

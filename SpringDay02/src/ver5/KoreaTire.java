package ver5;

import org.springframework.stereotype.Component;

//�̸� �Ⱥ��̸� Ŭ���� �̸��� ù���� �ҹ��ڷ� �ٲ��̸� �ڵ����
@Component
public class KoreaTire implements Tire{
	
	public String getModel(){
		return "����";
	}

}

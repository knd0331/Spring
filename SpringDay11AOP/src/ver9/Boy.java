package ver9;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person {

	@Override
	public String makeFood(int arg) throws Exception {
		////////////////////////
		// �ٽ� ���ɻ���
		System.out.println("�ø��� �����."+arg);
		if (new Random().nextBoolean()) {
			throw new Exception("�ҳ���.");// ���ܻ�Ȳ�߻�
		}
		/////////////////////////
		return "�ø� �ϼ�.";
	}

}

package ver8;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class Girl implements Person {

	@Override
	public String makeFood(int arg) throws Exception {
		////////////////////////
		// �ٽ� ���ɻ���
		System.out.println("���� �����."+arg);
		if (new Random().nextBoolean()) {
			throw new Exception("��Ⱑ ����.");// ���ܻ�Ȳ�߻�
		}
		/////////////////////////
		return "���� �ϼ�";
	}
}

package ver7;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class Boy implements Person {

	@Override
	public void makeFood() throws Exception {


		////////////////////////
		// �ٽ� ���ɻ���
		System.out.println("�ø��� �����.");
		if (new Random().nextBoolean()) {
			throw new Exception("�ҳ���.");// ���ܻ�Ȳ�߻�
		}
		/////////////////////////
	}
}

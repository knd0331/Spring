package ver3;

import java.util.Random;

public class Boy implements Person {

	@Override
	public void makeFood() throws Exception {


		////////////////////////
		// 핵심 관심사항
		System.out.println("냉면을 만든다.");
		if (new Random().nextBoolean()) {
			throw new Exception("불났다.");// 예외상황발생
		}
		/////////////////////////
	}
}

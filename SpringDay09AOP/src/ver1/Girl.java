package ver1;

import java.util.Random;

public class Girl implements Person {
	@Override
	public void makeFood() {

		System.out.println("배가 고프다.");

		////////////////////////
		// 핵심 관심사항
		try {
			System.out.println("갈비를 만든다.");
			if (new Random().nextBoolean()) {
				throw new Exception("고기가 없다.");// 예외상황발생
			}
			/////////////////////////
			System.out.println("음식을 먹는다.");
		} catch (Exception e) {// 예외상황처리
			System.out.println("엄마를 부른다.");
		} finally {
			System.out.println("설거지를 한다.");
		}
	}

}

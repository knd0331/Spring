package ver9;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class Girl implements Person {

	@Override
	public String makeFood(int arg) throws Exception {
		////////////////////////
		// 핵심 관심사항
		System.out.println("갈비를 만든다."+arg);
		if (new Random().nextBoolean()) {
			throw new Exception("고기가 없다.");// 예외상황발생
		}
		/////////////////////////
		return "갈비 완성";
	}
}

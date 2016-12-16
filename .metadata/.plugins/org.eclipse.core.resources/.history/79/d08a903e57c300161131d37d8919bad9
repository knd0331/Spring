package ver3;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void my_around(ProceedingJoinPoint target) {
		System.out.println("배가 고프다."); // before
		try {

			target.proceed(); // 핵심 관심사항 메소드 실행시점.

			System.out.println("음식을 먹는다.");// after returning
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("엄마를 부른다.");
			e.printStackTrace();
		} finally {
			System.out.println("설거지를 한다."); // after
		}
	}

}

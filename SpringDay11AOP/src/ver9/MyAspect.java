package ver9;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* makeFood(..))")
	public void my_point() {
	}

	@Around("my_point()")
	public void my_around(ProceedingJoinPoint target) {
		// before
		System.out.println("배가 고프다.");
		// 핵심 관심사항 수행전 입력 데이터 받기
		Object[] args = target.getArgs();
		System.out.println(args[0] + "인분 음식을 만들겠다.");
		try {

			Object result = target.proceed(); // 핵심 관심사항 메소드 실행시점.

			System.out.println(result + "음식을 먹는다.");// after returning 정상종료
		} catch (Throwable e) {
			// after throwing
			System.out.println(e.getMessage() + "엄마를 부른다.");
			e.printStackTrace();
		} finally {
			System.out.println("설거지를 한다."); // after
		}
	}

}

package ver6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Boy , Girl 클래스들에 공통으로 적용하고자 하는
//공통 관심사항 클래스
@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(void makeFood())")
	public void point() {
	}

	// 핵심관심사항 수행전 작업
	@Before("point()")
	public void my_before() {
		System.out.println("배가 고프다.");
	}

	// 핵심관심사항 정상 종료후 작업
	@AfterReturning("point()")
	public void my_after_returning() {
		System.out.println("음식을 먹는다.");
	}

	// 핵심관심사항 에러 종료후 작업
	@AfterThrowing("point()")
	public void my_after_throwing() {
		System.out.println("엄마를 부른다.");
	}

	// 핵심관심사항 정상 ,에러 이건 마지막 작업
	@After("point()")
	public void my_after() {
		System.out.println("설거지를 한다.");
	}
}

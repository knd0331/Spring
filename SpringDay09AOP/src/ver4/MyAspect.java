package ver4;

import org.aspectj.lang.JoinPoint;

//Boy , Girl 클래스들에 공통으로 적용하고자 하는
//공통 관심사항 클래스
public class MyAspect {

	// 핵심관심사항 수행전 전달되는 인자값을 먼저받아서작업
	// args 배열의 크기는 핵심관심사항에 들어가는 인자의 갯수
	public void my_before(JoinPoint joinPoint) {
		System.out.println("배가 고프다.");
		Object[]args = joinPoint.getArgs();
		System.out.println("before 준비물:"+args[0]);
	}

	// 핵심관심사항의 반환값은 자료형은 알수없지만 갯수는 항상 1개
	// Object 변수 하나로 받아오면됨
	public void my_after_returning(Object result) {
		System.out.println(result +"음식을 먹는다.");
	}

	// 핵심관심사항 예외발생으로 예외객체 핸들링을 원한다면 예외객체 받아볼수있음 
	public void my_after_throwing(Exception ex) {
		System.out.println(ex.getMessage()+"엄마를 부른다.");
	}

	// 핵심관심사항 정상 ,에러 이건 마지막 작업
	public void my_after() {
		System.out.println("설거지를 한다.");
	}
}

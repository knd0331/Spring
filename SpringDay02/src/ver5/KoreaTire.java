package ver5;

import org.springframework.stereotype.Component;

//이름 안붙이면 클래스 이름의 첫글자 소문자로 바꾼이름 자동등록
@Component
public class KoreaTire implements Tire{
	
	public String getModel(){
		return "국산";
	}

}

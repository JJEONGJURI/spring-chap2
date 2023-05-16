package gdu.kr.chap2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //@Component 막으면 컨테이너에 등록안됨 / 아니면 xml에 직접 하나씩 만들면 됨
public class SmartPhoneView implements Viewer{

	@Autowired //주입이 돼야 객체 생성 완료됨
	private DisplayMode displayMode; //DisplayMode 객체 주입.
	
	@Override
	public void add(Camera camera) {
		System.out.println("모니터에 " + camera + "영상 추가");
	}

	@Override
	public void draw() { //grid 여기서 출력
		System.out.println(displayMode.getType() + "모드로 카메라 이미지 출력");
	}
	
}

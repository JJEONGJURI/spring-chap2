package gdu.kr.chap2;

import org.springframework.stereotype.Component;

@Component //객체를 주입하기 위해 component  사용
public class SmsAlarmDevice implements AlarmDevice {
	@Override
	public void alarm(String name) {
		System.out.println(name + "에서 침입이 탐지됨. 신고 요망");
	}
}

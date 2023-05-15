package gdu.kr.chap2;

public class DisplayMode {
	/*
	 <bean id="displayMode" class="gdu.kr.chap2.DisplayMode" p:type="GRID" />
	 */
	private String type; //GRID 저장

	public String getType() {
		return type;
	}

	public void setType(String type) { //grid 가 type으로 들어감
		this.type = type;
	}
	
}

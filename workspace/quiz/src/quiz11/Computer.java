package quiz11;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	private KeyBoard kb;
	private Mouse mou;
	private Monitor moni;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	
	public Computer() {
		this.kb = new KeyBoard();
		this.mou = new Mouse();
		this.moni = new Monitor();
	}

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	
	public Computer(KeyBoard kb, Mouse mou, Monitor moni) {
		this.kb = kb;
		this.mou = mou;
		this.moni = moni;
	}

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	public void computerInfo() {
		kb.info();
		mou.info();
		moni.info();
	}

	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요
	
	public KeyBoard getKb() {
		return kb;
	}
	
	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}
	
	public Mouse getMou() {
		return mou;
	}
	
	public void setMou(Mouse mou) {
		this.mou = mou;
	}
	
	public Monitor getMoni() {
		return moni;
	}
	
	public void setMoni(Monitor moni) {
		this.moni = moni;
	}
	
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
	
	
	
	
	
	
}

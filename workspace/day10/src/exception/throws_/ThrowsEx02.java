package exception.throws_;

public class ThrowsEx02 {
	
	//생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	
	}
	
	//메서드
	public void aaa() throws Exception {
		System.out.println("aaa 호출");
		bbb(0);
		System.out.println("aaa 종료");
	}
	public void bbb(int num) throws Exception {
		System.out.println("bbb 호출");
		/*try {
			System.out.println(10 / num);
		} catch (Exception e) {
			System.out.println("예외처리 완료");
		}
		*/
		System.out.println(10 / num);
		
		System.out.println("bbb 종료");
		
	}

}

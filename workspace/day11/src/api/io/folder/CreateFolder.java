package api.io.folder;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		
		/*
		 * java에서 외부경로로 폴더를 생성할 때는 File클래스를 사용
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명을 작성
		 */
		
		
		
		try {
			File file = new File("C:\\Users\\user\\Desktop\\course\\java\\fileupload\\folder_test");
			
			if(!file.exists()) { //존재하면 true, 없다면 false
				file.mkdir();    //폴더 생성
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("이미 존재하는 폴더명 입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

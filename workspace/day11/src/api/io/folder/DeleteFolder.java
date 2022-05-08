package api.io.folder;

import java.io.File;

public class DeleteFolder {
	
	public static void main(String[] args) {
		
		//폴더or 파일을 지우는 방법.
		
		try {
			//폴더 경로 + \\지울폴더
			File file = new File("C:\\Users\\user\\Desktop\\course\\java\\fileupload\\folder_test");
			
			if(file.exists()) {
				file.delete();     //삭제되면 true, 실패시 false
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

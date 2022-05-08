package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {
	
	public static void main(String[] args) {
		
		//. inputSteram. outputStream은 문자를 읽기에 적합하지 않고,
		// 이미지, 동영상 파일을 읽는데 사용
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\user\\Desktop\\course\\java\\fileupload\\huhuhu.jpg"); //읽어드릴 파일경로
			
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\file\\huhuhu_copy.jpg"); //쓸 파일경로
			
			byte[] arr = new byte[100];//100바이트 단위로 읽는다
						
//			while(true) {
//				
//				int result = fis.read(arr);
//				
//				if (result == -1) break;
//				
//				fos.write(arr, 0, result);  //배열의 0에서~읽은 길이까지 써내린다
////				System.out.println(result); //읽어온 데이터의 길이
//				
//			}
			int result;
			while((result = fis.read(arr)) != -1) {
				fos.write(arr, 0, result);
				
			}

			System.out.println("파일 정상 복사!");
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
		
		
	}

}

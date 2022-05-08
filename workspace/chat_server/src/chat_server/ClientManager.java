package chat_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManager extends Thread {
	
	private Socket socket;
	private String id;
	
	public ClientManager(Socket socket) {
		this.socket = socket;
	}

	
	@Override
	public void run() {
		
		try {
			//소켓으로부터 전달된 입력 스트림을 받는다.
			BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			while(true) {
				String message = bf.readLine();
				
				//1. socket 연결이 끊어진 경우
				//2. socket 연결이 전달된 경우
				//3. 일반 메세지가 전달된 경우
				
				//1.
				//message == null >> 연결이 끊겼다
				//퇴장메시지를 list안에 모든 클라이언트한테 전달
				if(message == null) {
					System.out.println("서버로그:" + id + "님이 퇴장했습니다.");
					
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);
						
						out.println(id + "님이 퇴장했습니다.");
						out.flush(); //송신
					}
					break;
				}
				
				//2.
				//구분자를 통해 아이디 부분 추출
				String[] split = message.split(":");
				//모든 클라이언트에 입장 메세지를 전달하는 부분
				if(split.length == 2 && split[0].equals("ID")) {
					this.id = split[1]; //:기준 뒷부분 저장
					System.out.println("서버로그:" + this.id + "님이 입장하였습니다.");
					
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter pw = MainServer.list.get(i);
						
						pw.println(id + "님이 입장하였습니다.");
						pw.flush();
					}
					continue; //처음으로 돌아가서 다음메세지 대기 상태로
				}
				
				//3.
				//하나의 클라이언트에서 넘어온 메세지를 접속해 있는 모든 클라이언트에 전달
				for(int i = 0; i < MainServer.list.size(); i++) {
					PrintWriter pw = MainServer.list.get(i);
					pw.println(this.id + ">" + message);
					pw.flush();
				}
				
				//서버에 올라오는 메세지
				System.out.println("서버로그:" + id + ">" + message);
				
			} //while end
			
			//while문을 탈출하면, 연결의 종료를 의미하므로 리스트에서 해당 클라이언트를 지운다.
			MainServer.list.remove(new PrintWriter(socket.getOutputStream()));
			
			
			
		} catch (Exception e) {
			System.out.println(this.id + "님 연결이 끊겼습니다.");
		}
		
	}

}

package chat_server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MainServer {

	/* 
	 * 채팅은 클라이언트와 클라이언트의 대화
	 * 즉, 서버는 클라이언트의 채팅글만 전달하고, 채팅에 참여x
	 * 그래서 서버는 여러 클라이언트를 서로 연결할 수 있게끔 한다.
	 * 그 내용을 각각의 클라이언트에게 저너달하도록 만든다.
	 */
	
	//서버에 접속하는 클라이언트의 output을 저장하는 리스트
	public static ArrayList<PrintWriter> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(8383); //서버소켓(포트)
			
			//접속이 이루어지면, 종료되는 형태가 아니고, 다음 접속을 받을 수 있도록 처리
			while(true) { 
				//연결
				System.out.println("..........연결대기...........");
				Socket socket = serverSocket.accept();
				System.out.println("..........연결완료...........");
				
				//요청이 들어오면 클라이언트 관리클래스를 생성하고, 소켓의 output정보를 리스트에 저장.
				ClientManager client = new ClientManager(socket);
				//list에는 연결된 사람의 아웃풋 정보를 PW객체에 담아 저장.
				list.add(new PrintWriter(socket.getOutputStream()));				
				
				//thread 시작
				client.start();
			}
			
			
		} catch (Exception e) {
			System.out.println("MainServer error");
			e.printStackTrace();
		}
		
	}

}

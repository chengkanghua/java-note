package cn.learn.day19;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUserTest {

	public static void main(String[] args) {
		
		try {
			// 1.����ServerSocket���͵Ķ����ṩ�˿ں�
			ServerSocket ss = new ServerSocket(8888);
			
			// 2.�ȴ��ͻ��˵��������󣬵���accept����
			System.out.println("�ȴ��ͻ��˵���������...");
			Socket s = ss.accept();
			System.out.println("�ͻ������ӳɹ���");
			
			// 3.ʹ���������������ͨ��
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			Object obj = ois.readObject();
			System.out.println("���������յ������������ǣ�" + obj);
			
			// 4.�ر�Socket
			ois.close();
			s.close();
			ss.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package cn.learn.day19;

import java.io.ObjectOutputStream;
//import java.net.*;
import java.net.InetAddress;  
import java.net.Socket;

public class ClientUserTest {

	public static void main(String[] args) {
		
		try {
			// 1.����Socket���͵Ķ����ṩ��������IP��ַ�Ͷ˿ں�
			Socket s = new Socket(InetAddress.getLocalHost(), 8888);
			System.out.println("���ӷ������ɹ���");
			
			// 2.ʹ���������������ͨ��
			// ׼��һ��User���͵Ķ��󲢳�ʼ��
			User tu = new User("admin", "123456");
			// ʹ���������User���͵Ķ������巢�ͳ�ȥ
			ObjectOutputStream oos = 
				new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(tu);
			System.out.println("�ͻ��˷��Ͷ���ɹ���");
			
			// 3.�ر�Socket
			oos.close();
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}

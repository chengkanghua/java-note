package cn.learn.day19;

import java.io.ObjectOutputStream;
//import java.net.*;
import java.net.InetAddress;  
import java.net.Socket;

public class ClientUserTest {

	public static void main(String[] args) {
		
		try {
			// 1.创建Socket类型的对象并提供服务器的IP地址和端口号
			Socket s = new Socket(InetAddress.getLocalHost(), 8888);
			System.out.println("连接服务器成功！");
			
			// 2.使用输入输出流进行通信
			// 准备一个User类型的对象并初始化
			User tu = new User("admin", "123456");
			// 使用输出流将User类型的对象整体发送出去
			ObjectOutputStream oos = 
				new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(tu);
			System.out.println("客户端发送对象成功！");
			
			// 3.关闭Socket
			oos.close();
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}

package cn.learn.day19;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUserTest {

	public static void main(String[] args) {
		
		try {
			// 1.创建ServerSocket类型的对象并提供端口号
			ServerSocket ss = new ServerSocket(8888);
			
			// 2.等待客户端的连接请求，调用accept方法
			System.out.println("等待客户端的连接请求...");
			Socket s = ss.accept();
			System.out.println("客户端连接成功！");
			
			// 3.使用输入输出流进行通信
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			Object obj = ois.readObject();
			System.out.println("服务器接收到的数据内容是：" + obj);
			
			// 4.关闭Socket
			ois.close();
			s.close();
			ss.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

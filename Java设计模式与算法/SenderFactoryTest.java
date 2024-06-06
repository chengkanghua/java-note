package cn.learn.day19;

public class SenderFactoryTest {

	public static void main(String[] args) {
		
		// 声明SenderFactory类型的引用指向该类型的对象
		//SenderFactory sf  = new SenderFactory();
		// 调用成员方法实现对象的创建
		//Sender s = sf.produce("mail");
		//Sender s = sf.produceMail();
		Sender s = SenderFactory.produceMail();
		// 调用产品类中的成员方法实现发送的功能
		s.send();
		
		System.out.println("----------------------------");
		//System.out.println("牙好胃口就好！");
		Sender s2 = new MailSender();
		s2.send();
		
		// 200个对象
	}

}

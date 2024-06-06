package cn.learn.day19;

public class SenderFactory {

	// 自定义成员方法描述构造对象的行为
	// 该方式的缺点：当传入的字符串出错时，可能引发空指针异常
	public Sender produce(String type) {
		// 提高了代码的扩展性和可维护性
		//System.out.println("牙好胃口就好！");
		if("mail".equals(type)) {
			return new MailSender();
		}
		if("sms".equals(type)) {
			return new SmsSender();
		}
		return null;
	}
	
	// 自定义成员方法专门构造MailSender类型的对象
	public static Sender produceMail() {
		return new MailSender();
	}
	// 自定义成员方法专门构造SmsSender类型的对象
	public static Sender produceSms() {
		return new SmsSender();
	}
	// 练习：目前的工厂模式可以实现邮件和短信的发送，
	//       若希望实现包裹(Packet)的发送如何处理？
}

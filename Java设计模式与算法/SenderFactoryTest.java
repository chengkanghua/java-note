package cn.learn.day19;

public class SenderFactoryTest {

	public static void main(String[] args) {
		
		// ����SenderFactory���͵�����ָ������͵Ķ���
		//SenderFactory sf  = new SenderFactory();
		// ���ó�Ա����ʵ�ֶ���Ĵ���
		//Sender s = sf.produce("mail");
		//Sender s = sf.produceMail();
		Sender s = SenderFactory.produceMail();
		// ���ò�Ʒ���еĳ�Ա����ʵ�ַ��͵Ĺ���
		s.send();
		
		System.out.println("----------------------------");
		//System.out.println("����θ�ھͺã�");
		Sender s2 = new MailSender();
		s2.send();
		
		// 200������
	}

}

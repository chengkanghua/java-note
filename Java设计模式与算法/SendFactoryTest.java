package cn.learn.day19;

public class SendFactoryTest {

	public static void main(String[] args) {
		
		// ����SenderFactory���͵�����ָ������͵Ķ���
		//SenderFactory sf  = new SenderFactory();
		// ���ó�Ա����ʵ�ֶ���Ĵ���
		//Sender s = sf.produce("mail");
		//Sender s = sf.produceMail();
		Sender s = SendFactory.produceMail();
		// ���ò�Ʒ���еĳ�Ա����ʵ�ַ��͵Ĺ���
		s.send();
		
		System.out.println("----------------------------");
		//System.out.println("����θ�ھͺã�");
		Sender s2 = new MailSender();
		s2.send();
		
		// 200������
		System.out.println("----------------------------");
		Sender s3 = SendFactory.producePacket();
		s3.send();
		
		System.out.println("----------------------------");
		Provider pv = new MailSendFactory();
		Sender s4 = pv.produce();
		s4.send();
		
		System.out.println("----------------------------");
		Provider pv2 = new PacketSendFactory();
		Sender s5 = pv2.produce();
		s5.send();
	}

}

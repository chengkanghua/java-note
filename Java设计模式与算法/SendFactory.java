package cn.learn.day19;

public class SendFactory {

	// �Զ����Ա������������������Ϊ
	// �÷�ʽ��ȱ�㣺��������ַ�������ʱ������������ָ���쳣
	public Sender produce(String type) {
		// ����˴������չ�ԺͿ�ά����
		//System.out.println("����θ�ھͺã�");
		if("mail".equals(type)) {
			return new MailSender();
		}
		if("sms".equals(type)) {
			return new SmsSender();
		}
		return null;
	}
	
	// �Զ����Ա����ר�Ź���MailSender���͵Ķ���
	public static Sender produceMail() {
		return new MailSender();
	}
	// �Զ����Ա����ר�Ź���SmsSender���͵Ķ���
	public static Sender produceSms() {
		return new SmsSender();
	}
	// ��ϰ��Ŀǰ�Ĺ���ģʽ����ʵ���ʼ��Ͷ��ŵķ��ͣ�
	//       ��ϣ��ʵ�ְ���(Packet)�ķ�����δ���
	// �Զ����Ա����ר�Ź���PacketSender���͵Ķ���
	// ��Ȼʵ������ϰ��Ҫ�󣬵����޸��˹��������Ѳ�����ϵĴ��룬Υ������ԭ��
	public static Sender producePacket() {
		return new PacketSender();
	}
}

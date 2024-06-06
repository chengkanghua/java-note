package cn.learn.day19;

public class MailSendFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender(); 
	}

}

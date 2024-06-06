package cn.learn.day19;

public class SmsSendFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}

package cn.learn.day19;

public class PacketSendFactory implements Provider {

	@Override
	public Sender produce() {
		return new PacketSender();
	}

}

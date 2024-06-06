package cn.learn.day19;

public interface Provider {

	// 自定义抽象方法描述生产的行为
	public abstract Sender produce();
}

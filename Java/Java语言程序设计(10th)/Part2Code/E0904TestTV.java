
public class E904TestTV {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		E903TV tv1 = new E903TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		E903TV tv2 = new E903TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + 
				" and volume level is " + tv1.volumeLevel);
		
		System.out.println("tv2's channel is " + tv2.channel +  
				" and volume level is " + tv2.volumeLevel);
	}

}

package anomymous.basic2;

public class Computer {
	
	private int sound;
	private RemoteControl remote;
	
	
	public Computer() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터 볼륨:" + sound);
				
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터 볼륨:" + sound);
				
			}
			
			@Override
			public void turnOn() {
				System.out.println("Com On");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Com Off");
				
			}
		};
	}

	
	//getter, setter
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
	
}

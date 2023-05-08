package enums;

public enum Transport {

	CAR(200), TRUCK(90), AIRPLANE(600), TRAIN(120), BOAT(60), FOOT(20), JEGUE(10);

	private int speed;
	
	Transport(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}
}


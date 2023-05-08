class Sound {
	public static void main(String[] args) {
		double relationFeetMeter, distanceFromSound, distanceInFeet, distanceInMeters, airSpeedInFeet, airSpeedInMeters;

		relationFeetMeter = 0.3048;
		airSpeedInFeet = 1100;
		distanceFromSound = 7.2;

		distanceInFeet = airSpeedInFeet * distanceFromSound;
		airSpeedInMeters = airSpeedInFeet * relationFeetMeter;
		distanceInMeters = airSpeedInMeters * distanceFromSound;

		System.out.println("The lightning is  " + distanceInFeet + " feet away.");
		System.out.println("O trovão está a " + distanceInMeters + " metros de distância.");
	}
}

package windpark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WindengineData {
	
	private String windengineID;
	private String timestamp;
	
	private double windspeed;
	private String unitWindspeed;

	private double temperature;
	private String unitTemperature;

	private double power;
	private String unitPower;

	private double blindpower;
	private String unitBlindpower;

	private double rotationspeed;
	private String unitRotationspeed;

	private double bladeposition;
	private String unitBladeposition;

	/**
	 * Constructor
	 */
	public WindengineData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.unitWindspeed = "kmH";
		this.unitTemperature = "C";
		this.unitPower = "kwH";
		this.unitBlindpower = "kwH";
		this.unitRotationspeed = "uM";
		this.unitBladeposition = "grad";
		
	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getWindengineID() {
		return windengineID;
	}
	
	public void setWindengineID(String windengineID) {
		this.windengineID = windengineID;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}
	
	public double getWindspeed() {
		return windspeed;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getBlindpower() {
		return blindpower;
	}

	public void setBlindpower(double blindpower) {
		this.blindpower = blindpower;
	}

	public double getRotationspeed() {
		return rotationspeed;
	}

	public void setRotationspeed(double rotationspeed) {
		this.rotationspeed = rotationspeed;
	}

	public double getBladeposition() {
		return bladeposition;
	}

	public void setBladeposition(double bladeposition) {
		this.bladeposition = bladeposition;
	}

	public String getUnitWindspeed() {
		return unitWindspeed;
	}

	public String getUnitTemperature() {
		return unitTemperature;
	}

	public String getUnitPower() {
		return unitPower;
	}

	public String getUnitBlindpower() {
		return unitBlindpower;
	}

	public String getUnitRotationspeed() {
		return unitRotationspeed;
	}

	public String getUnitBladeposition() {
		return unitBladeposition;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		return "{" +
					"\"windengineID\": \"" + this.getWindengineID() + "\", " +
					"\"timestamp\": \"" + this.getTimestamp() + "\", " +
					"\"windspeed\": " + this.getWindspeed() + ", " +
					"\"unitWindspeed\": \"" + this.getUnitWindspeed() + "\", " +
					"\"temperature\": " + this.getTemperature() + ", " +
					"\"unitTemperature\": \"" + this.getUnitTemperature() + "\", " +
					"\"power\": " + this.getPower() + ", " +
					"\"unitPower\": \"" + this.getUnitPower() + "\", " +
					"\"blindpower\": " + this.getBlindpower() + ", " +
					"\"unitBlindpower\": \"" + this.getUnitBlindpower() + "\", " +
					"\"rotationspeed\": " + this.getRotationspeed() + ", " +
					"\"unitRotationspeed\": \"" + this.getUnitRotationspeed() + "\", " +
					"\"bladeposition\": " + this.getBladeposition() + ", " +
					"\"unitBladeposition\": \"" + this.getUnitBladeposition() + "\"" +
				"}";
	}


}

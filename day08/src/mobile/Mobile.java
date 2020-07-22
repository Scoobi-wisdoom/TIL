package mobile;

public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	
	// 1분 사용 시 배터리 10 감소. 잔여 배터리 리턴.
	public int operate(int time) {
		int result = 0;

		return result;
	}
	
	// 1분 충전 시 배터리 10 증가. 잔여 배터리 리턴.
	public int charge(int time) {
		int result = 0;

		return result;
	}
	

	@Override
	public String toString() {
		return " " + mobileName + "		" + batterySize + "		" + osType + " ";
	}

//	@Override
//	public String toString() {
//		return "  Mobile			Battery			OS  %n"+"-----------------------------------------%n"+this.getMobileName()" + batterySize + ", osType=" + osType + "]";
//	}
	
	

}

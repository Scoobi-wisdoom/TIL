package mobile;

public class Otab extends Mobile{
	
	public Otab() {}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	// overriding
	@Override
	public int operate(int time) {
		return super.getBatterySize() - time * 12;
	}
	
	@Override
	public int charge(int time) {
		return super.getBatterySize() + time * 8;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}

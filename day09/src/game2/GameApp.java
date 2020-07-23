package game2;

public class GameApp {

	public static void main(String[] args) {
		Unit u[] = new Unit[4];
		u[0] = new Jet(0, 0, "wing");
		u[1] = new Tank(0, 0, "artilery");
		u[2] = new Medic(0, 0, "bandage");
		u[3] = new Dealer(0, 0, "gun");
		for(Unit unit:u) {
			System.out.println(unit);
		}
		System.out.println();
		
		int move = 1;
		System.out.print("move "+move);
		for(Unit unit:u) {
			unit.move(move,move);
		}
		System.out.println();
		
		for(Unit unit:u) {
			System.out.println(unit);
		}
		
		for(Unit unit:u) {
			if(unit instanceof Mechanic) {
				((Mechanic)unit).repair();
				if(unit instanceof Jet) {
					((Jet)unit).fly();
				} else {
					((Tank)unit).changeMode();
				}
			} else {
				((Human)unit).heal();
				if(unit instanceof Medic) {
					((Medic)unit).support();
				} else {
					((Dealer)unit).stimPack();
				}
			}
			System.out.println();
		}

	}

}

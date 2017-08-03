package core;

public class Healer extends NPC {

	int heal_power=10;
	
	public Healer(String name) {
		super(name);
		super.setHp(1000);
		super.setMp(1000);
		super.setCharacter("lecitel");
	}
	
	@Override
	public void Heal(NPC npc){
		int heal=heal_power*this.getLvl();
		npc.setHp(npc.getHp() + (heal));
		System.out.printf("\n*******\nHrac: %s vylecil hrace %s za %d HP.", this.getName(),npc.getName(),heal);
	}

}
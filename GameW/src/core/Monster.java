package core;

public class Monster extends NPC {

	int poison_power=4;
	
	public Monster(String name) {
		super(name);
		super.setHp(1000);
		super.setMp(50);
		super.setCharacter("prisera");
		super.setLvl(10);
	}

	@Override
	public void PoisonTouch(NPC npc) {
		int attack = poison_power*this.getLvl();
		npc.setHp(npc.getHp() - attack);
		System.out.printf("\n*******\nHrac: %s zautocil na hrace %s a sebral mu %d HP.", this.getName(),npc.getName(),attack);
	}
}

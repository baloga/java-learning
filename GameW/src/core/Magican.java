package core;

public class Magican extends NPC {

	private int magic_power=10;
	
	public Magican(String name) {
		super(name);
		super.setHp(400);
		super.setMp(1000);
		super.setCharacter("kouzelnik");
	}
	
	@Override
	public void MagicAttack(NPC npc){
		int maggicattak=magic_power*this.getLvl();
		npc.setHp(npc.getHp() - maggicattak);
		System.out.printf("\n*******\nHrac: %s zakouzlil na hrace %s a sebral mu %d HP.", this.getName(),npc.getName(),maggicattak);
	}

}

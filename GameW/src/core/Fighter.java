/**
 * 
 */
package core;

/**
 * @author baloga
 *
 */
public class Fighter extends NPC {

	private int attack_power=5;
	
	public Fighter(String name) {
		super(name);
		super.setHp(1000);
		super.setMp(50);
		super.setCharacter("bojovnik");
	}
s
	@Override
	public void Attack(NPC npc) {
		int attack = attack_power*this.getLvl();
		npc.setHp(npc.getHp() - attack);
		System.out.printf("\n*******\nHrac: %s zautocil na hrace %s a sebral mu %d HP.", this.getName(),npc.getName(),attack);
	}	

}

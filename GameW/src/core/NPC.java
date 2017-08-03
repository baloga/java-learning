/**
 * 
 */
package core;

/**
 * @author baloga
 *
 */
abstract class NPC {

	private String name,character;
	private int hp,mp,exp,lvl,attack_power=2;

	public NPC(String name){		
		this.name=name;
		this.exp=0;
		this.lvl=1;
	}

//SPOLECNE METODY
	public void Attack(NPC npc) {
		int attack = attack_power*this.getLvl();
		npc.setHp(npc.getHp() - attack);
		System.out.printf("\n*******\nHrac: %s zautocil na hrace %s a sebral mu %d HP.", this.getName(),npc.getName(),attack);
	}
	
	public void Presentation() {
		System.out.printf("\nAhoj jmenuji se %s a moje povolani je %s.",name,character);
		Statistics();
	}
	
	public void Statistics() {
		System.out.printf("\nHP: %d\nMP: %d\nEXP: %d\nLVL: %d\n-------",hp,mp,exp,lvl);
	}
	
	public void LvlUp() {
		if (exp >= 100) {
			lvl=lvl+1;
			exp=0;
		}
	}

//PREPSANE METODY
	public void MagicAttack(NPC npc) {};
	public void Heal(NPC npc) {};
	public void PoisonTouch(NPC npc) {};
	
//GET, SETT	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	};
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	};
	
	public String getName() {
		return name;
	}

	public void setName(String character) {
		this.name = character;
	};	
	
	
	
}

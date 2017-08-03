/**
 * 
 */
package core;

/**
 * @author baloga
 *
 */
public class MainGame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NPC Jenik = new Fighter("Jenik");
		NPC SpuchlaPrisera = new Monster("Spuchla obluda");
		NPC JanPavel = new Healer("JanPavel");
		NPC Radek = new Magican("Radek");
		
		Jenik.Presentation();		
		Radek.Presentation();					
		SpuchlaPrisera.Presentation();
		JanPavel.Presentation();
								
		Jenik.Attack(SpuchlaPrisera);		
		Jenik.Attack(Radek);		
		Radek.MagicAttack(Jenik);		
		JanPavel.Heal(Jenik);
		
		Radek.MagicAttack(SpuchlaPrisera);
	}

}

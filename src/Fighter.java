
public class Fighter {

	String name;
	int damage,weight,health,dodge;
	double luck;
	
	Fighter(String name,int damage,int weight,int health,int dodge,double luck){
		this.name=name;
		this.health=health;
		this.damage=damage;
		this.weight=weight;
		this.dodge=dodge; 
		this.luck=luck;
	}
	
	
	int hit(Fighter foe) {
		System.out.println(this.name + "=> " + foe.name + " " + this.damage + " Hasar Vurdu." );
		if(foe.isDodge()) {
			System.out.println(foe.name + "Hasarı karşıladı.");
			return foe.health;
		}
		
		if(foe.health - this.damage<0) {
			return 0;
		}
		return foe.health - this.damage;
		
	}
	
	boolean isDodge() {
		double randomNumber=Math.random()*100;
		return randomNumber <= this.dodge;   
	}
}






















public class Match {
	Fighter f1;
	Fighter f2;
	int maxWeight,minWeight;
	
	
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        
	}
	
	void run() {
		if(isCheck()) {
				luck();
			while(this.f1.health>0 && this.f2.health>0) {			
				
				System.out.println("=====Yeni round=====");
				
				this.f2.health=this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				this.f1.health=this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				
				System.out.println(this.f1.name  + "==" + f1.health + " "+ this.f2.name + "==" +this.f2.health);
			}
		}else {
			System.out.println("sikletler uyuşmuyor.");
		}
	}
	
	boolean isCheck(){
		return(f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
		
	}
	
	
	boolean isWin() {
		if(this.f1.health==0) {
			System.out.println(f2.name + "kazandı.");
		return true;
		}
		
		if(this.f2.health==0) {
			System.out.println(f1.name + "kazandı.");
		return true;
		}
		return false;
	}
	void luck() {
		this.f1.luck = Math.round(Math.random());
		this.f2.luck = Math.round(Math.random());
		if(this.f2.luck>this.f1.luck) {
			 this.f2.health = this.f1.hit(this.f2);
		}
		
	}
	
	
	
}

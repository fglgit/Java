public class ConstructorDetial{
	public static void main(String[] args){
		Cs ct=new Cs();
		ct.info();
		ct.detial();

	}
}
class Cs{
	int money;
	int hp;
	public void info(){
		System.out.println("hp="+this.hp);
		System.out.println("money="+this.money);
	}
	public void detial(){
		info();
		this.info();
	}
	public Cs(){
		this(99);
		System.out.println("Cs()构造器");
	}
	public Cs(int hp){
		System.out.println("Cs(int hp)构造器");
		this.hp=hp;
	}
}
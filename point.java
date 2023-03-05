//5 method overriding
abstract class point {
	String boss = "kraft";
	abstract void meth();
	String myp(){
	return boss;
	}
}
	
class portal extends point{
	void meth(){
		System.out.println("overriding is done here.");
	}
}
	
class kitten {
	public static void main (String args[]){
		portal p=new portal();
		p.meth();
		System.out.print("my name is "+p.myp());
	}
		
	}



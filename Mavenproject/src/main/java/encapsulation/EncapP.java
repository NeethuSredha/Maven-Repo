package encapsulation;

public class EncapP {
	private String name;
	private int rollNum;
	
	public void set(String name,int rollNum) {
		this.name=name;
		this.rollNum=rollNum;
	}
	public void get() {
		System.out.println("Name :"+name+" Roll Num :"+rollNum);
	}
	
}

package overloading;

public class UseAddition {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		System.out.println(a.add(10));
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20,40));
		
	}

}

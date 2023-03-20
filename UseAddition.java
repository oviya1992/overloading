package overloading;

public class UseAddition {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		System.out.println(a.add(100));
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20,40));
		
	}

}

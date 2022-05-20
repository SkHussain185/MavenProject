package ProjectClass;

public class Palindrom {
	
	public static void main(String[] args) {
		
		String a = "anna";
		
		String out="";
		
		for (int i=a.length()-1; i>=0; i--) {
			
			char charAt = a.charAt(i);
			
			out=out+charAt;
		}
		System.out.println(out);
		
		if(a.equals(out)) {
			System.out.println("is a palidrom");
		}
		else {
			System.out.println("is not a palindrom");
		}
		
		
	}
}


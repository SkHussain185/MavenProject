package com.hello;

public class ProjectClassBasicProgram {
	
	static void reverse(int a) {
		//int a = 345;
		int rev = 0;
		
		while (a>0) {	
			int b = a/10;
			int c = a%10;
			rev = c+(rev*10);
			a=b;
		}
		System.out.println(rev);
	//	return rev;
	}
	public String primenumber(int a) {
		
		int b = 0;
		for (int i = 2; i < a; i++) {
			
			if(a%i==0) {
			b++;
			break;
		}
		}
		if(b==0) {
			return "Prime no";
		}else {
			return "not a primenumber";
		}
	}
		public void reversestring() {
			String s = "ava";
			String output = "";
			
			for (int i = s.length()-1; i>=0; i--) 
			{
				char charAt = s.charAt(i);
				output = output+charAt;	
			}
			System.out.println(output);
			if (s.equals(output)) {
				System.out.println("is palindrome");
			}else {
				System.out.println("is not palindrome");
			}
		}
	public static void main(String[] args) {
		reverse(123);
		ProjectClassBasicProgram a = new ProjectClassBasicProgram();
		String primenumber = a.primenumber(11);
		System.out.println(primenumber);
		a.reversestring();
	}
}

//	public static void main(String[] args) {
//		
//		int a = 543;
//		int rev =0;
//		
//		while(a>0) 
//		{
//			int b = a/10;
//			int c = a%10;
//			rev = c+(rev*10);
//			a=b;	
//		}
//		
//		System.out.println(rev);
//	}
//}


package ProjectClass;

public class Split {
	
	public static void main(String[] args) {
		
	String a = "java program";
	  
	String[] split = a.split(" ");
	
	//Split[java program]
			
			String output = "";
			
			for (String a1 : split) {
				
				for (int i = a.length()-1; i >=0; i--) {
					
					char charAt = a.charAt(i);
					output =output+charAt;
				}
				output = output+"";
				
			}
			System.out.println(output);
	
	}

}

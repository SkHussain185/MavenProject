package ProjectClass;

public class StringMultiplication {
	
	public static void main(String[] args) {
		
	String s = "2+3*4/2/2";
	
	char[] cs = s.toCharArray();//.......
	
	char c = cs[0];
	
	//int value=0;
	
	int value = Character.getNumericValue(c);
	
	for (int i = 0; i < cs.length; i++) {
		char d = cs[i];
		
		switch (d) {
		case '+':
			int numericValue2 = Character.getNumericValue(cs[i+1]);
			value =value+numericValue2;
			break;
		case '-':
			int numericValue3 = Character.getNumericValue(cs[i+1]);
			value =value-numericValue3;
			break;
		case '*':
			int numericValue4 = Character.getNumericValue(cs[i+1]);
			value =value*numericValue4;
			break;
		case '/':
			int numericValue5 = Character.getNumericValue(cs[i+1]);
			value =value/numericValue5;
			break;

		default:
			break;
		}	
	}
	System.out.println(value);
	}
}

package test;

public class test1 {

public static String countlegthofword(String st) {
		String result = null;
		int length = 0;
		String[] temp = st.split(" ");
		for (String a : temp) {
			if (length < a.length()) {
				length = a.length();
				result = a;
				}
		}
		result = length + " and " + result;
		return result;
	}

	public static void main(String[] args) {
		String st = "The cow jumped over the moon";   //sentence
		String result = countlegthofword(st);
		System.out.println(result);  //it will give output
	}
	 
}

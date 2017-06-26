package iappsqainterview;

public class StringProblem {

	public static String removeCharFromString(String str,char ch) {
		if(str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i) != ch){
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	

	public static String removeCharFromString1(String str,char ch) {
		if(str == null) {
			return null;
		}
		return str.replaceAll(ch+"", "");
	}
	
}

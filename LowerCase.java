
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String s) {
		String ns = ""; 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
			}
			
        ns += ch;
		}	
		
		return ns;
	}
}
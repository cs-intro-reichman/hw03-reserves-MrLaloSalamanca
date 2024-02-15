
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    
    public static String uniqueChars(String s) {
        String n = ""; 
		int i = 0;
		
		while ( i < s.length() ) {
			 char ch = s.charAt(i);
			 
			 if ( s.indexOf(ch) != i && ch != ' ') {
				i++;
				
			} else {
				n += ch;
				i++;
			}
			
		}
        return n;
    }
}

public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	
	
	

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
	 	advance ( dayOfMonth,  month,  year, n);
			
}
					
				

	 

	
	
	 private static void advance(int dayOfMonth, int month, int year, int n) {
		 while (year < n) {
			 
			while ( month <= 12) {
				
				while ( dayOfMonth <= nDaysInMonth ( month, year) ) {
					dayOfMonth ++ ;
					dayOfWeek ++ ;
				}
					
				month ++ ;
				dayOfMonth = 1;
			}
			
			month = 1;
			dayOfMonth = 1;
			year ++;
		 }
		 
			 
			while ( month <= 12) {	
				while ( dayOfMonth <= nDaysInMonth ( month, year) ) {
					System.out.print (dayOfMonth + "/" + month + "/" + year);
						if ((dayOfWeek - 1) % 7 == 0) {
							System.out.print (" Sunday");
							}		
					System.out.println();
					dayOfMonth ++ ;
					dayOfWeek ++ ;
					}
				month ++ ;
				dayOfMonth = 1;
			}
		 
	}
	 
				
				

	private static boolean isLeapYear(int year) {
	     if ( year % 100 == 0) {
			
			if (year % 400 == 0) { 
			return true;
			
			} else {
				return false; 
			}
			
		} else {
			
			if (year % 4 == 0) {
				return true;
				
			} else {
				return false;
			}
		}
	}
	
	 
	private static int nDaysInMonth(int month, int year) {
		if (month == 2) {
			
			if (isLeapYear(year)) {
				return 29;
				
			} else {
				return 28;
			}
			
				} else {
					if ( month != 4 && month != 6 && month != 9 && month != 11) {
					return 31;
				
						} else {
							return 30;
 			}
		}
		
	}
}
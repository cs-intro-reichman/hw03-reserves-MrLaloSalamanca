
public class Calendar1 {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	static int firstSundayCounter = 0;
	
	

	public static void main(String args[]) {
	    int debugDaysCounter = 0; 
	 	while (year <=1999) {
			while ( month <= 12) {	
				while ( dayOfMonth <= nDaysInMonth ( month, year) ) {
					advance(dayOfMonth, month, year);
					dayOfMonth ++ ;
					dayOfWeek ++ ;
					debugDaysCounter++;
					}
				month ++ ;
				dayOfMonth = 1;
			}
			month = 1;
			dayOfMonth = 1;
			year ++;
			
			if (debugDaysCounter == 36500) {
				break; 
			}
		}
					
				
		System.out.println();
	 	System.out.println ("During the 20th century, " + firstSundayCounter + " Sundays fell on the first day of the month");

	 }

	
	
	 private static void advance(int dayOfMonth, int month, int year) {
			System.out.print (dayOfMonth + "/" + month + "/" + year);
			if ((dayOfWeek - 1) % 7 == 0) {
					System.out.print (" Sunday");
					
					if (dayOfMonth == 1) {
						firstSundayCounter ++;
					}
				}
			System.out.println();
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
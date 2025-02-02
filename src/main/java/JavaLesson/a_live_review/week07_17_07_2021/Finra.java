package a_live_review.week07_17_07_2021;

public class Finra {

	public static void main(String[] args) {

		/*
		 * write a program that prints out all the numbers from 1 to 100, except for these conditions:
    - For numbers which are multiple of 3 and 5 print "FINRA" instead of the number
    - For numbers which are multiple of 3, print "FIN" instead of the number
    - For numbers which are multiple of 5, print "RA" instead of the number
Ex: 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ... 
		 */
		
		for (int i = 1; i<=100; i++) {
			if (i % (3*5) == 0) {
				System.out.print ("FINRA ");
			} else if (i % 3 == 0) {
				System.out.print ("FIN ");
			} else if (i % 5 == 0) {
				System.out.print ("RA ");
			} else {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println();
		for (int i = 1; i<=100; i++) {	
			System.out.print(i%15 ==0 ? "FINRA " : (i % 3 ==0 ? "FIN " : (i % 5 == 0 ? "RA " : i + " ")));
			
		}
		
				
	}

}

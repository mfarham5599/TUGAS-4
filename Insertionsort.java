import java.util.Arrays;


public class Insertionsort {
	public static void main(String[] args) {

		Double[] bilangan = {10.0 , 50.1 , 11.2 , 14.3 , 78.4 , 19.5 , 40.6 , 30.7 };
		System.out.println("Data Awal : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("Proses Insertion Sort :");
		System.out.println();
		
		for(int a = 0; a < bilangan.length; a++) {
			System.out.print("Step-"+(a+1)+"--> ");
			Double key = bilangan[a];
			int c = a-1;
			while (c>=0 && bilangan[c] >key) {
				bilangan[c+1] = bilangan[c];
				c = c-1;
			}
			bilangan[c+1] = key;	
			System.out.println(Arrays.toString(bilangan));
			} 
			
		
		System.out.println();
		System.out.println("Hasil Sorting Insertion : "+Arrays.toString(bilangan));
			
		}
}	   





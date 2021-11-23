import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Connect data = new Connect();
		String ulg = "y";
        while (ulg.equals("y")){
	        System.out.println(" ");
	        Scanner input = new Scanner(System.in);
	        String ul="";
	        
	        System.out.println("EVOD");
	        System.out.println("0. Menampilkan semua Ayat");
	        System.out.println("1. Mencari ayat berdasarkan periods");
			System.out.println("2. Mencari ayat berdasarkan events");
			System.out.println("3. Exit");
	        
	        System.out.print("Pilihan [0/1/2/3] = ");
	        int pilih = input.nextInt();
	        
	        if(pilih == 0 || pilih == 1 || pilih == 2 || pilih == 3 ) {
	        	switch (pilih) {
	        		case 0:
		            	data.viewAllVerses();
		                break;
	                
		            case 1:
		            	Scanner input1 = new Scanner(System.in);
		            	System.out.print("Masukan periods : ");
		            	int pilih1 = input1.nextInt();
		            	data.searchPeriods(pilih1);
		                break;
		                
		            case 2:
			            Scanner input2 = new Scanner(System.in);
			        	System.out.print("Masukan events : ");
			        	String pilih2 = input2.nextLine();
			        	data.searchEvents(pilih2);
			        	break;
			        	
		            case 3:
		            	System.out.println("\n==============================\nAplikasi Berhenti.\nTerima Kasih telah menggunakan Aplikasi ini.\n==============================");
		                System.exit(0); 
		                
	        	}
	        }else {
	        	System.out.println("\n==============================\nInput yang Anda masukan salah\n==============================");
	        }
        }

	}
}

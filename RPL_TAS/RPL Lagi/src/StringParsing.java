import java.util.*;

public class StringParsing{
	private String kunci;
	private String[] kunci2;
	private String hasil;
	
	public StringParsing(String kunci){
		this.kunci = kunci;
		parsingString();
	}
	
	public String getKunciParsing() {
		String hasil = "";
		for(int i=0;i<this.kunci2.length;i++){
			if(i != this.kunci2.length-1) {
//				System.out.println(this.kunci2[i]);
				hasil = hasil.concat("verseText LIKE '%");
				hasil = hasil.concat(this.kunci2[i]);
				hasil = hasil.concat("%' OR ") ;
			}else {
//				hasil = hasil+ "verseText LIKE '%"+this.kunci2[i]+"%'" ;
				hasil = hasil.concat("verseText LIKE '%");
				hasil = hasil.concat(this.kunci2[i]);
				hasil = hasil.concat("%'") ;
			}
          
		}
		this.hasil = hasil;
		return hasil;
	}
	
	public void parsingString() {
		this.kunci2 = kunci.split(" ");
	}
	

	
	
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan kata pencarian :");
//
//        String kunci = input.nextLine();
//
//        String[] kunci_list = kunci.split(" ");
//        for(int i=0;i<kunci_list.length ;i++){
//            System.out.println(kunci_list[i]);
//        }
    	
    	
    	// Ini yang bener
//   	StringParsing test = new StringParsing("God creates all things");
//   	System.out.println(test.getKunciParsing());

    	
//    	 for(int i=0;i<test.getKunciParsing().length;i++){
//            System.out.println(test.getKunciParsing()[i]);
//        }
    }
}
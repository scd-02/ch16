
public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr = "I@love@@@java@@@";
		 String[] arrOfStr = myStr.split("@",0);
		 for (String piece : arrOfStr) {
		 System.out.println(piece);
		 } 
	}

}

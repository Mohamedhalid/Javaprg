//72 to find length,concatenate & replace String
public class Lcr {

	public static void main(String[] args) {
		String str = new String("happy");
		System.out.println("The length of string is :"+str.length());//to find string length
		String s2 = " sad  " ;
		System.out.println(str.concat(s2));//two are strings are concatenated
		System.out.print(str.replaceAll("happy", "loofah"));	//String replaced
	}

}

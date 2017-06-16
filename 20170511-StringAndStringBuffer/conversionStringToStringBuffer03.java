
public class conversionStringToStringBuffer03 {

	public static void main(String[] args) {
		String ss = new String("Hello") ;
		String tt = new String(" Java") ;
		Runnable rr = (Runnable)()->System.out.println(ss + tt);
		rr.run();
	}

}

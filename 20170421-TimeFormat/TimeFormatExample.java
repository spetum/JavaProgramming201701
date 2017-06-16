import java.text.SimpleDateFormat; // for SimpleDateFormat class
import java.util.Date; // for Date class

public class TimeFormatExample {
	public static void main(String[] args) {	
		long time = System.currentTimeMillis();
//		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String str = dayTime.format(new Date(time));
		System.out.println(str);
	}
}
/*
 public class trunc_tweet_tag {

	public static void main(String [] args){

		long time = System.currentTimeMillis(); 

		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		String str = dayTime.format(new Date(time));

		System.out.println(str);

		

		long start = System.currentTimeMillis() ; 

		new trunc_tweet_tag("./message/");

		long end = System.currentTimeMillis(); 

		

		System.out.println((end-start)/1000 +" √  ∞…∏≤");

	}

......



 */
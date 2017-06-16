public class SecondsToDays {
	public static void main(String[] args) {
		// 4743928 seconds
		final int secondInDay = 24*60*60;
		final int secondInHour = 60*60;		
		int seconds =4_743_928;
		int days, hours, minutes, temp ;
		
		days = seconds / secondInDay ;
		temp = seconds % secondInDay;
		
		hours = temp / secondInHour ;
		temp = temp % secondInHour ;		
		
		minutes = temp / 60 ;
		temp = temp % 60 ;
		
		System.out.println( days +" Days " + hours + " Hours "
				+ minutes + " Minutes " + temp + " Seconds" );
	}

}

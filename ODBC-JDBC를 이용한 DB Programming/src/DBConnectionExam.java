import java.sql.*;
/* 
 * MS-Access 2007을 Java에서 접근하기 위해서는 일종의 bridge를 설치해줘야한다.
 * https://www.microsoft.com/ko-kr/download/details.aspx?id=23734
 * 
 * MS-Access 2010은 다음에서 다운로드하여 설치해주자.
 * https://www.microsoft.com/ko-kr/download/details.aspx?id=13255
 * 32bit와 64bit버전이 따로 있을 수 있으니 확인을 하고 다운로드 하자.
 * 
 * 32Bit인 MS-Access 2007은 JRE가 32bit여야 한다.
 * JDBC-ODBC Driver문제 때문에 JDK 7이나 JRE 7을 설치해야 한다.
 * JDBC-ODBC Driver가 1.4부터 1.5까지는 J2EE에 존재했고 
 * 1.6부터 1.7는 SQL문의 파싱과 Apache나 다른 외부 응용과의 연결을 위해 JDk만으로도 가능했다.
 * 그런데 JDK 8, 즉 1.8에서는 이 드라이버 부분이 빠져버렸다.
 * 다른 서드-파티 드라이버를 구입해서 설치해야한다.
 * 
 * 그런데 또 다른 문제는 Eclipse이다.
 * Eclipse Luna 이후 버전에서 기동하기 위해서는 JDK 8.0 64/32Bit를 설치해야 하고
 * Eclipse에서 프로젝트를 빙드는 1.7에 맞추고 JRE는 7.0으로 지정해야 한다.
 * 한가지 주의할 점은 32bit odbc를 지원하는 경우에는 JRE 7.0 32bit를 설치해야만 실습이 가능하다.
 */
public class DBConnectionExam {
	@SuppressWarnings("unused")
/*
	private static String strConnect =
			"jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=C:\\Clouds\\OneDrive\\2016-01\\응용프로그래밍\\person.accdb;;";
*/
	private static String strConnect =
	"jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=C:\\person.accdb;;";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC 선언부의 루틴
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		Connection con = null ;
		Statement stmt = null ;
		
		try {
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User와 Password모두 없는 상황
			//con = DriverManager.getConnection(url) ;
			//con = DriverManager.getConnection(strConnect, "","");
			stmt = con.createStatement();
			System.out.println("Success to connect Database\n");
		} catch (Exception e) {
			System.out.println("Can not connect Database\n");
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
				if (stmt != null) stmt.close() ;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

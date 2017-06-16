import java.sql.*;
/* 
 * MS-Access 2007�� Java���� �����ϱ� ���ؼ��� ������ bridge�� ��ġ������Ѵ�.
 * https://www.microsoft.com/ko-kr/download/details.aspx?id=23734
 * 
 * MS-Access 2010�� �������� �ٿ�ε��Ͽ� ��ġ������.
 * https://www.microsoft.com/ko-kr/download/details.aspx?id=13255
 * 32bit�� 64bit������ ���� ���� �� ������ Ȯ���� �ϰ� �ٿ�ε� ����.
 * 
 * 32Bit�� MS-Access 2007�� JRE�� 32bit���� �Ѵ�.
 * JDBC-ODBC Driver���� ������ JDK 7�̳� JRE 7�� ��ġ�ؾ� �Ѵ�.
 * JDBC-ODBC Driver�� 1.4���� 1.5������ J2EE�� �����߰� 
 * 1.6���� 1.7�� SQL���� �Ľ̰� Apache�� �ٸ� �ܺ� ������� ������ ���� JDk�����ε� �����ߴ�.
 * �׷��� JDK 8, �� 1.8������ �� ����̹� �κ��� �������ȴ�.
 * �ٸ� ����-��Ƽ ����̹��� �����ؼ� ��ġ�ؾ��Ѵ�.
 * 
 * �׷��� �� �ٸ� ������ Eclipse�̴�.
 * Eclipse Luna ���� �������� �⵿�ϱ� ���ؼ��� JDK 8.0 64/32Bit�� ��ġ�ؾ� �ϰ�
 * Eclipse���� ������Ʈ�� ����� 1.7�� ���߰� JRE�� 7.0���� �����ؾ� �Ѵ�.
 * �Ѱ��� ������ ���� 32bit odbc�� �����ϴ� ��쿡�� JRE 7.0 32bit�� ��ġ�ؾ߸� �ǽ��� �����ϴ�.
 */
public class DBConnectionExam {
	@SuppressWarnings("unused")
/*
	private static String strConnect =
			"jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=C:\\Clouds\\OneDrive\\2016-01\\�������α׷���\\person.accdb;;";
*/
	private static String strConnect =
	"jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=C:\\person.accdb;;";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC ������� ��ƾ
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		Connection con = null ;
		Statement stmt = null ;
		
		try {
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User�� Password��� ���� ��Ȳ
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

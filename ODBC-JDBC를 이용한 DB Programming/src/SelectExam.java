import java.sql.* ;

public class SelectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC 선언부의 루틴
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		Connection con = null ;
		Statement stmt = null ;
		ResultSet rs = null ;
		String sql = "Select * from member " ;
		
		try {			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User와 Password모두 없는 상황
	
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("ID\t\tNum\t\tName\t\taddr\t\tphone");
			while (rs.next()){
				System.out.print(rs.getLong("ID")+"\t\t");
				System.out.print(rs.getString("num")+"\t\t");
				System.out.print(rs.getString("member_name")+"\t\t");
				System.out.print(rs.getString("addr")+"\t\t");
				System.out.print(rs.getString("phone")+"\n");
			}
		}catch (Exception e) {
			System.out.println("Cannot connect Database : ");
			e.printStackTrace();
		} finally {
			try {
				if (rs !=null) rs.close();
				if (con != null) con.close();
				if (stmt != null) stmt.close() ;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}



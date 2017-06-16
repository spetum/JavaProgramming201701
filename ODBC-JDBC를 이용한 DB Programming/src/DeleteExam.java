import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC 선언부의 루틴
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		
		Connection con = null ;
		Statement stmt = null ;
		//ResultSet rs = null ; // SQL의 Delete 연산에서는 크게 필요하지 않음
		//String sql = "Select * from member " ; // for select
		//String sql = "Insert into member (num, member_name, addr, phone) values " ; // for Insert
		// String num, member_name, addr, phone; // for Insert
		String num = null ;
		
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("member table에서 자료 삭제하기....");
			System.out.print("삭제할 번호 입력 : ");
			num = br.readLine() ;
//			System.out.println("member table에 자료 추가하기....");
//			System.out.print("번호 입력 : ");
//			num = br.readLine() ;
//			System.out.print("이름 입력 : ");
//			member_name = br.readLine() ;
//			System.out.print("주소 입력 : ");
//			addr = br.readLine() ;
//			System.out.print("전화번호 입력 : ");
//			phone = br.readLine() ;
			
			// 각 필드에 자료를 입력할 수 있도록 문자열 조성
			// for insert
//			sql += "('" + num + "','" + member_name + "','" + addr + "','" + phone + "')";
			
			String sql = "Delete from member where num = '" + num + "'";
			System.out.println(sql);
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User와 Password모두 없는 상황
	
			stmt = con.createStatement();
			stmt.executeUpdate(sql); // for delete
			System.out.println("자료 삭제 성공");
//			rs=stmt.executeQuery(sql); // for select
/* 
 * 			//for Insert
			System.out.println("ID\t\tNum\t\tName\t\taddr\t\tphone"); 
			stmt.executeUpdate(sql);
			System.out.println("자료 입력 성공");
 */
/*
			// for select 
			while (rs.next()){
				System.out.print(rs.getLong("ID")+"\t\t");
				System.out.print(rs.getString("num")+"\t\t");
				System.out.print(rs.getString("member_name")+"\t\t");
				System.out.print(rs.getString("addr")+"\t\t");
				System.out.print(rs.getString("phone")+"\n");
			}
*/
		}catch (Exception e) {
			System.out.println("Cannot connect Database : ");
			e.printStackTrace();
		} finally {
			try {
				// if (rs !=null) rs.close();
				if (con != null) con.close();
				if (stmt != null) stmt.close() ;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

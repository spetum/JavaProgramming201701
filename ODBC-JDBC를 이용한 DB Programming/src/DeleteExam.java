import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC ������� ��ƾ
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		
		Connection con = null ;
		Statement stmt = null ;
		//ResultSet rs = null ; // SQL�� Delete ���꿡���� ũ�� �ʿ����� ����
		//String sql = "Select * from member " ; // for select
		//String sql = "Insert into member (num, member_name, addr, phone) values " ; // for Insert
		// String num, member_name, addr, phone; // for Insert
		String num = null ;
		
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("member table���� �ڷ� �����ϱ�....");
			System.out.print("������ ��ȣ �Է� : ");
			num = br.readLine() ;
//			System.out.println("member table�� �ڷ� �߰��ϱ�....");
//			System.out.print("��ȣ �Է� : ");
//			num = br.readLine() ;
//			System.out.print("�̸� �Է� : ");
//			member_name = br.readLine() ;
//			System.out.print("�ּ� �Է� : ");
//			addr = br.readLine() ;
//			System.out.print("��ȭ��ȣ �Է� : ");
//			phone = br.readLine() ;
			
			// �� �ʵ忡 �ڷḦ �Է��� �� �ֵ��� ���ڿ� ����
			// for insert
//			sql += "('" + num + "','" + member_name + "','" + addr + "','" + phone + "')";
			
			String sql = "Delete from member where num = '" + num + "'";
			System.out.println(sql);
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User�� Password��� ���� ��Ȳ
	
			stmt = con.createStatement();
			stmt.executeUpdate(sql); // for delete
			System.out.println("�ڷ� ���� ����");
//			rs=stmt.executeQuery(sql); // for select
/* 
 * 			//for Insert
			System.out.println("ID\t\tNum\t\tName\t\taddr\t\tphone"); 
			stmt.executeUpdate(sql);
			System.out.println("�ڷ� �Է� ����");
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

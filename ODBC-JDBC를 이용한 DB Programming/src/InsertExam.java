import java.io.*;
import java.sql.*;
public class InsertExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC-ODBC ������� ��ƾ
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
		String url = "jdbc:odbc:Person";
		Connection con = null ;
		Statement stmt = null ;
		ResultSet rs = null ;
		//String sql = "Select * from member " ; // select
		String sql = "Insert into member (num, member_name, addr, phone) values " ; //Insert
		String num, member_name, addr, phone;
		
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("member table�� �ڷ� �߰��ϱ�....");
			System.out.print("��ȣ �Է� : ");
			num = br.readLine() ;
			System.out.print("�̸� �Է� : ");
			member_name = br.readLine() ;
			System.out.print("�ּ� �Է� : ");
			addr = br.readLine() ;
			System.out.print("��ȭ��ȣ �Է� : ");
			phone = br.readLine() ;
			
			// �� �ʵ忡 �ڷḦ �Է��� �� �ֵ��� ���ڿ� ����
			sql += "('" + num + "','" + member_name + "','" + addr + "','" + phone + "')";
			System.out.println(sql);
			
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, "", "") ; // User�� Password��� ���� ��Ȳ
	
			stmt = con.createStatement();
			//rs=stmt.executeQuery(sql);
			//System.out.println("ID\t\tNum\t\tName\t\taddr\t\tphone");
			stmt.executeUpdate(sql);
			System.out.println("�ڷ� �Է� ����");
//			while (rs.next()){
//				System.out.print(rs.getLong("ID")+"\t\t");
//				System.out.print(rs.getString("num")+"\t\t");
//				System.out.print(rs.getString("member_name")+"\t\t");
//				System.out.print(rs.getString("addr")+"\t\t");
//				System.out.print(rs.getString("phone")+"\n");
//			}			
		}catch (Exception e) {
			System.out.println("Cannot connect Database : ");
			e.printStackTrace();
		} finally {
			try {
				if (rs !=null) rs.close();
				if (con != null) con.close();
				//if (stmt != null) stmt.close() ;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

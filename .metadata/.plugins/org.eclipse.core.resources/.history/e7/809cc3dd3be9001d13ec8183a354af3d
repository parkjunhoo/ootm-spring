package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 커넥션관리 자원반납 모든 DB관련 메소드에서 공통으로 처리하는 부분을 구현
 * 
 * DB연동과 관련된 기능을 유틸리티처럼 제공하는 클래스
 * 1. 드라이버로딩
 * 2. DB서버연결
 * 3. 자원반납
 */
public class DBUtil {
	
	final static String s_ip = "localhost";
	final static String s_port = "3306";
	final static String s_user = "exam";
	final static String s_password = "exam";
	final static String s_dbName = "ootm";
	
	// 드라이버로딩 - DBUtil클래스가 로딩될때 자동으로 드라이버가 로딩되도록 작업
	// => static{}에 정의한 코드는 DBUtil클래스가 클래스로더에 의해 메모리에 로딩될때 자동으로 실행된다.
	// 따라서 코드가 한 번 실행되도록 할 수 있다.
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	// DB서버에 연결하고 Connection을 리턴하는 메소드
	public static Connection getConnect(String ip, String port, String user, String password, String dbName) {
		String url = String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC",
				ip, port, dbName);
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//상수값으로 정의된 값들로 getConnect를 호출합니다.
	public static Connection getConnect() {
		return DBUtil.getConnect(DBUtil.s_ip , DBUtil.s_port , DBUtil.s_user , DBUtil.s_password , DBUtil.s_dbName);
	}

	
	
	
	// 자원반납을 위한 메소드
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// rs가 없을떄 null 쓰기 귀찮을때
	public static void close(Statement stmt, Connection con) {
		DBUtil.close(null, stmt , con);
	}

}

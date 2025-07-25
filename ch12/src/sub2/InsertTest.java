package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 Insert 실습하기
 */
// 데이터 삽입 (이것도 Update문으로 한다! 자바에 insert문 따로 없음.)
public class InsertTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "daeunlee1125";
		String pass = "1234";
		
		Connection conn = null;
		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			// SQL실행 객체 생성(Statement, PreparedStatement)
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "INSERT INTO user1 VALUES ('J101', '김유신', '010-1212-2221', 31)";
			stmt.executeUpdate(sql);
		
			// 결과 처리 (Select문일 경우)
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터베이스 종료
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Insert 완료...");
	}
}

package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedInsertTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "daeunlee1125";
		String pass = "1234";
		
		try {
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL 실행객체 생성
			// 쿼리 파라미터를 사용한 일종의 쿼리 템플릿 사용 SQL (준비된 쿼리)
			String sql = "INSERT INTO user1 VALUES (?,?,?,?)"; //요 물음표가 쿼리 파라미터
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);;
			
			//SQL 실행
			// !Prepared Statement 쓸 때는 execute문에 인자 안 써준다!
			psmt.executeUpdate(); // INSERT, DELETE, UPDATE는 executeUpdate()!!!!
			
			//결과처리 (SELECT 경우)
			
			//DB 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}
}

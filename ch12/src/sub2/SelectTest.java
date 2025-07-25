package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 SELECT 실습하기 (중요!!)
 */


public class SelectTest {
	public static void main(String[] args) {
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "daeunlee1125";
		final String PASS = "1234";
		
		List<User1VO> users = new ArrayList<>();
		
		try {
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
					
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "SELECT * FROM user1";
			// 얘는 Update문 아니죠?
			// SELECT문의 executeQuery로 실행하고, resultset 반환!!
			ResultSet rs = stmt.executeQuery(sql);
					
			// 결과 처리 (SElect일 경우! 일반적으로 리스트 생성)	
			while (rs.next()) { // 커서를 다음 row로 이동시킴. 이동할 row 없으면 false
				
				// 커서가 가리키는 Row의 각 컬럼값을 추출해서, VO 객체 초기화
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (User1VO user : users) {
			System.out.println(user);
		}
		
		System.out.println("SELECT 완료...");
	}
}

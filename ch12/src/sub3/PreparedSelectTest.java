package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "daeunlee1125";
		String pass = "1234";
		
		List<User1VO> users = new ArrayList<User1VO>(); // 조회 결과 반환용 리스트 생성
		
		try {
			// DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행객체 생성(prepared)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, 20); //1번째 쿼리파라미터에 나이 숫자 20 바인딩
			
			// SQL 실행
			// SELECT 실행하므로 executeQuery() 써줘야 resultSet 반환된다!
			ResultSet rs = psmt.executeQuery();
			
			// 결과처리(SELECT 경우)
			
			while (rs.next()) {
				
				//Vo 객체 생성 : Vo 객체는 DB에서 조회된 결과로 초기화된 읽기 전용 객체
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (User1VO us : users) {
			System.out.println(us);
		}
		
		System.out.println("Select 완료...");
	}
}

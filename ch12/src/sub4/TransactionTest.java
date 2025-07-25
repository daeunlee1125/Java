package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 Transaction 실습하기
 */
public class TransactionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("에러를 발생 하시겠습니까?");
		int answer = sc.nextInt();
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "bank";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			// DB 생성
			conn = DriverManager.getConnection(host, user, pass);
			
			// 자동 커밋 해제 (트랜잭션 시작) //
			/* 
			 * 아래의 이슈를 해결하기 위해 트랜잭션을 수동으로 해주는 것!
			 * 만약에 송금은 됐는데 받으면서 오류가 난 상황이라면
			 * 돈 공중분해 막기 위해, 아예 롤백해버리고 처음으로 돌아간다! 
			 */
			conn.setAutoCommit(false);

			String sql1 = "UPDATE account SET acc_balance = acc_balance-10000 WHERE acc_cid = ?";
			String sql2 = "UPDATE account SET acc_balance = acc_balance+10000 WHERE acc_cid = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt1.setString(1, "730423-1000001");
			psmt2.setString(1, "830513-2000003");
			
			psmt1.executeUpdate();
			
			// 호오옥시나 psmt1.update는 성공했는데, 2.update는 실패했을 경우!
			// 1이 2한테 송금하는데, 1은 보냈는데 2는 못 받으면 심각한 이슈겠죠!?
			if (answer==1) {
				throw new Exception("예기치 못한 에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); // 트랜잭션 작업 확정 (트랜잭션 실행)
			
			// 데이터베이스 종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				// 트랜잭션 작업 취소
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료...");
		
	}
}

package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	
	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] Args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		boolean running = true;
		
		while (running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.next());
			
			switch(choice) {
				case 1-> createAccount();
				case 2 -> listAccounts();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
			
		}
	}
	
	public void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
	}
	
	public void createAccount() {
		String id; String owner; int inibal;
		System.out.println("---------------- 계좌생성 -------------------");
		System.out.print("계좌번호: ");
		id = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기입금액: ");
		inibal = scanner.nextInt();
		
		accounts.add(new Account(id, owner, inibal));
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	public void listAccounts() {
		System.out.println("---------------- 계좌목록 -------------------");
		for (Account acc : accounts) {
			System.out.printf("%s %s %d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
		}
	}
	public void depositAccount() {
		String ano; int bal;
		System.out.println("----------------- 예금 --------------------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("예금액: ");
		bal = scanner.nextInt();
		
		Account a = findAccount(ano);
		if (a==null) {
			System.out.println("결과: 계좌가 없습니다.");
		}else {
			a.setBalance(a.getBalance() + bal);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
	}
	public void withdrawAccount() {
		String ano; int bal;
		System.out.println("----------------- 출금 --------------------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("출금액: ");
		bal = scanner.nextInt();
		
		Account a = findAccount(ano);
		if (a==null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		}else {
			a.setBalance(a.getBalance() - bal);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
	}
	
	public Account findAccount(String ano) { 
		for (Account acc : accounts) {
			if (acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
	
}

package member.controller;

import java.util.Scanner;
import member.model.vo.Member;

public class MemberManager {
	private static Member m[] = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("아이디 입력 : ");
		String userId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String userPwd = sc.next();
		System.out.print("이름 입력 : ");
		String userName = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		return;
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updatePwd() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void printOne(Member m) {
		
	}
}

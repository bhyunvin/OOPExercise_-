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
		System.out.print("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId() == userId) {
				printOne(m[i]);
			} else {
				System.out.println("검색하신 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName() == userName) {
				printOne(m[i]);
			} else {
				System.out.println("검색하신 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
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
		System.out.println("ID는 : " + m.getUserId());
		System.out.println("PassWord는 : " + m.getUserPwd());
		System.out.println("이름은 : " + m.getUserName());
		System.out.println("나이는 : " + m.getAge());
		System.out.println("성별은 : " + m.getGender());
		System.out.println("이메일은 : " + m.getEmail());
	}
}

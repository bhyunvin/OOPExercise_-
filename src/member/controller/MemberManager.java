package member.controller;

import java.util.Scanner;
import member.model.vo.Member;

public class MemberManager {
	private static Member m[] = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void insertMember() {
		System.out.print("���̵� �Է� : ");
		String userId = sc.next();
		System.out.print("��й�ȣ �Է� : ");
		String userPwd = sc.next();
		System.out.print("�̸� �Է� : ");
		String userName = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� �Է� : ");
		String email = sc.next();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
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

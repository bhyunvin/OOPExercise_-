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
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("�����Ͻ� ��й�ȣ�� �Է����ּ��� : ");
			String userPwd = sc.next();
			m[index].setUserPwd(userPwd);
			System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("�����Ͻ� �̸��� �Է����ּ��� : ");
			String userName = sc.next();
			m[index].setUserName(userName);
			System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("�����Ͻ� �̸����� �Է����ּ��� : ");
			String userEmail = sc.next();
			m[index].setEmail(userEmail);
			System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				for(int j = i + 1; j < m.length - i; j++) {
					m[i] = new Member(m[j].getUserId(), m[j].getUserPwd(), m[j].getUserName(), m[j].getAge(), m[j].getGender(), m[j].getEmail());
					ctn--;
				}
			} else {
				System.out.println("������ ȸ��  ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void deleteAll() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void printOne(Member m) {
		System.out.println("ID�� : " + m.getUserId());
		System.out.println("PassWord�� : " + m.getUserPwd());
		System.out.println("�̸��� : " + m.getUserName());
		System.out.println("���̴� : " + m.getAge());
		System.out.println("������ : " + m.getGender());
		System.out.println("�̸����� : " + m.getEmail());
	}
}

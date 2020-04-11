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
		int index = 0;
		int sw = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				index = i;
				sw = 1;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			printOne(m[index]);
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		int index = 0;
		int sw = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				index = i;
				sw = 1;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			printOne(m[index]);
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 : ");
		String userEmail = sc.next();
		int index = 0;
		int sw = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				index = i;
				sw = 1;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			printOne(m[index]);
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
		}
	}
	
	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("변경하실 비밀번호를 입력해주세요 : ");
			String userPwd = sc.next();
			m[index].setUserPwd(userPwd);
			System.out.println("패스워드 수정이 완료되었습니다.");
			return;
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("변경하실 이름을 입력해주세요 : ");
			String userName = sc.next();
			m[index].setUserName(userName);
			System.out.println("이름 수정이 완료되었습니다.");
			return;
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.print("변경하실 이메일을 입력해주세요 : ");
			String userEmail = sc.next();
			m[index].setEmail(userEmail);
			System.out.println("이메일 수정이 완료되었습니다.");
			return;
		} else {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				for(int j = i + 1; j < ctn - i; j++) {
					m[i] = new Member(m[j].getUserId(), m[j].getUserPwd(), m[j].getUserName(), m[j].getAge(), m[j].getGender(), m[j].getEmail());
					ctn--;
				}
			} else {
				System.out.println("삭제할 회원  정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender('\u0000');
			m[i].setEmail(null);
		}
		ctn = 0;
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println((i + 1) + "번째 유저입니다.");
			System.out.println("ID는 : " + m[i].getUserId());
			System.out.println("PassWord는 : " + m[i].getUserPwd());
			System.out.println("이름은 : " + m[i].getUserName());
			System.out.println("나이는 : " + m[i].getAge());
			System.out.println("성별은 : " + m[i].getGender());
			System.out.println("이메일은 : " + m[i].getEmail());
			System.out.println("==================");
		}
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

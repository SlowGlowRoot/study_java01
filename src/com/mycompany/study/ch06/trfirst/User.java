package com.mycompany.study.ch06.trfirst;
import java.util.Date;

public class User {
	
	// 이름, 아이디, 패스워드, 이메일
	
	String id;
	String password;
	String email;
	String nickname;
	String country;
	String name;
	String gender;
	Date dob;
	
	
	void regCreate() {
		System.out.println("회원정보를 등록해주세요.");
	}
	
	void regSuccess() {
		System.out.println("회원가입 되었습니다.");
	}
	
	void regDenial() {
		System.out.println("회원정보를 다시 한 번 확인해주세요.");
	}
	
	void loginSuccess() {
		System.out.println("로그인 되었습니다.");
	}
	
	void loginDenial() {
		System.out.println("로그인 정보를 다시 한 번 확인해주세요.");
	}
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
	void changeInfo() {
		System.out.println("회원정보를 수정하시겠습니까?");
	}
	
	void confirmPw() {
		System.out.println("보안유지를 위해 비밀번호를 입력해주세요.");
	}
	
	void SwitchOn() {
		System.out.println("설정을 'On'으로 설정했습니다.");
	}
	
	void SwitchOff() {
		System.out.println("설정을 'Off'으로 설정했습니다.");
	}
	
	void saveInfo() {
		System.out.println("회원정보가 정상적으로 저장되었습니다.");
	}
	
	void regSecess() {
		System.out.println("회원정보가 정상적으로 삭제되었습니다.");
	}
	
}

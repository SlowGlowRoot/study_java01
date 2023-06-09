package com.mycompany.study.ch06.trfirst;
import java.util.Date;

public class Post {

	String title;
	String contents;
	String writer;
	Date date;
	int view;
	boolean isNew;
	
	void upload() {
		System.out.println("게시글이 정상적으로 업로드 되었습니다.");
	}
	
	void selectList() {
		System.out.println("게시글을 조회하고 있습니다.");

	}
	
	void selectOne() {
		System.out.println("선택한 게시글을 불러오고 있습니다.");

	}
	
	void save() {
		System.out.println("게시글이 정상적으로 저장되었습니다.");
	}
	
	void edit() {
		System.out.println("게시글을 수정하시겠습니까?");
	}
	
	void delete() {
		System.out.println("게시글이 정상적으로 삭제되었습니다.");
	}
	
}

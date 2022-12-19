package com.sh.git;
/**
 * 되돌리기
 * - revert : 지정한 커밋의 작업내용을 취소한 버전을 새로운 커밋으로 만듬(conflict 날 수 있음)
 * 
 * - reset : 지정한 커밋으로 돌아감 (팀 작업할때는 비추)
 * 		- hard : 지정 커밋 이후 변경사항 버림
 * 		- mixed : 지정 커밋 이후 변경사항을 unstaging area 보관. 재추가후 커밋 가능
 * 		- soft : 지정 커밋 이후 변경사항을 staging area 보관. 즉시 커밋 가능
 */
public class Main {
	
	public void master() {
		
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
	}
	
	public void feature() {
		
	}

}

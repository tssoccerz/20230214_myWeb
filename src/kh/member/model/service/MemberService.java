package kh.member.model.service;

import java.sql.Connection;

import static kh.common.jdbc.JdbcTemplate.*;
import kh.member.model.dao.MemberDAO;
import kh.member.model.vo.MemberVO;


public class MemberService {
	// 내정보 보기
	public MemberVO myInfo(String id) {
		MemberVO result = null;
		Connection conn = getConnection();
		result = new MemberDAO().myInfo(conn, id);
		close(conn);
		return result;
	}
	
	// 로그인
	public MemberVO login(MemberVO vo) {
		MemberVO result = null;
		Connection conn = getConnection();
		result = new MemberDAO().login(conn, vo);
		close(conn);
		return result;
	}

	// 회원가입
	public int enroll(MemberVO vo) {
		int result = -1;
		Connection conn = getConnection();
		result = new MemberDAO().enroll(conn, vo);
		close(conn);
		return result;
	}

}

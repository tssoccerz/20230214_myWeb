package kh.member.model.service;

import java.sql.Connection;

import static kh.common.jdbc.JdbcTemplate.*;
import kh.member.model.dao.MemberDAO;
import kh.member.model.vo.MemberVO;

public class MemberService {

	// 회원가입
	public int enroll(MemberVO vo) {
		int result = -1;
		Connection conn = getConnection();
		result = new MemberDAO().enroll(conn, vo);
		close(conn);
		return result;
	}
}

package kh.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static kh.common.jdbc.JdbcTemplate.*;
import kh.member.model.vo.MemberVO;

public class MemberDAO {

	// 회원가입
	public int enroll(Connection conn, MemberVO vo) {
		int result = -1;
		String query = "insert into TEST_MEMBER values";
		query += "(?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			// ? 채워주기
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			// pstmt 실행
			// 결과값 result 에 대입
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("DAO enroll() return: " + result);
		return result;
	}
}

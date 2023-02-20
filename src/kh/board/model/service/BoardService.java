package kh.board.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import kh.board.model.dao.BoardDAO;
import kh.board.model.vo.BoardVO;
import static kh.common.jdbc.JdbcTemplate.*;

public class BoardService {
	public int getCountBoard() {
		int result = 0;
		Connection conn = getConnection();
		result = new BoardDAO().getCountBoard(conn);
		close(conn);
		return result;
	}
	// overloading
	public List<BoardVO> getBoardList(int srnum, int ernum) {
		List<BoardVO> result = null;
		Connection conn = getConnection();
		result = new BoardDAO().getBoardList(conn, srnum, ernum);
		close(conn);
		return result;
	}
}

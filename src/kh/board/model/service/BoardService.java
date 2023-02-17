package kh.board.model.service;

import java.sql.Connection;
import java.util.List;

import kh.board.model.dao.BoardDAO;
import kh.board.model.vo.BoardVO;
import static kh.common.jdbc.JdbcTemplate.*;

public class BoardService {

	public List<BoardVO> getBoardList() {
		List<BoardVO> result = null;
		Connection conn = getConnection();
		result = new BoardDAO().getBoardList(conn);
		close(conn);
		return result;
	}
}

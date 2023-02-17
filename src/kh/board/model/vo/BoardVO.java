package kh.board.model.vo;

import java.sql.Date;

public class BoardVO {
//	CREATE TABLE BOARD (
//	BOARD_NUM NUMBER, -- 게시글 번호
//	BOARD_TITLE VARCHAR2(50), -- 게시글 제목
//	BOARD_WRITER VARCHAR2(15), -- 게시글 작성자
//	BOARD_CONTENT VARCHAR2(2000), -- 게시글 내용
//	BOARD_ORIGINAL_FILENAME VARCHAR2(100), -- 업로드한 원래 파일명
//	BOARD_RENAME_FILENAME VARCHAR2(100), -- 바뀐 파일명
//	BOARD_DATE DATE DEFAULT SYSDATE,-- 게시글 올린 날짜
//	BOARD_LEVEL NUMBER DEFAULT 0,-- 글레벨 : 원글 0, 원글의 답글 1, 답글의 답글 2
//	BOARD_REF NUMBER, -- 원글일때는 자기번호, 답글일 때 참조하는 원글 번호
//	BOARD_REPLY_SEQ NUMBER DEFAULT 0, -- 답글의 순번
//	BOARD_READCOUNT NUMBER DEFAULT 0, -- 조회수
	private int boardNum;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardOriginalFilename;
	private String boardRenameFilename;
	private Date boardDate;
	private int boardLevel;
	private int boardRef;
	private int boardReplySeq;
	private int boardReadcount;
	
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", boardContent=" + boardContent + ", boardOriginalFilename=" + boardOriginalFilename
				+ ", boardRenameFilename=" + boardRenameFilename + ", boardDate=" + boardDate + ", boardLevel="
				+ boardLevel + ", boardRef=" + boardRef + ", boardReplySeq=" + boardReplySeq + ", boardReadcount="
				+ boardReadcount + "]";
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardOriginalFilename() {
		return boardOriginalFilename;
	}
	public void setBoardOriginalFilename(String boardOriginalFilename) {
		this.boardOriginalFilename = boardOriginalFilename;
	}
	public String getBoardRenameFilename() {
		return boardRenameFilename;
	}
	public void setBoardRenameFilename(String boardRenameFilename) {
		this.boardRenameFilename = boardRenameFilename;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public int getBoardLevel() {
		return boardLevel;
	}
	public void setBoardLevel(int boardLevel) {
		this.boardLevel = boardLevel;
	}
	public int getBoardRef() {
		return boardRef;
	}
	public void setBoardRef(int boardRef) {
		this.boardRef = boardRef;
	}
	public int getBoardReplySeq() {
		return boardReplySeq;
	}
	public void setBoardReplySeq(int boardReplySeq) {
		this.boardReplySeq = boardReplySeq;
	}
	public int getBoardReadcount() {
		return boardReadcount;
	}
	public void setBoardReadcount(int boardReadcount) {
		this.boardReadcount = boardReadcount;
	}
	
	
}

package com.mvc.dao;

import java.util.List;

import com.mvc.vo.BoardVO;

public interface BoardDAO {
	//게시글 작성
	public void write(BoardVO boardVo) throws Exception;
		
	//게시글 목록 조회
	public List<BoardVO> list() throws Exception;
	
	//게시글 상세보기
	public BoardVO read(int bno) throws Exception;
	
	//게시글 수정
	public void update(BoardVO boardVO) throws Exception;
	
	//게시글 삭제
	public void delete(int bno) throws Exception;
}

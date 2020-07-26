package com.mvc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mvc.dao.BoardDAO;
import com.mvc.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {	//구현부 클래스

	@Inject
	private BoardDAO dao;
	
	//게시글 작성
	@Override
	public void write(BoardVO boardVo) throws Exception {
		dao.write(boardVo);
	}

	//게시글 목록 조회
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();	//dao에 있는 list()함수를 호출해서 반환하겠다는 뜻
	}

	//게시글 상세보기
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}

	//게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	//게시글 삭제
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}


}

package com.mvc.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mvc.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	//boardDao에 정의된 멤버들을 여기서 대신 구현하는 클래스. 즉, 구현부

	@Inject
	private SqlSession sqlSession;
	
	//게시글 작성
	@Override
	public void write(BoardVO boardVo) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVo);
	}

	//게시물 목록 조회
	@Override
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList("boardMapper.list");
	}

	//게시글 상세보기
	@Override
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne("boardMapper.read", bno);
	}
	
	
}

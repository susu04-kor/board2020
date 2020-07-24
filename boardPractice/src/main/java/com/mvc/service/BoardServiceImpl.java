package com.mvc.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mvc.dao.BoardDAO;
import com.mvc.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public void write(BoardVO boardVo) throws Exception {
		dao.write(boardVo);

	}

}

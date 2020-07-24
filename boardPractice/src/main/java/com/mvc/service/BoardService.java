package com.mvc.service;

import com.mvc.vo.BoardVO;

public interface BoardService {

	//게시글 작성
	public void write(BoardVO boardVo) throws Exception;
}

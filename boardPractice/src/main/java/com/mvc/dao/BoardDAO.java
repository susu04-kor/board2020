package com.mvc.dao;

import com.mvc.vo.BoardVO;

public interface BoardDAO {
	//게시글 작성
		public void write(BoardVO boardVo) throws Exception;
}

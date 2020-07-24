package com.mvc.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.service.BoardService;
import com.mvc.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	//게시글 작성화면
	@RequestMapping(value="/writeView", method=RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
	}
	
	//게시글 작성
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO boardVo) throws Exception{
		logger.info("write");
		
		service.write(boardVo);
		
		return "redirect:/";
	}
	
	
}

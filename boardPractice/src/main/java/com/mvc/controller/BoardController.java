package com.mvc.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return "redirect:/board/list";
	}
	
	//게시글 목록 조회
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("list");
		
		model.addAttribute("list", service.list());
		
		return "board/list";
		
		//오라클 > 다오 > 서비스 > 컨트롤러로 가져온 데이터들을 jsp에 뿌려주기
		//model은 데이터를 담을 그릇
		//addAttribute("list", service.list())는
		//service에 있는 list()메소드에 담긴 데이터를 "list"라는 이름으로 model에 담을 것이다 라는 뜻
	}
	
	//게시글 상세보기
	@RequestMapping(value="/readView", method=RequestMethod.GET)
	public String read(BoardVO boardVO, Model model) throws Exception{
		logger.info("read");
		
		model.addAttribute("read", service.read(boardVO.getBno()));
		
		return "board/readView";
	}
	
	
}

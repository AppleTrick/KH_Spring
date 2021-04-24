package com.mvc.upgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.MYBoardBiz;
import com.mvc.upgrade.model.dto.MYBoardDto;

@Controller
public class MYBoardController {

	@Autowired
	private MYBoardBiz biz;
	
	@RequestMapping("/list.do")
	public String selectList(Model model) {
		
		model.addAttribute("list",biz.selectList());
		
		return "myboardlist";
				
	}
	
	// 리퀘스트 맵핑 , writeform.do로 온다면 myboardinsert.jsp  반환
	
	@RequestMapping("/writeform.do")
	public String insertForm() {
		return "myboardinsert";
	}
	
	// 리퀘스트 맵핑 , writeform.do , method 방식 POST로 선택
	
	@RequestMapping(value="/writeres.do", method=RequestMethod.POST)
	public String insertRes(MYBoardDto dto) {
		// 해당 값을 받아오는데 dto의 변수 즉 생성자 이름과 같다면 자동으로 해준다.
		
		if(biz.insert(dto) > 0) {
			
			// 자동으로 list.do 로 보내준다.
			
			return "redirect:list.do";
		}
		
		return "redirect:wirteform.do";
	}
	
	@RequestMapping("/detail.do")
	public String selectOne(Model model, int myno) {
		
		model.addAttribute("dto", biz.selectOne(myno));
		
		return "myboarddetail";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		if(biz.delete(myno) > 0) {
			return "redirect:list.do";
		}
		return "redirect:detail.do?myno="+myno;
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		
		model.addAttribute("dto",biz.selectOne(myno));
		
		return "myboardupdate";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(MYBoardDto dto) {
		
		if (biz.update(dto)>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}
		
		return "redirect:updateform.do?myno="+dto.getMyno();
	}
}

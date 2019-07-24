package com.itbank.mvcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicSelectController {

	@Autowired
	MusicDAO musicDAO;
	
	@RequestMapping("musicSelect")
	public void mSelect(MusicDTO musicDTO, Model model) {  // model : 객체를 파라메터로 받아서 views로 넘겨주는 역할
		MusicDTO musicDTO2 = musicDAO.select(musicDTO);
		model.addAttribute("musicDTO2", musicDTO2);  // musicDTO2에 검색한 id 값을 받아옴
		System.out.println("select 요청 완료");
	}
			
	@RequestMapping("musicSelectAll")
	public void mSelectAll(Model model) {  // DB전체 리스트 검색
		List<MusicDTO> list = musicDAO.selectAll();
		model.addAttribute("list", list);
		System.out.println("selectAll 요청 완료");
	}
}

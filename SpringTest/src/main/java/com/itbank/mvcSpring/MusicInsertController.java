package com.itbank.mvcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicInsertController {
	
	@Autowired
	MusicDAO dao;
	
	@RequestMapping("musicInsert")
	public void mInsert(MusicDTO musicDTO) {
		dao.insert(musicDTO);
		System.out.println("music insert 요청완료");
	}
}

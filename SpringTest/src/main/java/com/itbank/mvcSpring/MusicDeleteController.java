package com.itbank.mvcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicDeleteController {
	
	@Autowired
	MusicDAO musicDAO;
	
	@RequestMapping("musicDelete")
	public void mDelete(MusicDTO musicDTO) {
		musicDAO.delete(musicDTO);
		System.out.println("music delete요청 완료");
	}
}

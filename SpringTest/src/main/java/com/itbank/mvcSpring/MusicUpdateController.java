package com.itbank.mvcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicUpdateController {
	
	@Autowired
	MusicDAO musicDAO;
	
	@RequestMapping("musicUpdate")
	public void mUpdate(MusicDTO musicDTO) {
		musicDAO.update(musicDTO);
		System.out.println("music update요청 완료");
	}
}

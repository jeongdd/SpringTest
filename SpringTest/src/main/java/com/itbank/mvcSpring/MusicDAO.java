package com.itbank.mvcSpring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository  // DB용 객체를 싱글톤으로 만듦
public class MusicDAO {
	
	@Autowired  // getInstance()의 역할 -> 클래스 타입으로 찾음
	SqlSessionTemplate music;
	
	// 삽입
	public void insert(MusicDTO musicDTO) {
		music.insert("mDAO.insert", musicDTO);
		System.out.println("insert 완료");
	}
	
	// 삭제
	public void delete(MusicDTO musicDTO) {
		music.delete("mDAO.delete", musicDTO);
		System.out.println("delete 완료");
	}
	
	// 수정
	public void update(MusicDTO	musicDTO) {
		music.update("mDAO.update", musicDTO);
		System.out.println("update 완료");
	}
	
	// id별 검색정보
	public MusicDTO select(MusicDTO musicDTO) {
		return music.selectOne("mDAO.select", musicDTO);
	}
	
	// 전체 리스트 검색
	public List<MusicDTO> selectAll() {
		return music.selectList("mDAO.selectAll");
	}
	
}

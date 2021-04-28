package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MYBoardDto;

@Repository
public class MYBoardDaoImpl implements MYBoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<MYBoardDto> selectList() {
		
		List<MYBoardDto> list = new ArrayList<MYBoardDto>();
		
		try {
			list = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MYBoardDto selectOne(int myno) {
		
		
		return null;
	}

	@Override
	public int insert(MYBoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MYBoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return 0;
	}

}

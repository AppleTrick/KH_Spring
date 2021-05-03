package com.mvc.upgrade.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MYMemberDto;

@Repository
public class MYMemberDaoImpl implements MYMemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public MYMemberDto login(MYMemberDto dto) {
		
		MYMemberDto res = null;
		
		System.out.println("dto " + dto.getMemberid());
		
		try {
			System.out.println("res 값" + res);
			res = sqlSession.selectOne(NAMESPACE+"login",dto);
			System.out.println("res 값" + res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

}

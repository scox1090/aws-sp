package com.aws.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aws.sp.dao.AwsDAO;
import com.aws.sp.vo.AwsVO;

@Repository
public class AwsDAOImpl implements AwsDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AwsVO> selectAwsList() {
		
		return ss.selectList("com.aws.sp.AWSMapper.selectAwsList");
	}

	@Override
	public AwsVO selectAws(int atnum) {
		
		return ss.selectOne("com.aws.sp.AWSMapper.selectAws",atnum);
	}

	@Override
	public Integer insertAws(AwsVO aws) {
		
		return ss.insert("com.aws.sp.AWSMapper.insertAws",aws);
	}

	@Override
	public Integer updateAws(AwsVO aws) {
		
		return ss.update("com.aws.sp.AWSMapper.updateAws",aws);
	}

	@Override
	public Integer deleteAws(int atnum) {
		
		return ss.delete("com.aws.sp.AWSMapper.deleteAws",atnum);
	}

}

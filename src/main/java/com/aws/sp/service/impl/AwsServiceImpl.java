package com.aws.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.sp.dao.AwsDAO;
import com.aws.sp.service.awsService;
import com.aws.sp.vo.AwsVO;

@Service
public class AwsServiceImpl implements awsService {

	@Autowired
	private AwsDAO adao;
	
	@Override
	public List<AwsVO> selectAwsList() {
		return adao.selectAwsList();
	}

	@Override
	public AwsVO selectAws(int atnum) {
		return adao.selectAws(atnum);
	}

	@Override
	public Integer insertAws(AwsVO aws) {
		return adao.insertAws(aws);
	}

	@Override
	public Integer updateAws(AwsVO aws) {
		return adao.updateAws(aws);
	}

	@Override
	public Integer deleteAws(int atnum) {
		return adao.deleteAws(atnum);
	}

}

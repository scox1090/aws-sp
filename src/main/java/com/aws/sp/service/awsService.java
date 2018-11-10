package com.aws.sp.service;

import java.util.List;

import com.aws.sp.vo.AwsVO;

public interface awsService {

	public List<AwsVO> selectAwsList();
	public AwsVO selectAws(int atnum);
	public Integer insertAws(AwsVO aws);
	public Integer updateAws(AwsVO aws);
	public Integer deleteAws(int atnum);
}

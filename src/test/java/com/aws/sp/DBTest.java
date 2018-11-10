package com.aws.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aws.sp.dao.AwsDAO;
import com.aws.sp.service.awsService;
import com.aws.sp.vo.AwsVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBTest {

	
	@Autowired
	private awsService as;
	
	/*@Autowired
	private AwsDAO adao;*/

	/*@Autowired
	private SqlSession ss;*/
	
	
	@Test
	public void aws() throws SQLException {
		assertEquals(5, as.selectAwsList().size());
		
		/*
		AwsVO aws = ss.selectOne("com.aws.sp.AWSMapper.selectAws",1);
		assertNotNull(aws);

		//assertertEquals("테스트", aws.getAtname());
		aws.setAtname("변경1");
		aws.setAtage(221);
		
		
		//assertertEquals(1, adao.insert("com.aws.sp.AWSMapper.insertAws",aws));
		
		assertEquals(1, ss.update("com.aws.sp.AWSMapper.updateAws",aws));
		
		//assertertEquals(1, adao.delete("com.aws.sp.AWSMapper.deleteAws",4));
		*/
		
	}

	
	
}

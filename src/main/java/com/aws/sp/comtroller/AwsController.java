package com.aws.sp.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aws.sp.service.awsService;
import com.aws.sp.vo.AwsVO;  
 
@Controller
public class AwsController {

	@Autowired
	private awsService as;
	
	@GetMapping("/awstests")
	public @ResponseBody List<AwsVO> getAwsList(){
			return as.selectAwsList();
	}
}

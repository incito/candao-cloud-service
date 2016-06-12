package com.candao.pre.controller.updown;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @Description: 上传下载controller类
 * @Company:上海餐道
 * @create Author: 余城序
 * @create Date: 2016年6月12日下午5:52:46
 * @version 1.0
 */
@Controller
@RequestMapping("/upDownController")
public class UpDownController {
	/**
	 * 
	 * @Description:根据前端WebUploader的方式上传数据
	 * @create: 余城序
	 * @Modification:
	 * @return String
	 */
	@RequestMapping("/upByWebUploader.do")
	@ResponseBody
	public String upByWebUploader(MultipartFile[] files, String destDir,HttpServletRequest request){
		System.out.println(files);
		return "success";
	}
}

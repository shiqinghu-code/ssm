package com.qing.hu.controller;

import java.io.File;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qing.hu.common.Result;
import com.qing.hu.entity.EctCnSysLog;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
@RestController
@RequestMapping("/fileController")
@Api(tags="文件上传测试")
public class FileController {
	
	 
	
	@PostMapping(value = "/uploadFile", consumes = "multipart/*", headers = {"content-type=multipart/form-data","content-type=application/json"})
			@ApiOperation(value = "上传文件图片", notes = "上传文件", httpMethod = "POST")
			@ApiResponses(value = {
			@ApiResponse(code = 200, message = "上传成功！"),
			@ApiResponse(code = 500, message = "上传失败！")
			})
			public String uploadFile(@ApiParam(value = "文件", required = true) MultipartFile[] files) {
			    for(MultipartFile file : files) {
			        if (!file.isEmpty()) {
			            
			                try {
			                    String temp = "images" + File.separator + "upload" + File.separator;
			                    // 获取的文件名
			                    String fileName = file.getOriginalFilename();
			                    // 获取的扩展名
			                    String extensionName = fileName.substring(fileName.indexOf("."));
			                    // 新的文件名 = 获取时间戳+"."扩展名
			                    String newFileName = String.valueOf(System.currentTimeMillis()) + "." + extensionName;
			                    // 数据库保存的目录
			                    String datdDirectory = temp.concat(String.valueOf(1)).concat(File.separator);
			                    // 文件路径
			                    String filePath = "src\\main\\resources\\upload";

			                    File dest = new File(filePath, newFileName);
		 	                    if (!dest.getParentFile().exists()) {
			                        dest.getParentFile().mkdirs();
			                    }
			                    // 上传到指定目录
			                    file.transferTo(dest);
			                } catch (Exception e) {
			                    return "上传失败";
			                }
			        }
			    }
			    return "上传成功";

			}
 
	 	

}

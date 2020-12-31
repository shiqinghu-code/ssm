package com.qing.hu.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/fileController")
@Api(tags = "文件上传测试")
public class FileController {

	@PostMapping(value = "/uploadFile")
	@ApiOperation(value = "上传文件", notes = "上传文件", httpMethod = "POST")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "上传成功！"), @ApiResponse(code = 500, message = "上传失败！") })
	public String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				// 获取的文件名
				String fileName = file.getOriginalFilename();
				// 获取的扩展名
				String extensionName = fileName.substring(fileName.indexOf("."));
				// 新的文件名 = 获取时间戳+"."扩展名
				String newFileName = String.valueOf(System.currentTimeMillis()) + extensionName;
				// 数据库保存的目录
				// 文件路径
				String filePath = "D:\\mySpringBootWork\\upload\\";

				File dest = new File(filePath + newFileName);

				if (!dest.getParentFile().exists()) {
					dest.getParentFile().mkdirs();
				}
				// 上传到指定目录
				file.transferTo(dest);
			} catch (Exception e) {
				e.printStackTrace();
				return "上传失败";
			}
		}
		return "上传成功";

	}

	/**
	 * 实现多文件上传
	 */
	@PostMapping(value = "multifileUpload")
	public String multifileUpload(HttpServletRequest request) {

		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("fileName");

		if (files.isEmpty()) {
			return "false";
		}

		String path = "F:/test";

		for (MultipartFile file : files) {
			String fileName = file.getOriginalFilename();
			int size = (int) file.getSize();
			System.out.println(fileName + "-->" + size);

			if (file.isEmpty()) {
				return "false";
			} else {
				File dest = new File(path + "/" + fileName);
				if (!dest.getParentFile().exists()) { // 判断文件父目录是否存在
					dest.getParentFile().mkdir();
				}
				try {
					file.transferTo(dest);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "false";
				}
			}
		}
		return "true";
	}
}

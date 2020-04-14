package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@PostMapping("/uploadFile")
	public String upload(@RequestParam("attach") MultipartFile file, Model model) throws IOException{
		
		// file info
		System.out.println("File name = " + file.getOriginalFilename());
		System.out.println("File type = " + file.getContentType());
		
		// save to disk
		String filePath = "C:\\Users\\Kywee Zay\\Documents";
		file.transferTo(new File(filePath + file.getOriginalFilename()));
		model.addAttribute("Success", true);
		
		return "index";
		
	}

}

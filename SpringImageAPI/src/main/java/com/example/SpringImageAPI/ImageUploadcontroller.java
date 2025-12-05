package com.example.SpringImageAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/uploads")
public class ImageUploadcontroller 
{
	@Value("${file.upload-dir}")
	private String image;
	@PostMapping("/images")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) throws IOException
	{
		// save the file to the directory
		String filePath = saveImage(file);
		return ResponseEntity.ok("image uploaded successfully"+filePath);
	}
	
	private String saveImage(MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		Path uploadPath=Paths.get(image);
		if(!Files.exists(uploadPath))
		{
			Files.createDirectories(uploadPath);
		}
		String filename=file.getOriginalFilename();
		Path filePath = uploadPath.resolve(filename);
		Files.copy(file.getInputStream(),filePath,StandardCopyOption.REPLACE_EXISTING);
		return filePath.toString();
	}

}
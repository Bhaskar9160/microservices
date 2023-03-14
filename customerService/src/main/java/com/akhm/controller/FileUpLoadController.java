package com.akhm.controller;


import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



import jakarta.ws.rs.core.HttpHeaders;

@RestController
public class FileUpLoadController {
	@PostMapping("/fileupload")
	public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile multipartFile)
	{
		try {
			String fileName=StringUtils.cleanPath(multipartFile.getOriginalFilename());
			Long size=multipartFile.getSize();
			Path uplodePath=Paths.get("uploads");
				if(!Files.exists(uplodePath))
					{
						Files.createDirectories(uplodePath);
					}
					String newFileName=RandomStringUtils.randomAlphanumeric(10);
					InputStream inputStream=multipartFile.getInputStream();
					Path filePath=uplodePath.resolve(uplodePath);
					Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
					return new ResponseEntity<String>(newFileName+"-"+fileName,org.springframework.http.HttpStatus.OK);
					
							
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/downloadfile/{fname}")
	public ResponseEntity<Resource>downloadFile(@PathVariable("fname") String firstName){
		try {
			Path filePath=Paths.get("uploades"+firstName);
			if (Files.exists(filePath)) {
				Resource resource=new UrlResource(filePath.toUri());
				String contentType="application/octet.stream";
				String headerValue="attachment:fileName=\""+resource.getFilename()+"\"";
				return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header(HttpHeaders.CONTENT_DISPOSITION, headerValue).body(resource);
			}
			else {
				return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

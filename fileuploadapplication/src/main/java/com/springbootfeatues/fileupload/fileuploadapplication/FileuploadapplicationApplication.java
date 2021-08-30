package com.springbootfeatues.fileupload.fileuploadapplication;

import com.springbootfeatues.fileupload.fileuploadapplication.service.FileStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.Resource;



@SpringBootApplication
public class FileuploadapplicationApplication implements CommandLineRunner {
	@Resource
	FileStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(FileuploadapplicationApplication.class, args);
	}
	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}

}

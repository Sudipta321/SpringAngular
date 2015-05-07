package com.java.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.model.File;
import com.java.spring.repository.FileRepository;
import com.java.spring.repository.FileRepositoryImpl;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private FileRepository fileRepository;



	public List<File> listFile(int clientId) {
		return fileRepository.listFile(clientId);
	}
}

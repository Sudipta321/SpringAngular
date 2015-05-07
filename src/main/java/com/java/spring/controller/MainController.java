package com.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.model.Client;
import com.java.spring.model.File;
import com.java.spring.repository.ClientRepositoryImpl;
import com.java.spring.repository.DAO;
import com.java.spring.repository.FileRepositoryImpl;
import com.java.spring.service.ClientService;
import com.java.spring.service.ClientServiceImpl;
import com.java.spring.service.FileService;
import com.java.spring.service.FileServiceImpl;


@Controller
public class MainController {

	@Autowired
	private ClientService clientService ;

	@Autowired
	private FileService fileService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homepage()
	{
		return "home";
	}


	@RequestMapping(value="getClientList", method=RequestMethod.GET)
	public @ResponseBody List<Client> getClientList() {
		/*DAO dao = new DAO();
		return dao.clientlist();*/

		/*ClientRepositoryImpl cr =new ClientRepositoryImpl();
		return cr.listClient();*/

		return clientService.listClient();
		}


	@RequestMapping(value="getFileList", method=RequestMethod.GET)
	public @ResponseBody List<File> getFileList(@RequestParam("clientId") int clientId) {
/*
		DAO dao = new DAO();
		return dao.fileList(clientId);
*/
		/*FileRepositoryImpl fr = new FileRepositoryImpl();

		return fr.listFile(clientId);*/

		return fileService.listFile(clientId);



		}


}

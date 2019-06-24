package com.ets.csm.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.Decoder.Binary;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ets.csm.model.Document;
import com.ets.csm.repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	DocumentRepository documentrepo;
	
	

	@Override
	public void save(MultipartFile document, String documentName) throws IOException {
		Document documents = new Document();
		documents.setDocument( document.getBytes());
		documents.setDocumentName(documentName);
		documentrepo.save(documents);
		// TODO Auto-generated method stub
		
	}



	
}

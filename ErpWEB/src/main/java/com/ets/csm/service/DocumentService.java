package com.ets.csm.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.Decoder.Binary;

import org.springframework.web.multipart.MultipartFile;

import com.ets.csm.model.Document;

public interface DocumentService {
	//public void save(File document,String documentName) throws IOException;
	//public void save(Document document);
	void save(MultipartFile document, String documentName) throws IOException;

}

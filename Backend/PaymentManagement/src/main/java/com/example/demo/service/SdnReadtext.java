package com.example.demo.service;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class SdnReadtext {
	
	 public String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	  }
	 
//	  public static void main(String[] args) throws Exception
//	  {
//	    String data = readFileAsString("C:\\Users\\Administrator\\Downloads\\DBS Training 2022 Payment Project\\sdnlist.txt");
//	    System.out.println(data);
//	  }

}

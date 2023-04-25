package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FileWriteService {
	
	@Autowired
	PersonService personService;
	
	public void chunkList()
	{
		List<Person> persons = personService.findPersons();
		List<List<Person>> chunks = new ArrayList<List<Person>>();
		int size =persons.size();
		
		for(int i=0, j=1; i<size; i++)
		{
			
			
			List<Person> chunk = null;
			if(i%2==0 &&i<size-1)
			{
//				chunk = new ArrayList<Person>();
//				chunk.add(persons.get(i-1));
//				chunk.add(persons.get(i));
				
				chunk = (List<Person>) chunks.stream()
			            .collect(Collectors.toList())
			            .subList(i-1, i + 2)
			            .stream();
				j++;
			}
			else if(i==size-1)
			{
//				chunk = new ArrayList<Person>();
//				chunk.add(persons.get(i));
				
				chunk = (List<Person>) chunks.stream()
			            .collect(Collectors.toList())
			            .subList(i-1, i + 1)
			            .stream();
				
			}
			try {
				writeToFiles(chunk, j);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void writeToFiles(List<Person> chunk, int suffix) throws IOException
	{
		String filename = "person_chunk_"+suffix;
		File file = new File(filename+".txt");
		FileWriter fw;
		FileOutputStream fos = new FileOutputStream(filename+".zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		
        FileInputStream fis = new FileInputStream(file);
		fw = new FileWriter(filename+".txt");
		
		fw.write(chunk.toString());
		
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zos.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) {
        	zos.write(bytes, 0, length);
        }
        zos.close();
        fis.close();
        fos.close();
        fw.close();
	}

}

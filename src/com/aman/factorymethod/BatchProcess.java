/**
 * 
 */
package com.aman.factorymethod;

import java.io.File;
import java.util.List;

/**
 * @author amanb
 *
 */
public class BatchProcess {
	
	public void processBatch(String fileName) {
		File f=openFile(fileName);
		TextParser tx=new TextParser(f);
		List<Record> rd=tx.parse();
		processRecords(rd);
		writeSummary();
		closeFile();
	}

	private File openFile(String fileName) {
		System.out.println("Opened file ");
		return null;
	}

	private void processRecords(List<Record> rd) {
		System.out.println("Processing each records !!");
		
	}

	private void writeSummary() {
		System.out.println("Wrote batch records");
		
	}

	private void closeFile() {
		System.out.println("Closed file");
		
	}

}

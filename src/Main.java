import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		File from = new File("from");
		File to = new File("to");
		from.mkdirs();
		to.mkdirs();
		
		// список файлов в каталоге
		
		File mainFolder = new File(".");
		File [] files = mainFolder.listFiles();
		
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		// список файлов в каталоге по фильтру
		ExtFilter extF = new ExtFilter("doc", "pdf", "txt");
		
		File[] fileList = from.listFiles(extF);
		for (File file : fileList) {
		System.out.println(file);
		}
		*/

		FileManagement fm = new FileManagement();
		fm.copyFileFromCatalog("from", "to", "doc", "txt");
		fm.copyFileFromCatalog("e:/4", "e:/5", "doc", "jpg");

	}
	
	

}

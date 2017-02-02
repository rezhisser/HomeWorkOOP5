import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagement {
	
	
	
	
	
	public FileManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void copyFile (File in, File out){
	try(
	FileInputStream fis = new FileInputStream(in);
	FileOutputStream fos = new FileOutputStream(out)) {
	byte[] buffer = new byte[1024];
	int byteread = 0;
	for (; (byteread = fis.read(buffer)) > 0;) {
	fos.write(buffer, 0, byteread);
	}
	} catch (IOException e) {
		System.out.println(e);
		}
	}
	
	protected void copyFileFromCatalog (File [] filelist, String catalogFrom, String catalogTo){
		
		for (int i = 0; i < filelist.length; i++) {
			try(
					FileInputStream fis = new FileInputStream( catalogFrom + "/" +filelist[i].getName());
					FileOutputStream fos = new FileOutputStream(catalogTo + "/" + filelist[i].getName())) {
					byte[] buffer = new byte[1024];
					int byteread = 0;
					for (; (byteread = fis.read(buffer)) > 0;) {
					fos.write(buffer, 0, byteread);
					}
					} catch (IOException e) {
						System.out.println(e);
						}
		}
		
	}
	
	
	
}

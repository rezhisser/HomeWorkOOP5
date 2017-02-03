import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagement {
	
	
	
	
	
	public FileManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void copyFileFromCatalog (String catalogFrom, String catalogTo, String... ext){
		
		//������� ������ from ��������, � �������� ����� �����������
		File from = new File(catalogFrom);
		
		// ������� ������ ExtFilter, ���������� ������ ����������, ������� ����� ������������
		ExtFilter extF = new ExtFilter(ext);
		
		// �������� ������ ������ �� �������� from
		File[] fileList = from.listFiles(extF);
		
		for (int i = 0; i < fileList.length; i++) {
			// �������� ��� ����� �� filelist
			try(
					FileInputStream fis = new FileInputStream( catalogFrom + "/" +fileList[i].getName());
					FileOutputStream fos = new FileOutputStream(catalogTo + "/" + fileList[i].getName())) {
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

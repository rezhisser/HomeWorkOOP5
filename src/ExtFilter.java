import java.io.File;
import java.io.FileFilter;

public class ExtFilter implements FileFilter{
	
	private String ext [];
	
	

	public ExtFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExtFilter(String... ext) {
		super();
		this.ext = ext;
	}
	
	private boolean checkExt (String ext){
		for (int i = 0; i < this.ext.length; i++) {
			if (this.ext[i].equals(ext) == true){
				return true;
			}
		}
		return false;	
	}

	@Override
	public boolean accept(File filename) {
		int indexExt = filename.getName().lastIndexOf(".");
		if (indexExt == -1){
			return false;
		}
		String ext = filename.getName().substring(indexExt + 1);
		return checkExt(ext);
	}

}

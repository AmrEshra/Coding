import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FoldersAndFiles {

	public static void main(String args[]) {

		String path = "E:\\Google Drive\\Omar Khairat - Copy";
		adjustFileNames(path);
	}

	private static void adjustFileNames(String path) {

		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			try {
				rename(listOfFiles[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

//		subtitle(path);
	}

	public static void rename(File toBeRenamed) throws IOException {
		
		String new_name = toBeRenamed.getName();
		new_name = new_name.replace("music_test2_", "");
		new_name = new_name.replace("عمر خيرت", "");
		new_name = new_name.replace("اغاني مصرية_موسيقى-عمر-خيرت", "");
		new_name = new_name.replace("-", "");
		new_name = new_name.replace("_", "");
		new_name = new_name.replace("MP3", "");
		new_name = new_name.replace("    ", "");
		
		new_name.trim();
		
		// need to be in the same path
		File fileWithNewName = new File(toBeRenamed.getParent(), new_name);
		if (fileWithNewName.exists()) {
			throw new IOException("file exists");
		}
		// Rename file (or directory)
		boolean success = toBeRenamed.renameTo(fileWithNewName);
		if (!success) {
			// File was not successfully renamed
		}
	}

	private static String rename(String string) {

		return string.replace("music_test2_", "");
	}

	private static void subtitle(String path) {

		File folder = new File(path);
		
		File[] listOfFiles = folder.listFiles();
		
		ArrayList <File> listOfMp4 = new ArrayList<File>();
		ArrayList <File> listOfSrt = new ArrayList<File>();

		for (int i = 0; i < listOfFiles.length; i++) {
			
			if (listOfFiles[i].getName().toLowerCase().endsWith("mp4"))
				listOfMp4.add(listOfFiles[i]);
			else
				listOfSrt.add(listOfFiles[i]);	
		}

		for (int i = 0; i < listOfMp4.size(); i++) {
						
			String newFileName = path + "/" + listOfSrt.get(i).getName().replace("srt", "mp4");
			File newFile = new File(newFileName);
			System.out.println(newFileName);
			listOfMp4.get(i).renameTo(newFile);
			
			System.out.println("----------------------------");
		}

		
	}

}

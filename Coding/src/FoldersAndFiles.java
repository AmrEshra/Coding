import java.io.File;
import java.util.ArrayList;

public class FoldersAndFiles {

	public static void main(String args[]) {

		String path = "E:/Movies/The Office/The Office S06";
		adjustFileNames(path);
	}

	private static void adjustFileNames(String path) {
		
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			
			String newFileName = rename(listOfFiles[i].getName());
						
			File newFile = new File(path + "/" + i + ".srt");
			System.out.println(path + "/" +newFile.getName());
			listOfFiles[i].renameTo(newFile);
		}
		
//		subtitle(path);
	}

	private static String rename(String string) {

		if (string.length() == 113)
			return string.replace("Episode ", "Episode 0");

		return string;
		
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

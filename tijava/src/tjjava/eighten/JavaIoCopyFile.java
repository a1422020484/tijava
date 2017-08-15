package tjjava.eighten;

import java.io.*;

public class JavaIoCopyFile {
	public static void main(String[] args) {

		File sourceFile = new File("E:/sourceTest");
		File targetFile = new File("E:/sourceTager");
		copy(sourceFile, targetFile);

	}

	private static void copy(File sourceFile, File targetFile) {
		File tarpath = new File(targetFile, sourceFile.getName());
		if (sourceFile.isDirectory()) {
			tarpath.mkdir();
			File[] dir = sourceFile.listFiles();
			for (int i = 0; i < dir.length; i++) {
				copy(dir[i], tarpath);
			}
		} else {
			try {
				InputStream is = new FileInputStream(sourceFile);
				OutputStream os = new FileOutputStream(tarpath);

				byte[] buf = new byte[1024];
				int len = 0;
				while ((len = is.read(buf)) != -1) {
					os.write(buf);
				}
				System.out.println("复制完成");
				is.close();
				os.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}

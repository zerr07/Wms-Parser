package packages;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;

public class base64 {

    /**
     *
     * @param url - web url
     * @return - Base64 String
     * Method used to Convert URL to Base64 String
     */
    public static String convertUrlToBase64(String url) {
        String encodedString = null;
        try {
            URL u = new URL(url);
            InputStream in = u.openStream();
            Files.copy(
                    in,
                    Paths.get(FilenameUtils.getName(u.getPath())),
                    StandardCopyOption.REPLACE_EXISTING
            );
            File f = new File(String.valueOf(Paths.get(FilenameUtils.getName(u.getPath()))));
            byte[] fileContent = FileUtils.readFileToByteArray(f);
            encodedString = Base64.getEncoder().encodeToString(fileContent);
            if(f.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    return encodedString;
    }
}

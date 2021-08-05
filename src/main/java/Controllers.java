import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Controllers {
    public static void DownloadData(String url, Parser dataFile){
        try {
            Files.copy(
                    new URL(url).openStream(),
                    Path.of(dataFile.getDataFileAbsolutePath()),
                    StandardCopyOption.REPLACE_EXISTING
            );
            dataFile.setLoaded(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

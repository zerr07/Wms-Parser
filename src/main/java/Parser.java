import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Parser {
    private final String dataFile;
    private boolean isLoaded;
    public Parser(String dataFile){
        this.dataFile = dataFile;
        this.isLoaded = false;
    }
    public String getDataFile() {
        return dataFile;
    }
    public String getDataFileAbsolutePath() {
        return Paths.get("").toAbsolutePath() + "/" + this.dataFile;
    }
    public boolean isLoaded(){
        return this.isLoaded;
    }
    public void setLoaded(boolean loaded){
        this.isLoaded = loaded;
    }
    /* You should check if the file is loaded before executing the method below */
    public String getDataFromFile() throws IOException {
        return Files.readString(Path.of(Paths.get("").toAbsolutePath() + "/" + this.dataFile), StandardCharsets.ISO_8859_1);
    }
}

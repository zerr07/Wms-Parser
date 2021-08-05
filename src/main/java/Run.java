import Dreamlove.catalog;
import Dreamlove.Process.ParserProcess;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Run {
    public static void main(String[] args) {
        // The platform id is required in the args[0]
        // The list is available in readme.txt
        try {
            if(args[0].equals("1")) {
                Parser DreamLoveParser = new Parser("DreamloveData.xml");
                if (args.length > 1) {
                    if (args[1].equals("nodownload")) {
                        System.out.println("Skipping download");
                        if (new File(DreamLoveParser.getDataFileAbsolutePath()).exists()) {
                            DreamLoveParser.setLoaded(true);
                        } else {
                            System.out.println("No file found\nExiting");
                        }
                    } else {
                        System.out.println("Unknown argument supplied, check your query");
                        Controllers.DownloadData("https://store.dreamlove.es/dyndata/exportaciones/csvzip/catalog_1_51_125_2_8964ad7838ce7787975ab7a21a3787ff_xml_plain.xml", DreamLoveParser);
                    }
                } else {
                    Controllers.DownloadData("https://store.dreamlove.es/dyndata/exportaciones/csvzip/catalog_1_51_125_2_8964ad7838ce7787975ab7a21a3787ff_xml_plain.xml", DreamLoveParser);
                }
                if (DreamLoveParser.isLoaded()) {
                    JAXBContext context = JAXBContext.newInstance(Dreamlove.catalog.class);
                    Dreamlove.catalog cat = (catalog) context.createUnmarshaller().unmarshal(new FileReader(DreamLoveParser.getDataFile()));
                    ParserProcess.ProcessData(cat);
                } else {
                    System.out.println("Data file not loaded\nExiting");
                }
            } else if (args[0].equals("list")){
                System.out.println("List of platforms");
                System.out.println("1 - Dreamlove");
            } else {
                System.out.println("Invalid id or command\nExiting");
                System.exit(1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No valid platform supplied\nExiting");
            System.exit(1);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found\nExiting");
            System.exit(1);
        }

    }
}

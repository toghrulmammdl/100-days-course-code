package Threads2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtils {
    public static String filename = "output.txt";
    public static String content = "Hello";

    // io
    public static void writeFileAppendIO(String filename, String content) throws Exception {

        for(int i=0; i<100; i++) {
            try(FileWriter fileWriter = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ){
                bufferedWriter.write(content + "\n");
                System.out.println("Written to " + filename);
            }
        catch (IOException e){
            System.err.println("Error writing to file");
            e.printStackTrace();
        }
    }
    }


    // nio
    public static void writeFileAppendNIO(String filename, String content){
        try {
            for (int i = 0; i < 100; i++) {
                Files.write(Paths.get(filename), (content + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        }catch (Exception e){
            System.err.println("Error occured:"+e);
        }
    }
}

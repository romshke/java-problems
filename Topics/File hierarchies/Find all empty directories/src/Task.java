// You can experiment here, it won’t be checked

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task {
    public static void main(String[] args) throws IOException {
        // put your code here
        File file = new File(
                "Topics/File hierarchies/Find all empty directories/src/resources/basedir"
        );

        Files.walk(Path.of(file.getPath()))
                .filter(path -> path.toFile().isDirectory())
                .filter(path -> path.toFile().listFiles().length == 0)
                .forEach(path -> System.out.print(path.getFileName() + " "));
    }
}

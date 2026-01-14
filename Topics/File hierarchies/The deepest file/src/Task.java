// You can experiment here, it won’t be checked

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class Task {
    public static void main(String[] args) throws IOException {
        // put your code here
        File file = new File("Topics/File hierarchies/The deepest file/src/resources/basedir");
        System.out.println(Files.walk(file.toPath()).max(Comparator.comparing(Path::getNameCount)).get().getFileName());
    }
}

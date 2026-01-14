// You can experiment here, it won’t be checked

import java.io.File;
import java.util.Objects;

public class Task {
    public static void main(String[] args) {
        // put your code here
        File file = new File(
                "Topics/File hierarchies/Find a directory with the max number of files/src/resources/basedir"
        );
        String directoryName = "";
        int maxNumberOfFiles = 0;

        for (File directory : Objects.requireNonNull(file.listFiles())) {
            int numberOfFiles = Objects.requireNonNull(directory.list()).length;

            if (numberOfFiles > maxNumberOfFiles) {
                maxNumberOfFiles = numberOfFiles;
                directoryName = directory.getName();
            }
        }

        System.out.printf("%s %d", directoryName, maxNumberOfFiles);
    }
}

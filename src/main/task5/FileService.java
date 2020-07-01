package main.task5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileService {
    public List<String> readFile(String name) {
        try {
            return Files.lines(Paths.get(name), StandardCharsets.UTF_8).collect(Collectors.toList());
        } catch (IOException ex) {
            return null;
        }
    }

    public void writeFile(String name, List<String> uriList) {
        File file = new File(name);
        file.delete();

        for (String uri: uriList) {
            try (FileWriter writer = new FileWriter(name, true)) {
                writer.write(uri + "\n");
            } catch (IOException ex) {

            }
        }
    }
}

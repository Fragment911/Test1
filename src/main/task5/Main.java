package main.task5;

import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        FileService fileService = new FileService();
        NetService netService = new NetService();

        List<String> checkedUriList = new ArrayList<>();

        List<String> uriList = fileService.readFile("input.txt");

        for (String uri: uriList) { // формируем список доступных сайтов
            if (netService.isAllow(uri)) {
                checkedUriList.add(uri);
            }
        }

        fileService.writeFile("output.txt", checkedUriList);

        if (checkedUriList.size() > 0) {
            try {
                Desktop.getDesktop().browse(new URI(checkedUriList.get(0)));
            } catch (Exception ex) {

            }
        }
    }
}

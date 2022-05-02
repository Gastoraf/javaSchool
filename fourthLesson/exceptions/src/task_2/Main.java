package task_2;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Scanner in = new Scanner(System.in);

        boolean fl = false;

        System.out.println("Введите ссылку");
        while (!fl){

            fl = readContent(in.nextLine());
        }

    }

    static public boolean readContent(String url) {
        try {
            (new java.net.URL(url)).openConnection();
            Desktop desktop = Desktop.getDesktop();

            desktop.browse(new URI(url));
            return true;
        } catch (Exception ex) {
            System.out.println("Повторите ввод: ");
        }
        return false;
    }
}

package task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Account account = new Account("Alexey", 1232.55, "1111");

        TerminalImpl terminal = new TerminalImpl();

        terminal.runTerminal(account);


    }
}

package task_1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TerminalImpl implements ITerminal {

    private final Scanner in = new Scanner(System.in);
    private String inStr;

    private final TerminalServer server = new TerminalServer();
    private final PinValidator pinValidator = new PinValidator();
    private final Messages messages = new Messages();


    @Override
    public void getAccount(@NotNull Account account) {
        messages.messageAccount(account.getMoney());
    }

    @Override
    public void changeAccount(Account account) {
        while (true){
            messages.messageChangeMenu();
            inStr = in.nextLine();

            if (inStr.equals("1")){
                messages.messageAmount();
                int inInt = Integer.parseInt(in.nextLine());
                //int inInt = in.nextInt();in.nextLine();

                try {
                    server.withdrawMoney(account, inInt);
                } catch (TerminalServerException e) {
                    messages.messageException(e.getMessage());
                }

            } else if (inStr.equals("2")){
                messages.messageAmount();
                int inInt =  Integer.parseInt(in.nextLine());

                try {
                    server.putMoney(account, inInt);
                } catch (TerminalServerException e) {
                    messages.messageException(e.getMessage());
                }

            } else if (inStr.equals("3")){
                break;
            } else {
                messages.messageErMenu();
            }
        }

    }

    @Override
    public void runTerminal(Account account) {

        while (true){

            messages.messagePIN();

            try{
                inStr = in.nextLine();
                pinValidator.isValid(inStr);
                server.login(account, inStr);
                while (true) {
                    messages.messageMainMenu();
                    inStr = in.nextLine();

                    if (inStr.equals("1")){
                        getAccount(account);
                    } else if (inStr.equals("2")){
                        changeAccount(account);
                    } else if (inStr.equals("3")){
                        break;
                    } else {
                        messages.messageErMenu();
                    }
                }
            }

            catch(PinValidatorException | TerminalServerException ex){
                messages.messageException(ex.getMessage());
            }

        }

    }


}

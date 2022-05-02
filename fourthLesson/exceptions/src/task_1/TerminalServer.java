package task_1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TerminalServer {
    private int counter = 0;

    //внести
    public boolean putMoney(Account account, int amount) throws TerminalServerException {
        if (isMultiplicities(amount)){
            account.setMoney(account.getMoney() + amount);
            return true;
        }
        return false;
    }

    //снять
    public boolean withdrawMoney(Account account, int amount) throws TerminalServerException {
        if (isMultiplicities(amount)){
            account.setMoney(account.getMoney() - amount);
            return true;
        }
        return false;
    }

    //вход
    public boolean login(Account account, String pin) throws TerminalServerException {
        //блокировка на 10 сек
         if(account.getBlock() > 0){
            throw new TerminalServerException("Аккаунт заблокирован. Осталось " + account.getBlock() + " секунд.");
        } else if(!(account.getPin().equals(pin))){
            counter++;
            if (counter == 3){
                blockAccount(account);
            }
            throw new TerminalServerException("Неверный ПИН-код");
        }
        counter = 0;
        return true;
    }

    //Проверка кратности
    private boolean isMultiplicities(int amount) throws TerminalServerException {
        if(!(amount % 100 == 0)){
            throw new TerminalServerException("Число должно быть кратно 100");
        }
        return true;
    }

    //блокировка аккаунта
    private void blockAccount(Account account){
        MyThreadBlock myThreadBlock = new MyThreadBlock(account);
        myThreadBlock.start();
    }

}

class TerminalServerException extends Exception{

    public TerminalServerException(String message){

        super(message);
    }
}

//Поток блокировки
class MyThreadBlock extends Thread {
    private Account account = null;

    MyThreadBlock(Account account) {
        this.account = account;
    }

    public void run() {
        account.setBlock(10);
        for (int i = 0; i < account.getBlock(); account.setBlock(account.getBlock() - 1)) {

                if (account.getBlock() > 0) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
        }
    }


}

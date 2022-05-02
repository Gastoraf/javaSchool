package task_1;

public interface ITerminal {
    //•	Проверить состояние счета
    //•	Снять/ положить деньги
    void getAccount(Account account);
    void changeAccount(Account account);
    void runTerminal(Account account);
}

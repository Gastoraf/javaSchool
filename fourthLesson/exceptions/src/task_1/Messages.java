package task_1;

public class Messages {
    public void messagePIN(){
        System.out.println("__________________________\n" + "Введите ПИН-код:");
    }
    public void messageMainMenu(){
        System.out.println("__________________________\n" +
                "Введите число: \n" +
                "1. Проверить состояние счета\n" +
                "2. Снять/ положить деньги\n" +
                "3. Выйти.\n");
    }
    public void messageErMenu(){
        System.out.println("__________________________\n" +
                "Введите число от 1 до 3");
    }
    public void messageChangeMenu(){
        System.out.println("__________________________\n" +
                "Введите число: \n" +
                "1. Снять деньги\n" +
                "2. Положить деньги\n" +
                "3. Выйти.\n");
    }

    public void messageException(String str){
        System.out.println("__________________________\n" + str);
    }

    public void messageAccount(double money){
        System.out.format("__________________________\n" +
                "Состояние вашего счета: %.2f \n", money);
    }

    public void messageAmount(){
        System.out.println("__________________________\n" + "Введите кол-во денег:");

    }

}

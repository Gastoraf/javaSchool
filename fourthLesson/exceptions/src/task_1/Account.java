package task_1;

public class Account {
    private String name;
    private double money;
    private String pin;
    private int block = 0;

    Account(String name, double money, String pin){
        this.name = name;
        this.money = money;
        this.pin = pin;
    }


    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getBlock() {
        return block;
    }


}

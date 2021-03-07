package Bai1;

public class BankPolicy {
    public static float interestRate = 0.1f ;

    public BankPolicy() {
    }

    public BankPolicy(float interRate) {
        this.interestRate = interRate;
    }

    public float getInterRate() {
        return interestRate;
    }

    public void setInterRate(float interRate) {
        this.interestRate = interRate;
    }
}

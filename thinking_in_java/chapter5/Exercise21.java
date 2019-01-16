package com.dinghui.practice.chapter5;

enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY,FIFTY;
}

class PaperCurrency {
    PaperCurrencyTypes money;
    public PaperCurrency(PaperCurrencyTypes money) { this.money = money; }
    public void describe() {
        System.out.print("The paper currency types: ");
        switch(money) {
            case ONE:     System.out.println("ONE");
                          break;
            case TWO:     System.out.println("TWO");
                          break;
            case FIVE:    System.out.println("FIVE");
                          break;
            case TEN:     System.out.println("TEN");
                          break;
            case TWENTY:  System.out.println("TWENTY");
                          break;                      
            case FIFTY:   System.out.println("FIFTY");
                          break;
            default:      System.out.println("default");
        }
    }
    
}

public class Exercise21 {
    public static void main(String[] args) {
        for (PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
        PaperCurrency
          one = new PaperCurrency(PaperCurrencyTypes.ONE),
          two = new PaperCurrency(PaperCurrencyTypes.TWO),
          five = new PaperCurrency(PaperCurrencyTypes.FIVE);
        one.describe();
        two.describe();
        five.describe();
    }
}
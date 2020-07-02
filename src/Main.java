public class Main {
    public static void main (String[] args){
        int balance = 100;
        int transfer = 1200;
        int minTransferForBonus = 1000;
        int bonus = 0;
        if (transfer >= minTransferForBonus){
            bonus =transfer / 100;
        }
        System.out.println(bonus);
    }
}

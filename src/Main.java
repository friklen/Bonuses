class Main {
    public static void main(String[] args) {
        int balance = 100;
        int chek = 3000;
        int bonus;
        if (chek > 1000) {
            bonus = chek / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}

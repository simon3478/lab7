



public class Main {
    public static void main(String[] args) {
        double unit = 1.2;
        lifeSite lifesite = new lifeSite(unit, 3.0,0.7);
        double getbaseamount = lifesite.getbaseamount();
        String s = "lifesite's baseamount";
        System.out.println(s + " is: " + getbaseamount);

    }
}
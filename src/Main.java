



public class Main {
    public static void main(String[] args) {
        lifeSite lifesite = new lifeSite(1.2, 3.0,0.7);
        double getbaseamount = lifesite.getbaseamount();
        String s = "lifesite's baseamount";
        System.out.println(s + " is: " + getbaseamount);
    }
}
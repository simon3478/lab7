



public class Main {
    public static void main(String[] args, String s) {
        double unit = 1.2;
        lifeSite lifesite = new lifeSite(unit, 3.0,0.7);
        double getbaseamount = lifesite.getbaseamount();
        System.out.println(s + " is: " + getbaseamount);
        double unit1 = 3.4;
        ResidentialSite Resident = new ResidentialSite(unit1, 4.2, 7.8);
        System.out.println(s + Resident.getbaseamount());
    }
}
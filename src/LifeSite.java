 class LifeSite extends Site{


    public LifeSite(double unit, double rate, double tax_rate) {
        super(unit, rate, tax_rate);
    }

    public double getBillablelAmount(){

        double base = aDouble * _rate * 0.5;
        double tax= base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
    @Override
    protected double getbaseamount(){
        return aDouble * _rate * 0.5;
    }
    @Override
    protected double getTaxAmount(){
        double base = getbaseamount();
        double tax= base * Site.TAX_RATE * 0.2;
        return tax;
    }

}

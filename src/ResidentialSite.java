 class ResidentialSite extends Site{
    public ResidentialSite(double unit, double rate, double tax_rate) {
        super(unit, rate, tax_rate);
    }


    public double getBillablelAmount(){

        double base = aDouble * _rate;
        double tax= base * Site.TAX_RATE;
        return base + tax;}

     @Override
     protected double getbaseamount() {
         double base = aDouble * _rate;
        return base;
     }

     //     @override
//    public double getBaseAmount(){
//        double base = _units * _rate;
//        return base;
//
//    }
     @Override
    protected double getTaxAmount(){
        double base= getbaseamount();
        double tax= base * Site.TAX_RATE;
         return tax;
    }
}

 class ResidentialSite extends Site{
    public ResidentialSite(int unit, int rate, int tax_rate) {
        super(unit, rate, tax_rate);
    }


    public double getBillablelAmount(){

        double base = _units * _rate;
        double tax= base * Site.TAX_RATE;
        return base + tax;}

     @Override
     protected double getBaseAmount() {
         double base = _units * _rate;
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
        double base=getBaseAmount();
        double tax= base * Site.TAX_RATE;
         return tax;
    }
}

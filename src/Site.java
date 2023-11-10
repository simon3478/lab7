 class Site {
     protected double _units;

    protected    double _rate;
    protected static double TAX_RATE = 0;
    public Site(double unit, double rate, double tax_rate){
        this._units=unit;
        this._rate=rate;
        this.TAX_RATE=tax_rate;

    }
    public double getBillablelAmount(){
        return getBaseAmount() + getTaxAmount();
    }


    protected double getBaseAmount(){
        return 0;
    }

    protected double getTaxAmount(){

        return 0;
    }
}

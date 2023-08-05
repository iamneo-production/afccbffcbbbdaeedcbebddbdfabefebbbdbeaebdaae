package service;

public class AmountDetails implements InterfaceClass {
    @Override
    public double withdrawAmount(double arg1, double arg2) {
        // TODO Auto-generated method stub
        arg2 = arg2 - arg1;
        
        return arg2;
    }
    @Override
    public double depositAmount(double arg1, double arg2) {
        // TODO Auto-generated method stub
        arg2 = arg2 + arg1;
      
        return arg2;
    }
    @Override
    public double accountBalance(double arg1) {
        // TODO Auto-generated method stub
        
        return arg1;
    }
}

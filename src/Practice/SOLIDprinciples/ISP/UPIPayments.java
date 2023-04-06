package Practice.SOLIDprinciples.ISP;



// 4. The interface UPIPayments initially had method for CashBack; the service for which was not provided by
// some of the implementing classes, hence it was violating the ISP.



public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();


}

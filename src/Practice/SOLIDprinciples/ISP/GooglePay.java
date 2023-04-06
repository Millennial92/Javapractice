package Practice.SOLIDprinciples.ISP;

public class GooglePay implements UPIPayments,CashBackManager {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {

        // 4. This service is provided by GooglePay.

    }
}

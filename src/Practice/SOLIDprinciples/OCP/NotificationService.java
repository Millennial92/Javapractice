package Practice.SOLIDprinciples.OCP;



// 2. We needed to add Whatsapp Notification Service method....
//.....Hence we made a new interface to be implemented by different other classes, and thereby fulfilling OCP.


public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}

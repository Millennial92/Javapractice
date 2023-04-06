package Practice.SOLIDprinciples.SRP;



// 1.  The class BankService formally held methods of Printing Service, Loan Service, Notification Service....
//.....Hence, we have made three more classes in order to implement the SINGLE RESPONSIBILITY PRINCIPLE.


public class BankService {

    public long deposit( long amount, String accountNo )
    {

      return 0;
    }
    public long withDraw( long amount, String accountNo )
    {

        return 0;
    }

}

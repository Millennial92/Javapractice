package Practice.SOLIDprinciples.DIP;



// 5. Here, we use BankCard as the interface in order to loosely couple ShoppingMall to different cards( classes ).
// This maintains the Dependency Inversion Principle.



public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {

        this.bankCard = bankCard;

    }

    public void doPurchaseSomething(long amount) {

        bankCard.doTransaction(amount);


    }

    public static void main(String[]args) {

        // 5. DebitCard is the child of BankCard, hence we loosely coupled DebitCard/CreditCard by tightly coupling it
        // with BankCard ( Run Time Polymorphism ). This maintains the DIP.

        BankCard bankCard = new DebitCard();   // Change the implementation jut here.

        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);


    }

}

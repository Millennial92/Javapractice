package Practice.LamdaFunctionExamples.GreetExample;

public class Greeter {

    public static void greet( Greeting greeting ) {
        greeting.perform();
    }

    public static void main(String[]args)
    {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

      Greeting lambdaGreeting = () -> System.out.println("Hello World !!");

    Greeting innerClassGreeting = new Greeting() {
        public void perform() {
            System.out.println("Hello World !!");
        }
    };

    Greeter.greet(lambdaGreeting);
    Greeter.greet(innerClassGreeting);
    }
}

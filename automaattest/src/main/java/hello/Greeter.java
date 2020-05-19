package hello;

public class Greeter {
    public String sayHello(String name) {
        Counter counter = new Counter();
        int length = counter.nameLenght(name);

        if (length < 1) {
            return "Hello short " + name;
        } else {
            return "Hello long " + name;

        }
    }
}

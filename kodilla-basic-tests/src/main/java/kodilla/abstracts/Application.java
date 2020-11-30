package kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        Duck duck = new Duck(2);

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);


    }
}

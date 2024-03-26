package divergent_after.After;

public class Order {
	private OrderCreator creator;
    private OrderProcessor processor;

    public void create() {
        creator.create();
    }

    public void process() {
        processor.process();
    }
}

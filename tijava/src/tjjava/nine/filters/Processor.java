package tjjava.nine.filters;

public interface Processor {
	public String name();
	Object process(Object input);
}

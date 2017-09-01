package tjjava.nine.filters;

public class FileterAdapter implements Processor{

	Filter filter;
	public FileterAdapter(Filter filter){
		this.filter = filter;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}

}

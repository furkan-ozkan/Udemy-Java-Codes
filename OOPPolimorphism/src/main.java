
public class main {

	public static void main(String[] args) {
		
		DefaultPublisher df = new DefaultPublisher();
		DefaultPublisher kw = new KwitterPublisher();
		DefaultPublisher hb = new HeysbookPublisher();
		DefaultPublisher kt = new KinstagramPublisher();
		
		df.Publish();
		kw.Publish();
		hb.Publish();
		kt.Publish();
		
	}

}

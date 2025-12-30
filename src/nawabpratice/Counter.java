package nawabpratice;

public class Counter {
	
	static int staticcount=0;
	int nonstaticcount=0;
	
	public static void incrementstatic() {
		staticcount++;
		System.out.println("static count :"+staticcount);
	}
	
	public  void incrementnonstatic() {
		nonstaticcount++;
		System.out.println("non static count:"+nonstaticcount);
	}
	

	}


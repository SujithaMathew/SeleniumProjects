
public class Try {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3/0);
	}
	catch(Throwable e){
		e.printStackTrace();
		String x = e.getMessage();
		System.out.println(x);
	}
	finally {
		System.out.println(4
				);
	}
}
}

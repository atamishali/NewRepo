
public class SwiftVXI implements Swift{

	@Override
	public void drive() {
		System.out.println("SwiftVXI is driving");
		
	}

	@Override
	public void reverse() {
		System.out.println("SwiftVXI is driving in reverse");
		
	}

	@Override
	public void stop() {
		System.out.println("SwiftVXI is stopped");
		
	}
}

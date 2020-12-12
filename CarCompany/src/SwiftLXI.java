
public class SwiftLXI implements Swift{

	@Override
	public void drive() {
		System.out.println("SwiftLXI is driving");
		
	}

	@Override
	public void reverse() {
		System.out.println("SwiftLXI is driving in reverse");
		
	}

	@Override
	public void stop() {
		System.out.println("SwiftLXI is stopped");
		
	}
	
}

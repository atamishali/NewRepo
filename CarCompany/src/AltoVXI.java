
public class AltoVXI implements Alto{

	@Override
	public void drive() {
		System.out.println("AltoVXI is driving");
		
	}

	@Override
	public void reverse() {
		System.out.println("AltoVXI is driving in reverse");
		
	}

	@Override
	public void stop() {
		System.out.println("AltoVXI is stopped");
		
	}
}

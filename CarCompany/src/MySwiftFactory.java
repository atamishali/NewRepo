
public class MySwiftFactory implements MyMarutiFactory {

	@Override
	public Swift getCar(CarType sct) {
		switch (sct) {
		case SWIFTLXI:
			return new SwiftLXI();

		case SWIFTVXI:
			return new SwiftVXI();

		case SWIFTZXI:
			return new SwiftZXI();

		default:
			return null;
		}
	}

}


public class MainFactory {

	public static MyMarutiFactory getFactory(FactoryType factoryType) {
		switch (factoryType) {
		case ALTO:
			return new MyAltoFactory();
		case SWIFT:
			return new MySwiftFactory();

		default:
			return null;
		}
	}
}

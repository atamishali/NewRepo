
public class StartApplication {

	public static void main(String[] args) {

		Swift lxi = (Swift) MainFactory.getFactory(FactoryType.SWIFT).getCar(CarType.SWIFTLXI);
	     lxi.drive();
	     lxi.stop();
	    Alto vxi = (Alto) MainFactory.getFactory(FactoryType.ALTO).getCar(CarType.ALTOVXI);
	    vxi.reverse();
	    vxi.stop();
	}

}


public class MyAltoFactory implements MyMarutiFactory{

	@Override
	public Alto getCar(CarType carTYpe) {

		switch (carTYpe) {
		case ALTOLXI:
			return new AltoLXI();

		case ALTOVXI:
			return new AltoVXI();

		default:
			return null;
		}

	}
}

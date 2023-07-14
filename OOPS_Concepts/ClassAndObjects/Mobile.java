public class Mobile {
	String brand;
	String color;
	String model;
	int ram;
	int storage;
	String display;
	String camera;
	int battery;
	int cost;
	String network;
	String processor;

	public Mobile(String brand, String color, String model, int ram, int storage, String display, String camera,
			int battery, int cost, String network,String processor) {
		super();
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.camera = camera;
		this.battery = battery;
		this.cost = cost;
		this.network = network;
		this.processor = processor;
	}

	void MobileSpecifications() {
		System.out.println(brand + " " + model + " Specifications are : ");
		System.out.println("Mobile color : "+color);
		System.out.println("Mobile model : "+model);
		System.out.println("Mobile ram : "+ram);
		System.out.println("Mobile storage : "+storage);
		System.out.println("Mobile display : "+display);
		System.out.println("Mobile camera : "+camera);
		System.out.println("Mobile battery : "+battery);
		System.out.println("Mobile cost : "+cost);
		System.out.println("Mobile network : "+network);
		System.out.println("Mobile processor : " + processor);
	}

	void WatchMovies() {
		System.out.println("--------------------------------------");
		System.out.println("I am watching movie in "+brand+"'s "+model+" mobile which is "+color+" coloured.");
	}

	void PlayGames() {
		System.out.println("--------------------------------------");
		System.out.println("I am playing Free Fire in "+brand+"'s "+model+" mobile having "+processor+" processor and "+ram+"GB RAM.");
	}

	void InsertROMs() {
		System.out.println("--------------------------------------");
		System.out.println("Flashing custom ROMs in "+brand+"'s "+model+" is very easy and fun.");
	}
}

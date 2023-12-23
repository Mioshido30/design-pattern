package mediator;

public class Main {

	public Main() {
		
		/*
		 * Mediator is a behavioral design pattern that lets you reduce chaotic 
		 * dependencies between objects. The pattern restricts direct communications 
		 * between the objects and forces them to collaborate only via a mediator object.
		 * */
		
		ChatMediator chatMediator = new ChatMediator();
		
		Employee felix = new Employee("Felix", true, chatMediator);
		Employee danheng = new Employee("Dan heng", true, chatMediator);
		Employee argenti = new Employee("Argenti", true, chatMediator);
		Employee jingyuan = new Employee("Jing yuan", false, chatMediator);
		Employee blade = new Employee("Blade", true, chatMediator);
		
		blade.send(jingyuan, "Lets fight!!");
		danheng.send(blade, "Run Run Run");
		felix.send(argenti, "PULL PULL PULL");
	}

	public static void main(String[] args) {
		new Main();
	}

}

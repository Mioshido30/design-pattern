package facade;

import java.util.Scanner;

public class Main {

	public Main() {
		/*
		 * Facade is a structural design pattern that provides a simplified interface 
		 * to a library, a framework, or any other complex set of classes.
		 * */
		
		InstaFacade facade = new InstaFacade();
		String username = "";
		String content = "";
		
		Scanner scan = new Scanner(System.in);
		
		
		int input;
		int inputAction;
		do {
			System.out.println("Input user:");
			username = scan.nextLine();
			
			mainMenu();
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1:
				actionMenu();
				inputAction = scan.nextInt();
				scan.nextLine();
				if(inputAction == 1) {					
					System.out.println("Input Content:");
					content = scan.nextLine();
					facade.postFeed(username, content);
				} else if(inputAction == 2) {			
					System.out.println("Input Content:");
					content = scan.nextLine();				
					facade.deleteFeed(username, content);
				}
				
				break;
			case 2:
				actionMenu();
				inputAction = scan.nextInt();
				scan.nextLine();
				if(inputAction == 1) {		
					System.out.println("Input Content:");
					content = scan.nextLine();					
					facade.postVideo(username, content);
				} else if(inputAction == 2) {		
					System.out.println("Input Content:");
					content = scan.nextLine();					
					facade.deleteVideo(username, content);
				}
				
				break;
			case 3:
				actionMenu();
				inputAction = scan.nextInt();
				scan.nextLine();
				if(inputAction == 1) {			
					System.out.println("Input Content:");
					content = scan.nextLine();				
					facade.postStory(username, content);
				} else if(inputAction == 2) {			
					System.out.println("Input Content:");
					content = scan.nextLine();				
					facade.deleteStory(username, content);
				}
				
				break;
			default:
				break;
			}
			
		} while (input != 4);
		
		scan.close();
	}
	
	public void actionMenu() {
		System.out.println("1. Post");
		System.out.println("2. Delete");
	}
	
	public void mainMenu() {
		System.out.println("Choose your post below :");
		System.out.println("1. Feeds");
		System.out.println("2. Video");
		System.out.println("3. Story");
	}

	public static void main(String[] args) {
		new Main();
	}

}

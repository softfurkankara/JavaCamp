import Adapters.MernisServiceAdapter;
import Concrete.CampaingManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(1,"Furkan","Kara",1998,"0000000000");
		Customer customer2=new Customer(2,"Yasin","Kara",1993,"0000000000");
		
		Game game1=new Game(1,"CSGO",196);
		Game game2=new Game(2,"Valorant",250);
		Game game3=new Game(3,"Cossacks3",140);
		
		Campaing campaign1=new Campaing(1,"WOOD",30);
		Campaing campaing2=new Campaing(2,"STONE",50);
		Campaing campaing3=new Campaing(3,"GOLD",70);
		
		CustomerManager customerManager=new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		customerManager.add(customer2);

		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.add(campaign1);
		campaingManager.add(campaing2);
		campaingManager.add(campaing3);
		
		OrderManager orderManager=new OrderManager();
		orderManager.buyGame(customer1, game1);
		orderManager.discountBuyGame(customer2, game3, campaing3);
		
		
		campaingManager.delete(campaing3);
		gameManager.delete(game2);
		customerManager.delete(customer1);

	}

}

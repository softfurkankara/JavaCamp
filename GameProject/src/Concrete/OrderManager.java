package Concrete;

import Abstract.CampaignService;
import Abstract.OrderService;
import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

public class OrderManager implements OrderService{

	@Override
	public void buyGame(Customer customer, Game game) {
		System.out.println("\n "+customer.getFirstName()+" "+customer.getLastName()+" "+
				game.getGameName()+" oyununu "+game.getGameunitPrice()+" TL'ye Satýn Aldý.");
		
	}

	@Override
	public void discountBuyGame(Customer customer, Game game, Campaing campaign) {
		System.out.println("\n "+customer.getFirstName()+" "+game.getGameName()+" oyununu "+game.getGameunitPrice()+" yerine "
				+campaign.getDiscount()+" indirimle "+(game.getGameunitPrice()-((game.getGameunitPrice()*campaign.getDiscount())/100))+
						"TL'ye Satýn aldý");
		
	}

}

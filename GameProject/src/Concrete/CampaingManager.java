package Concrete;

import Abstract.CampaignService;
import Entities.Campaing;

public class CampaingManager implements CampaignService {

	@Override
	public void add(Campaing campaign) {
		System.out.println("\nKampanya "+campaign.getName()+"basladi. Bu kampanyada %"+campaign.getDiscount()+"indirim var.");
		
	}

	@Override
	public void delete(Campaing campaign) {
		System.out.println("\nKampanya "+campaign.getName()+" bitti.");
		
	}

	@Override
	public void update(Campaing campaign) {
		System.out.println("\nKampanya  "+campaign.getName()+" güncellendi.");
		
	}

}

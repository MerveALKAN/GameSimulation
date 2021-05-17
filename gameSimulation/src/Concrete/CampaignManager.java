package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		if (campaign.getName().length()<2 && campaign.getDiscountPrice()<0)
		{
		System.out.println("Hatal� bilgi");	
		}else {
			System.out.println(campaign.getName() +" "+ "dahilinde oyununuz" +" "+ "%" + " " + campaign.getDiscountPrice() +"  "+"�ndirimli eklendi"  );
		}
	}

	@Override
	public void update(Campaign campaign) {
		if (campaign.getName().length()<2 && campaign.getDiscountPrice()<0)
		{
		System.out.println("Hatal� bilgi");	
		}else {
			System.out.println(campaign.getName()+" "+ "�simli kampanya" + " " + campaign.getDiscountPrice() +"ba�ar�yla g�ncellendi");
		}
		
	}

	@Override
	public void delete(Campaign campaign) 
	 
		
	{
	 System.out.println(campaign.getName() + " " + "Kampanya silindi");
	}

}

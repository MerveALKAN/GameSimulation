package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		if (campaign.getName().length()<2 && campaign.getDiscountPrice()<0)
		{
		System.out.println("Hatalý bilgi");	
		}else {
			System.out.println(campaign.getName() +" "+ "dahilinde oyununuz" +" "+ "%" + " " + campaign.getDiscountPrice() +"  "+"Ýndirimli eklendi"  );
		}
	}

	@Override
	public void update(Campaign campaign) {
		if (campaign.getName().length()<2 && campaign.getDiscountPrice()<0)
		{
		System.out.println("Hatalý bilgi");	
		}else {
			System.out.println(campaign.getName()+" "+ "Ýsimli kampanya" + " " + campaign.getDiscountPrice() +"baþarýyla güncellendi");
		}
		
	}

	@Override
	public void delete(Campaign campaign) 
	 
		
	{
	 System.out.println(campaign.getName() + " " + "Kampanya silindi");
	}

}

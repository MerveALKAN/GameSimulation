package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println("Deðerli Müþterimiz" + " " + sale.getPlayer().getFirstName()+" "+ 
	                       sale.getPlayer().getLastName()+" "+ 
				           sale.getGame().getGameName()+ " "+ "Ýsimli oyunu"+ " " + 
	                       sale.getGame().getPrice() +"TL ile Satýn aldýnýz " 
	                       );
		
	}
	public void add(Sale sale, Campaign campaign) {
		System.out.println("Deðerli Müþterimiz" + " " + sale.getPlayer().getFirstName()+" "+
	                       sale.getPlayer().getLastName()+ " "+
				           sale.getGame().getGameName()+" "+ "Ýsimli oyunu" + " " + 
	                       campaign.getName()+" "+ "dahilinde"+ " % " + campaign.getDiscountPrice()+ " "+ "indirim ile " +
	                       (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPrice()/100))+" "+ "TL'ye satýn aldýnýz"+ " "+ "\n"
			+"Kazancýnýz : " +" "+  sale.getGame().getPrice()*campaign.getDiscountPrice()/100);
		                   
	}

}

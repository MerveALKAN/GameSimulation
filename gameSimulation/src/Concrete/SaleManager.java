package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sale) {
		System.out.println("De�erli M��terimiz" + " " + sale.getPlayer().getFirstName()+" "+ 
	                       sale.getPlayer().getLastName()+" "+ 
				           sale.getGame().getGameName()+ " "+ "�simli oyunu"+ " " + 
	                       sale.getGame().getPrice() +"TL ile Sat�n ald�n�z " 
	                       );
		
	}
	public void add(Sale sale, Campaign campaign) {
		System.out.println("De�erli M��terimiz" + " " + sale.getPlayer().getFirstName()+" "+
	                       sale.getPlayer().getLastName()+ " "+
				           sale.getGame().getGameName()+" "+ "�simli oyunu" + " " + 
	                       campaign.getName()+" "+ "dahilinde"+ " % " + campaign.getDiscountPrice()+ " "+ "indirim ile " +
	                       (sale.getGame().getPrice()-(sale.getGame().getPrice()*campaign.getDiscountPrice()/100))+" "+ "TL'ye sat�n ald�n�z"+ " "+ "\n"
			+"Kazanc�n�z : " +" "+  sale.getGame().getPrice()*campaign.getDiscountPrice()/100);
		                   
	}

}

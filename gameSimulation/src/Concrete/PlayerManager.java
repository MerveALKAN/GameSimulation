package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	
	PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if (playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("Ki�i eklendi :" +player.getFirstName() + " " + player.getLastName());
		}
		else {
			System.out.println("Hatal� bilgi");
		}
		
	}

	@Override
	public void update(Player player) {
	
		if (playerCheckService.checkIfRealPerson(player)) 
	    {
		System.out.println("Bilgiler g�ncellendi : " + player.getFirstName()+" "+ player.getLastName());
	    }
		
	else {
		System.out.println("Hatal� bilgi");
	}
}
	@Override
	public void delete(Player player) {
		System.out.println("Ki�i silindi");
	}

}

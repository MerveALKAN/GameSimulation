package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		if (game.getGameName().length() < 2 && game.getPrice() < 0) 
		{
			System.out.println("Eksik bilgi");
			
		}else {
			System.out.println("Oyun eklendi :" +game.getGameName());
		}
		
	}

	@Override
	public void update(Game game) {
		if (game.getGameName().length()<2 && game.getPrice()<0) 
		{
		System.out.println("Eksik bilgi");	
		}else {
			System.out.println("Oyun güncellendi : "+game.getGameName());
		}
		
	}

	@Override
	public void delete(Game game) {
	if (game.getGameName().length()<2 && game.getPrice()<0) 
	{
	System.out.println("Eksik bilgi");	
	}else {
		System.out.println("Oyun silindi");
	}
		
	}

}

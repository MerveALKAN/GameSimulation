package gameSimulation;

import java.time.LocalDate;

import Abstract.PlayerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Merve");
		player1.setLastName("ALKAN");
		player1.setNationalityId("52753464950");
		player1.setDateofBirth(LocalDate.of(1998, 6, 7));
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Dota");
		game1.setPrice(200);
		game1.setDescription("A Modern Multiplayer Masterwork");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz kampanyasý");
		campaign1.setDiscountPrice(30);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setPlayer(player1);
		
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);

	}

}

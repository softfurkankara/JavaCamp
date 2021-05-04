package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("\nOyun Eklendi : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("\nOyun Silindi : "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("\nOyun Güncellendi : "+game.getGameName());
	}

}

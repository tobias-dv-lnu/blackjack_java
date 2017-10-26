package BlackJack.model.rules;

public class SoftAmericanRules implements IRulesFactory{

	public INewGameStrategy GetNewGameStrategy() {
		return new AmericanNewGameStrategy();
	}

	public IHitStrategy GetHitStrategy() {
		return new SoftHitStrategy();
	}

	public IWinStrategy GetWinStrategy() {
		return new DealerWinStrategy();
	}

}
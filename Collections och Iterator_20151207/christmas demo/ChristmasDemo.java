public class ChristmasDemo {
	public static void main(String[] args) {
		System.out.println("Christmas Demo!");

		Package pc = new Package("Datorchassi", 2000);
		Thing motberboard = new Thing("Gigabyte", 4000);
		Thing processor = new Thing("Intel i7", 4000);

		pc.add(motberboard);
		pc.add(processor);

		Thing boardGame = new Thing("board game", 600);

		Package oscarsGift = new Package("Julklapp", 10);
		oscarsGift.add(boardGame);
		oscarsGift.add(pc);

		System.out.println("Värdet på PC:n " + pc.getValue());
		System.out.println("Värdet på Osvars julklapp: " + oscarsGift.getValue());

		Package misPresenter = new Package("choklad", 500);
		misPresenter.add(oscarsGift);	
		System.out.println("värdet på mis presenter : " + misPresenter.getValue());
		misPresenter.getAllItems();
	}
}
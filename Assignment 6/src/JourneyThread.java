
//package se.mah.k3lara;

import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneyThread extends Thread {

	private SkåneTrafikenGUI gui;
	private Parser parser;

	public JourneyThread(SkåneTrafikenGUI g, Parser p) {
		this.gui = g;
		this.parser = p;

	}

	public void Run() {
		gui.txtareaResult.setText("Searching...");

		/**
		 * String searchURL =
		 * Constants.getURL(gui.txtFrom.getText(),gui.txtToStation.getText(),1);
		 * //Malmö C = 80000, Lund C, 81216 Malmö Gatorg 80100, Hässleholm C
		 * 93070
		 * 
		 * 
		 * Journeys journeys = Parser.getJourneys(searchURL); for (Journey
		 * journey : journeys.getJourneys()) {
		 * gui.txtToResult.append(journey.getStartStation()+" - ");
		 * gui.txtToResult.append(journey.getEndStation().getStationName());
		 * String time =
		 * journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.
		 * getDepDateTime().get(Calendar.MINUTE); gui.txtToResult.append(
		 * " Departs " + time +" that is in "+journey.getTimeToDeparture()+
		 * " minutes. And it is "+journey.getDepTimeDeviation()+" min late"); }
		 * }
		 */

	}
}
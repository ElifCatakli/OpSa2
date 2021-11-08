package gui;

import java.io.IOException;
import business.FreizeitbaederModel;
import javafx.stage.Stage;

public class FreizeitbaederControl {
	
	private FreizeitbaederView freizeitbaederView;
	private FreizeitbaederModel freizeitbaederModel;
	
	public FreizeitbaederControl(Stage primaryStage) {
		this.freizeitbaederModel = new FreizeitbaederModel();
		this.freizeitbaederView = new FreizeitbaederView(primaryStage, this, this.freizeitbaederModel);
	}

	void schreibeFreizeitbaederInDatei(String typ) {
		try {
			if ("csv".equals(typ)) {
				// Aufruf des Models zum Schreiben des
				// Freizeitbads in die Datei des vorgegebenen
				// Typs und Ausgabe der Meldung
				this.freizeitbaederModel.schreibeFreizeitbaederInCsvDatei(freizeitbaederView);
				this.freizeitbaederView.zeigeInformationsfensterAn("Das Freizeitbad wurde eingetragen.");
			} else {
				freizeitbaederView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		} catch (IOException exc) {
			freizeitbaederView.zeigeFehlermeldungsfensterAn("IOException beim Speichern!", exc.toString());
		} catch (Exception exc) {
			freizeitbaederView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!", exc.toString());
		}
	}
}
package business;

import java.io.*;
import java.io.IOException;
import gui.*;

public class FreizeitbaederModel {

	private Freizeitbad freizeitbad;

	public FreizeitbaederModel() {
	}

	public Freizeitbad getFreizeitbad() {
		return freizeitbad;
	}

	public void setFreizeitbad(Freizeitbad freizeitbad) {
		this.freizeitbad = freizeitbad;
	}

	public void schreibeFreizeitbaederInCsvDatei(FreizeitbaederView freizeitbeaderView) throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Freizeitbaeder.csv", true));
		aus.write(this.getFreizeitbad().gibFreizeitbadZurueck(';'));
		aus.close();
	}

}
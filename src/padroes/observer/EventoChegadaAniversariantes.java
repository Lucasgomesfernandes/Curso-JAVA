package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariantes {

	private final Date momento;

	public EventoChegadaAniversariantes(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
	
}

package application;

public class IsiEvent {
	private String kolomPeriod = ""; 
	private String kolomJudulAyat = "";
	private String kolomIsiAyat = "";

	public String getKolomPeriod() {
		return kolomPeriod;
	}

	public void setKolomPeriod(String kolomPeriod) {
		this.kolomPeriod = kolomPeriod;
	}

	public String getKolomJudulAyat() {
		return kolomJudulAyat;
	}

	public void setKolomJudulAyat(String kolomJudulAyat) {
		this.kolomJudulAyat = kolomJudulAyat;
	}

	public String getKolomIsiAyat() {
		return kolomIsiAyat;
	}

	public void setKolomIsiAyat(String kolomIsiAyat) {
		this.kolomIsiAyat = kolomIsiAyat;
	}

	public IsiEvent(String kolomPeriod, String kolomJudulAyat, String kolomIsiAyat) {
		super();
		this.kolomPeriod = kolomPeriod;
		this.kolomJudulAyat = kolomJudulAyat;
		this.kolomIsiAyat = kolomIsiAyat;
	}

}

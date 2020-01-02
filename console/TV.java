package console;

public class TV {

	private String TVname;
	private int volume;
	private boolean mute; // on/off

	public TV(String TVname, int volume, boolean mute) {//throws InvalidVolumeException {
		this.TVname = TVname;
		this.volume = volume;
		this.mute = mute;
	}

	public String getName() {
		return TVname;
	}

	public int getVol() {
		return volume;
	}

	public boolean getStatus() {
		return mute;
	}

	public int changeVol(int vol) throws InvalidVolumeException {
		if ((volume + vol >= 0) && (volume + vol <= 10)) {
			volume += vol;
			System.out.println("New volume is: " + volume);
			return volume;
		} else {
			throw new InvalidVolumeException();
		}
	}

	public boolean changeStatus(boolean status) {
		mute = status;
		System.out.println(mute);
		return mute;
	}

}

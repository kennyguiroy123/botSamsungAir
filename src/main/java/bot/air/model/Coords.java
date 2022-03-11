package bot.air.model;

import bot.air.model.BotAir.ZoneState;

public class Coords {

	private int x;
	private int y;
	private ZoneState zs;
	
	public ZoneState getZs(int x,int y) {
		return this.zs;
	}

	public Coords(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.zs = ZoneState.Unknown;
	}


}

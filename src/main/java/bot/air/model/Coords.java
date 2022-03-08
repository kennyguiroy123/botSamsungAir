package bot.air.model;

import bot.air.model.BotAir.ZoneState;

public class Coords {

	private Number x;
	private Number y;
	private ZoneState zs;
	
	public ZoneState getZs(Number x,Number y) {
		return this.zs;
	}

	public Coords(Number x, Number y) {
		super();
		this.x = x;
		this.y = y;
	}


}

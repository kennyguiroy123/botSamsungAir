package bot.air.model;

interface BotAir {
    
    public enum ZoneState {
        
    	Obstructed("-1"), Unknown("0"), Free("1");
		private String code;
    	
    	   ZoneState(String code) {
			// TODO Auto-generated constructor stub
		}
    	   public String getCode() {
    	       return code;
    	   }
    	   public void setCode(String code) {
    	       this.code = code;
    	   } 

    }

}
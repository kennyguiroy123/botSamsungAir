package bot.air.model;

import java.awt.Desktop.Action;

import bot.air.model.BotAir.ZoneState;


public class Processing
{
    private Action motion;
    //private ZoneState[][] grid = new ArrayList<Coords>();
    private ZoneState[][] grid;

    
    public Processing(int width, int height, Action motion)
    {
        this.motion = motion;
        this.grid = new ZoneState[height][width];
        //this.grid = new Position[height, width];
        for(int i=0; i < width; i++)
        {
            if(grid[0][i] == ZoneState.Obstructed);
        }
        for (int i = 0; i < height; i++)
        {
            grid[i][0] = grid[i][width - 1] = ZoneState.Obstructed;
        }
        grid[1][1] = ZoneState.Free;
    }
   /* public IEnumerable<ZoneState> Scan()
    {
        return Array.Empty<ZoneState>();
    }*/

}

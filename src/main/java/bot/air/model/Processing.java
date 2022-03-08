package bot.air.model;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

import bot.air.model.BotAir.ZoneState;


public class Processing
{
    private Action motion;
    private List<Coords> grid = new ArrayList<Coords>();

    
    public Processing(int width, int height, Action motion)
    {
        this.motion = motion;
        this.grid = new Position[height, width];
        for(int i=0; i < width; i++)
        {
            if(grid[0, i] == ZoneState.Obstructed)
            	
        }
        for (int i = 0; i < height; i++)
        {
            grid[i, 0] = grid[i, width - 1] = ZoneState.Obstructed;
        }
        grid[1, 1] = ZoneState.Free;
    }
    public IEnumerable<ZoneState> Scan()
    {
        return Array.Empty<ZoneState>();
    }
}

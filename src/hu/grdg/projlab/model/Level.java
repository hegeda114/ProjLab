package hu.grdg.projlab.model;

import hu.grdg.projlab.SkeletonTester;

import java.util.ArrayList;

/**
 * Class for generating and storing a field for playing
 */
public class Level {
    private ArrayList<Tile> tiles;

    public Level(){
        tiles = new ArrayList<Tile>();
    }

    /**
     *
     * @return tiles
     * @author Dorina
     */
    public ArrayList<Tile> getTiles() {
        SkeletonTester.call(this);
        SkeletonTester.addNamedReference(tiles, "tiles");
        SkeletonTester.creturn(tiles);
        return tiles;

    }

    /**
     *
     * @param w width of the level
     * @param h height of the level
     * @return The tile where all the players stand in the beginning
     * @author Dorina
     */
    public IceTile genTiles(int w, int h) {
        SkeletonTester.call(this, h, w);
        for(int i=0; i<w*h; i++){
            tiles.add(new IceTile());
        }
        IceTile tile = (IceTile) tiles.get(0);
        SkeletonTester.addNamedReference(tile, "tile");
        SkeletonTester.creturn(tile);
        return tile;
    }
}

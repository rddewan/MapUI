
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.*;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.PApplet;
import processing.core.PImage;

import java.net.URL;

public class MapUI extends PApplet {
    UnfoldingMap map;
    private PImage backGroundImg;



    public static void main(String[] args) {
        PApplet.main("MapUI",args);



    }

    public void setup() {
        size(800, 600,P2D);
        //
        //backGroundImg = loadImage("http://blog.goway.com/gowayagent/wp-content/uploads/2016/08/Back-of-Christ-the-Redeemer-Statue-in-Rio-de-Janeiro-Brazil.jpg");
        // Select a map provider
        AbstractMapProvider provider = new Google.GoogleTerrainProvider();
        // Set a zoom level
        int zoomLevel = 10;
        map = new UnfoldingMap(this,50,50,350,500,provider);
        // The next line zooms in and centers the map at
        map.zoomAndPanTo(zoomLevel,new Location(13.90921f,100.5520322f));
        // This line makes the map interactive
        MapUtils.createDefaultEventDispatcher(this, map);
    }

    public void draw(){
        map.draw();
    }
}

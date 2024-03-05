package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    //angulos
    private double anguloMercurio, anguloVenus, anguloTierra, anguloMarte, anguloJupiter = 0;
    //esferass
    private Sphere sol, mercurio, venus, tierra, marte, jupiter;
    //geometrias
    private Geometry geomSol, geomMercurio, geomVenus, geomTierra, geomMarte, geomJupiter;
    //materiales
    private Material matSol, matMercurio, matVenus, matTierra, matMarte, matJupiter;
    
    //radio orbitas
    private int rad_Mercurio = 10;
    private int rad_Venus = 18;
    private int rad_Tierra = 25;
    private int rad_Marte = 33;
    private int rad_Jupiter = 45;
    
    //angular veloci
    private int vel_Mercurio = 0.05;
    private int vel_Venus = 0.03;
    private int vel_Tierra = 0.02;
    private int vel_Marte = 0.015;
    private int vel_Jupiter = 0.01;

    

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}

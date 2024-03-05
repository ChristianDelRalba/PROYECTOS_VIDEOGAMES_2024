package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;

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

    

    

    @Override
    public void simpleInitApp() {
        //camara y raton
        cam.setLocation(new Vector3f(0f, 0f, 100f));
        flycam.setMoveSpeed(10);
        
        //esferas planetas y sol
        sol = new Sphere(32, 32, 5f);
        mercurio = new Sphere(32, 32, 0.5f);
        venus = new Sphere(32, 32, 1f);
        tierra = new Sphere(32, 32, 1f);
        marte = new Sphere(32, 32, 0.8f);
        jupiter = new Sphere(32, 32, 3f);
        
        //geometrias sol y planetas
        geomSol = new Geometry("Sol", sol);
        geomMercurio = new Geometry("Mercurio", mercurio);
        geomVenus = new Geometry("Venus", venus);
        geomTierra = new Geometry("Tierra", tierra);
        geomMarte = new Geometry("Marte", marte);
        geomJupiter = new Geometry("Jupiter", jupiter);
        
        //materiales
        matSol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMercurio = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matVenus = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matTierra = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMarte = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matJupiter = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        
        //colores
        matSol.setColor("Color", ColorRGBA.Yellow);
        matMercurio.setColor("Color", ColorRGBA.Gray);
        matVenus.setColor("Color", ColorRGBA.Brown);
        matTierra.setColor("Color", ColorRGBA.Blue);
        matMarte.setColor("Color", ColorRGBA.Red);
        matJupiter.setColor("Color", ColorRGBA.Orange);
        
        // Asignar los materiales a las geometrías
        geomSol.setMaterial(matSol);
        geomMercurio.setMaterial(matMercurio);
        geomVenus.setMaterial(matVenus);
        geomTierra.setMaterial(matTierra);
        geomMarte.setMaterial(matMarte);
        geomJupiter.setMaterial(matJupiter);
        
        // Añadir las geometrías al nodo raíz de la escena
        rootNode.attachChild(geomSol);
        rootNode.attachChild(geomMercurio);
        rootNode.attachChild(geomVenus);
        rootNode.attachChild(geomTierra);
        rootNode.attachChild(geomMarte);
        rootNode.attachChild(geomJupiter);
        
       
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
    
public static void main(String[] args) {
    Main app = new Main();
    app.start();
}
}

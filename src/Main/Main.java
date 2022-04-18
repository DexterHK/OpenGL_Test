package Main;

import com.jme3.app.SimpleApplication;
import com.jme3.export.binary.BinaryImporter;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Node;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {

         /** Load a Node from a .j3o file */
        BinaryImporter importer = BinaryImporter.getInstance();
        importer.setAssetManager(assetManager);
        File file = new File("assets/Scenes/testScene.j3o");
        try {
          Node loadedNode = (Node)importer.load(file);
          loadedNode.setName("loaded node");
          rootNode.attachChild(loadedNode);
        } catch (IOException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "No saved node loaded.", ex);
        } 


        


        
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

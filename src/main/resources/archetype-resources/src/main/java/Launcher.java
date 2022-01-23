package ${package};

import com.codersdungeon.warp.engine.Application;
import com.codersdungeon.warp.engine.scenes.Scene2D;
import com.codersdungeon.warp.engine.scenes.SceneManager2D;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher extends Application {
    private static final Logger LOG = LoggerFactory.getLogger(Launcher.class);

    public static void main(String... args){
        LOG.info("Start");

        setInitialScene();

        Application application = new Launcher();
        application.run();

        LOG.info("End");
    }

    private static void setInitialScene(){
        SceneManager2D.addScene(new Scene2D() {
            @Override
            public void enter() {
                LOG.info("enter scene2d");
            }

            @Override
            public void update(float v) {

            }

            @Override
            public void render(float v) {

            }

            @Override
            public void exit() {
                LOG.info("exit scene2d");
            }
        });
    }
}

package de.felixroske.jfxtest;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.SplashScreen;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleApp extends AbstractJavaFxApplicationSupport {

    public static void main(String args[]) {
        launch(SampleApp.class, SampleView.class, new SplashScreen(), args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setTitle("Sample app");
    }

    @Override
    public void beforeShowingSplash(Stage splashStage) {
        splashStage.setTitle("Sample splash");
    }
}
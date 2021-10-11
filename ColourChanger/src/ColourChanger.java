import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ColourChanger extends Application
{
	@Override
	public void start (Stage stage)
	{
		// make buttons
		Button setBlue = new Button();
		setBlue.setText("Set background to blue");
		
		
		Button setRed = new Button();
		setRed.setText("Set background to red");
		
		
		HBox buttons = new HBox();
		buttons.getChildren().addAll(setBlue, setRed);
		buttons.setAlignment(Pos.CENTER);
		buttons.setPadding(new Insets (15, 0, 0, 0));
		buttons.setSpacing(15);
		
		// Supply code to buttons
		
		
		// Add components to root
		VBox root = new VBox();
		root.getChildren().addAll(buttons);
		
		// add root to scene
		Scene scene = new Scene(root, 400, 100);
		
		// Supply code to buttons
		// Set Blue
		setBlue.setOnAction(e ->
		{
			root.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(0), new Insets(0))));
		});
		
		// Set Red
		setRed.setOnAction(e -> 
		{
			root.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));
		});
		
		// add scene to stage and show stage
		stage.setScene(scene);
		stage.setTitle("Colour Changer");
		stage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}

}

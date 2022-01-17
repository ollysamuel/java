import javafx.application.Application;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.VBox;
	import javafx.scene.paint.Color;
	import javafx.scene.text.Font;
	import javafx.stage.Stage;
	
public class Binding extends Application
{
	@Override
	public void start(Stage stage)
	{
		final double HEIGHT = 150, WIDTH = 300;
			
		// text field
		TextField top = new TextField();
		TextField bottom = new TextField();
		top.setMaxWidth(250);
		bottom.setMaxWidth(250);
			
		bottom.textProperty().bindBidirectional(top.textProperty());
			
		// Vbox
		VBox root = new VBox();
		root.setSpacing(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(top, bottom);
			
		//Scene
		Scene scene = new Scene(root);
			
		stage.setScene(scene);
		stage.setTitle("Binding Demonstration");
		stage.setHeight(HEIGHT);
		stage.setWidth(WIDTH);
		stage.show();
	}
		
	public static void main(String[] args)
	{
		launch(args);
	}

}

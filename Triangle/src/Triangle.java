import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Triangle extends Application 
{
	@Override
	public void start (Stage stage)
	{
		// create triangle
		Line line1 = new Line(100, 100, 400, 200);
		line1.setFill(Color.BLACK);
		line1.setStroke(Color.BLACK);
					
		Line line2 = new Line(100, 100, 100, 200);
		line2.setFill(Color.BLACK);
		line2.setStroke(Color.BLACK);
					
		Line line3 = new Line(100, 200, 400, 200);
		line3.setFill(Color.BLACK);
		line3.setStroke(Color.BLACK);
					
		Group triGroup = new Group(line1, line2, line3);
		
		//create and configure VBox to hold main components
		VBox root = new VBox();
		root.setSpacing(10);
		root.setAlignment(Pos.CENTER);
		
		// Add components to root VBox
		root.getChildren().addAll(triGroup);
		
		// create new scene
		Scene scene = new Scene(root, 800, 500);
		
		// add scene to stage, configure stage and make it visible
		stage.setScene(scene);
		stage.setTitle("Triangle Maker");
		stage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}

}

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseButton;
import javafx.scene.control.ContextMenu;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Side;
import javafx.scene.control.ComboBox;

public class Tester extends Application
{
	@Override
	public void start(Stage stage)
	{
		ComboBox<String> month = new ComboBox<>();
		
		month.getItems().addAll("jan");
		
		
		// create and configure a new scene
		Scene scene = new Scene(root, 250, 275, Color.YELLOW);
		
		// add the scene to the stage, then set the title
		stage.setScene(scene);
		stage.setTitle("Smiley Face");
		
		// show the stage
		stage.show();
		}
	
		public static void main(String[] args)
		{
			launch(args);
		}
}
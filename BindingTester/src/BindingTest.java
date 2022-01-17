import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class BindingTest extends Application
{
	// 2. Adapt the PropertyExample application of Sect. 16.3 so that three or more TextFields operate in unison.
	@Override
	public void start(Stage stage)
	{
		TextField textField1 = new TextField();
		textField1.setPadding(new Insets(10, 10, 10, 10));
		
		TextField textField2 = new TextField();
		textField2.setPadding(new Insets(10, 10, 10, 10));
		textField2.textProperty().bind(textField1.textProperty());
		
		TextField textField3 = new TextField();
		textField3.setPadding(new Insets(10, 10, 10, 10));
		textField3.textProperty().bind(textField1.textProperty());
			
		VBox root = new VBox();
		root.getChildren().addAll(textField1, textField2, textField3);
		
		Scene scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.setTitle("Binding Test");
		stage.show();
			
	}
		
	public static void main(String[] args)
	{
		launch(args);
	}
	
}
	


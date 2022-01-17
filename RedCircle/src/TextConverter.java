import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextConverter extends Application
{
	@Override
	public void start(Stage stage)
	{
		final double HEIGHT = 100, WIDTH = 300;
		
		String messageStart = "You typed: ";
		String messageStart2 = "Last character typed: ";
		
		
		// text field
		TextField textField = new TextField();
		textField.setMaxWidth(250);
		
		// label
		Label label = new Label();
		
		/*
		textField.setOnKeyReleased(e ->
		{
			label.setText("");
			label.setText(messageStart2 + textField.getText().charAt(textField.getText().length()-1));
		});*/
		
		textField.setOnKeyTyped(e -> 
		{
			if (e.getCharacter().equals("\r"))
			{
				label.setText(messageStart + textField.getText());
			}
			else
			{
				label.setText(messageStart2 + e.getCharacter());
			}
		});
		
		// Vbox
		VBox root = new VBox();
		root.setSpacing(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(textField, label);
		
		//Scene
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("Text Converter");
		stage.setHeight(HEIGHT);
		stage.setWidth(WIDTH);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}

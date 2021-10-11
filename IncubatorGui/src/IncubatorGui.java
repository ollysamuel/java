import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class IncubatorGui extends Application 
{
	@Override
	public void start (Stage stage)
	{
		// create incubator object
		Incubator incubator = new Incubator();
		
		// create buttons
		Button incButton = new Button("Increase");
		Button decButton = new Button("Decrease");
		Button disButton = new Button("Display Temp");
		Button helpButton = new Button("Help");
		
		// create HBox for buttons
		HBox buttons = new HBox(10);
		buttons.getChildren().addAll(incButton, decButton, disButton, helpButton);
		buttons.setAlignment(Pos.CENTER);
		buttons.setPadding(new Insets(10, 0, 10, 0));
		
		// create and configure a label to display the output
		Label message = new Label();
		message.setTextFill(Color.BLACK);
		message.setFont(Font.font("Arial", 20));
		
		// create and configure a label to display alarm
		Label alarm = new Label();
		alarm.setTextFill(Color.RED);
		alarm.setFont(Font.font("Arial", 30));
		
		// create VBox for label/s
		VBox labels = new VBox();
		labels.getChildren().addAll(message, alarm);
		labels.setAlignment(Pos.CENTER);
		
		// add components to root
		VBox root = new VBox();
		root.getChildren().addAll(buttons, labels);
		
		// add root to scene
		Scene scene = new Scene(root, 400, 150);
		
		// configure button functions
		
		incButton.setOnAction( e -> 
			{
				String result = incubator.increaseTemperature();
				if (result == "1")
				{
					message.setText("WARNING temp too high");
					alarm.setText("\n" + incubator.alarm());
				}
				else
					message.setText(result);
			}
		);
		
		decButton.setOnAction( e ->
			{
				String result = incubator.decreaseTemperature();
				message.setText(result);
			}
		);
		
		disButton.setOnAction( e ->
			{
				String result = incubator.getTemperature();
				message.setText(result);
			}
		);
		
		helpButton.setOnAction( e ->
			{
				String result = incubator.help();
				message.setText(result);
			}
		);
		
		// add scene to stage and show stage
		stage.setScene(scene);
		stage.setTitle("Incubator");
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}

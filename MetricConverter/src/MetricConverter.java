import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MetricConverter extends Application
{
	@Override
	public void start(Stage stage)
	{
		DecimalFormat df = new DecimalFormat("0.0#"); // see discussion in previous section
		
		// first the components for converting back and forth from inches to centimetres
		
		// create input fields, and labels to show the units
		TextField cmText = new TextField("Centimetres");
		Label cmLabel = new Label("Cm");
		TextField inchText = new TextField("Inches");
		Label inchLabel = new Label("Inches");
		
		// create buttons to perform the calculations
		Button cmToInchButton = new Button(" ===> ");
		Button inchToCmButton = new Button(" <=== ");
		
		// create a VBox to hold the buttons
		VBox inchCmButtons = new VBox();
		inchCmButtons.getChildren().addAll(cmToInchButton, inchToCmButton);
		
		// create an HBox to hold all the items for the first row
		HBox inchCmPanel = new HBox(10); // compound container
		inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButtons, inchText, inchLabel);
		inchCmPanel.setAlignment(Pos.CENTER);
		
		// next the components for converting back and forth from miles to kilometres
		
		// create input fields, and labels to show the units
		TextField kmText = new TextField("Kilometres");
		Label kmLabel = new Label(" Km ");
		TextField mileText = new TextField("Miles");
		Label mileLabel = new Label("Miles "); // extra spaces make all labels the same length
		
		// create buttons to perform the calculations
		Button kmToMileButton = new Button(" ===> ");
		Button mileToKmButton = new Button(" <=== ");
		
		// create a VBox to hold the buttons
		VBox mileKmButtons = new VBox();
		mileKmButtons.getChildren().addAll(kmToMileButton, mileToKmButton);
		
		// create an HBox to hold all the items for the second row
		HBox mileKmPanel = new HBox(10);
		mileKmPanel.getChildren().addAll(kmText, kmLabel, mileKmButtons, mileText, mileLabel);
		mileKmPanel.setAlignment(Pos.CENTER);
		
		// finally the components for converting back and forth from pounds to kilograms
		
		// create input fields, and labels to show the units
		TextField kgText = new TextField("Kilograms");
		Label kgLabel = new Label("Kg"); // extra spaces make all labels the same length
		TextField poundText = new TextField("Pounds");
		Label poundLabel = new Label("Lb"); // extra spaces make all labels the same length
		
		// create buttons to perform the calculations
		Button kgToPoundButton = new Button(" ===> ");
		Button poundToKgButton = new Button(" <=== ");
		
		// create a VBox to hold the buttons
		VBox poundKgButtons = new VBox();
		poundKgButtons.getChildren().addAll(kgToPoundButton, poundToKgButton);
		
		// create an HBox to hold all the items for the third row
		HBox poundKgPanel = new HBox(10);
		poundKgPanel.getChildren().addAll(kgText, kgLabel, poundKgButtons, poundText, poundLabel);
		poundKgPanel.setAlignment(Pos.CENTER);
		
		// components for Celsius to Fahrenheit
		
		// create text fields
		TextField celText = new TextField("celsius");
		Label celLabel = new Label(" C ");
		TextField fahText = new TextField("fahrenheit");
		Label fahLabel = new Label(" F ");
		
		// Create buttons
		Button celToFahButton = new Button(" ===> ");
		Button fahToCelButton = new Button(" <=== ");
		
		// create VBox to hold the buttons
		VBox celFahButtons = new VBox();
		celFahButtons.getChildren().addAll(celToFahButton, fahToCelButton);
		
		// create HBox to hold all components
		HBox celFahPanel = new HBox(10);
		celFahPanel.getChildren().addAll(celText, celLabel, celFahButtons, fahText, fahLabel);
		celFahPanel.setAlignment(Pos.CENTER);
		
		// litres to pint conversion
		
		// create text fields
		TextField litText = new TextField();
		Label litLabel = new Label(" L ");
		TextField pintsText = new TextField();
		Label pintsLabel = new Label(" p ");
		
		// create buttons
		Button litToPintButton = new Button(" ===> ");
		Button pintToLitButton = new Button(" <=== ");
		
		// Create VBox for buttons
		VBox litPintButtons = new VBox();
		litPintButtons.getChildren().addAll(litToPintButton, pintToLitButton);
		
		// create HBox for all components
		HBox pintLitPanel = new HBox(10);
		pintLitPanel.getChildren().addAll(litText, litLabel, litPintButtons, pintsText, pintsLabel);
		pintLitPanel.setAlignment(Pos.CENTER);
		
		// create a VBox to hold all rows
		VBox root = new VBox(10);
		root.getChildren().addAll(inchCmPanel, mileKmPanel, poundKgPanel, celFahPanel, pintLitPanel);
		root.setAlignment(Pos.CENTER);
		
		// write the code for the buttons
		cmToInchButton.setOnAction( e -> 
			{
				String s = new String(cmText.getText());
				double d = Double.parseDouble(s);
				d = d / 2.54;
				s = df.format(d);
				inchText.setText(s);
			}
		);
		
		inchToCmButton.setOnAction( e -> 
			{
				String s = new String(inchText.getText());
				double d = Double.parseDouble(s);
				d = d * 2.54;
				s = df.format(d);
				cmText.setText(s);
			}
		);
		
		kmToMileButton.setOnAction( e -> 
			{
				String s = new String(kmText.getText());
				double d = Double.parseDouble(s);
				d = d / 1.609;
				s = df.format(d);
				mileText.setText(s);
			}
		);
		
		mileToKmButton.setOnAction( e -> 
			{
				String s = new String(mileText.getText());
				double d = Double.parseDouble(s);
				d = d * 1.609;
				s = df.format(d);
				kmText.setText(s);
			}
		);
		
		kgToPoundButton.setOnAction( e -> 
			{
				String s = new String(kgText.getText());
				double d = Double.parseDouble(s);
				d = d * 2.2;
				s = df.format(d);
				poundText.setText(s);
			}
		);
		
		poundToKgButton.setOnAction( e -> 
			{
				String s = new String(poundText.getText());
				double d = Double.parseDouble(s);
				d = d / 2.2;
				s = df.format(d);
				kgText.setText(s);
			}
		);
		
		celToFahButton.setOnAction( e -> 
			{
				String s = new String(celText.getText());
				double d = Double.parseDouble(s);
				d = (d * 1.8) + 32;
				s = df.format(d);
				fahText.setText(s);
			}
		);
		
		fahToCelButton.setOnAction( e -> 
			{
				String s = new String(fahText.getText());
				double d = Double.parseDouble(s);
				d = (d - 32) * 0.5556;
				s = df.format(d);
				celText.setText(s);
			}
		);
		
		litToPintButton.setOnAction( e -> 
			{
				String s = new String(litText.getText());
				double d = Double.parseDouble(s);
				d = d * 2.113376;
				s = df.format(d);
				pintsText.setText(s);
			}
		);
		
		pintToLitButton.setOnAction( e -> 
		{
			String s = new String(pintsText.getText());
			double d = Double.parseDouble(s);
			d = d / 2.113376;
			s = df.format(d);
			litText.setText(s);
		}
	);
		
		
		// create a new scene
		Scene scene = new Scene(root);
		
		// add the scene to the stage, then configure the stage and make it visible
		stage.setScene(scene);
		stage.setTitle("Metric Converter");
		stage.setWidth(500);
		stage.setHeight(350);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
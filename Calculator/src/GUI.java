import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.lang.*;

public class GUI extends Application
{
	static String answerString = "";
	static double answer = 0;
	char operation;
	@Override 
	public void start(Stage stage)
	{
		// set component width and height
		int width = 40, height = 40;
		
		// create calculator object
		Calculator calc = new Calculator();
		
		// create fonts
		Font font1 = new Font(18);
		
		// set button background
		Background buttonBG = new Background(new BackgroundFill(Color.DARKGREY, 
				new CornerRadii(2), Insets.EMPTY));
		
		// create and configure text field
		TextField mainDisplay = new TextField();
		mainDisplay.setFont(font1);
		mainDisplay.setMinSize(4 * width, height);
		
		//create and configure number buttons
		
		Button one = new Button("1");
		one.setMinSize(width, height);
		//one.setBackground(buttonBG);
		one.setOnAction( e ->
		{
			calc.numberButtons("1");
			mainDisplay.setText(mainDisplay.getText() + 1);
		});
		
		Button two = new Button("2");
		two.setMinSize(width, height);
		two.setOnAction( e -> 
		{
			calc.numberButtons("2");
			mainDisplay.setText(mainDisplay.getText() + 2);
		});
		
		Button three = new Button("3");
		three.setMinSize(width, height);
		three.setOnAction( e -> 
		{
			calc.numberButtons("3");
			mainDisplay.setText(mainDisplay.getText() + 3);
		});
		
		Button four = new Button("4");
		four.setMinSize(width, height);
		four.setOnAction( e -> 
		{
			calc.numberButtons("4");
			mainDisplay.setText(mainDisplay.getText() + 4);;
		});
		
		Button five = new Button("5");
		five.setMinSize(width, height);
		five.setOnAction( e -> 
		{
			calc.numberButtons("5");
			mainDisplay.setText(mainDisplay.getText() + 5);
		});
		
		Button six = new Button("6");
		six.setMinSize(width, height);
		six.setOnAction( e ->
		{
			calc.numberButtons("6");
			mainDisplay.setText(mainDisplay.getText() + 6);
		});
		
		Button seven = new Button("7");
		seven.setMinSize(width, height);
		seven.setOnAction( e -> 
		{
			calc.numberButtons("7");
			mainDisplay.setText(mainDisplay.getText() + 7);
		});
		
		Button eight = new Button("8");
		eight.setMinSize(width, height);
		eight.setOnAction( e -> 
		{
			calc.numberButtons("8");
			mainDisplay.setText(mainDisplay.getText() + 8);
		});
		
		Button nine = new Button("9");
		nine.setMinSize(width, height);
		nine.setOnAction( e ->
		{
			calc.numberButtons("9");
			mainDisplay.setText(mainDisplay.getText() + 9);
		});
		
		Button zero = new Button("0");
		zero.setMinSize(width, height);
		zero.setOnAction( e ->
		{
			calc.numberButtons("0");
			mainDisplay.setText(mainDisplay.getText() + 0);
		});
		
		Button point = new Button(".");
		point.setMinSize(width, height);
		point.setOnAction( e ->
		{
			calc.numberButtons(".");
			mainDisplay.setText(mainDisplay.getText() + ".");
		});
		
		Button clear = new Button("CE");
		clear.setMinSize(width, height);
		clear.setOnAction(e ->
		{
			calc.clear();
			mainDisplay.setText("");
		});
		
		// create and configure operation buttons
		Button plus = new Button("+");
		plus.setMinSize(width, height);
		plus.setOnAction( e -> 
		{
			calc.calculate('+');
			mainDisplay.setText(mainDisplay.getText() + "+");
		});
		
		Button subtract = new Button("-");
		subtract.setMinSize(width, height);
		subtract.setOnAction( e ->
		{
			calc.calculate('-');
			mainDisplay.setText(mainDisplay.getText() + "-");
		});
		
		Button times = new Button("x");
		times.setMinSize(width, height);
		times.setOnAction( e ->
		{
			calc.calculate('x');
			mainDisplay.setText(mainDisplay.getText() + "x");
		});
		
		Button divide = new Button("/");
		divide.setMinSize(width, height);
		divide.setOnAction( e ->
		{
			calc.calculate('/');
			mainDisplay.setText(mainDisplay.getText() + "/");
		});
		
		Button equals = new Button("=");
		equals.setMinSize(width, height);
		equals.setOnAction( e -> 
		{
			mainDisplay.setText("" + calc.equals());
		});
		
		// create HBox for screen
		HBox screen = new HBox(10);
		screen.setAlignment(Pos.CENTER);
		screen.getChildren().add(mainDisplay);
		
		//create HBox for buttons
		HBox row1 = new HBox(10);
		row1.getChildren().addAll(one, two, three);
		HBox row2 = new HBox(10);
		row2.getChildren().addAll(four, five, six);
		HBox row3 = new HBox(10);
		row3.getChildren().addAll(seven, eight, nine);
		
		// bottom row
		HBox bottom = new HBox(10);
		bottom.getChildren().addAll(equals, point, clear);
		
		// create vbox for number buttons
		VBox numbers = new VBox(10);
		numbers.getChildren().addAll(row1, row2, row3, bottom);
		
		//Create VBox for operator buttons
		VBox operators = new VBox(10);
		operators.getChildren().addAll(plus, subtract, times, divide);
		
		// Create HBox for numbers and operators
		HBox allButtons = new HBox(10);
		allButtons.setAlignment(Pos.CENTER);
		allButtons.getChildren().addAll(numbers, operators);
		
		//create vbox for calculator
		VBox calculator = new VBox(10);
		BorderStroke stroke1 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
				new CornerRadii(15), new BorderWidths(3));
		calculator.setBorder(new Border(stroke1));
		calculator.setBackground(new Background(new BackgroundFill(Color.DARKGREY, 
				new CornerRadii(25), Insets.EMPTY)));
		calculator.setPadding(new Insets(10, 10, 10, 10));
		calculator.setMaxWidth(((4 * width) + 30));
		calculator.setAlignment(Pos.CENTER);
		calculator.getChildren().addAll(screen, allButtons);
		
		//create vbox container
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setBackground(new Background(new BackgroundFill(Color.WHITE, 
				new CornerRadii(10), Insets.EMPTY)));
		root.getChildren().addAll(calculator);
		
		Scene scene = new Scene (root, 300, 300);
		stage.setScene(scene);
		stage.setTitle("Calculator");
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
}

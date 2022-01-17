import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseButton;
import javafx.scene.control.ContextMenu;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Side;

public class FlagClass extends Application
{
	@Override
	public void start(Stage stage)
	{
		final int WIDTH = 600;
		final int HEIGHT = 400;
		final int MENUHEIGHT = 25;
		
		// create menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.setMinHeight(MENUHEIGHT);
		menuBar.setMaxHeight(MENUHEIGHT);
		
		// Create top menu options
		Menu stripe1 = new Menu("Stripe 1");
		Menu stripe2 = new Menu("Stripe 2");
		Menu stripe3 = new Menu("Stripe 3");
		Menu circle = new Menu("Circle");
		
		// create color menus
		Menu redTop = new Menu("Red");
		Menu blueTop = new Menu("Blue");
		Menu yellowTop = new Menu("Yellow");
		Menu whiteTop = new Menu("White");
		
		Menu redMiddle = new Menu("Red");
		Menu blueMiddle = new Menu("Blue");
		Menu yellowMiddle = new Menu("Yellow");
		Menu whiteMiddle = new Menu("White");
		
		Menu redBottom = new Menu("Red");
		Menu blueBottom = new Menu("Blue");
		Menu yellowBottom = new Menu("Yellow");
		Menu whiteBottom = new Menu("White");
		
		//create circle menu
		Menu addCircle = new Menu("Add Circle");
		Menu circleColor = new Menu("Color");
		Menu circleRed = new Menu("Red");
		Menu circleBlue = new Menu("Blue");
		Menu circleYellow = new Menu("Yellow");
		Menu circleWhite = new Menu("White");
		
		// add submenus to top menus
		stripe1.getItems().addAll(redTop, blueTop, yellowTop, whiteTop);
		stripe2.getItems().addAll(redMiddle, blueMiddle, yellowMiddle, whiteMiddle);
		stripe3.getItems().addAll(redBottom, blueBottom, yellowBottom, whiteBottom);
		circle.getItems().addAll(addCircle);
		circle.getItems().addAll(circleColor);
		
		//add options to sub menus
		circleColor.getItems().addAll(circleRed, circleBlue, circleYellow, circleWhite);
		
		// Add stripe menus to menubar
		menuBar.getMenus().addAll(stripe1, stripe2, stripe3, circle);
		
		// Context Menu Items
		Menu red = new Menu("Red");
		Menu blue = new Menu("Blue");
		Menu yellow = new Menu("Yellow");
		Menu white = new Menu("White");
		
		// create right click context menus
		ContextMenu rcTop = new ContextMenu(red, blue, yellow, white);
		ContextMenu rightClickMiddle = new ContextMenu();
		ContextMenu rightClickBottom = new ContextMenu();
		
		// add submenus to context menus
		rcTop.getItems().addAll(redTop);
		rightClickMiddle.getItems().addAll(redMiddle, blueMiddle, yellowMiddle, whiteMiddle);
		rightClickBottom.getItems().addAll(redBottom, blueBottom, yellowBottom, whiteBottom);
		
		// Create flag out of rectangles
		Rectangle topStripe = new Rectangle(WIDTH, (HEIGHT - MENUHEIGHT) / 3);
		topStripe.setFill(Color.WHITE);
		Rectangle middleStripe = new Rectangle(WIDTH, (HEIGHT - MENUHEIGHT) / 3);
		middleStripe.setFill(Color.WHITE);
		Rectangle bottomStripe = new Rectangle(WIDTH, (HEIGHT - MENUHEIGHT) / 3);
		bottomStripe.setFill(Color.WHITE);
		
		//Vbox to hold stripes
		VBox stripes = new VBox();
		stripes.getChildren().addAll(topStripe, middleStripe, bottomStripe);
		
		// create circle
		Circle circleObj = new Circle();
		circleObj.setRadius(100);
		circleObj.setCenterX(WIDTH/2);
		circleObj.setCenterY(MENUHEIGHT/2);
		circleObj.setFill(Color.BLACK);
		circleObj.setVisible(false);
	    
	    
		// create circle actions
		addCircle.setOnAction(e -> 
		{
			if (!circleObj.isVisible())
			{	
				circleObj.setVisible(true);
				addCircle.setText("Remove Circle");
			}
			else
			{
				circleObj.setVisible(false);
				addCircle.setText("Add Circle");
			}
		});
		
		circleObj.setOnMouseDragged(e ->
		{
			circleObj.setRadius(e.getY());
			if (circleObj.getRadius() < 10)
			{
				circleObj.setRadius(10);
			}
		});
		
		
		
		/*middleStripe.setOnMouseClicked(e -> 
		{
			if (e.getButton() == MouseButton.SECONDARY)
			{
				rightClickMiddle.show(stack, null, e.getX(), MENUHEIGHT);
			}
		});
		
		bottomStripe.setOnMouseClicked(e -> 
		{
			if (e.getButton() == MouseButton.SECONDARY)
			{
				
				rightClickBottom.show(stack, null, e.getX(), MENUHEIGHT);
			}
			if (e.getButton() == MouseButton.PRIMARY)
			{
				rightClickBottom.hide();
			}
		});*/
		
		
		
		// Define menu events
		redTop.setOnAction(e -> topStripe.setFill(Color.RED));
		blueTop.setOnAction(e -> topStripe.setFill(Color.BLUE));
		yellowTop.setOnAction(e -> topStripe.setFill(Color.YELLOW));
		whiteTop.setOnAction(e -> topStripe.setFill(Color.WHITE));
		
		redMiddle.setOnAction(e -> middleStripe.setFill(Color.RED));
		blueMiddle.setOnAction(e -> middleStripe.setFill(Color.BLUE));
		yellowMiddle.setOnAction(e -> middleStripe.setFill(Color.YELLOW));
		whiteMiddle.setOnAction(e -> middleStripe.setFill(Color.WHITE));
		
		redBottom.setOnAction(e -> bottomStripe.setFill(Color.RED));
		blueBottom.setOnAction(e -> bottomStripe.setFill(Color.BLUE));
		yellowBottom.setOnAction(e -> bottomStripe.setFill(Color.YELLOW));
		whiteBottom.setOnAction(e -> bottomStripe.setFill(Color.WHITE));
		
		circleRed.setOnAction(e -> circleObj.setFill(Color.RED));
		circleBlue.setOnAction(e -> circleObj.setFill(Color.BLUE));
		circleYellow.setOnAction(e -> circleObj.setFill(Color.YELLOW));
		circleWhite.setOnAction(e -> circleObj.setFill(Color.WHITE));
		
		StackPane stack = new StackPane();
	    stack.getChildren().addAll(stripes, circleObj);
		
		VBox root = new VBox();
		root.getChildren().addAll(menuBar, stack);
				
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		stripes.setOnMouseClicked(e -> 
		{
			if (e.getButton() == MouseButton.SECONDARY)
			{
				topStripe.setFill(Color.PINK);
				rcTop.show(root, Side.RIGHT, e.getX(), e.getY());
			}
		});
	
		
		stage.setScene(scene);
		stage.setTitle("Flag Creator");
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}



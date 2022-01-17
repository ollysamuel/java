import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class DrawRectangle extends Application
{
	@Override
	public void start(Stage stage)
	{
		double WIDTH = 400;
		final double HEIGHT = 400;

		Circle circle = new Circle(10);
		circle.setFill(Color.RED);
		
		Rectangle rect = new Rectangle(10, 10);
		rect.setFill(Color.RED);
		
		Ellipse eli = new Ellipse(40, 40);
		eli.setFill(Color.BLUE);
		
		VBox root = new VBox();
		root.getChildren().addAll(rect, circle, eli);
		root.setAlignment(Pos.TOP_LEFT);
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		// method goes here
		
		rect.setOnMouseDragged(e ->
		{
			rect.setWidth(e.getX());
		});
		
		circle.setOnMouseDragged(e ->
		{
			circle.setRadius(e.getX());
			circle.setRadius(e.getY());
		});
		
		eli.setOnMouseDragged( e ->
		{
			eli.setRadiusX(e.getX());
			eli.setRadiusY(e.getY());
		});
		
		eli.setOnMouseClicked(e ->
		{
			eli.setFill(Color.PINK);
		});
		
		eli.setOnMouseEntered(e ->
		{
			eli.setFill(Color.PINK);
		});
		
		eli.setOnMouseExited(e ->
		{
			eli.setFill(Color.BLUE);
		});
		
		
		
		
		
	
		
		
		stage.setScene(scene);
		stage.setTitle("Draw Rectangle");
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
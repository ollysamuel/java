

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class BookingBox extends Group
{
	private int width = 200;
	private int height = 300;
	private int topHeight = 25;
	private String month;
	private int date;
	private String room;
	BorderStroke boxBorderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(1));
	Border boxBorder = new Border(boxBorderStroke);
	
	public BookingBox(int dateIn, String roomIn, String slot1In, String slot2In, String slot3In)
	{
		super();
		this.getChildren().addAll(dateBox(dateIn), detailsBox(slot1In, slot2In, slot3In));
		date = dateIn;
		room = roomIn;
	}
	
	private HBox dateBox(int dateIn)
	{
		HBox dateBox = new HBox();
		dateBox.setPrefSize(width, topHeight);
		dateBox.setBorder(boxBorder);
		dateBox.getChildren().add(new Label(Integer.toString(dateIn)));
		dateBox.setAlignment(Pos.CENTER);
		dateBox.setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, new CornerRadii(0), new Insets(2, 2, 2, 2))));
		return dateBox;
	}
	
	private VBox detailsBox(String slot1In, String slot2In, String slot3In)
	{
		Label slot1 = new Label("Slot 1: " + slot1In);
		Label slot2 = new Label("Slot 2: " + slot2In);
		Label slot3 = new Label("Slot 3: " + slot3In);
		
		VBox text = new VBox();
		text.getChildren().addAll(slot1, slot2, slot3);
		VBox detailsBox = new VBox();
		detailsBox.setMargin(text, new Insets(25, 0, 0, 0));
		detailsBox.setPadding(new Insets(5, 5, 5, 5));
		detailsBox.getChildren().addAll(text);
		detailsBox.setPrefSize(width, topHeight);
		detailsBox.setBorder(boxBorder);
		return detailsBox;
	}
	
	public void setWidth(int widthIn)
	{
		width = widthIn;
	}
	
	public void setHeight(int heightIn)
	{
		height = heightIn;
	}
	
	public void setTopHeight(int heightIn)
	{
		topHeight = heightIn;
	}
	
	public void increaseSize()
	{
		width *= 1.2;
		height *= 1.2; 
	}
	
	public void decreaseSize()
	{
		width /= 1.2;
		height /= 1.2; 
	}
}

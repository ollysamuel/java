package classFiles;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class DateBox extends HBox
{
	BorderStroke boxBorderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2));
	Border boxBorder = new Border(boxBorderStroke);
	
	public DateBox()
	{
		super();
		setPrefSize(100, 25);
		setBorder(boxBorder);
	}
}

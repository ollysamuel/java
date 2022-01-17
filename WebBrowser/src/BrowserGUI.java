import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class BrowserGUI extends Application
{
	@Override 
	public void start(Stage stage)
	{
		final int HEIGHT = 1024, WIDTH = 1920;
		
		/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		final double WIDTH = screenSize.getWidth();
		final double HEIGHT = screenSize.getHeight();*/
		
		WebView wv = new WebView();
		wv.setMaxSize(WIDTH, HEIGHT);
		wv.setMinSize(WIDTH, HEIGHT);
		
		Browser browser = new Browser(HEIGHT, WIDTH);	
		// Header
		
		// address bar
		TextField addressBar = new TextField();
		addressBar.setPrefWidth(WIDTH * 0.8);
		addressBar.setMaxWidth(WIDTH * 0.8);
		addressBar.setMinWidth(100);
		addressBar.setAlignment(Pos.CENTER_LEFT);
		addressBar.setText(browser.getHomeScreen());
		addressBar.setPrefHeight(40);
		wv.getEngine().load(addressBar.getText());
		
		addressBar.setOnKeyTyped(e -> 
		{
			if (e.getCharacter().equals("\r"))
			{
				String url = browser.formatURL(addressBar.getText());
				addressBar.setText(url);
				browser.addURL(url);
				wv.getEngine().load(url);
			}
		});
		
		// refresh button
		Image refresh = new Image("refresh.jpg");
		ImageView refreshIV = new ImageView(refresh);
		refreshIV.setFitHeight(30);
		refreshIV.setPreserveRatio(true);
		Button refreshButton = new Button("", refreshIV);
		refreshButton.setOnAction(e -> 
		{
			String url = browser.getURL(browser.getLength() - 1);
			addressBar.setText(url);
			wv.getEngine().load(url);
		});
		
		// back button
		Button backButton = new Button("<-");
		backButton.setPrefHeight(50);
		backButton.setOnAction(e -> 
		{
			String url = browser.back();
			addressBar.setText(url);
			wv.getEngine().load(url);
		});
		
		// Forward Button
		Button forwardButton = new Button("->");
		forwardButton.setPrefHeight(50);
		forwardButton.setOnAction(e -> 
		{
			String url = browser.forward();
			addressBar.setText(url);
			wv.getEngine().load(url);
		});
		
		// Home Button
		Button homeButton = new Button("H");
		homeButton.setPrefHeight(50);
		homeButton.setOnAction(e -> 
		{
			String url = browser.getHomeScreen();
			addressBar.setText(url);
			wv.getEngine().load(url);
		});
		
		// Create header HBOX
		HBox header = new HBox(10);
		header.setMaxHeight(HEIGHT * 0.1);
		header.setPadding(new Insets(10, 10, 10, 10));
		header.getChildren().addAll(refreshButton, backButton, forwardButton, homeButton, addressBar);
		
		VBox root = new VBox();
		root.getChildren().addAll(header, wv);
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Olly Browse");
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
package classFiles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.geometry.HPos;

public class TimeTableGUI extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		final double WIDTH = 1920;
		final double HEIGHT = 1040;
		final double MENUBARHEIGHT = 25;
		final int spacer = 50;
		//Calendar currentCal;
		String slot1 = "9:00 - 12:00", slot2 = "12:00 - 15:00", slot3 = "15:00 - 18:00"; 
		//List<Calendar> calendars = new ArrayList<>();
		CalendarList calendars = new CalendarList();
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		// TOP MENUBAR
		MenuBar menuBar = new MenuBar();
		menuBar.setPrefHeight(MENUBARHEIGHT);
		
		Menu file = new Menu("file");
		Menu edit = new Menu("edit");
		Menu help = new Menu("help");
		
		menuBar.getMenus().addAll(file, edit, help);
		
		// SUB MENUS
		
		// Create modal secondary stage for pop up sub menus
		Stage subMenuStage = new Stage();
		subMenuStage.initModality(Modality.APPLICATION_MODAL);
		VBox subMenuVBox = new VBox();
		
		Menu newS = new Menu("New");
		
		file.getItems().addAll(newS);
		
		// SUB SUB MENUS
		MenuItem newCalendar = new MenuItem("New Calendar");
		MenuItem newRoom = new MenuItem("New Room");
		MenuItem newStudent = new MenuItem("Add Student");
		MenuItem makeBooking = new MenuItem("Make Booking");
		
		newS.getItems().addAll(newCalendar, newRoom, newStudent, makeBooking);
		
		HBox topMenu = new HBox();
		topMenu.getChildren().addAll(menuBar);
		
		Button cancelButton = new Button("Cancel");
		cancelButton.setOnAction(e -> subMenuStage.hide());
		
		//****** NEW CALENDAR POP UP MENU ******//
		Label newCalTitle = new Label("New Calendar");
		
		Label newCalName = new Label("Calendar Name");
		TextField newCalTextField = new TextField();
		
		Button submitNewCalButton = new Button("Submit");
		
		VBox newCalBox = new VBox();
		newCalBox.getChildren().addAll(newCalTitle, newCalName, newCalTextField, submitNewCalButton, cancelButton);
		
		Scene newCalScene = new Scene(newCalBox, 400, 600);
		
		//****** NEW BOOKING POP UP MENU ******//
		
		Label bookingNameLabel = new Label("Enter name");
		TextField bookingName = new TextField();
		
		Label rmNumBookingLabel = new Label("Room Number");
		ComboBox<String> rmNumBookingMenu = new ComboBox<>();
		rmNumBookingMenu.setPromptText("Room");
		
		Label monthBookingLabel = new Label("Select month");
		ComboBox<String> monthBookingMenu = new ComboBox<>();
		monthBookingMenu.setPromptText("Month");
		for (String item : months)
			monthBookingMenu.getItems().add(item);
		
		Label dayBookingLabel = new Label("Select day");
		ComboBox<Integer> dayBookingMenu = new ComboBox<>();
		for (int i = 1; i <= 31; i++)
			dayBookingMenu.getItems().add(i);
		
		Label slotBookingLabel = new Label("Select slot");
		ComboBox<String> slotBookingMenu = new ComboBox<>();
		slotBookingMenu.getItems().addAll(slot1, slot2, slot3);
		
		Label bookingErrorLabel = new Label("");
		
		Button submitBookingButton = new Button("Submit Booking");
		
		VBox newBookingBox = new VBox();
		newBookingBox.getChildren().addAll(new Label("Make a Booking"), bookingNameLabel, bookingName, monthBookingLabel, monthBookingMenu, 
				dayBookingLabel, dayBookingMenu, slotBookingLabel, slotBookingMenu, submitBookingButton, cancelButton, bookingErrorLabel);
		
		Scene newBookingScene = new Scene(newBookingBox, 400, 600);
		
		//****** NEW ROOM POP UP MENU ******//
		VBox newRoomBox = new VBox();
		Scene newRoomScene = new Scene(newRoomBox, 400, 600);
		Label roomLabel = new Label("Enter room number");
		TextField roomNumTField = new TextField();
		Button addRoomButton = new Button("Add Room");
		newRoomBox.getChildren().addAll(roomLabel, roomNumTField, addRoomButton);
		
		//****** Main Menu GUI ******//
		
		// month select combobox
		ComboBox<String> monthMenu = new ComboBox<>();
		monthMenu.getItems().addAll("January", "February", "March", "April", "May", "June", 
									"July", "August", "September", "October", "November", "December");
		monthMenu.setPromptText("Month");
		
		Label monthMenuTitle = new Label("Month");
		
		// Calendar Select Combo Box
		ComboBox<String> calendarMenu = new ComboBox<>();
		Label calendarMenuTitle = new Label();
		
		calendarMenu.setPromptText("Calendars");
		
		for (int i = 0; i < calendars.getSize(); i++)
			calendarMenu.getItems().add(calendars.getCalendar(i).getCalName());
		
		//room select combobox
		ComboBox<String> roomNumMenu = new ComboBox<>();
		
		roomNumMenu.setPromptText("Room Number");
		
		Label roomNumMenuTitle = new Label("Room Number");
		
		// load calendar button
		Button loadCalButton = new Button("Load Calendar");
		
		VBox optionsArea = new VBox();
		optionsArea.getChildren().addAll(calendarMenuTitle, calendarMenu, monthMenuTitle, monthMenu, roomNumMenuTitle, roomNumMenu, loadCalButton);
		optionsArea.setAlignment(Pos.CENTER);
		
		// Boxes
		GridPane calendarPane = new GridPane();
		calendarPane.setAlignment(Pos.CENTER);
		calendarPane.setVgap(10);
		calendarPane.setHgap(10);
		
		Label calTitle = new Label("Timetable");
		Label monthTitle = new Label("Please select a month");
		
		VBox calendar = new VBox();
		calendar.getChildren().addAll(calTitle, monthTitle, calendarPane);
		calendar.setAlignment(Pos.CENTER);
		calendar.setSpacing(20);
		
		VBox mainBody = new VBox();
		mainBody.getChildren().addAll(optionsArea, calendar);
		mainBody.setAlignment(Pos.CENTER);
		mainBody.setSpacing(spacer);
		
		VBox root = new VBox();
		root.getChildren().addAll(topMenu, mainBody);
		root.setSpacing(spacer);
		
		Scene primaryScene = new Scene(root, WIDTH, HEIGHT);
		primaryStage.setScene(primaryScene);
		primaryStage.setTitle("TimeTable Booking");
		primaryStage.show();
		
		//****** MAIN SCREEN MENU FUNCTIONS ******//
		
		// Calendar select combobox function
		calendarMenu.setOnAction(e -> 
		{
			for (int i = 0; i < calendars.getSize(); i++)
			{
				if (calendars.getCalendar(i).getCalName().equals(calendarMenu.getValue()))
				{
					calendars.setCurrentCal(calendars.getCalendar(i));
				}
			}
		});
		
		// Room select combobox function
		roomNumMenu.setOnAction(e -> 
		{
			for (int i = 0; i < calendars.getSize(); i++)
			{
				if (calendars.getCurrentCal().getRoom(i).equals(roomNumMenu.getValue()))
				{
					calendars.setCurrentRoom(calendars.getCurrentCal().getRoom(i));
				}
			}
		});
		
		
		
		// Month select combobox function
		/*monthMenu.setOnAction(e ->
		{
			calendarPane.getChildren().clear();
			monthTitle.setText("Timetable for " + monthMenu.getValue());
			
			if (!roomNumMenu.getValue().isBlank())
			{
				for (int i = 0; i < calendars.getCurrentCal().getDays().length; i++)
				{
					Label dayLabel = new Label(calendars.getCurrentCal().getDay(i));
					calendarPane.add(dayLabel, i, 0);
					calendarPane.setHalignment(dayLabel, HPos.CENTER);
				}
				
				int counter = 0;
				
				for (int i = 1; i < 6; i++)
					for (int j = 0; j < 7; j++)
					{
						if (counter >= 30)
							break;
						calendarPane.add(new BookingBox(counter + 1, roomNumMenu.getValue()), j, i);
						counter++;
				}
			}
			
		});*/
		
		loadCalButton.setOnAction(e ->
		{
			if (!(roomNumMenu.getValue().isBlank() && monthMenu.getValue().isBlank()))
			{
				String month = monthMenu.getValue();
				String room = roomNumMenu.getValue();
				int roomIndex = calendars.getCurrentCal().getRoomIndex(room);
				List<Booking> bookingsByMonth = calendars.getCurrentCal().getRoom(roomIndex).searchMonth(month); //gets arraylist of bookings for selected month
				
				calendarPane.getChildren().clear();
				monthTitle.setText("Timetable for " + month);
				
				// displays months at top of calendar
				for (int i = 0; i < calendars.getCurrentCal().getDays().length; i++)
				{
					Label dayLabel = new Label(calendars.getCurrentCal().getDay(i));
					calendarPane.add(dayLabel, i, 0);
					calendarPane.setHalignment(dayLabel, HPos.CENTER);
				}
				
				// displays booking boxes
				String bSlot1 = "empty";
				String bSlot2 = "empty";
				String bSlot3 = "empty";
				
				int counter = 0;
				
				for (int i = 1; i < 6; i++)
					for (int j = 0; j < 7; j++)
					{
						if (counter >= 30)
							break;
						for (int k = 0; k < bookingsByMonth.size(); k++)
						{
							if (bookingsByMonth.get(k).getDay() == counter + 1)
							{
								for (int l = 0; l < 3; l ++)
								{
									if (!(bookingsByMonth.get(l).getTimeSlot() == 1))
										bSlot1 = bookingsByMonth.get(l).getName();
									else if (!(bookingsByMonth.get(l).getTimeSlot() == 2))
										bSlot2 = bookingsByMonth.get(l).getName();
									else if (!(bookingsByMonth.get(l).getTimeSlot() == 3))
										bSlot3 = bookingsByMonth.get(l).getName();
								}
							}
						}
						calendarPane.add(new BookingBox(counter + 1, room, bSlot1, bSlot2, bSlot3), j, i);
						counter++;
				}
			}
		});
		
		//****** NEW STUDENT POP UP MENU ******//
		
		Scene newStudentScene = new Scene(subMenuVBox, 400, 600);
		Label nameLabel = new Label("Enter name");
		TextField studentName = new TextField();
		Label studentNumberLabel = new Label("Enter Student Number");
		TextField studentNumber = new TextField();
		Button addStudentButton = new Button("Add Student");
		Label addStudentMessage = new Label("");
				
		// New student menu selection function
		newStudent.setOnAction(e -> 
		{
			subMenuVBox.getChildren().clear();
			subMenuVBox.getChildren().addAll(new Label("Add New Student"), nameLabel, studentName, studentNumberLabel, studentNumber, 
						addStudentButton, cancelButton, addStudentMessage);
			subMenuStage.setScene(newStudentScene);
			subMenuStage.setX(WIDTH/2 - 200);
			subMenuStage.setY(HEIGHT/2 - 300);
			subMenuStage.show();
		});
				
		//****** New student pop menu functions ******//
		addStudentButton.setOnAction(e -> 
		{
			if (studentName.getText().equals(""))
				nameLabel.setTextFill(Color.RED);
			if (studentNumber.getText().equals(""))
				studentNumberLabel.setTextFill(Color.RED);
			else if (!(studentName.getText().equals("") && studentNumber.getText().equals("")))
				if (calendars.getCurrentCal().addStudent(studentName.getText(), studentNumber.getText()))
					addStudentMessage.setText("Student added successfully");
			else
				addStudentMessage.setText("Student not added");
			
			studentName.setText("");
			studentNumber.setText("");
			subMenuStage.hide();
		});
				
		//****** New calendar pop up menu functions ******//
		newCalendar.setOnAction(e ->
		{
			subMenuStage.setScene(newCalScene);
			subMenuStage.setX(WIDTH/2 - 200);
			subMenuStage.setY(HEIGHT/2 - 300);
			subMenuStage.show();
		});
		
		submitNewCalButton.setOnAction(e ->
		{
			if (!newCalTextField.getText().isBlank())
			{
				if (calendars.addCalendar(newCalTextField.getText()))
				{
					calendarMenu.getItems().add(newCalTextField.getText());
					subMenuStage.hide();
				}
			}
		});
	
		//****** New booking menu selection functions ******//
		makeBooking.setOnAction(e -> 
		{			
			// Populates room numbers drop down with room numbers from selected calendar
			//for (int i = 0; i < calendars.getCurrentCal().getNumberOfRooms(); i++) 
				//rmNumBookingMenu.getItems().add(calendars.getCurrentCal().getRoomNumber(i)); 
					
			subMenuStage.setScene(newBookingScene);
			subMenuStage.setX(WIDTH/2 - 200);
			subMenuStage.setY(HEIGHT/2 - 300);
			subMenuStage.show();
		});
				
		submitBookingButton.setOnAction(e ->
		{
				int slot = 1;
				
			    /*int rmNumIndex = calendars.getCurrentCal().getRoomIndex(calendars.getCurrentRoom().getRoomNumber()); // Gets index of selected room
			    subMenuStage.hide();
				if (slotBookingMenu.getValue().equals(slot1))
				{
					slot = 1;
				}
				else if (slotBookingMenu.getValue().equals(slot2))
				{
					slot = 2;
				}
				else if (slotBookingMenu.getValue().equals(slot3))
				{
					slot = 3;
				}*/
				
				if (calendars.getCurrentCal().getRoom(0).addBooking(new Booking(bookingName.getText(), monthBookingMenu.getValue(), dayBookingMenu.getValue(), slot)));
				{
					subMenuStage.hide();
				}
		});
				
		//****** New room pop up menu functions ******//
		newRoom.setOnAction(e -> 
		{
			subMenuStage.setScene(newRoomScene);
			subMenuStage.setX(WIDTH/2 - 200);
			subMenuStage.setY(HEIGHT/2 - 300);
			subMenuStage.show();
		});
				
		addRoomButton.setOnAction(e -> 
		{
			String roomNum = roomNumTField.getText();
			if (!roomNum.isBlank())
			{
				if (calendars.getCurrentCal().addRoom(roomNum))
				{
					roomNumMenu.getItems().add(roomNum);
					subMenuStage.hide();
					roomNumTField.clear();
				}
			}
		});
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

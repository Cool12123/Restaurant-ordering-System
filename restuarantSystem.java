package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;



public class hw1 extends Application {
	double totalCost = 0.0;
	double finalBill = 0.0;                 //with tax
	
	Text totCostText;
	Text finalTotalText;
	
	@Override
	public void start(Stage primaryStage) {
		
		Label label1 = new Label("Joe's Deli");                                     //labels for text on GUI
		Label label2 = new Label("Eat:");
		Label label3 = new Label("Drink:");
		Label label4 = new Label("Bill");
		
		Button button1 = new Button("Order");
		Button button2 = new Button("Cancel");
		Button button3 = new Button("Confirm");
		
		label1.setStyle("-fx-font-family: sample; -fx-font-size: 35;");
		label2.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		label3.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		label4.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		
		button1.setMinSize(150, 50); 											    //order button
		button2.setMinSize(150, 50); 											    //cancel button
		button3.setMinSize(150, 50); 											    //confirm button
		button1.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		button2.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		button3.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		
		
		CheckBox checkBox1 = new CheckBox("Egg Sandwich");
		CheckBox checkBox2 = new CheckBox("Chicken Sandwich");
		CheckBox checkBox3 = new CheckBox("Bagel");
		CheckBox checkBox4 = new CheckBox("Potato salad");
		
		RadioButton radioButton1 = new RadioButton("Black Tea");
		RadioButton radioButton2 = new RadioButton("Green Tea");
		RadioButton radioButton3 = new RadioButton("Coffee");
		RadioButton radioButton4 = new RadioButton("Orange Juice");
		
		checkBox1.setStyle("-fx-font-family: sample; -fx-font-size: 20;");         //checkbox styling
		checkBox2.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		checkBox3.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		checkBox4.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		
		
		radioButton1.setStyle("-fx-font-family: sample; -fx-font-size: 20;");      //radiobutton styling
		radioButton2.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		radioButton3.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		radioButton4.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		
		Rectangle rect1 = new Rectangle();                                         //Rectangle for bill text area
		rect1.setWidth(250);  
	    rect1.setHeight(300); 
	    rect1.setFill(Color.TRANSPARENT);
	    rect1.setStroke(Color.BLACK);
	    
	    StackPane stackPaneBillTextArea = new StackPane();    //stackpane for bill text area
	    stackPaneBillTextArea.getChildren().add(rect1);
	    
	    VBox verticalList = new VBox();
	    HBox hBox1 = new HBox();
        hBox1.getChildren().add(label4);
        hBox1.setAlignment(Pos.CENTER);
	    verticalList.getChildren().add(hBox1);
		
		GridPane gridPane1 = new GridPane();
	
		gridPane1.add(stackPaneBillTextArea, 3, 4, 1, 20);
		gridPane1.add(label1, 2, 0);
		gridPane1.add(label2, 1, 6);
		gridPane1.add(label3, 2, 6);
		gridPane1.add(checkBox1, 1, 10);                      //Alignment of check boxes
		gridPane1.add(checkBox2, 1, 14);
		gridPane1.add(checkBox3, 1, 18);
		gridPane1.add(checkBox4, 1, 22);
		gridPane1.add(radioButton1, 2, 10);                   //Alignment of radio boxes
		gridPane1.add(radioButton2, 2, 14);
		gridPane1.add(radioButton3, 2, 18);
		gridPane1.add(radioButton4, 2, 22);
		gridPane1.add(button1, 1, 26);
		gridPane1.add(button2, 2, 26);
		gridPane1.add(button3, 3, 26);
		 
		
		gridPane1.setHgap(100);
        gridPane1.setVgap(9);

		
		try {
			Scene scene = new Scene(gridPane1, 1000, 500);   //Scene of specific size
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Text text1 = new Text("Egg Sandwich : 7.99");
		Text text2 = new Text("Chicken Sandwich : 9.99");
		Text text3 = new Text("Bagel : 2.50");
		Text text4 = new Text("Potato Salad : 4.49");
		Text text5 = new Text("Black Tea : 1.25");
		Text text6 = new Text("Green Tea : 0.99");
		Text text7 = new Text("Coffee : 1.99");
		Text text8 = new Text("Orange Juice : 2.25");
		
		text1.setStyle("-fx-font-family: sample; -fx-font-size: 20;");           //styling text for bill text area
		text2.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text3.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text4.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text5.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text6.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text7.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		text8.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
		
		double[] costArray = {7.99, 9.99, 2.50, 4.49, 1.25, 0.99, 1.99, 2.25};                     //Costs corresponding to food and drink texts
		Text[] textArray = {text1, text2, text3, text4, text5, text6, text7, text8};               //Text array for events
		CheckBox[] checkBoxArray = {checkBox1, checkBox2, checkBox3, checkBox4};                   //Checkbox array for events
		RadioButton[] radioButtonArray = {radioButton1, radioButton2, radioButton3, radioButton4}; //radioButton array for events
		
		
		ToggleGroup toggleGroup1 = new ToggleGroup();                                     //radiobutton toggle for only 1 option
		radioButton1.setToggleGroup(toggleGroup1);
		radioButton2.setToggleGroup(toggleGroup1);
		radioButton3.setToggleGroup(toggleGroup1);
		radioButton4.setToggleGroup(toggleGroup1);
		
		EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {       //event for clicking order button
	        public void handle(ActionEvent event) {
		    	for (int i = 0; i < 4; ++i) {                      				   //loop for clicking checkboxes
		    		if (checkBoxArray[i].isSelected()) {
		    			verticalList.getChildren().add(textArray[i]);              //adds food text to bill text area
		    		    totalCost += costArray[i];
		    		}
			    }
		    	for (int i = 4; i < 8; ++i) {                      				   //loop for clicking radiobuttons
		    		if (radioButtonArray[i - 4].isSelected()) {
		    			verticalList.getChildren().add(textArray[i]);              //adds drink text to bill text area
		    			totalCost += costArray[i];
		    			break;													   //breaks since only one drink allowed
		    		}
			    }
		    	totCostText = new Text("\nTotal Cost : " + String.format("%.2f", totalCost));
		    	verticalList.getChildren().add(totCostText);   
		    	totCostText.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
	        }
		};
		
		EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {       //event for clicking cancel button
	        public void handle(ActionEvent event) {
	        	toggleGroup1.selectToggle(null);                                   //deselects radiobutton selected
	        	checkBox1.setSelected(false);                                      //deselects checkboxes 
	        	checkBox2.setSelected(false);
	        	checkBox3.setSelected(false);
	        	checkBox4.setSelected(false);
	        	verticalList.getChildren().clear();
	            verticalList.getChildren().add(hBox1);
	        	totalCost = 0.0;
	        }
		};
		
		EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {       //event for clicking order button
	        public void handle(ActionEvent event) {
	        	toggleGroup1.selectToggle(null);                                   //deselects radiobutton selected
	        	checkBox1.setSelected(false);                                      //deselects checkboxes 
	        	checkBox2.setSelected(false);
	        	checkBox3.setSelected(false);
	        	checkBox4.setSelected(false);
	        	finalTotalText = new Text("\nFinal Total : " + String.format("%.2f", totalCost * 1.07));
	        	finalTotalText.setStyle("-fx-font-family: sample; -fx-font-size: 20;");
	        	verticalList.getChildren().remove(totCostText);
	        	verticalList.getChildren().remove(finalTotalText);
	        	verticalList.getChildren().add(finalTotalText);
	        }
		};
		
		button1.setOnAction(event1);                                               //Calling events for buttons
		button2.setOnAction(event2);
		button3.setOnAction(event3);
		stackPaneBillTextArea.getChildren().remove(verticalList); 
		stackPaneBillTextArea.getChildren().add(verticalList);                     //Adding list of text to stackpane
		gridPane1.getChildren().remove(stackPaneBillTextArea);
		gridPane1.add(stackPaneBillTextArea, 3, 4, 1, 20);
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);                                                              //launching application
	}
}

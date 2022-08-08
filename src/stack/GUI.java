package stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.AccessibleRole;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application{

    @Override
    public void start(Stage primaryStage){

        ArrayStack<Integer> myStack = new ArrayStack<Integer>();

        primaryStage.setTitle("A Stack Program.");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));
        grid.add(scenetitle, 0, 0, 3, 1);

        // Display of stack contents
        Text stackdisplay = new Text("Stack: {}" );
//        stack.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(stackdisplay, 0, 2, 2, 1);

        Label userName = new Label("Enter a Number:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        // push Button
        Button btn = new Button("Push");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 1);

        // pop Button
        Button pop_btn = new Button("Pop");
        HBox pop_hbBtn = new HBox(10);
        pop_hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        pop_hbBtn.getChildren().add(pop_btn);
        grid.add(pop_hbBtn, 2, 2);

        // Scene
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int userInput = Integer.parseInt(userTextField.getText());
                myStack.push(userInput);

                stackdisplay.setText(myStack.toString());
            }
        });

        pop_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int popped = myStack.pop();
                stackdisplay.setText(myStack.toString());
            }
        });
    }



}

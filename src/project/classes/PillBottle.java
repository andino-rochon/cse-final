package project.classes;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class PillBottle extends Application {

    HBox title;
    ImageView pillTitle;
    
    HBox dosBox;
    Text dosage;
    TextField inpDos;

    HBox timeBox;
    Text time;
    TextField inpTime;

    
    HBox bottom;
    Text patient;
    TextField pCode;
   

    HBox doneBar;
    Button done;

    HBox titleLogin;
    ImageView log;
    
    HBox user;
    Text username;
    TextField userBox;
    
    HBox password;
    Text pass;
    TextField passBox;

    HBox bot;
    Button authorize;

    String userDoctor;
    String doctorPass;

    HBox upload;
    ImageView up;

    HBox another;
    Button oneMore;
    
    HBox close;
    Button exit;
    
    /** {@inheritDoc} */
    @Override
    public void start(Stage stage) {
        VBox pane = new VBox(33);

	userDoctor = "doctor";
	doctorPass = "pepper";
	
	pillTitle = new ImageView("file:resources/pillTitle.png");
	pillTitle.setPreserveRatio(true);
	pillTitle.setFitWidth(550);
	title = new HBox(pillTitle);
	title.setPadding(Insets.EMPTY);
	dosage = new Text("Dosage: ");

	inpDos = new TextField("2 pills");

	dosBox = new HBox(20, dosage, inpDos);
	dosBox.setAlignment(Pos.CENTER);
	time = new Text("Time: ");

        inpTime = new TextField("12 Hours");

        timeBox = new HBox(20, time, inpTime);
	timeBox.setAlignment(Pos.CENTER);

	patient = new Text("Patient Code: ");
	pCode = new TextField("FT23UH897");


	bottom = new HBox(20, patient, pCode);
	bottom.setAlignment(Pos.CENTER);

	done = new Button("Done");
	done.setId("dark-blue");
	doneBar = new HBox(done);
        doneBar.setAlignment(Pos.CENTER);

	
	pane.setId("pill-back");
        pane.getStylesheets().add("file:resources/Pill.css");
	
        pane.getChildren().addAll(title, dosBox, timeBox, bottom, doneBar);

	VBox login = new VBox(35);

	log = new ImageView("file:resources/login.png");
	log.setPreserveRatio(true);
	log.setFitWidth(500);
	titleLogin = new HBox(log);
	titleLogin.setAlignment(Pos.CENTER);
	
	username = new Text("Username: ");
	userBox = new TextField("username");
	user = new HBox(username, userBox);
	user.setAlignment(Pos.CENTER);
	
	pass = new Text("Password: ");
	passBox = new TextField("password");
	password = new HBox(pass, passBox);
	password.setAlignment(Pos.CENTER);

	authorize = new Button("Login");
	authorize.setId("dark-blue");
	bot = new HBox(authorize);
	bot.setAlignment(Pos.CENTER);
	
	login.setId("pill-back");
	login.getStylesheets().add("file:resources/Pill.css");
	login.getChildren().addAll(titleLogin, user, password, bot);

	VBox last = new VBox(55);

	up = new ImageView("file:resources/uploaded.png");
	up.setPreserveRatio(true);
	up.setFitWidth(500);
	upload = new HBox(up);
	upload.setAlignment(Pos.CENTER);

	oneMore = new Button("Set Another");
	oneMore.setId("dark-blue");
	another = new HBox(oneMore);
	another.setAlignment(Pos.CENTER);
	
	exit = new Button("Close");
	exit.setId("dark-blue");
	close = new HBox(exit);
	close.setAlignment(Pos.CENTER);
	
	last.setId("pill-back");
	last.getStylesheets().add("file:resources/Pill.css");
	last.getChildren().addAll(upload, another, close);
        Scene scene = new Scene(login, 550, 300);
        stage.setMaxWidth(640);
        stage.setMaxHeight(485);
        stage.setTitle("Pill Dispenser");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

	authorize.setOnAction(e -> {
		if(userBox.getCharacters().toString().equals(userDoctor) &&
		   passBox.getCharacters().toString().equals(doctorPass)){
	 	    scene.setRoot(pane);
	  	}
	 	    });

	done.setOnAction(e -> scene.setRoot(last));
	
	exit.setOnAction(e -> System.exit(0));

	oneMore.setOnAction(e -> scene.setRoot(pane));
    } // start


    
}

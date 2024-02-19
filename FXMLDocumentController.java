package libraryjavafx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.ListView;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Sampath Gunnam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView list;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button R1;

    @FXML
    private Button R2;

    @FXML
    private Button R3;

    @FXML
    private Button R4;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    ArrayList<Book> List;

    @FXML
    private void B1Click(ActionEvent event) {

        String book = L1.getText();

        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.borrowed();
                B1.setDisable(true);
                R1.setDisable(false);
                getAvailBooks();

            }
        }

    }
    
    @FXML
    private void B2Click(ActionEvent event) {

        String book = L2.getText();

        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.borrowed();
                B2.setDisable(true);
                R2.setDisable(false);
                getAvailBooks();

            }
        }

    }
    
    @FXML
    private void B3Click(ActionEvent event) {

        String book = L3.getText();

        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.borrowed();
                B3.setDisable(true);
                R3.setDisable(false);
                getAvailBooks();

            }
        }

    }
    
    
    @FXML
    private void B4Click(ActionEvent event) {

        String book = L4.getText();

        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.borrowed();
                B4.setDisable(true);
                R4.setDisable(false);
                getAvailBooks();

            }
        }

    }
    
    
    @FXML
    private void R1Click(ActionEvent event){
        
        String book=L1.getText();
        
        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.returned();
                B1.setDisable(false);
                R1.setDisable(true);
                getAvailBooks();

            }
        }
        
    }
    
    @FXML
    private void R2Click(ActionEvent event){
        
        String book=L2.getText();
        
        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.returned();
                B2.setDisable(false);
                R2.setDisable(true);
                getAvailBooks();

            }
        }
        
    }
    
    @FXML
    private void R3Click(ActionEvent event){
        
        String book=L3.getText();
        
        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.returned();
                B3.setDisable(false);
                R3.setDisable(true);
                getAvailBooks();

            }
        }
        
    }
    
    @FXML
    private void R4Click(ActionEvent event){
        
        String book=L4.getText();
        
        for (Book List1 : List) {

            if (List1.getTitle().equals(book)) {

                List1.returned();
                B4.setDisable(false);
                R4.setDisable(true);
                getAvailBooks();

            }
        }
        
    }
    
    

    public void AddBooks() {

        List = new ArrayList<>();

        //  ObservableList<Book> observableList = FXCollections.observableList(List);
        List.add(new Book("Java How To Program (Early Objects))"));
        List.add(new Book("Rise of the Robots"));
        List.add(new Book("Code Complete"));
        List.add(new Book("The Pragmatic Programmer"));
    }

    public void getAvailBooks() {

        ArrayList<String> arr = new ArrayList<>();

        for (Book List1 : List) {

            if (List1.isBorrowed() == false) {
                arr.add(List1.getTitle());
            }
        }
        ObservableList<String> observableList1 = FXCollections.observableList(arr);

        list.setItems(observableList1);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /* List = new ArrayList<>();

        //  ObservableList<Book> observableList = FXCollections.observableList(List);
        List.add(new Book("Java How To Program (Early Objects)):"));
        List.add(new Book("Rise of the Robots"));
        List.add(new Book("Code Complete"));
        List.add(new Book("The Pragmatic Programmer"));

        ArrayList<String> arr = new ArrayList<>();

        for (Book List1 : List) {

            arr.add(List1.getTitle());
        }
        ObservableList<String> observableList1 = FXCollections.observableList(arr);

        list.setItems(observableList1);*/
        AddBooks();
        getAvailBooks();

        R1.setDisable(true);
        R2.setDisable(true);
        R3.setDisable(true);
        R4.setDisable(true);
    }

}

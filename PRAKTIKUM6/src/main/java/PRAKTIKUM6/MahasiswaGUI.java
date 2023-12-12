package PRAKTIKUM6;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MahasiswaGUI extends Application {

    public static class Mahasiswa {
        private int id;
        private String nama;
        private String NIm;

        public Mahasiswa(int id, String nama, String NIm) {
            this.id = id;
            this.nama = nama;
            this.NIm = NIm;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNIm() {
            return NIm;
        }

        public void setNIm(String NIm) {
            this.NIm = NIm;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tabel Mahasiswa");

        TableView<Mahasiswa> tabelMhs = new TableView<>();
        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(

                new Mahasiswa(1, "Fransiskus", "12345"),
                new Mahasiswa(2, "Assisi", "23456"),
                new Mahasiswa(3, "Indra", "34567"),
                new Mahasiswa(4, "Wijaya", "45678"),
                new Mahasiswa(5, "Double QuarterPounder With Cheese", "56789"),
                new Mahasiswa(6, "Baking Soda", "67890"),
                new Mahasiswa(7, "Duct Tape", "78901"),
                new Mahasiswa(8, "Big mac", "89012"),
                new Mahasiswa(9, "Ammonium Nitrate", "90123"),
                new Mahasiswa(10, "Flat Tire", "01234")
        );
        TableColumn<Mahasiswa, String> NIMKolom = new TableColumn<>("NIM");
        NIMKolom.setCellValueFactory(
                new PropertyValueFactory<>("NIm"));

        TableColumn<Mahasiswa, String> NamaKolom = new TableColumn<>("Nama");
        NamaKolom.setCellValueFactory(
                new PropertyValueFactory<>("nama"));

        tabelMhs.getColumns().addAll(NIMKolom, NamaKolom);
        tabelMhs.setItems(data);

        VBox vBox = new VBox(tabelMhs);
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

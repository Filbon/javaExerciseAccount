module se.kth.filkle.account3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.filkle.account3 to javafx.fxml;
    exports se.kth.filkle.account3;
}
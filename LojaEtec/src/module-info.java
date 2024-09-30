module LojaEtec {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens br.com.etec.model to javafx.graphics, javafx.fxml;
}

package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Mensagens {

	public void erroSenha() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Ação inválida");
		alert.setContentText("Preencha a SENHA");
		alert.showAndWait();

	}

	public void erroSexo() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Ação inválida");
		alert.setContentText("Selecione o sexo");
		alert.showAndWait();
	}

	public void erroPrenchimento() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Ação inválida");
		alert.setContentText("Preencha TODOS os campos");
		alert.showAndWait();
	}

	public void erroLoginJaExiste() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Ação inválida");
		alert.setContentText("Login já existe");
		alert.showAndWait();
	}

	public void senhaNaoExiste() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("As senhas não são iguais");
		alert.setContentText("Digite a senha corretamente");
		alert.showAndWait();
	}

	public void comentarioAvaliado() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Ação inválida");
		alert.setContentText("Comentario já foi classificado");
		alert.showAndWait();
	}

}

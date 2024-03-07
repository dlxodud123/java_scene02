package member.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import member.service.MemberService;
import member.service.MemberServiceImpl;

public class MemberController implements Initializable{
	
	@FXML public ComboBox<String> cmbAge;
	@FXML public TextField fxName, fxId;
	@FXML public PasswordField fxPwd, fxPwdChk;
	@FXML public CheckBox chkMusic, chkMovie, chkMung;
	@FXML public RadioButton rdoWoman;
	
	Parent root;
	MemberService ms;
	public void setRoot(Parent root) {
		ms.setRoot(root);
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemberServiceImpl();
		
		String[] cmbTxt = {"20대 미만", "20대", "30대"};
		cmbAge.getItems().addAll(cmbTxt);
		/*
		String[] cmbVal = {"1", "2", "3"};
		ObservableArray<String> list = FXCollections.observableArrayList(cmbVal);
		cmbAge.setItems(list);
		*/
	}
	public void registerFunc() {
		
		ms.resgisterFunc();
		
	}
	public void cancelFunc() {
		ms.cancelFunc();
	}
}

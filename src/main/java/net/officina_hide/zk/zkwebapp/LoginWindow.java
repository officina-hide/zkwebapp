package net.officina_hide.zk.zkwebapp;

import org.zkoss.zhtml.Div;
import org.zkoss.zhtml.Form;
import org.zkoss.zhtml.Table;
import org.zkoss.zhtml.Td;
import org.zkoss.zhtml.Tr;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class LoginWindow extends Window {

	private static final long serialVersionUID = 8245206368138966070L;

	protected Label lblPassword;
	protected Label lblLogin;    
    protected Textbox txtPassword;
	
	public LoginWindow() {
        lblPassword = new Label();
        lblPassword.setId("lblPassword");
        lblPassword.setValue("Password");
        txtPassword = new Textbox();
        txtPassword.setId("txtPassword");
        txtPassword.setType("password");
        txtPassword.setCols(25);
	}

//	public void onCreate() {
//		System.out.println("Login onCreate");
//	}
//
	public void init(AdempiereWebUI adempiereWebUI) {
		createUI();
	}

	private void createUI() {
		Form form = new Form();
		Div div = new Div();
		div.setSclass(ITheme.LOGIN_BOX_HEADER_CLASS);
	   	lblLogin = new Label("Login");
    	lblLogin.setSclass(ITheme.LOGIN_BOX_HEADER_TXT_CLASS);
    	div.appendChild(lblLogin);
    	form.appendChild(div);
		System.out.println("test");
    	
       	Table table = new Table();
    	table.setId("grdLogin");
    	table.setDynamicProperty("cellpadding", "0");
    	table.setDynamicProperty("cellspacing", "5");
    	table.setSclass(ITheme.LOGIN_BOX_BODY_CLASS);

    	form.appendChild(table);

    	Tr tr = new Tr();
    	Td td = new Td();   	
       	tr = new Tr();
        tr.setId("rowPassword");
        table.appendChild(tr);
    	td = new Td();
    	tr.appendChild(td);
    	td.setSclass(ITheme.LOGIN_LABEL_CLASS);
    	td.appendChild(lblPassword);
    	td = new Td();
    	td.setSclass(ITheme.LOGIN_FIELD_CLASS);
    	tr.appendChild(td);
    	td.appendChild(txtPassword);
		System.out.println("test");

    	this.appendChild(form);
	}
}

package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

@ManagedBean
@Data
@SessionScoped
public class ConfirmFDialog {

	private List<String> isimler;

	public ConfirmFDialog() {
		ilkHalineGetir();
	}

	public void isimSil() {
		if (isimler.size() > 0) {
			isimler.remove(isimler.size() - 1);
		}
	}

	public void ilkHalineGetir() {
		isimler = new ArrayList<String>();
		isimler.add("ali1");
		isimler.add("ali2");
		isimler.add("ali3");
		isimler.add("ali4");
		isimler.add("ali5");
		isimler.add("ali6");
	}
}

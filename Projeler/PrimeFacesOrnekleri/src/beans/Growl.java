package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import lombok.Data;

@ManagedBean
@Data
public class Growl {
	private String isim;

	public void kontrol() {
		if ("".equals(isim)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Hata", "Ad boþ olamaz"));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "iþlem detayý", "baþarýlý giriþ yapýldý"));
		}
	}
}

package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import lombok.Data;
import utils.SessionUtil;

@ManagedBean
@Data
@SessionScoped
public class Giris {
	private String adi;
	private String sifre;

	public Giris() {
		adi = "Ayþe";
	}

	public String girisYap() {
		boolean valid = LoginDAO.validate(adi, sifre);
		if (valid) {
			HttpSession session = SessionUtil.getSession();
			session.setAttribute("tcno", adi);
			return "menu";
		} else {
			return null;
		}
	}

	public String isimDegistir() {
		adi = "Mehmet";
		return null;
	}
}

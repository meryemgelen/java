package ornek3;

public class MasaKiyaslaAgirligaGore implements Kiyaslayici {

    @Override
    public int kiyasla(Object o1, Object o2) {
	// TODO Auto-generated method stub
	Masa masa1 = (Masa) o1;
	Masa masa2 = (Masa) o2;

	if (masa1.getAgirlik() < masa2.getAgirlik()) {
	    return -1;
	} else if (masa1.getAgirlik() > masa2.getAgirlik()) {
	    return 1;
	} else {
	    return 0;
	}

    }

}

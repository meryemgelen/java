package intro;

public class main {
    
	
	public static void main(String[] args) {
		
		String internetSubeButonu="internet �ubesi A�";
		double dolarDun=8.15;
		double dolarBugun=8.18;
		int vade =36;
		boolean dustuMu=false;
		
		
		if( dolarBugun<dolarDun) {
			System.out.println("dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("dolar y�kseldi resmi");
		}else {
			System.out.println("e�ittir");
		
		}
		
		
		String [] krediler= { "sf", "1","eefdgd","fdsfsdgdg"};
		
		 for(String kredi:krediler) {System.out.println(kredi);}
		
		
		System.out.println(internetSubeButonu);
		
		
		
		
	}
	
	
}

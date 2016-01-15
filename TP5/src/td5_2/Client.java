package td5_2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermometr th =new Thermometr(0);		
		Vue vS = new VueSlider(th);
		Vue vT= new VueTexte(th);
		while (true){
			vS.mettreAjour();
			vT.mettreAjour();
		}
	}

}

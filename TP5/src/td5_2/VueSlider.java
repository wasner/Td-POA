package td5_2;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class VueSlider extends Vue{
	private JFrame wind;
	private JSlider slid;
	private Thermometr th;
	public VueSlider(Thermometr th) {
		// TODO Auto-generated constructor stub
		this.th= th;
		this.wind = new JFrame("test thermometre");
		this.slid = new JSlider();
		this.slid.setValue(0);
		this.slid.setMaximum(100);
		this.slid.setMinimum(-100);
		this.wind.add(this.slid);
		this.wind.setSize(new Dimension(500, 500));
		this.wind.setVisible(true);
		this.wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void mettreAjour() {
		// TODO Auto-generated method stub
		try{
			this.slid.setValue(th.getTemperature());
			th.setTemperature(this.slid.getValue());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	

}

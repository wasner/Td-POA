package td5_2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VueTexte extends Vue {
	private JFrame wind;
	private JTextField slid;
	private JButton bPlus;
	private JButton bMoin;
	private Thermometr th;
	public VueTexte(Thermometr the) {
		// TODO Auto-generated constructor stub
		this.th=the;
		this.wind= new JFrame("test thermometre");
		this.slid = new JTextField();
		this.slid.setText("0");
		this.slid.setSize(new Dimension(100, 50));
		
		this.wind.setSize(new Dimension(500, 500));
		this.bPlus = new JButton("+");
		this.bMoin = new JButton("-");
		this.bMoin.setMaximumSize(new Dimension(10, 20));
		this.bPlus.setMaximumSize(new Dimension(10, 20));
		this.wind.setLayout(new GridLayout(1, 1));
		this.bMoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				th.setTemperature(th.getTemperature()-1);
			}
		});
		this.bPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Integer it =th.getTemperature()+1;
				th.setTemperature(it);
			}
		});
		this.wind.add(slid);
		this.wind.add(bPlus);
		this.wind.add(bMoin);
		this.wind.setVisible(true);
		this.wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	@Override
	public void mettreAjour() {
		// TODO Auto-generated method stub
		//if (this.bPlus.getAction()==JButton.PRESSED_ICON_CHANGED_PROPERTY)
		//th.setTemperature(Integer.parseInt(this.slid.getText()));
		try {
			Integer t =th.getTemperature();
			this.slid.setText(t.toString());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	

}

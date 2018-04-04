package GUI.mainWindow.mainPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainPanel extends JPanel
{
	protected JLabel		m_label;
	
	public MainPanel()
	{
		super();
		
		this.m_label = new JLabel("Super programme qui déchire tout"); 
		
		this.setLayout(new FlowLayout());
		this.add(this.m_label);
	}
}

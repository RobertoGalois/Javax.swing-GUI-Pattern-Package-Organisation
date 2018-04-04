package GUI.mainWindow.mainMenuBar.menus.shapeMenu.shapeMenuItems.shapeTypeMenu;	

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;


public class ShapeTypeMenu extends JMenu
{
	protected ButtonGroup				m_buttonGroup;
	protected JRadioButtonMenuItem		m_radioRound;
	protected JRadioButtonMenuItem		m_radioSquare;
	protected JRadioButtonMenuItem		m_radioTriangle;
	protected JRadioButtonMenuItem		m_radioStar;
		
	public	ShapeTypeMenu()
	{
		super("Type de forme");
		
		this.m_buttonGroup = new ButtonGroup();
		this.m_radioRound = new JRadioButtonMenuItem("Rond");
		this.m_radioRound.setSelected(true);
		this.m_radioSquare = new JRadioButtonMenuItem("Carré");
		this.m_radioTriangle = new JRadioButtonMenuItem("Triangle");
		this.m_radioStar = new JRadioButtonMenuItem("Etoile");
		
		this.m_buttonGroup.add(this.m_radioRound);
		this.m_buttonGroup.add(this.m_radioSquare);
		this.m_buttonGroup.add(this.m_radioTriangle);
		this.m_buttonGroup.add(this.m_radioStar);
		
		this.add(this.m_radioRound);
		this.add(this.m_radioSquare);
		this.add(this.m_radioTriangle);
		this.add(this.m_radioStar);
	}
}

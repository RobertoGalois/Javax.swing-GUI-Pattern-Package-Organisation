package GUI.mainWindow.mainMenuBar;

import javax.swing.JMenuBar;

import GUI.mainWindow.mainMenuBar.menus.aProposMenu.AProposMenu;
import GUI.mainWindow.mainMenuBar.menus.animationMenu.AnimationMenu;
import GUI.mainWindow.mainMenuBar.menus.shapeMenu.ShapeMenu;


public class MainMenuBar extends JMenuBar
{
	protected AnimationMenu		m_AnimationMenu;
	protected ShapeMenu			m_ShapeMenu;
	protected AProposMenu		m_AProposMenu;
	
	public MainMenuBar()
	{
		super();
		
		this.m_AnimationMenu = new AnimationMenu();
		this.m_ShapeMenu = new ShapeMenu();
		this.m_AProposMenu = new AProposMenu();
		
		this.add(this.m_AnimationMenu);
		this.add(this.m_ShapeMenu);
		this.add(this.m_AProposMenu);
		
	}
}

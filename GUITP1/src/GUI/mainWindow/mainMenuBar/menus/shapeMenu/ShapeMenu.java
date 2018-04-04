package GUI.mainWindow.mainMenuBar.menus.shapeMenu;

import javax.swing.JMenu;

import GUI.mainWindow.mainMenuBar.menus.shapeMenu.shapeMenuItems.MorphingItem;
import GUI.mainWindow.mainMenuBar.menus.shapeMenu.shapeMenuItems.shapeTypeMenu.ShapeTypeMenu;


public class ShapeMenu extends JMenu
{
	protected ShapeTypeMenu		m_ShapeTypeMenu;
	protected MorphingItem		m_MorphingItem;
	
	public	ShapeMenu()
	{
		super("Forme");
		
		this.m_ShapeTypeMenu = new ShapeTypeMenu();
		this.m_MorphingItem = new MorphingItem();
		
		this.add(this.m_ShapeTypeMenu);
		this.addSeparator();
		this.add(this.m_MorphingItem);
	}
}

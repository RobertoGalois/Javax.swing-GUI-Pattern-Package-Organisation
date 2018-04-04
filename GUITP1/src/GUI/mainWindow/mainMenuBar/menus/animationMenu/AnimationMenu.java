package GUI.mainWindow.mainMenuBar.menus.animationMenu;

import javax.swing.JMenu;

import GUI.mainWindow.mainMenuBar.menus.animationMenu.animationMenuItems.LaunchAnimationItem;
import GUI.mainWindow.mainMenuBar.menus.animationMenu.animationMenuItems.QuitItem;
import GUI.mainWindow.mainMenuBar.menus.animationMenu.animationMenuItems.StopAnimationItem;


public class AnimationMenu extends JMenu
{
	protected	LaunchAnimationItem		m_LaunchAnimationItem;
	protected	StopAnimationItem		m_StopAnimationItem;
	protected	QuitItem				m_QuitItem;
	
	public AnimationMenu()
	{
		super("Animation");
		
		this.m_LaunchAnimationItem = new LaunchAnimationItem();
		this.m_StopAnimationItem = new StopAnimationItem();
		this.m_StopAnimationItem.setEnabled(false);
		this.m_QuitItem = new QuitItem();
		
		this.add(this.m_LaunchAnimationItem);
		this.add(this.m_StopAnimationItem);
		this.addSeparator();
		this.add(this.m_QuitItem);
	}
}

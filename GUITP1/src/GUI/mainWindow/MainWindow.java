package GUI.mainWindow;

import java.awt.Dimension;

import javax.swing.JFrame;

import GUI.mainWindow.mainMenuBar.MainMenuBar;
import GUI.mainWindow.mainPanel.MainPanel;


public class MainWindow extends JFrame
{
	protected MainPanel		m_mainPanel;
	protected MainMenuBar	m_menuBar;
	
	public MainWindow()
	{
		super();
	
		this.m_mainPanel = new MainPanel();
		this.m_menuBar = new MainMenuBar();
		
		this.setJMenuBar(this.m_menuBar);
		this.setContentPane(this.m_mainPanel);
		
		this.setSize(500, 500);
		this.setMinimumSize(new Dimension(500, 500));
		this.setTitle("Animation");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}

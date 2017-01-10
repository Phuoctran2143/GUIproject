package graphicView;

import javax.swing.JFrame;
import graphicController.FirstGUIController;
import java.awt.Dimension;

public class FirstGUIFrame extends JFrame
{
	private FirstGUIController baseController;
	private FirstGUIPanel appPanel;
	
	public FirstGUIFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new FirstGUIPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("WOW A WINDOW");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}
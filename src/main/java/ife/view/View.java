package ife.view;

import ife.Model;

import javax.swing.*;
import java.awt.*;

public class View {
    private Model model;
    private JFrame frame;

    private JMenuItem mnuItemNewStory;
    private JMenuItem mnuItemAddSection;
    private JMenuItem mnuItemQuit;

    private SectionsPanel sectionsPanel;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();

        frame.setTitle("Interactive Fiction Editor");
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mnuItemNewStory   = new JMenuItem("New Story");
        mnuItemAddSection = new JMenuItem("Add Section");
        mnuItemQuit       = new JMenuItem("Quit");

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(mnuItemNewStory);
        fileMenu.addSeparator();
        fileMenu.add(mnuItemAddSection);
        fileMenu.addSeparator();
        fileMenu.add(mnuItemQuit);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        sectionsPanel = new SectionsPanel(model, this);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(sectionsPanel, BorderLayout.CENTER);
    }

    public void refresh(){
        sectionsPanel.refresh();
    }

    public Model getModel() {
        return model;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JMenuItem getMnuItemNewStory() {
        return mnuItemNewStory;
    }

    public JMenuItem getMnuItemAddSection() {
        return mnuItemAddSection;
    }

    public JMenuItem getMnuItemQuit() {
        return mnuItemQuit;
    }

    public SectionsPanel getSectionsPanel() {
        return sectionsPanel;
    }
}

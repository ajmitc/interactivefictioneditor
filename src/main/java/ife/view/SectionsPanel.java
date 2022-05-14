package ife.view;

import ife.Model;

import javax.swing.*;
import java.awt.*;

public class SectionsPanel extends JPanel {
    private Model model;
    private View view;

    private SectionsTableModel tableModel;
    private JTable sectionPanels;

    public SectionsPanel(Model model, View view){
        super(new BorderLayout());
        this.model = model;
        this.view = view;

        tableModel = new SectionsTableModel();
        sectionPanels = new JTable(tableModel);
        sectionPanels.setTableHeader(null);

        add(new JScrollPane(sectionPanels), BorderLayout.CENTER);
    }

    public void refresh(){
        if (tableModel.getStory() == null && model.getStory() != null)
            tableModel.setStory(model.getStory());
    }
}

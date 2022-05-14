package ife.view;

import ife.story.Section;
import ife.util.Util;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class SectionPanel extends JPanel implements ListCellRenderer<Section>{
    private Section section;
    private JTextPane textPane;
    private StyledDocument styledDocument;
    private JLabel lblId;

    public SectionPanel(){
        super(new BorderLayout());
        textPane = new JTextPane();
        styledDocument = textPane.getStyledDocument();
        Util.addStylesToDocument(styledDocument);

        textPane.setEditable(true);
        textPane.setBorder(BorderFactory.createLineBorder(Color.black));

        lblId = new JLabel();

        add(lblId, BorderLayout.NORTH);
        add(textPane, BorderLayout.CENTER);
    }

    public void appendText(String text, String style){
        try {
            styledDocument.insertString(styledDocument.getLength(), text, styledDocument.getStyle(style));
        } catch (BadLocationException ble)
        {
            System.err.println("Couldn't insert initial text into text pane.");
        }
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;

        lblId.setText(section.getId());
        textPane.setText(section.getContent());
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Section> list, Section value, int index, boolean isSelected, boolean cellHasFocus) {
        SectionPanel sectionPanel = new SectionPanel();
        sectionPanel.setSection(value);
        return sectionPanel;
    }
}

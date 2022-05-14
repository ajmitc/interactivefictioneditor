package ife.view;

import ife.story.Story;

import javax.swing.table.AbstractTableModel;

public class SectionsTableModel extends AbstractTableModel {
    private Story story;

    @Override
    public int getRowCount() {
        if (story == null)
            return 0;
        return story.getSections().size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (story == null)
            return null;
        return story.getSections().get(rowIndex);
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}

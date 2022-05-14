package ife;

import ife.story.Section;
import ife.story.Story;
import ife.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        view.getMnuItemQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        view.getMnuItemNewStory().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Story story = new Story();
                Section section = new Section();
                section.setId("1");
                story.getSections().add(section);
                model.setStory(story);
                //view.getSectionsPanel().addSectionPanel(section);
            }
        });

        view.getMnuItemAddSection().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Section section = new Section();
                section.setId("" + (model.getStory().getSections().size() + 1));
                model.getStory().getSections().add(section);
                //view.getSectionsPanel().addSectionPanel(section);
            }
        });
    }
}

package ife.story;

import java.util.ArrayList;
import java.util.List;

public class Story {
    private String title = "My Story";
    private String author = "";
    private List<Section> sections = new ArrayList<>();

    public Story(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void addSection(){

    }
}

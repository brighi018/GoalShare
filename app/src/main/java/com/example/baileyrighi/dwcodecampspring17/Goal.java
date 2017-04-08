package com.example.baileyrighi.dwcodecampspring17;

import java.util.Date;

/**
 * Created by Bailey Righi on 4/7/2017.
 */

public class Goal {

    private String title;

    private String description;

    private String forWho;

    private boolean isChecked;

    private Date dueDate;

    public Goal() {
        title = "(no title)";
        description = "(no description)";
        forWho = "?";
        isChecked = false;
    }

    public Goal(String givenTitle) {
        title = givenTitle;
        description = "(no description)";
        forWho = "?";
        isChecked = false;
    }

    public Goal(String givenTitle, String givenDescription, String givenForWho) {
        title = givenTitle;
        description = givenDescription;
        forWho = givenForWho;
        isChecked = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForWho() {
        return forWho;
    }

    public void setForWho(String forWho) {
        this.forWho = forWho;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}

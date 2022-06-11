package com.example.cms_club_ver_1;

public class EventPOJO
{

    public String Name;
    public String Date;
    public String Description;
    //public String Photo;


    public boolean isShrink = true;

    public EventPOJO(String name, String date, String description ) {
        Name = name;
        Date = date;
        Description = description;
        //Photo=photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
//    public EventPOJO(String name, String date, String discription) {
//        this.Name = event_name;
//        this.date = date;
//        this.discription = discription;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setEvent_name(String event_name) {
//        this.Name = event_name;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getDiscription() {
//        return discription;
//    }
//
//    public void setDiscription(String discription) {
//        this.discription = discription;
//    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }
}

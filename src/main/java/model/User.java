package model;


import java.util.List;

public class User extends  BaseEntity{

    private String first_name;
    private String last_name;
    private List<Event> eventList;
    private List<File> fileList;
    private Account account;

}

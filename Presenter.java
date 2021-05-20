package com.example.mvp_designpattern;

public class Presenter {

    private User user;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.user = new User();
    }

    public void updateName(String name){
        user.setName(name);
        view.updateInfo(user.toString());

    }

    //presenter
    public void updateEmail(String email){
        user.setEmail(email);
        view.updateInfo(user.toString());

    }

    interface View{
        void showProgress();
        void hideProgress();
        void updateInfo(String info);
    }

}

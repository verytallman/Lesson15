package org.homework.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class ModelConstructor {
    public static void main(String[] args) {
        MainObject mainObject = new MainObject();
        Menu menu = new Menu();
        Popup popup = new Popup();
        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        MenuItem menuItem3 = new MenuItem();
        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(menuItem1);
        menuItemList.add(menuItem2);
        menuItemList.add(menuItem3);

        menuItem1.setValue("New");
        menuItem1.setOnClick("CreateNewDoc()");
        menuItem2.setValue("Open");
        menuItem2.setOnClick("OpenDoc()");
        menuItem3.setValue("Close");
        menuItem3.setOnClick("CloseDoc()");

        popup.setMenuItemList(menuItemList);
        menu.setId("file");
        menu.setValue("File");
        menu.setPopup(popup);
        mainObject.setMenu(menu);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(mainObject.getMenu()));
    }
}

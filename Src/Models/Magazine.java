package Models;

import Service.Device;

public class Magazine implements Device.Printable {

    String name;

    public Magazine(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}

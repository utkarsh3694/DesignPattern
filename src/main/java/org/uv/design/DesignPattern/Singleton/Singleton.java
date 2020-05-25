package org.uv.design.DesignPattern.Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer number;
    public static Singleton getInstance(){
        if (uniqueInstance==null){
            synchronized(Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

package com.zb.designpattern.observe;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public interface ToObserver {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}

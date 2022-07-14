package com.bridgelabz.oops_concept;

abstract class Box{
    abstract void boxType();
}
class GiftBox extends Box{
    void boxType(){
        System.out.println("Its a Box full of gifts ");
    }
}
class BallBox extends GiftBox{
    void boxType(){
        System.out.println("Its a box full of footballs");
    }
}
public class MultiLevelInheritance extends BallBox{
    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox();
        giftBox.boxType();
        GiftBox ballBox = new BallBox();
        ballBox.boxType();
    }
}

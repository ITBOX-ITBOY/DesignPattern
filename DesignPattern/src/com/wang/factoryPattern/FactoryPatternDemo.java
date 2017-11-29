
package com.wang.factoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {

    }

    /**
     * 
     * 方法一
     * 此方法有一个缺点：每次增加一个产品时，都需要增加一个对象实现
     * @author wangjiucheng
     * 2017年11月29日
     */
    public void moth1() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.shape();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.shape();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.shape();
    }
    
    /**
     * 
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     * @author wangjiucheng
     * 2017年11月29日
     */
    public void moth2(){
        Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rect.shape();
        
        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.shape();
    }
}

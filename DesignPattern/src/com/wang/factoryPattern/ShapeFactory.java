
package com.wang.factoryPattern;

/**
 * 工厂实现类
 * 
 * @author wangjiucheng
 */
public class ShapeFactory {
    /**
     * 方法一：此方法每次增加一个产品时，都需要增加一个对象实现
     * 
     * @author wangjiucheng 2017年11月29日
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    /**
     * 
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     * @author wangjiucheng
     * 2017年11月29日
     * @param clazz
     * @return
     */
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

}

package com.holyant;

import lombok.Data;

/**
 * @author holyant
 */
@Data
public class ConcreteChess implements ChessFlyWeight {
    private String color;
    public ConcreteChess(String color) {
        super();
        this.color = color;
    }
    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + c.getX() + "----" + c.getY());
    }
}

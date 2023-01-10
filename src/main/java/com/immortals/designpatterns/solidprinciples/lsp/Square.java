package com.immortals.designpatterns.solidprinciples.lsp;

public class Square extends  Rectangle{
    public Square() {}

    public Square(int size) {
        width = height = size;
    }

    // the issue in code which will cause LSP issue
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

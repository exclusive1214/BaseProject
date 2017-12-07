package com.github.exclusive1214;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class C8763Test {
    @Test
    public void getType() throws Exception {
        // Arrange
        C8763 triangle = new C8763(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}

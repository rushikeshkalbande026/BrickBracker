package com.example.brickbracker;


    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Arrays;

    class MapGenerator {
        public int[][] map;
        public int bricksWidth;
        public int bricksHeight;

        public MapGenerator(int var1, int var2) {
            this.map = new int[var1][var2];
            int[][] var3 = this.map;
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                int[] var6 = var3[var5];
                Arrays.fill(var6, 1);
            }

            this.bricksWidth = 540 / var2;
            this.bricksHeight = 150 / var1;
        }

        public void draw(Graphics2D var1) {
            for(int var2 = 0; var2 < this.map.length; ++var2) {
                for(int var3 = 0; var3 < this.map[0].length; ++var3) {
                    if (this.map[var2][var3] > 0) {
                        var1.setColor(Color.red);
                        var1.fillRect(var3 * this.bricksWidth + 80, var2 * this.bricksHeight + 50, this.bricksWidth, this.bricksHeight);
                        var1.setStroke(new BasicStroke(3.0F));
                        var1.setColor(Color.black);
                        var1.drawRect(var3 * this.bricksWidth + 80, var2 * this.bricksHeight + 50, this.bricksWidth, this.bricksHeight);
                    }
                }
            }

        }

        public void setBricksValue(int var1, int var2, int var3) {
            this.map[var2][var3] = var1;
        }
    }



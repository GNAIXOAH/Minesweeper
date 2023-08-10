import java.awt.*;

public class GameUtil {
    static int MINE_MAX = 100;
    static int MAP_W = 36;
    static int MAP_H = 17;
    static int OFFSET = 45;
    static int SQUARE_LENGTH = 50;
    static  int FLAG_NUM = 0;
    static int MOUSE_X;
    static int MOUSE_Y;
    static boolean LEFT = true;
    static boolean RIGHT = false;
    static int state = 3;
    static int level;
    static long START_TIME;
    static long END_TIME;
    static int[][] DATA_BUTTOM = new int[MAP_W + 2][MAP_H + 2];
    static int[][] DATA_TOP = new int[MAP_W + 2][MAP_H + 2];
    static Image mine = Toolkit.getDefaultToolkit().getImage("imgs/mine.gif");
    static Image top = Toolkit.getDefaultToolkit().getImage("imgs/top.gif");
    static Image flag = Toolkit.getDefaultToolkit().getImage("imgs/flag.gif");
    static Image noflag = Toolkit.getDefaultToolkit().getImage("imgs/noflag.gif");
    static Image face = Toolkit.getDefaultToolkit().getImage("imgs/face.gif");
    static Image over = Toolkit.getDefaultToolkit().getImage("imgs/over.gif");
    static Image win = Toolkit.getDefaultToolkit().getImage("imgs/win.gif");
    static Image[] images = new Image[9];
    static {
        for (int i = 1; i<=8; i++){
            images[i] = Toolkit.getDefaultToolkit().getImage("imgs/num/" + i + ".gif");
        }
    }
    static  void drawWord(Graphics g, String str, int x, int y, int size, Color color){
        g.setColor(color);
        g.setFont(new Font("Times New Rome", Font.BOLD, size));
        g.drawString(str, x, y);
    }
}


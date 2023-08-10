import java.awt.*;

public class MapBottom {
    BottomMine bottomMine = new BottomMine();
    BottomNum bottomNum = new BottomNum();
    {
        bottomMine.newMine();
        bottomNum.newNum();
    }
    void reGame(){
        for (int i = 1; i <=GameUtil.MAP_W; i++){
            for (int j = 1; j <= GameUtil.MAP_H; j++){
                GameUtil.DATA_BUTTOM[i][j] = 0;
            }
        }
        bottomMine.newMine();
        bottomNum.newNum();
    }
    void paintSelf(Graphics g){
                g.setColor(Color.black);
                for (int i = 0; i <= GameUtil.MAP_W; i++){
                    g.drawLine(GameUtil.OFFSET + i * GameUtil.SQUARE_LENGTH,
                            3*GameUtil.OFFSET,
                    GameUtil.OFFSET+i*GameUtil.SQUARE_LENGTH,
                    3*GameUtil.OFFSET+GameUtil.MAP_H*GameUtil.SQUARE_LENGTH);
        }
        for (int i = 0; i <= GameUtil.MAP_H; i++){
            g.drawLine(GameUtil.OFFSET ,
                    3*GameUtil.OFFSET + i * GameUtil.SQUARE_LENGTH,
                    GameUtil.OFFSET+GameUtil.MAP_W*GameUtil.SQUARE_LENGTH,
                    3*GameUtil.OFFSET + i * GameUtil.SQUARE_LENGTH);
        }
        for (int i = 1; i <=GameUtil.MAP_W; i++){
            for (int j = 1; j <= GameUtil.MAP_H; j++){
                if (GameUtil.DATA_BUTTOM[i][j] == -1) {
                    g.drawImage(GameUtil.mine,
                            GameUtil.OFFSET + (i - 1) * GameUtil.SQUARE_LENGTH + 1,
                            GameUtil.OFFSET * 3 + (j - 1) * GameUtil.SQUARE_LENGTH + 1,
                            GameUtil.SQUARE_LENGTH - 2,
                            GameUtil.SQUARE_LENGTH - 2,
                            null);
                }
                if (GameUtil.DATA_BUTTOM[i][j] >= 0) {
                    g.drawImage(GameUtil.images[GameUtil.DATA_BUTTOM[i][j]],
                            GameUtil.OFFSET + (i - 1) * GameUtil.SQUARE_LENGTH + 1,
                            GameUtil.OFFSET * 3 + (j - 1) * GameUtil.SQUARE_LENGTH + 1,
                            GameUtil.SQUARE_LENGTH - 2,
                            GameUtil.SQUARE_LENGTH - 2,
                            null);
                }
            }
        }
        GameUtil.drawWord(g, " " + (GameUtil.MINE_MAX - GameUtil.FLAG_NUM),
                GameUtil.OFFSET,
                2*GameUtil.OFFSET, 30, Color.BLACK);
        GameUtil.drawWord(g, " " + (GameUtil.END_TIME - GameUtil.START_TIME) / 1000,
                GameUtil. OFFSET+ GameUtil.SQUARE_LENGTH * (GameUtil.MAP_W - 1),
                2*GameUtil.OFFSET, 30, Color.BLACK);
        switch (GameUtil.state){
            case 0:
                GameUtil.END_TIME = System.currentTimeMillis();
                g.drawImage(GameUtil.face,
                        GameUtil.OFFSET + GameUtil.SQUARE_LENGTH * (GameUtil.MAP_W/2),
                        GameUtil.OFFSET,
                        GameUtil.SQUARE_LENGTH - 2,
                        GameUtil.SQUARE_LENGTH - 2,
                        null);
                break;
            case 1:
                g.drawImage(GameUtil.win,
                        GameUtil.OFFSET + GameUtil.SQUARE_LENGTH * (GameUtil.MAP_W/2),
                        GameUtil.OFFSET,
                        GameUtil.SQUARE_LENGTH - 2,
                        GameUtil.SQUARE_LENGTH - 2,
                        null);
                break;
            case 2:
                g.drawImage(GameUtil.over,
                        GameUtil.OFFSET + GameUtil.SQUARE_LENGTH * (GameUtil.MAP_W/2),
                        GameUtil.OFFSET,
                        GameUtil.SQUARE_LENGTH - 2,
                        GameUtil.SQUARE_LENGTH - 2,
                        null);
                break;
            default:
        }
    }
}

public class BottomMine {
    static int[] mines = new int[GameUtil.MINE_MAX * 2];
    int x, y;
    boolean isPlace = true;
    void newMine(){
        for (int i = 0; i < GameUtil.MINE_MAX*2; i += 2){
            x = (int) (Math.random()*GameUtil.MAP_W + 1);
            y = (int) (Math.random()*GameUtil.MAP_H + 1);

            for (int j = 0; j < i; j += 2) {
                if (x == mines[j] && y == mines[j + 1]) {
                    i -= 2;
                    isPlace = false;
                    break;
                }
            }
                if (isPlace){
                    mines[i] = x;
                    mines[i+1] = y;
                }
                isPlace = true;
        }
        for (int i = 0; i < GameUtil.MINE_MAX * 2; i += 2){
            GameUtil.DATA_BUTTOM[mines[i]][mines[i+1]] = -1;
        }
    }
}

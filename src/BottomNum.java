public class BottomNum {
    void newNum(){
        for (int i = 1; i <= GameUtil.MAP_W; i++){
            for (int j = 1; j <= GameUtil.MAP_H; j++){
                if (GameUtil.DATA_BUTTOM[i][j] == -1){
                    for (int k = i - 1; k <= i + 1; k++){
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (GameUtil.DATA_BUTTOM[k][l] >= 0){
                                GameUtil.DATA_BUTTOM[k][l]++;
                            }
                        }
                    }
                }
            }
        }
    }
}
/**
 * @author a
 * @date 2018/7/31 18:28
 */
public class StoneGame {

    public int pickUpStones(int[] arr, int start, int end) {
        int yaScore, liScore = 0;
        boolean flag = (end - start) % 2 == 1 ? true : false;
        if (flag) {
            yaScore = arr[start]+pickUpStones(arr,start+1,end);
            yaScore = arr[arr.length - 1];
        }

        if (arr.length == 0) {
            return 0;
        } else if (arr.length % 2 == 0) {

        } else {

        }
        return 0;
    }

}

/*
这道题目错的一塌糊涂
public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        int result = 1, i = 0,j = 1 ;
        while(i < points.length && j <points.length){
            if(points[i][1]<points[j][0]){
                result++;
                i = j + 1;
            }else{
                j++;
            }
        }
        return result;
    }
}
这是最开始的代码
一： 还是没有考虑到数组为空的情况
二： 没有考虑到可能会造成[[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]]  导致[0,9]排在第一个然后错误
没有考虑到  [[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]   造成最右边的数据开始的时候过大，而中间的数组范围比较小，
the location of array 取得很大的时候已经不再中间的数据的范围之内
*/


public class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0 )
        return 0;
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]!=b[0]? a[0] - b[0]:a[1] - b[1];
            }
        });
        int result = 1;
        int min = points[0][1];
        for( int i = 1;i < points.length; i++){
            if(min < points[i][0]){
                result++;
                min = points[i][1];
            }
            else{
                min = Math.min(min,points[i][1]);
            }
        }
        return result;
    }
}
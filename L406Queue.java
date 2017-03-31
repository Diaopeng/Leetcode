/*
这道题做的扎心了，题目本身比较难想到解法，看了题解之后感觉似乎不难，但是因为java知识的欠缺
一直看不懂这题解到底要干啥。
一：Array的sort方法可以重写排序的规则
List这个接口实现类ArrayList和LinkedList的方法add时候都可以两个参数，第一个参数作为index，第二个参数作为对象加入进去
*/



public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] != b[0]? b[0]-a[0]:a[1]-b[1];
            }
        });
        ArrayList nums = new ArrayList();
        for(int[] cur : people){
            nums.add(cur[1],cur);
        }
        nums.toArray(people);
        return people;
    }
}
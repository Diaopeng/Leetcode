class Solution {
    class UnionFind{
        private int count;
        private int [] rank, parent;
        public UnionFind(int n){
            count = n;
            rank = new int[n];
            parent = new int[n];
            for(int i = 0;i < n;i++){
                parent[i] = i;
            }
        }
        public int find(int x){
            if(parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        
        public void union(int x, int y){
            x = find(x);
            y = find(y);
            if(x == y) return;
            if(rank[x] > rank[y])
                parent[y] = x;
            else{
                if(rank[x] == rank[y])
                    rank[y]++;
                parent[x] = y;
            }
            count --;
        }
    }
    public int findCircleNum(int[][] M) {   
        int m = M.length;
        UnionFind uf = new UnionFind(m);
        for(int i = 0;i < m;i++){
            for(int j = 0;j < M[0].length;j++){
                if(M[i][j] == 1) uf.union(i,j);
            }
        }
        return uf.count;
    }
}

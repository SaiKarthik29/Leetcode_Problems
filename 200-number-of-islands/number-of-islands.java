class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    qwer(i,j,grid,n,m);
                    cnt++;
                }
                
            }
        }
        return cnt;
    }
    public static void qwer(int i,int j,char[][] grid, int n,int m){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='0' || grid[i][j]=='2'){
            return;
        }
        if(grid[i][j]=='1'){
            grid[i][j]='2';
        }
        qwer(i-1,j,grid,n,m);
        qwer(i,j-1,grid,n,m);
        qwer(i+1,j,grid,n,m);
        qwer(i,j+1,grid,n,m);
    }
}
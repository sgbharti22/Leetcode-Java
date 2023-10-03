class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans=new int[m][n];
        for (int a[]:ans){
            Arrays.fill(a,1);
        }
        ans[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>0 && j>0)
                {
                    ans[i][j]=ans[i][j-1]+ans[i-1][j];
                }
            }
        }
        return ans[m-1][n-1];
    }
}

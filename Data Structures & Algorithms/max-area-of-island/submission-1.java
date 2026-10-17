class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int rows = grid.length; int cols = grid[0].length;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {
                if (grid[r][c] != 1)
                    continue;

                int area = 0;
                Queue<Integer> q = new ArrayDeque<>();
                q.offer(r*cols + c);
                grid[r][c] = 0;

                while(q.size() != 0) {
                    int id = q.poll();
                    int cr = id/cols, cc = id % cols; //calculate current row and current col 
                    area++;

                    for(int[] d: dirs) {
                        int nr = cr + d[0], nc = cc + d[1]; //neighbour row/col
                        if(nr >=0 && nc >=0 && nr < rows && nc <cols && grid[nr][nc] == 1){
                            grid[nr][nc] = 0; //visited
                            q.offer(nr*cols + nc);
                        }
                    }
                }

                max = Math.max(max, area);
            }
        }
        return max;
    }

}

// Time Complexity : O(row * column)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();
        
        int m = matrix.length;          //no. of rows
        int n = matrix[0].length;       //no. of columns
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        
        while(top <= bottom && left <= right){
            //top row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            //right column
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            //bottom row
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            
            //left column
            if(top <= bottom && left <= right){
                for(int i = bottom; i>= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
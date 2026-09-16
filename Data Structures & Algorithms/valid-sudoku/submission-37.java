class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
            List<Character> row = new ArrayList<>();
            List<Character> column = new ArrayList<>();
            for(int j=0; j<board.length; j++){
                if(board[i][j] != '.') {
                    if(row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);
                }

                if(board[j][i] != '.') {
                    if(column.contains(board[j][i])) {
                        return false;
                    }
                    column.add(board[j][i]);
                }
            }
        }
        List<List<Character>> grid = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            grid.add(new ArrayList<>());
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(i<3 && j<3){
                    if(board[i][j] != '.'){
                        if(grid.get(0).contains(board[i][j])){
                            return false;
                        }
                        grid.get(0).add(board[i][j]);
                    }
                }else if(i>=3 && i<6 && j<3){
                    if(board[i][j] != '.'){
                        if(grid.get(1).contains(board[i][j])){
                            return false;
                        }
                        grid.get(1).add(board[i][j]);
                    }
                }else if(i>=6 && j<3){
                    if(board[i][j] != '.'){
                        if(grid.get(2).contains(board[i][j])){
                            return false;
                        }
                        grid.get(2).add(board[i][j]);
                    }
                }else if(i<3 && j>=3 && j<6){
                    if(board[i][j] != '.'){
                        if(grid.get(3).contains(board[i][j])){
                            return false;
                        }
                        grid.get(3).add(board[i][j]);
                    }
                }else if(i>=3 && i<6 && j>=3 && j<6){
                    if(board[i][j] != '.'){
                        if(grid.get(4).contains(board[i][j])){
                            return false;
                        }
                        grid.get(4).add(board[i][j]);
                    }
                }else if(i>=6 && i<9 && j>=3 && j<6){
                    if(board[i][j] != '.'){
                        if(grid.get(5).contains(board[i][j])){
                            return false;
                        }
                        grid.get(5).add(board[i][j]);
                    }
                }else if(i<3 && j>=6 && j<9){
                    if(board[i][j] != '.'){
                        if(grid.get(6).contains(board[i][j])){
                            return false;
                        }
                        grid.get(6).add(board[i][j]);
                    }
                }else if(i>=3 && i<6 && j>=6 && j<9){
                    if(board[i][j] != '.'){
                        if(grid.get(7).contains(board[i][j])){
                            return false;
                        }
                        grid.get(7).add(board[i][j]);
                    }
                }else{
                    if(board[i][j] != '.'){
                        if(grid.get(8).contains(board[i][j])){
                            return false;
                        }
                        grid.get(8).add(board[i][j]);
                    }
                }
                System.out.println(grid);
            }
        }
        return true;
    }
}

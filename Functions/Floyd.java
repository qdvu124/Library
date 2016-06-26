for(int k = 1; k <= v; k++){
            for(int i = 1; i <= v; i ++){
                    for(int j = 1; j <= v; j ++){
                            matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                
            }
        }

//Remember to initialize adj matrix to INF where i != j

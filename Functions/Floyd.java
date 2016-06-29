//Floyd-Warshall's algorithm to solve the all-pairs shortest path problem
static void floyd(int matrix[][]){
	for(int k = 1; k <= v; k++){
		for(int i = 1; i <= v; i ++){
                    for(int j = 1; j <= v; j ++){
                            matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                
            }
        }

}
//v is the number of vertices in the graph
//Remember to initialize adj matrix to INF where i != j


//Function to compute the factorial of a number
static BigDecimal factorial(int n){
	BigDecimal result = BigDecimal.ONE;
	for(int i = 2; i <= n; i ++)
		result = result.multiply(new BigInteger(Integer.toString(i)));
	return result;
}

//Bottom-up's approach of calculating the nth Fibonacci number
static long fibonacci(int n){
	long dp = new long[n+1];
	dp[1] = 1;
	dp[2] = 1;
	for(int i = 3; i <= n; i++){
		dp[i] = dp[i] + dp[i-1];
	}
	return dp[n];
}

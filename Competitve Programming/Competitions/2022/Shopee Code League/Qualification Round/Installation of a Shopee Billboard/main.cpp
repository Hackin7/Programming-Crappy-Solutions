// A recursive C++ program for partition problem
#include <bits/stdc++.h>
using namespace std;
 
int ans=0;

// A utility function that returns true if there is
// a subset of arr[] with sun equal to given sum
bool isSubsetSum(int arr[], int n, int sum,
                 vector<vector<int> >& dp)
{
    // Base Cases
    if (sum == 0)
        return true;
    if (n == 0 && sum != 0)
        return false;
 
    // return solved subproblem
    if (dp[n][sum] != -1) {
        return dp[n][sum];
    }
 
    // If last element is greater than sum, then
    // ignore it
    if (arr[n - 1] > sum)
        return isSubsetSum(arr, n - 1, sum, dp);
 
    /* else, check if sum can be obtained by any of
        the following
        (a) including the last element
        (b) excluding the last element
    */
    // also store the subproblem in dp matrix
    return dp[n][sum]
           = isSubsetSum(arr, n - 1, sum, dp)
             || isSubsetSum(arr, n - 1, sum - arr[n - 1],
                            dp);
}
 
// Returns true if arr[] can be partitioned in two
// subsets of equal sum, otherwise false
bool findPartition(int arr[], int n)
{
    // Calculate sum of the elements in array
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];
 
    // If sum is odd, there cannot be two subsets
    // with equal sum
    if (sum % 2 != 0)
        return false;
 
    // To store overlapping subproblems
    vector<vector<int> > dp(n + 1,
                            vector<int>(sum + 1, -1));
 
    // Find if there is subset with sum equal to
    // half of total sum
    if (isSubsetSum(arr, n, sum / 2, dp)){
        ans = sum / 2;
        return true;
    }else{
        return false;
    }
}
 
int bruteforcePermutation(int size){
    for(int i=0;i<size;i++){
        return i;
    }
}

// Driver code
int main()
{
    int L;cin>>L;
    int arr[L]; for(int i=0;i<L;i++){cin>>arr[i];}
    
    //int arr[] = { 3, 1, 5, 9, 12 };
    int n = sizeof(arr) / sizeof(arr[0]);
    
    int overallans=0;
    
    for (int S=2;S<L;S+=2){// Wanted subset size
        int aaa[S];
        
        // Generate permutations
        int perm = pow(L, S); // eg. 
        for (int p=0;p<perm;p++){
            
            int index = p;
            bool toreject = false;
            set<int> sss;
            // Generate Permutations
            for(int s=0;s<S;s++){ // loop through element
                aaa[s] = arr[p % L];
                cout<<aaa[s]<<","<<p%L<<" ";
                if (sss.find(p%L)==sss.end()){
                    toreject=true;
                    break;
                }
                sss.insert(p%L);
                index = p % L;
                
            }
            cout<<endl;
            if (!toreject){
                findPartition(aaa, S);
                //cout<<ans <<endl;
                overallans = max(ans,overallans);
            }
        }
        
    }
    cout << overallans;
    return 0;
}

/*
4
1 2 3 6
*/

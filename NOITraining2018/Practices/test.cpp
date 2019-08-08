#include <bits/stdc++.h>
using namespace std;

/*sumup
int main() 
{
    int a;
    int b;
    int c;
    int sum;
    cin>>a>>b>>c;
    sum = a+b+c;
    cout <<sum;
    return 0;
}
*/
/* Odd Even

int main(){
    int a;
    cin >> a;

    while( a >=2 ) {
        a-=2;
    }
    if (a == 1){cout<<"Odd\n";}
    else if (a == 0){cout<<"Even\n";}
    return 0;
}
*/

/* Square
int main() {
    int length;
    cin >> length;
    for (int rows = 0;rows<length;rows++){
        for (int column = 0;column<length;column++){
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}
*/
/*Maximum
int main() {
    int a;
    cin >> a;
    int b;
    cin >> b;
    if (a>b){cout<<a;}
    else{cout<<b;}
    return 0;
}
*/ 
/*Calculator
int main() {
    //scanf("%d%d%d", &,&,&);
    int a,b;
    char operate;
    cin>>a>>operate>>b;
    switch(operate) {
        case '+' : cout << a+b;break;
        case '-' : cout << a-b;break;
        case '*' : cout << a*b;break;
        case '/' : cout << a/b;break;
    }
}
*/
/*lazysponge
int main() {
    int n,x;
    cin >>n>>x;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
    }
    cout<<numbers[x-1];
    return 0;
}
*/

/* rightangtri
int main() {
    int length;
    cin >> length;
    for (int rows = 0;rows<length;rows++){
        for (int column = 0;column<rows+1;column++){
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}
*/
/*multiples
int main(){
    int n,m;
    cin >> n >> m;
    for (int multiple = 1;multiple<=m;multiple++){
        cout<<n*multiple<<"\n";
    }
    return 0;
}
*/
/*checkmultiple
int main(){
    int n,m;
    cin >> n >> m;
    if (n%m==0){cout<<"Yes";}
    else{cout << "No";}
    return 0;
}
*/
/* psle 
int main(){
    int mark;
    cin >> mark;
    if (mark >= 91){cout << "A*";} 
    else if (mark >= 75){cout << "A";} 
    else if (mark >= 60){cout << "B";} 
    else if (mark >= 50){cout << "C";} 
    else if (mark >= 35){cout << "D";} 
    else if (mark >= 20){cout << "E";} 
    else{cout << "U";} 
    return 0;
}
*/
/* lunch 
int main(){
    int n;
    cin >> n;
    if (n > 8){cout << "OMG POTATOES!!!";} 
    else if (n >= 6){cout << "That's a good potato!";} 
    else if (n >= 3){cout << "That's a normal potato!";} 
    else if (n>=1){cout << "That's a terrible potato!";} 
    return 0;
}
*/
/*3n+1
int main(){
    int n;
    cin >> n;
    while(n!=1){
        cout << n<<" ";
        if (n%2 == 0){n=n/2;}
        else{n = 3*n+1;}
    }
    cout << n;
    return 0;
}
*/
/* gpa 
int main(){
    int mark;
    cin >> mark;
    if (mark >= 80){cout << "4.0";} 
    else if (mark >= 70){cout << "3.6";} 
    else if (mark >= 65){cout << "3.2";} 
    else if (mark >= 60){cout << "2.8";} 
    else if (mark >= 55){cout << "2.4";} 
    else if (mark >= 50){cout << "2.0";} 
    else if (mark >= 45){cout << "1.6";} 
    else if (mark >= 40){cout << "1.2";} 
    else{cout << 0.8;} 
    return 0;
}*/
/* checkerboard 
int main(){
    int n;
    cin >> n;
    int shapeNo = 1;
    for (int i = 0;i<n;i++){
        for (int l = 0;l<n;l++){
            if (shapeNo % 2 == 1){cout << "o";}
            else if (shapeNo % 2 == 0){cout << "x";}
            shapeNo += 1;
        }
        cout << "\n";
        if (n%2 == 0){shapeNo += 1;}
    } 
    return 0;
}
*/
/*sumint
int main() {
    int n;
    int sum = 0;
    cin >>n;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        sum += numbers[i];
    }
    cout<<sum;
    return 0;
}
*/
/*squares
int main() {
    int n;
    cin >>n;
    for (int i = 1;i<=n;i++){
        cout << i*i;
        if (i!=n){cout << " ";}
    }   
    //i+=1;
    //cout << i*i;
    return 0;
}
*/
/*meanstring
int main() {
    int n;
    int sum = 0;
    cin >>n;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        sum += numbers[i];
    }
    cout<<sum/n;
    return 0;
}
*/
/*medianstr
int main() {
    int n;
    int sum = 0;
    cin >>n;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        sum += numbers[i];
    }
    if (n%2 == 0){
        cout << (numbers[n/2]+numbers[n/2+1])/2;
    }
    else{
        cout<<numbers[n/2];
    }
    return 0;
}
*/
/* strlineeqn_easy 
int main() {
    int m,c;
    cin >> m >> c;
    cout << c;
    return 0;
}
*/
/* summation
int main(){
    int n;
    int sum = 0;
    cin >>n;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        if (numbers[i] < 0) {
            sum -= numbers[i];
        }
        else {sum += numbers[i];}
    }
    cout << sum;
    return 0;
}
*/
/* executions 
int main() {
    int n;
    int sum = 0;
    cin >>n;
    int numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        sum += numbers[i];
    }
    cout<<sum;
    return 0;
}
*/
/* oranges
int main() {
    int n;
    cin >>n;
    long numbers[n];
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
    }
    
    int max1 = 0;
    int max2 = 0;
    for (int i = 0;i<n;i++){
        if (numbers[i] > numbers[max2]){
            max2 = i;
            
            //Swap
            if(numbers[max2] > numbers[max1]){
                int a = max1;
                int b = max2;
                max1 = b;
                max2 = a;
            }
            ///////
        }
    }
    
    max1++;max2++;
    if (max1<max2){cout<<max1<<" "<<max2;}
    else{cout<<max2<<" "<<max1;}
    return 0;
}*/

/*FizzBuzz
int main(){
    long s, e, a, b;
    cin >> s >> e >> a >> b;
    for (long i = s;i<=e;i++){
        if (i%a == 0 && i%b==0){cout<<"FizzBuzz\n";}
        else if (i%b == 0){cout<<"Buzz\n";}
        else if (i%a == 0){cout<<"Fizz\n";}
        else{cout<<i<<"\n";}
    }
    return 0;
}
*/

/*haybales
int main(){
    int n;
    cin >>n;
    int numbers[n];
    int sum,average,toMove;
    sum=0;
    for (int i = 0;i<n;i++){
        cin >> numbers[i];
        sum+=numbers[i];
    }   
    average = sum/n;
    toMove = 0;
    for (int i = 0;i<n;i++){
        if(average>numbers[i]){
            toMove+= average-numbers[i];
        }
        if(average<numbers[i]){
            toMove+= numbers[i]-average;
        }
    }   
    toMove/=2;
    cout<<toMove;
    return 0;
}
*/
/*nadan*/

int main(){
    int n,k,average,sum,leftover,left1,left2;
    cin >> k;
    cin >> n;
    sum = 0;
    average = k/n;
    leftover = k%n;
    if (leftover!=0){//2n-1
        if (leftover%2==0){left1 = n/2;left2=n/2;}
        if (leftover%2==1){left1 = n/2;left2=n/2+1;}
    }
    for (int i = 1;i<=n/2;i++){
        sum+=average*2;
        /*if (i=n/2){
            cout << average-i-left1<<"\n";
            cout << (average + i)+left2<<"\n";
            break;
        }*/
        cout << average-i<<"\n";
        cout << (average + i)<<"\n";        
    }
    if (n%2 == 1){
        cout << average;sum+=average;
    }
    return 0;
}


/*preokret
int main(){
    //input
    int a;
    cin >> a;
    int aTime[a];
    
    int scoredFirsthalf = 0, turnarounds = 0;
    
    for (int i = 0;i<a;i++){
        cin >> aTime[i];
        if (aTime[i] <= 1440){
            scoredFirsthalf+=1;
        }
    }   
    int b;
    cin >> b;
    int bTime[b];
    for (int i = 0;i<b;i++){
        cin >> bTime[i];
        if (bTime[i] <= 1440){
            scoredFirsthalf+=1;
        }
    }   
    
    int x=0,y=0,aPoints[a+b],bPoints[a+b];//,timings[a+b];
    aPoints[0] = 0;bPoints[0] = 0;
    for (int i = 0;i<a+b;i++){
        if (aTime[x]<bTime[y]){
            //timings[i] = aTime[x];
            aPoints[i+1] = aPoints[i]+1;
            bPoints[i+1] = bPoints[i];
            x++;
        }
        else if (bTime[y]<aTime[x]){
            //timings[i] = bTime[y];
            aPoints[i+1] = aPoints[i];
            bPoints[i+1] = bPoints[i]+1;
            y++;
        }
        //cout<<aPoints[i+1]<<" "<<bPoints[i+1]<<" "<<i<<"\n";
    }
    for (int i = 1;i<a+b-1;i++){
        if ((aPoints[i]<bPoints[i] && aPoints[i+2]>bPoints[i+2])
        || (aPoints[i]>bPoints[i] && aPoints[i+2]<bPoints[i+2])){
            turnarounds+=1;
            //cout<<aPoints[i+2]<<" "<<bPoints[i+2]<<"\n";
        }
    }

    cout<<scoredFirsthalf<<"\n";
    cout<<turnarounds;
    return 0;
}*/

/*kosnja
int main(){
    int k;
    cin >> k;
    int n[k],m[k];
    for (int i = 0;i<k;i++){
        cin >> n[i]; cin >> m[i];
    }   
    for (int i = 0;i<k;i++){
        if (n[i]<m[i]){cout << (n[i]-1)*2<<"\n";}
        else{cout << (m[i]-1)*2<<"\n";}
    }   
    return 0;
}
*/

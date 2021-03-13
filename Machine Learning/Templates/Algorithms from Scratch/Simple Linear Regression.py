# Simple Linear Regression in a package
# https://machinelearningmastery.com/implement-simple-linear-regression-scratch-python/
class LinearRegression:
    ### Mathematical Functions needed ###################
    def mean(values):
        # Calculate y mean
        total = 0
        counter = 0
        for i in values:
            total += i
            counter += 1
        return total / counter
    def variance(values, mean):
        val = 0
        for i in values:
            val += (i-mean)**2
        return val
    def covariance(x,x_mean,y,y_mean):
        covar = 0.0
        for i in range(len(x)):
            covar += (x[i] - x_mean) * (y[i] - y_mean)
        return covar
    
    ### The actual model ###############################
    '''
    Format: y = mx + c
    '''
    def __init__(self):
        # y = mx+c
        self.m = 0
        self.c = 0
        
    def fit(self,x,y):
        # Insert constant ones for bias weights
        # Calculate x mean
        x_mean = LinearRegression.mean(x)
        y_mean = LinearRegression.mean(y)
        self.c = LinearRegression.covariance(x,x_mean,y,y_mean) / \
                    LinearRegression.variance(x,x_mean)
        self.m = y_mean - self.c * x_mean

    def predict(self,x):
        return self.m * x + self.c
        
def test():
    data = [[1, 1],[2, 3],[4, 3],[3, 2],[5, 5]]
    X = [i[0] for i in data]
    Y = [i[1] for i in data]
    model = LinearRegression()
    model.fit(X,Y)
    print(model.predict(3))

if __name__=='__main__':
    test()

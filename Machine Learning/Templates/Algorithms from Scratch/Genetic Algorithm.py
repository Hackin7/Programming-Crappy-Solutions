import random
# Finds the number 10 from a range of 0 to 100
class GeneticAlgorithm:
    def __init__(self, debug=False):
        self.population = []
        self.debug = debug

    ### These 4 functions can be altered depending on what is being searched
    def randomInit(self):
        self.population = [random.randint(0,100) for i in range(10)]

    def fitness(self, val):
        return abs(val-10)

    def mutate(self,val):
        return val + random.randint(-10,10)

    def mate(self, val1, val2):
        return self.mutate(val1+val2)

    ### The Actual Search Code
    def search(self, elitism=0.1, mateRate=0.9, mateSelection=0.5, maxGeneration=-1):
        minFitness = None
        value = None

        self.randomInit()
        generation = 1
        while (maxGeneration == -1 or generation < maxGeneration) and \
              (minFitness == None or minFitness > 0):
            #Debugging
            if self.debug: print(f"Generation {generation}, Fitness={minFitness}: {self.population}")
            # Elitism
            popSize = len(self.population)
            self.population = sorted(self.population,key=self.fitness)
            self.population = self.population[:int(popSize*elitism)]
            # Mutation
            for i in range(int(popSize*mateRate)):
                #Choose 2 random parents among the fittest to mate
                ranges = int(popSize*mateSelection)
                parent1 = random.choice(self.population[:ranges])
                parent2 = random.choice(self.population[:ranges])
                self.population.append(self.mate(parent1,parent2))
            # Find new minimum fitness
            newFitness = self.fitness(self.population[0])
            if minFitness == None or newFitness < minFitness:
                minFitness = newFitness
                value = self.population[0]
            generation += 1
            
        if self.debug: print(f"Generation {generation}, Fitness={minFitness}: {self.population}")
        return generation,value

def test():
    algo = GeneticAlgorithm(debug=True)
    print(algo.search())

if __name__=="__main__":
    test()

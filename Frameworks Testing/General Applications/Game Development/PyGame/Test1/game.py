import pygame, random

screen_resolution = [1059,500]
display = pygame.display.set_mode(screen_resolution)
isRunning = True

clock = pygame.time.Clock()
speed = 10

hero = pygame.image.load("hero.jpg")
hero.set_colorkey([255,128,128])
hero_pos = [0,0]
hero_is_alive=True

dead = pygame.image.load("pi.png")
dead.set_colorkey([255,128,128])


class GameObject:
    def __init__(self, x, y, filename):
        self.x = x
        self.y = y
        self.image = pygame.image.load(filename)
        self.image.set_colorkey([255,128,128])
    def update(self): pass
    def draw(self, display):
        #print(self.x, self.y)
        display.blit(self.image,(self.x,self.y))

class Enemy(GameObject):
    def __init__(self, x, y):
        super().__init__(x,y,"pi.png")

enemies= []
for i in range(10):
    new_enemy = Enemy(random.randint(0,1000), random.randint(0,500))
    enemies.append(new_enemy)

while True:#isRunning:
    events = pygame.event.get()
    for event in events:
        if event.type == pygame.QUIT:
                    #pygame.quit()
                    isRunning = False
    display.fill([0,0,0])

    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT]:
            hero_pos[0] -= speed
    if keys[pygame.K_RIGHT]:
            hero_pos[0] += speed
    if keys[pygame.K_UP]:
            hero_pos[1] -= speed
    if keys[pygame.K_DOWN]:
            hero_pos[1] += speed

    for enemy in enemies:
            box1_pos = hero_pos
            box1_size = hero.get_rect().size #get_image()
            #print(enemy)
            box2_pos = enemy.x, enemy.y
            box2_size = enemy.image.get_rect().size #get_image()
            collision = (box1_pos[0] + box1_size[0] > box2_pos[0] and
                         box1_pos[0] < box1_size[0] > box2_pos[0] and
                         box1_pos[0] + box1_size[0] > box2_pos[0] and
                         box1_pos[1] < box2_pos[1] > box2_size[0])
            if collision: #print(collision)
                hero_is_alive = False
                continue


            enemy.update()

    if hero_is_alive: display.blit(hero, hero_pos)
    else: display.blit(dead, hero_pos)
    for enemy in enemies: enemy.draw(display)

    pygame.display.update()
    clock.tick(120)

pygame.quit()

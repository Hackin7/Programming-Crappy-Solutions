Entity = Class{}
function Entity:init(def)
    self.x = 10
    self.y = 200
    
    self.speed = 350
    self.vx = 0
    self.vy = 0
    
    self.ax = 0
    self.ay = 45
    
    self.floor = VIRTUAL_HEIGHT-10
end
function Entity:jump()
    self.vy = -50
end
function Entity:control()
    if love.keyboard.isDown('left') then
        self.ax = -299
    elseif love.keyboard.isDown('right') then
        self.ax = 299
    else
        self.vx = 0
    end
end
function Entity:update(dt)
    self:control()
    
    self.vx = self.vx + self.ax * dt
    self.vy = self.vy + self.ay * dt
    
    if self.vx >= 300 then
        self.vx = 300
    end
    if self.vx <= -300 then
        self.vx = -300
    end
    
    self.x = self.x + self.vx * dt
    self.y = self.y + self.vy * dt
    
    --print(self.floor)
    if self.y > self.floor and self.y < self.floor + 10/2 and self.vy > 0 then
        self.y = self.floor
        self.vy = 0
    end
end

function Entity:render()
    love.graphics.rectangle('fill', self.x, self.y, 10, 10)
end

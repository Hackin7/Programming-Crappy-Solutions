Entity = Class{}
function Entity:init(def)
    self.x = 10
    self.y = 200
    
    self.speed = 350
    self.vx = 0
    self.vy = 0
    
    self.ax = 0
    self.ay = 150
    
    self.floor = VIRTUAL_HEIGHT-10
end
function Entity:jump()
    self.vy = -150
end
function Entity:control()
    if love.keyboard.isDown('left') then
        self.ax = -299
    elseif love.keyboard.isDown('right') then
        self.ax = 299
    else
    --Deceleration
        if ((self.vx > 0 and self.ax > 0) or 
        (self.vx < 0 and self.ax < 0)) and self.y == self.floor then
            self.ax = -self.ax*0.5
        end
        if (self.vx > -5 and self.vx < 5) then 
            self.vx = 0
            self.ax = 0
        end
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
    if self.x <= 0 then
        self.x = 0
    end
    self.x = self.x + self.vx * dt
    self.y = self.y + self.vy * dt
    
    --print(self.floor)
    if love.keyboard.isDown('down') and self.y > self.floor and self.y < self.floor + 10/2 then
        self.y = self.y + 10/2
    end
    if self.y > self.floor and self.y < self.floor + 10/2 and self.vy > 0 then
        self.y = self.floor
        self.vy = 0
    end
end

function Entity:render()
    love.graphics.setColor(255,0,0)
    love.graphics.rectangle('fill', self.x, self.y, 10, 10)
end

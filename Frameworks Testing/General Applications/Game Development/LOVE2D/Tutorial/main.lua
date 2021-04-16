Class = require 'lib/class'
push = require 'lib/push'
Timer = require 'lib/knife.timer'

require 'Entity'

gFonts = {
    ['small'] = love.graphics.newFont('fonts/font.ttf', 8),
    ['medium'] = love.graphics.newFont('fonts/font.ttf', 16),
    ['large'] = love.graphics.newFont('fonts/font.ttf', 32),
    ['title'] = love.graphics.newFont('fonts/ArcadeAlternate.ttf', 32)
}

WINDOW_WIDTH = 1280
WINDOW_HEIGHT = 720
-- size we're trying to emulate with push
VIRTUAL_WIDTH = 432
VIRTUAL_HEIGHT = 243

function GenerateQuads(atlas, tilewidth, tileheight)
    local sheetWidth = atlas:getWidth() / tilewidth
    local sheetHeight = atlas:getHeight() / tileheight

    local sheetCounter = 1
    local spritesheet = {}

    for y = 0, sheetHeight - 1 do
        for x = 0, sheetWidth - 1 do
            spritesheet[sheetCounter] =
                love.graphics.newQuad(x * tilewidth, y * tileheight, tilewidth,
                tileheight, atlas:getDimensions())
            sheetCounter = sheetCounter + 1
        end
    end

    return spritesheet
end
function setUpTiling()
    tiles = {}
    
    -- tilesheet image and quads for it, which will map to our IDs
    tilesheet = love.graphics.newImage('tiles.png')
    quads = GenerateQuads(tilesheet, TILE_SIZE, TILE_SIZE)
    
    mapWidth = 20
    mapHeight = 20

    -- amount by which we'll translate the scene to emulate a camera
    cameraScroll = 0

    backgroundR = math.random(255)
    backgroundG = math.random(255)
    backgroundB = math.random(255)

    for y = 1, mapHeight do
        table.insert(tiles, {})
        
        for x = 1, mapWidth do
            -- sky and bricks; this ID directly maps to whatever quad we want to render
            table.insert(tiles[y], {
                id = y < 10 and SKY or GROUND
            })
        end
    end
end

TILE_SIZE = 16
CAMERA_SCROLL_SPEED = 150
-- tile ID constants
SKY = 2
GROUND = 1
function drawTiles()
    love.graphics.translate(-math.floor(cameraScroll), 0)
    --love.graphics.clear(backgroundR, backgroundG, backgroundB, 255)
    havefloor = false
    for y = 1, mapHeight do
        for x = 1, mapWidth do
            local tile = tiles[y][x]
            if tile.id == 1 and b.floor > (y - 1) * TILE_SIZE - math.floor(TILE_SIZE/2) 
            and b.x >= (x - 1) * TILE_SIZE and b.x <= (x) * TILE_SIZE then
                b.floor = (y - 1) * TILE_SIZE - math.floor(TILE_SIZE/2)
                havefloor = true
            end
            love.graphics.draw(tilesheet, quads[tile.id], (x - 1) * TILE_SIZE, (y - 1) * TILE_SIZE)
        end
    end
    if havefloor == false then b.floor = VIRTUAL_HEIGHT-10 end
end
function love.load()
    love.graphics.setDefaultFilter('nearest', 'nearest')
    love.window.setTitle('SpeedFormer')

    love.graphics.setFont(gFonts['medium'])

    math.randomseed(os.time())
    push:setupScreen(VIRTUAL_WIDTH, VIRTUAL_HEIGHT, WINDOW_WIDTH, WINDOW_HEIGHT, {
        fullscreen = false,
        vsync = true,
        resizable = true
    })

    love.keyboard.keysPressed = {}
    setUpTiling()
    b = Entity{}
end

function love.resize(w, h)
    push:resize(w, h)
end

function love.keypressed(key)
    if key == 'escape' then
        love.event.quit()
    end
    if key == 'space' then
        b:jump()
    end
    love.keyboard.keysPressed[key] = true
end

function love.keyboard.wasPressed(key)
    return love.keyboard.keysPressed[key]
end

function love.update(dt)
    b:update(dt)
    if b.vx > 0 and b.x > cameraScroll + 300 then
        cameraScroll = cameraScroll + b.vx * dt
    elseif b.vx < 0 and b.x < cameraScroll + 100 then
        cameraScroll = cameraScroll + b.vx * dt
    end
    love.keyboard.keysPressed = {}
end

function love.draw()
    push:start()
    --gStateMachine:render()
    love.graphics.clear()
    drawTiles()
    love.graphics.printf('SpeedFormer!', 0, 10, VIRTUAL_WIDTH, 'center')
    b:render()
    push:finish()
end

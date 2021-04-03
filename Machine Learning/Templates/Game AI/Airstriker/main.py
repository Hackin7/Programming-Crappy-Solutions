#https://analyticsindiamag.com/hands-on-guide-reinforcement-learning-openai-gymretro/

# To set up, just pip3 install gym-retro

import retro
env = retro.make(game='Airstriker-Genesis', record='.')
env.reset()

done = False

while not done:
    env.render()
    obs, rew, done, info = env.step(env.action_space.sample())
    if done:
        obs = env.reset()
        env.close()

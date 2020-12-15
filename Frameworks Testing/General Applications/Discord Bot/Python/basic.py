#https://realpython.com/how-to-make-a-discord-bot-python/

import discord
from discord.ext import commands

TOKEN = input("Enter discord token: ")

bot = commands.Bot(command_prefix='!')

@bot.event
async def on_ready():
    print(f'{bot.user} has connected to Discord!')

@bot.event
async def on_message(message):
    # Prevent the bot from responding to itself
    if message.author == bot.user:
        return
    print(message.content)

@bot.command(name='direct-message', help='Direct Message test')
async def dm(ctx):
    member = ctx.author
    await member.create_dm()
    message = await member.dm_channel.send(
        f'Hi {member.name}, I heard you dm me!'
    )
    #await message.edit(content="hi")
    
@bot.command(name='channel-message', help='Send a message to the group')
async def channel_message(ctx):
    ### Message and content
    content = "This is a sample group message, where you can put normal text **with special markdown formatting**, :laughing: and stuff"
    embed = discord.Embed(title="Sample Embed", description="This is an embed, where you can put your content inside", color=0x00ff00)
    embed.add_field(name="Field", value="You can put your contents inside fields like this", inline=False)
    message = await ctx.send(content=content, embed=embed)
    await message.add_reaction(emoji="\N{WHITE HEAVY CHECK MARK}")
    
    ### Respond to reactions ###################################################
    def check(reaction, user):
        return reaction.emoji == "\N{WHITE HEAVY CHECK MARK}" \
               and user != bot.user and user == ctx.author
    while True:
        ## Add emoji reaction
        res = await bot.wait_for('reaction_add', check=check)#, timeout=60.0)
        if res:
            new_embed = discord.Embed(title="Updated Embed", description="You can also modify the embed", color=0x00ff00)
            await message.edit(content="The bot can check for reactions, and do whatever you want (eg. send a new message, dm)\nIn this case: update the message", embed=new_embed)

        ## Remove emoji reaction
        res = await bot.wait_for('reaction_remove',check=check)
        if res:
            await message.edit(content=content, embed=embed)
    ############################################################################
    
@bot.command(name='yes-number', help='Put in a number like `!yes-number 1`. Used to test passing parameters into commands')
async def yesnumber(ctx, number: int):
    message = await ctx.send(f"You given a number {number}. Whether it is right is debatable.")

    
bot.run(TOKEN)

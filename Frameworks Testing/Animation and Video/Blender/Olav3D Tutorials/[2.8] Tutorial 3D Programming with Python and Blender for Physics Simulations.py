# https://www.youtube.com/watch?v=KI0tjZUkb5A&t=87s
import bpy

number = 5
counter = 0
for a in range(0, number):
    counter += 2
    counter2 = 0
    for b in range(0, number):
        counter2 += 2
        counter3 = 0
        for c in range(0, number):
            bpy.ops.mesh.primitive_cube_add(size=2, location=(counter3+2,counter2-2,counter-2))
            counter3+=2
            bpy.ops.rigidbody.object_add()
            bpy.context.object.rigid_body.mass = 20
            bpy.context.object.rigid_body.collision_shape = 'BOX'
            bpy.context.object.rigid_body.friction = 1
            bpy.context.object.rigid_body.use_margin = True
            bpy.context.object.rigid_body.collision_margin = 0
            bpy.context.object.rigid_body.linear_damping = 0.35
            bpy.context.object.rigid_body.angular_damping = 0.6

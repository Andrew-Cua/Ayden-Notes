from pygame.math import Vector2 
from util import wrap_position, load_sprite, get_random_vel
from pygame.transform import rotozoom


class GameObject: 
    def __init__(self, position, sprite, velocity):
        self.position = Vector2(position)
        self.sprite = sprite 
        self.radius = sprite.get_width() / 2 
        self.velocity = Vector2(velocity)

    def draw(self, surface):
        blit_pos = self.position - Vector2(self.radius)
        surface.blit(self.sprite, blit_pos)

    def move(self, surface):
        self.position = wrap_position(self.position + self.velocity, surface)

    def collides_with(self, other_obj):
        distance = self.position.distance_to(other_obj.position)
        return distance < self.radius + other_obj.radius
    

class Asteroid(GameObject):

    def __init__(self, position, create_asteroid_callback, size = 3):
        self.asteroid_callback = create_asteroid_callback
        self.size = size
        size_to_scale = {
            3: 1,
            2: 0.5, 
            1: 0.25
        }
        scale = size_to_scale[size]
        sprite = rotozoom(load_sprite('asteroid'), 0, scale)
        super().__init__(position, load_sprite("asteroid"), get_random_vel(1, 3))


    def split(self):
        """
        TODO: Add in logic for splitting asteroids 
        """

        #self.create_asteroid(asteroid) # uncomment this line when done 




class Bullet(GameObject):

    def __init__(self, position, velocity):
        super().__init__(position, load_sprite("bullet"), velocity)

    def move(self, surface):
        self.position = self.position + self.velocity
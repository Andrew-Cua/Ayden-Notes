import pygame
from util import load_sprite
from GameObject import GameObject, Bullet
from pygame.math import Vector2
from pygame.transform import rotozoom


class Player(GameObject):
    MANUEVERABILITY = 3
    MAX_ACCEL = 0.05
    UP = Vector2(0, -1)

    
    def __init__(self, position, create_bullet_callback):
        self.direction = Vector2(0, -1)
        self.bullet_callback = create_bullet_callback

        super().__init__(position, load_sprite("spaceship"), Vector2(0))
    
    def rotate(self, clockwise=True):
        sign = 1 if clockwise else - 1
        angle = self.MANUEVERABILITY * sign 
        self.direction.rotate_ip(angle)

    def draw(self, surface):
        angle = self.direction.angle_to(self.UP)
        rotated_surface = rotozoom(self.sprite, angle, 1.0)
        rotate_surface_size = Vector2(rotated_surface.get_size())
        blit_position = self.position - rotate_surface_size * 0.5
        surface.blit(rotated_surface, blit_position)

    def accelerate(self):
        self.velocity += self.direction * self.MAX_ACCEL

    def shoot(self):
        bullet_velocity = self.direction * 3 + self.velocity
        bullet = Bullet(self.position, bullet_velocity)
        self.bullet_callback(bullet)

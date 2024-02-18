import pygame 

from util import load_sprite, get_random_position
from GameObject import GameObject, Asteroid, Bullet
from player import Player

class Asteroids:
    MIN_AST_DIST = 250
    score = 0


    def __init__(self):
        
        self._init_pygame()
        self.font = pygame.font.Font('sprites/alro-alro-regular-400.ttf', 32)
        self.screen = pygame.display.set_mode((800, 600))
        self.background = load_sprite("space", False)
        self.bullets = []

        self.spaceship = Player((400,300), self.bullets.append)

        self.asteroids = []
        

        for _ in range(6):
            while True: 
                position = get_random_position(self.screen)
                if (
                    position.distance_to(self.spaceship.position) > self.MIN_AST_DIST
                ):
                    break
            self.asteroids.append(Asteroid(position, self.asteroids.append))


        self.clock = pygame.time.Clock()

    def main_loop(self):
        while True: 
            self._handle_input()
            self._process_game_logic()
            self._draw() 

    def _init_pygame(self):
        pygame.init()
        pygame.display.set_caption("Asteroids")

    def _handle_input(self):
        for event in pygame.event.get():
            if event.type == pygame.QUIT or (
                event.type == pygame.KEYDOWN and event.key == pygame.K_ESCAPE
            ):
                quit()
            elif (
            self.spaceship
            and event.type == pygame.KEYDOWN
            and event.key == pygame.K_SPACE
            ):
                self.spaceship.shoot()

        is_key_pressed = pygame.key.get_pressed()

        if self.spaceship:
            if is_key_pressed[pygame.K_a]:
                self.spaceship.rotate(clockwise=False)
            elif is_key_pressed[pygame.K_d]:
                self.spaceship.rotate(clockwise=True)
            
            if is_key_pressed[pygame.K_w]:
                self.spaceship.accelerate()

    def _process_game_logic(self): 
        for game_obj in self._get_game_objects():
            game_obj.move(self.screen)

        ## remove bullets 
        for bullet in self.bullets[:]:
            if not self.screen.get_rect().collidepoint(bullet.position):
                self.bullets.remove(bullet)

        ### TODO 1
        ### Check if the player is colliding with one of the asteroids 
          # if its is, set it to None 
          # you can use .collides_with(game_obj) to check if they are colliding 

            
        for asteroid in self.asteroids:
            if self.spaceship and self.spaceship.collides_with(asteroid):
                self.spaceship = None 
                
        ### TODO 2 
          # Check if a bullet is colliding with one of the asteroids 
          # if it is, remove it 
        
                        
        ### TODO 4 
          # after an asteroid is removed, increment the score. give bonus points based 
          # on the size of the asteroid 
                
        for bullet in self.bullets:
            for asteroid in self.asteroids:
                if bullet.collides_with(asteroid):
                    self.score +=1
                    self.asteroids.remove(asteroid)
                    self.bullets.remove(bullet)
                
        ### TODO 3 
          # in the actual asteroid game, after an asteroid is hit, it splits in two
          # so instead of removing the asteroid, spawn 2 more at its old location
          # go to GameObject.py
                
        
                    


    def _draw(self):
        self.screen.blit(self.background, (0,0))
        
        for game_obj in self._get_game_objects():
            game_obj.draw(self.screen)


        text = self.font.render(f"SCORE: {self.score}", True, (255,255,255), (0,0,0))
        text_rect = text.get_rect()
        text_rect_ctr = (50,50)
        self.screen.blit(text, text_rect)
        pygame.display.flip()
        self.clock.tick(60)

    def _get_game_objects(self):
        game_objs = [*self.asteroids, *self.bullets]

        if (self.spaceship):
            game_objs.append(self.spaceship)
        return game_objs
    


Asteroids().main_loop()
import random

class Game:
    def __init__(self, player1, player2):
        self.player1 = player1
        self.player2 = player2
        self.current_player = None
        self.symbols = {}  # Stores player-symbol mapping

    def toss(self):
        # Randomly pick 0 or 1
        toss_result = random.randint(0, 1)

        if toss_result == 0:
            first_player = self.player1
            second_player = self.player2
        else:
            first_player = self.player2
            second_player = self.player1

        # Assign symbols
        self.symbols[first_player] = 'X'
        self.symbols[second_player] = 'O'

        # Set current player
        self.current_player = first_player

        # Output results
        print("Toss Result:")
        print(f"{first_player} starts first!")
        print(f"{first_player} is 'X'")
        print(f"{second_player} is 'O'")

    def get_game_state(self):
        return {
            "current_player": self.current_player,
            "symbols": self.symbols
        }


# Example usage
game = Game("Player 1", "Player 2")
game.toss()

state = game.get_game_state()
print("\nGame State:", state)
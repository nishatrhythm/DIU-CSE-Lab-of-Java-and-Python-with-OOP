from collections import namedtuple
import random

Card = namedtuple("Card", ["rank", "suit"])

class Deck:
    ranks = [str(n) for n in range(2, 11)] + ["Jack", "Queen", "King", "Ace"]
    suits = ["Spades", "Hearts", "Diamonds", "Clubs"]

    def __init__(self):
        self._cards = [Card(rank, suit) for suit in self.suits for rank in self.ranks]

    def __len__(self):
        return len(self._cards)

    def __getitem__(self, position):
        return self._cards[position]

    def shuffle(self):
        random.shuffle(self._cards)

    def deal(self, num_cards=1):
        dealt = []
        for _ in range(num_cards):
            if self._cards:
                dealt.append(self._cards.pop())
        return dealt

if __name__ == "__main__":
    deck = Deck()
    print("Total cards in fresh deck:", len(deck))
    print("First card:", deck[0])
    print("Last card:", deck[-1])

    deck.shuffle()
    print("After shuffle, first 3 cards:")
    for card in deck[:3]:
        print(f" - {card.rank} of {card.suit}")

    hand = deck.deal(5)
    print("\nDealt a 5-card poker hand:")
    for card in hand:
        print(f" -> {card.rank} of {card.suit}")

    print("Cards remaining in deck:", len(deck))